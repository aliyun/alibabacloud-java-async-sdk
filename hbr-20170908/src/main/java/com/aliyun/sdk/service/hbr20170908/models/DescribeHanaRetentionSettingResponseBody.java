// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHanaRetentionSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHanaRetentionSettingResponseBody</p>
 */
public class DescribeHanaRetentionSettingResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("Code")
    private String code;

    @NameInMap("DatabaseName")
    private String databaseName;

    @NameInMap("Disabled")
    private Boolean disabled;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RetentionDays")
    private Long retentionDays;

    @NameInMap("Schedule")
    private String schedule;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("VaultId")
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
         * The ID of the SAP HANA instance.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The HTTP status code. The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The name of the database.
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Indicates whether the backup is permanently retained. Valid values:
         * <p>
         * 
         * *   true: The backup is permanently retained.
         * *   false: The backup is retained for the specified number of days.
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of days for which the backup is retained. If the value of the Disabled parameter is false, the backup is retained for the number of days specified by this parameter.
         */
        public Builder retentionDays(Long retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * The policy to update the retention period. Format: `I|{startTime}|{interval}`, which indicates that the retention period is updated at an interval of {interval} starting from {startTime}.
         * <p>
         * 
         * *   startTime: the time at which the system starts to update the retention period. The time follows the UNIX time format. Unit: seconds.
         * *   interval: the interval at which the system updates the retention period. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of 1 hour. P1D indicates an interval of one day.
         */
        public Builder schedule(String schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the backup vault.
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
