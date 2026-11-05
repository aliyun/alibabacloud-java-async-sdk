// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeSQLExplorerRetentionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLExplorerRetentionResponseBody</p>
 */
public class DescribeSQLExplorerRetentionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigValue")
    private String configValue;

    @com.aliyun.core.annotation.NameInMap("DBInstanceID")
    private Integer DBInstanceID;

    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSQLExplorerRetentionResponseBody(Builder builder) {
        this.configValue = builder.configValue;
        this.DBInstanceID = builder.DBInstanceID;
        this.DBInstanceName = builder.DBInstanceName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLExplorerRetentionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configValue
     */
    public String getConfigValue() {
        return this.configValue;
    }

    /**
     * @return DBInstanceID
     */
    public Integer getDBInstanceID() {
        return this.DBInstanceID;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String configValue; 
        private Integer DBInstanceID; 
        private String DBInstanceName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeSQLExplorerRetentionResponseBody model) {
            this.configValue = model.configValue;
            this.DBInstanceID = model.DBInstanceID;
            this.DBInstanceName = model.DBInstanceName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The retention period of SQL Explorer logs. Valid values:</p>
         * <ul>
         * <li><strong>30</strong>: 30 days</li>
         * <li><strong>180</strong>: 180 days</li>
         * <li><strong>365</strong>: 1 year</li>
         * <li><strong>1095</strong>: 3 years</li>
         * <li><strong>1825</strong>: 5 years</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder configValue(String configValue) {
            this.configValue = configValue;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>35707295</p>
         */
        public Builder DBInstanceID(Integer DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6A2EE5B4-CC9F-46E1-A747-E43BC9******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSQLExplorerRetentionResponseBody build() {
            return new DescribeSQLExplorerRetentionResponseBody(this);
        } 

    } 

}
