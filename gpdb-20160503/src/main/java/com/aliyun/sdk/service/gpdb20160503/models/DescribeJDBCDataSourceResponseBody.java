// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    @com.aliyun.core.annotation.NameInMap("ExternalDataServiceId")
    private String externalDataServiceId;

    @com.aliyun.core.annotation.NameInMap("JDBCConnectionString")
    private String JDBCConnectionString;

    @com.aliyun.core.annotation.NameInMap("JDBCPassword")
    private String JDBCPassword;

    @com.aliyun.core.annotation.NameInMap("JDBCUserName")
    private String JDBCUserName;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

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
        this.externalDataServiceId = builder.externalDataServiceId;
        this.JDBCConnectionString = builder.JDBCConnectionString;
        this.JDBCPassword = builder.JDBCPassword;
        this.JDBCUserName = builder.JDBCUserName;
        this.modifyTime = builder.modifyTime;
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
     * @return externalDataServiceId
     */
    public String getExternalDataServiceId() {
        return this.externalDataServiceId;
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
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
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
        private String externalDataServiceId; 
        private String JDBCConnectionString; 
        private String JDBCPassword; 
        private String JDBCUserName; 
        private String modifyTime; 
        private String requestId; 
        private String statusMessage; 

        /**
         * <p>The time when the service was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T16:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the service. The description can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql data source config</p>
         */
        public Builder dataSourceDescription(String dataSourceDescription) {
            this.dataSourceDescription = dataSourceDescription;
            return this;
        }

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>The name of data soruce</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs_pxf</p>
         */
        public Builder dataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * <p>The status of the service. Valid values:</p>
         * <ul>
         * <li>Init</li>
         * <li>Running</li>
         * <li>Exception</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder dataSourceStatus(String dataSourceStatus) {
            this.dataSourceStatus = dataSourceStatus;
            return this;
        }

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>The id of the external data service</p>
         * 
         * <strong>example:</strong>
         * <p>2989</p>
         */
        public Builder externalDataServiceId(String externalDataServiceId) {
            this.externalDataServiceId = externalDataServiceId;
            return this;
        }

        /**
         * <p>The JDBC connection string.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder JDBCConnectionString(String JDBCConnectionString) {
            this.JDBCConnectionString = JDBCConnectionString;
            return this;
        }

        /**
         * <p>The password of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder JDBCPassword(String JDBCPassword) {
            this.JDBCPassword = JDBCPassword;
            return this;
        }

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder JDBCUserName(String JDBCUserName) {
            this.JDBCUserName = JDBCUserName;
            return this;
        }

        /**
         * <p>The time when the data source was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-27T02:01:10Z</p>
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The message of the status</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
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
