// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJDBCDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJDBCDataSourceResponseBody</p>
 */
public class DescribeJDBCDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DataSourceDescription")
    private String dataSourceDescription;

    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.NameInMap("DataSourceName")
    private String dataSourceName;

    @com.aliyun.core.annotation.NameInMap("DataSourceStatus")
    private String dataSourceStatus;

    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.NameInMap("JDBCConnectionString")
    private String JDBCConnectionString;

    @com.aliyun.core.annotation.NameInMap("JDBCPassword")
    private String JDBCPassword;

    @com.aliyun.core.annotation.NameInMap("JDBCUserName")
    private String JDBCUserName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatusMessage")
    private String statusMessage;

    private DescribeJDBCDataSourceResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.dataSourceDescription = builder.dataSourceDescription;
        this.dataSourceId = builder.dataSourceId;
        this.dataSourceName = builder.dataSourceName;
        this.dataSourceStatus = builder.dataSourceStatus;
        this.dataSourceType = builder.dataSourceType;
        this.JDBCConnectionString = builder.JDBCConnectionString;
        this.JDBCPassword = builder.JDBCPassword;
        this.JDBCUserName = builder.JDBCUserName;
        this.requestId = builder.requestId;
        this.statusMessage = builder.statusMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJDBCDataSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dataSourceDescription
     */
    public String getDataSourceDescription() {
        return this.dataSourceDescription;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return dataSourceStatus
     */
    public String getDataSourceStatus() {
        return this.dataSourceStatus;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return JDBCConnectionString
     */
    public String getJDBCConnectionString() {
        return this.JDBCConnectionString;
    }

    /**
     * @return JDBCPassword
     */
    public String getJDBCPassword() {
        return this.JDBCPassword;
    }

    /**
     * @return JDBCUserName
     */
    public String getJDBCUserName() {
        return this.JDBCUserName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statusMessage
     */
    public String getStatusMessage() {
        return this.statusMessage;
    }

    public static final class Builder {
        private String createTime; 
        private String dataSourceDescription; 
        private String dataSourceId; 
        private String dataSourceName; 
        private String dataSourceStatus; 
        private String dataSourceType; 
        private String JDBCConnectionString; 
        private String JDBCPassword; 
        private String JDBCUserName; 
        private String requestId; 
        private String statusMessage; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DataSourceDescription.
         */
        public Builder dataSourceDescription(String dataSourceDescription) {
            this.dataSourceDescription = dataSourceDescription;
            return this;
        }

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * DataSourceName.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * DataSourceStatus.
         */
        public Builder dataSourceStatus(String dataSourceStatus) {
            this.dataSourceStatus = dataSourceStatus;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * JDBCConnectionString.
         */
        public Builder JDBCConnectionString(String JDBCConnectionString) {
            this.JDBCConnectionString = JDBCConnectionString;
            return this;
        }

        /**
         * JDBCPassword.
         */
        public Builder JDBCPassword(String JDBCPassword) {
            this.JDBCPassword = JDBCPassword;
            return this;
        }

        /**
         * JDBCUserName.
         */
        public Builder JDBCUserName(String JDBCUserName) {
            this.JDBCUserName = JDBCUserName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StatusMessage.
         */
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }

        public DescribeJDBCDataSourceResponseBody build() {
            return new DescribeJDBCDataSourceResponseBody(this);
        } 

    } 

}
