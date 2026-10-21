// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListDataConnectorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataConnectorsResponseBody</p>
 */
public class ListDataConnectorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataConnector")
    private java.util.List<DataConnector> dataConnector;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDataConnectorsResponseBody(Builder builder) {
        this.dataConnector = builder.dataConnector;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataConnectorsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataConnector
     */
    public java.util.List<DataConnector> getDataConnector() {
        return this.dataConnector;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DataConnector> dataConnector; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDataConnectorsResponseBody model) {
            this.dataConnector = model.dataConnector;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of collectors.</p>
         */
        public Builder dataConnector(java.util.List<DataConnector> dataConnector) {
            this.dataConnector = dataConnector;
            return this;
        }

        /**
         * <p>The maximum number of records returned in this query.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAASLVeIxed4466E0LVmGkzwS6hJKd9DGVGMDRM6Lu****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>57</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataConnectorsResponseBody build() {
            return new ListDataConnectorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataConnectorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataConnectorsResponseBody</p>
     */
    public static class DataConnector extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthConfigId")
        private String authConfigId;

        @com.aliyun.core.annotation.NameInMap("AuthConfigProduct")
        private String authConfigProduct;

        @com.aliyun.core.annotation.NameInMap("AuthConfigVendor")
        private String authConfigVendor;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("DataConnectorConfig")
        private String dataConnectorConfig;

        @com.aliyun.core.annotation.NameInMap("DataConnectorId")
        private String dataConnectorId;

        @com.aliyun.core.annotation.NameInMap("DataConnectorName")
        private String dataConnectorName;

        @com.aliyun.core.annotation.NameInMap("DataConnectorStatus")
        private String dataConnectorStatus;

        @com.aliyun.core.annotation.NameInMap("DataConnectorType")
        private String dataConnectorType;

        @com.aliyun.core.annotation.NameInMap("DestDataSourceId")
        private String destDataSourceId;

        @com.aliyun.core.annotation.NameInMap("LogProjectName")
        private String logProjectName;

        @com.aliyun.core.annotation.NameInMap("LogRegionId")
        private String logRegionId;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("SlsIngestionJobName")
        private String slsIngestionJobName;

        @com.aliyun.core.annotation.NameInMap("SlsIngestionJobState")
        private String slsIngestionJobState;

        @com.aliyun.core.annotation.NameInMap("SrcDataType")
        private String srcDataType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private DataConnector(Builder builder) {
            this.authConfigId = builder.authConfigId;
            this.authConfigProduct = builder.authConfigProduct;
            this.authConfigVendor = builder.authConfigVendor;
            this.creationTime = builder.creationTime;
            this.dataConnectorConfig = builder.dataConnectorConfig;
            this.dataConnectorId = builder.dataConnectorId;
            this.dataConnectorName = builder.dataConnectorName;
            this.dataConnectorStatus = builder.dataConnectorStatus;
            this.dataConnectorType = builder.dataConnectorType;
            this.destDataSourceId = builder.destDataSourceId;
            this.logProjectName = builder.logProjectName;
            this.logRegionId = builder.logRegionId;
            this.logStoreName = builder.logStoreName;
            this.slsIngestionJobName = builder.slsIngestionJobName;
            this.slsIngestionJobState = builder.slsIngestionJobState;
            this.srcDataType = builder.srcDataType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataConnector create() {
            return builder().build();
        }

        /**
         * @return authConfigId
         */
        public String getAuthConfigId() {
            return this.authConfigId;
        }

        /**
         * @return authConfigProduct
         */
        public String getAuthConfigProduct() {
            return this.authConfigProduct;
        }

        /**
         * @return authConfigVendor
         */
        public String getAuthConfigVendor() {
            return this.authConfigVendor;
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return dataConnectorConfig
         */
        public String getDataConnectorConfig() {
            return this.dataConnectorConfig;
        }

        /**
         * @return dataConnectorId
         */
        public String getDataConnectorId() {
            return this.dataConnectorId;
        }

        /**
         * @return dataConnectorName
         */
        public String getDataConnectorName() {
            return this.dataConnectorName;
        }

        /**
         * @return dataConnectorStatus
         */
        public String getDataConnectorStatus() {
            return this.dataConnectorStatus;
        }

        /**
         * @return dataConnectorType
         */
        public String getDataConnectorType() {
            return this.dataConnectorType;
        }

        /**
         * @return destDataSourceId
         */
        public String getDestDataSourceId() {
            return this.destDataSourceId;
        }

        /**
         * @return logProjectName
         */
        public String getLogProjectName() {
            return this.logProjectName;
        }

        /**
         * @return logRegionId
         */
        public String getLogRegionId() {
            return this.logRegionId;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return slsIngestionJobName
         */
        public String getSlsIngestionJobName() {
            return this.slsIngestionJobName;
        }

        /**
         * @return slsIngestionJobState
         */
        public String getSlsIngestionJobState() {
            return this.slsIngestionJobState;
        }

        /**
         * @return srcDataType
         */
        public String getSrcDataType() {
            return this.srcDataType;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String authConfigId; 
            private String authConfigProduct; 
            private String authConfigVendor; 
            private Long creationTime; 
            private String dataConnectorConfig; 
            private String dataConnectorId; 
            private String dataConnectorName; 
            private String dataConnectorStatus; 
            private String dataConnectorType; 
            private String destDataSourceId; 
            private String logProjectName; 
            private String logRegionId; 
            private String logStoreName; 
            private String slsIngestionJobName; 
            private String slsIngestionJobState; 
            private String srcDataType; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(DataConnector model) {
                this.authConfigId = model.authConfigId;
                this.authConfigProduct = model.authConfigProduct;
                this.authConfigVendor = model.authConfigVendor;
                this.creationTime = model.creationTime;
                this.dataConnectorConfig = model.dataConnectorConfig;
                this.dataConnectorId = model.dataConnectorId;
                this.dataConnectorName = model.dataConnectorName;
                this.dataConnectorStatus = model.dataConnectorStatus;
                this.dataConnectorType = model.dataConnectorType;
                this.destDataSourceId = model.destDataSourceId;
                this.logProjectName = model.logProjectName;
                this.logRegionId = model.logRegionId;
                this.logStoreName = model.logStoreName;
                this.slsIngestionJobName = model.slsIngestionJobName;
                this.slsIngestionJobState = model.slsIngestionJobState;
                this.srcDataType = model.srcDataType;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The configuration item ID of the collector access object in the multi-cloud configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-smbc-prod-cloudtrail.s3.cn-north-1.amazonaws.com.cn_AKIAX4AUG6AYSJO7FAG4</p>
             */
            public Builder authConfigId(String authConfigId) {
                this.authConfigId = authConfigId;
                return this;
            }

            /**
             * <p>The cloud product to which the authentication configuration belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>salesForceRestAPI</p>
             */
            public Builder authConfigProduct(String authConfigProduct) {
                this.authConfigProduct = authConfigProduct;
                return this;
            }

            /**
             * <p>The cloud vendor to which the authentication configuration belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>SALESFORCE</p>
             */
            public Builder authConfigVendor(String authConfigVendor) {
                this.authConfigVendor = authConfigVendor;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-01T02:14:24Z</p>
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The collector configuration information.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;endpoint\&quot;:\&quot;csrm-sentinel.s3.cn-north-1.amazonaws.com.cn_AKIARGUYUGSX6A6VUXQJ\&quot;,\&quot;bucket\&quot;:\&quot;csrm-sentinel\&quot;,\&quot;prefix\&quot;:\&quot;AliTest/\&quot;,\&quot;format\&quot;:{\&quot;type\&quot;:\&quot;JSON\&quot;},\&quot;encoding\&quot;:\&quot;UTF-8\&quot;}</p>
             */
            public Builder dataConnectorConfig(String dataConnectorConfig) {
                this.dataConnectorConfig = dataConnectorConfig;
                return this;
            }

            /**
             * <p>The collector ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dc-07423146117d77db266f78bc41f4fd80</p>
             */
            public Builder dataConnectorId(String dataConnectorId) {
                this.dataConnectorId = dataConnectorId;
                return this;
            }

            /**
             * <p>The data connector name.</p>
             * 
             * <strong>example:</strong>
             * <p>dc-***</p>
             */
            public Builder dataConnectorName(String dataConnectorName) {
                this.dataConnectorName = dataConnectorName;
                return this;
            }

            /**
             * <p>The connector status.</p>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder dataConnectorStatus(String dataConnectorStatus) {
                this.dataConnectorStatus = dataConnectorStatus;
                return this;
            }

            /**
             * <p>The connector type.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder dataConnectorType(String dataConnectorType) {
                this.dataConnectorType = dataConnectorType;
                return this;
            }

            /**
             * <p>The destination data source ID. This parameter is required only for synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-t3ywipile7gctobaunx0</p>
             */
            public Builder destDataSourceId(String destDataSourceId) {
                this.destDataSourceId = destDataSourceId;
                return this;
            }

            /**
             * <p>The Simple Log Service project name.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun-cloudsiem-channel-1371069058301795-cn-shanghai</p>
             */
            public Builder logProjectName(String logProjectName) {
                this.logProjectName = logProjectName;
                return this;
            }

            /**
             * <p>The log storage region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder logRegionId(String logRegionId) {
                this.logRegionId = logRegionId;
                return this;
            }

            /**
             * <p>The Simple Log Service Logstore name.</p>
             * 
             * <strong>example:</strong>
             * <p>ls-wecom-crontasklog-prod</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * <p>The name of the SLS data import job for the collector.</p>
             * 
             * <strong>example:</strong>
             * <p>1a2b3c4d5e6f7a8b9c0d1e2f3a4b****</p>
             */
            public Builder slsIngestionJobName(String slsIngestionJobName) {
                this.slsIngestionJobName = slsIngestionJobName;
                return this;
            }

            /**
             * <p>The status of the SLS data import job for the collector.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder slsIngestionJobState(String slsIngestionJobState) {
                this.slsIngestionJobState = slsIngestionJobState;
                return this;
            }

            /**
             * <p>The source data type.</p>
             * 
             * <strong>example:</strong>
             * <p>s3</p>
             */
            public Builder srcDataType(String srcDataType) {
                this.srcDataType = srcDataType;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-04 22:31:54</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DataConnector build() {
                return new DataConnector(this);
            } 

        } 

    }
}
