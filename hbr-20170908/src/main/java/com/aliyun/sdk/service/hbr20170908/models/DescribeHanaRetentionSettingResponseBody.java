// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHanaRetentionSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHanaRetentionSettingResponseBody</p>
 */
public class DescribeHanaRetentionSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("Disabled")
    private Boolean disabled;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetentionDays")
    private Long retentionDays;

    @com.aliyun.core.annotation.NameInMap("Schedule")
    private String schedule;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("VaultId")
    private String vaultId;

    private DescribeHanaRetentionSettingResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.code = builder.code;
        this.databaseName = builder.databaseName;
        this.disabled = builder.disabled;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.retentionDays = builder.retentionDays;
        this.schedule = builder.schedule;
        this.success = builder.success;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHanaRetentionSettingResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return disabled
     */
    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retentionDays
     */
    public Long getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * @return schedule
     */
    public String getSchedule() {
        return this.schedule;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder {
        private String clusterId; 
        private String code; 
        private String databaseName; 
        private Boolean disabled; 
        private String message; 
        private String requestId; 
        private Long retentionDays; 
        private String schedule; 
        private Boolean success; 
        private String vaultId; 

        /**
         * <p>The ID of the SAP HANA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-0003jyv******fsku5m</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The response code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>Q01</p>
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>Indicates whether the backup is permanently retained. Valid values:</p>
         * <ul>
         * <li>true: The backup is permanently retained.</li>
         * <li>false: The backup is retained for the specified number of days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>280DD872-EE25-52E8-9CB4-491067173DD0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of days for which the backup is retained. If the value of the Disabled parameter is false, the backup is retained for the number of days specified by this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>3650</p>
         */
        public Builder retentionDays(Long retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * <p>The policy to update the retention period. Format: <code>I|{startTime}|{interval}</code>, which indicates that the retention period is updated at an interval of {interval} starting from {startTime}.</p>
         * <ul>
         * <li>startTime: the time at which the system starts to run a backup job. The time follows the UNIX time format. Unit: seconds.</li>
         * <li>interval: the interval at which the system runs a backup job. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of 1 hour. P1D indicates an interval of one day.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>I|0|P1D</p>
         */
        public Builder schedule(String schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The ID of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>v-0006wkn7******zkn</p>
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }

        public DescribeHanaRetentionSettingResponseBody build() {
            return new DescribeHanaRetentionSettingResponseBody(this);
        } 

    } 

}
