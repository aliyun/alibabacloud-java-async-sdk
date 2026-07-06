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
         * DataConnector.
         */
        public Builder dataConnector(java.util.List<DataConnector> dataConnector) {
            this.dataConnector = dataConnector;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
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
             * AuthConfigId.
             */
            public Builder authConfigId(String authConfigId) {
                this.authConfigId = authConfigId;
                return this;
            }

            /**
             * AuthConfigProduct.
             */
            public Builder authConfigProduct(String authConfigProduct) {
                this.authConfigProduct = authConfigProduct;
                return this;
            }

            /**
             * AuthConfigVendor.
             */
            public Builder authConfigVendor(String authConfigVendor) {
                this.authConfigVendor = authConfigVendor;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DataConnectorConfig.
             */
            public Builder dataConnectorConfig(String dataConnectorConfig) {
                this.dataConnectorConfig = dataConnectorConfig;
                return this;
            }

            /**
             * DataConnectorId.
             */
            public Builder dataConnectorId(String dataConnectorId) {
                this.dataConnectorId = dataConnectorId;
                return this;
            }

            /**
             * DataConnectorName.
             */
            public Builder dataConnectorName(String dataConnectorName) {
                this.dataConnectorName = dataConnectorName;
                return this;
            }

            /**
             * DataConnectorStatus.
             */
            public Builder dataConnectorStatus(String dataConnectorStatus) {
                this.dataConnectorStatus = dataConnectorStatus;
                return this;
            }

            /**
             * DataConnectorType.
             */
            public Builder dataConnectorType(String dataConnectorType) {
                this.dataConnectorType = dataConnectorType;
                return this;
            }

            /**
             * DestDataSourceId.
             */
            public Builder destDataSourceId(String destDataSourceId) {
                this.destDataSourceId = destDataSourceId;
                return this;
            }

            /**
             * LogProjectName.
             */
            public Builder logProjectName(String logProjectName) {
                this.logProjectName = logProjectName;
                return this;
            }

            /**
             * LogRegionId.
             */
            public Builder logRegionId(String logRegionId) {
                this.logRegionId = logRegionId;
                return this;
            }

            /**
             * LogStoreName.
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * SlsIngestionJobName.
             */
            public Builder slsIngestionJobName(String slsIngestionJobName) {
                this.slsIngestionJobName = slsIngestionJobName;
                return this;
            }

            /**
             * SlsIngestionJobState.
             */
            public Builder slsIngestionJobState(String slsIngestionJobState) {
                this.slsIngestionJobState = slsIngestionJobState;
                return this;
            }

            /**
             * SrcDataType.
             */
            public Builder srcDataType(String srcDataType) {
                this.srcDataType = srcDataType;
                return this;
            }

            /**
             * UpdateTime.
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
