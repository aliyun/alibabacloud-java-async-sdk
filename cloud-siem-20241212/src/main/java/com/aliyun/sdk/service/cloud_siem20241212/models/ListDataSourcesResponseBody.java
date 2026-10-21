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
 * {@link ListDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourcesResponseBody</p>
 */
public class ListDataSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSources")
    private java.util.List<DataSources> dataSources;

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

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private ListDataSourcesResponseBody(Builder builder) {
        this.dataSources = builder.dataSources;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSources
     */
    public java.util.List<DataSources> getDataSources() {
        return this.dataSources;
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

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List<DataSources> dataSources; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(ListDataSourcesResponseBody model) {
            this.dataSources = model.dataSources;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The alert source products associated with events.</p>
         */
        public Builder dataSources(java.util.List<DataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        /**
         * <p>The maximum number of entries to return in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next query. Leave this parameter empty for the first query or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListDataSourcesResponseBody build() {
            return new ListDataSourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourcesResponseBody</p>
     */
    public static class DataSourceReferences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataIngestionId")
        private String dataIngestionId;

        private DataSourceReferences(Builder builder) {
            this.dataIngestionId = builder.dataIngestionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceReferences create() {
            return builder().build();
        }

        /**
         * @return dataIngestionId
         */
        public String getDataIngestionId() {
            return this.dataIngestionId;
        }

        public static final class Builder {
            private String dataIngestionId; 

            private Builder() {
            } 

            private Builder(DataSourceReferences model) {
                this.dataIngestionId = model.dataIngestionId;
            } 

            /**
             * <p>The data ingestion ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud_sas_account_snapshot_log_173326*******</p>
             */
            public Builder dataIngestionId(String dataIngestionId) {
                this.dataIngestionId = dataIngestionId;
                return this;
            }

            public DataSourceReferences build() {
                return new DataSourceReferences(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourcesResponseBody</p>
     */
    public static class DataSourceStores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckTime")
        private Long checkTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataSourceStoreFrom")
        private String dataSourceStoreFrom;

        @com.aliyun.core.annotation.NameInMap("DataSourceStoreId")
        private String dataSourceStoreId;

        @com.aliyun.core.annotation.NameInMap("DataSourceStoreStatus")
        private String dataSourceStoreStatus;

        @com.aliyun.core.annotation.NameInMap("DataSourceStoreStatusCode")
        private String dataSourceStoreStatusCode;

        @com.aliyun.core.annotation.NameInMap("LogProjectName")
        private String logProjectName;

        @com.aliyun.core.annotation.NameInMap("LogRegionId")
        private String logRegionId;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private DataSourceStores(Builder builder) {
            this.checkTime = builder.checkTime;
            this.createTime = builder.createTime;
            this.dataSourceStoreFrom = builder.dataSourceStoreFrom;
            this.dataSourceStoreId = builder.dataSourceStoreId;
            this.dataSourceStoreStatus = builder.dataSourceStoreStatus;
            this.dataSourceStoreStatusCode = builder.dataSourceStoreStatusCode;
            this.logProjectName = builder.logProjectName;
            this.logRegionId = builder.logRegionId;
            this.logStoreName = builder.logStoreName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceStores create() {
            return builder().build();
        }

        /**
         * @return checkTime
         */
        public Long getCheckTime() {
            return this.checkTime;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSourceStoreFrom
         */
        public String getDataSourceStoreFrom() {
            return this.dataSourceStoreFrom;
        }

        /**
         * @return dataSourceStoreId
         */
        public String getDataSourceStoreId() {
            return this.dataSourceStoreId;
        }

        /**
         * @return dataSourceStoreStatus
         */
        public String getDataSourceStoreStatus() {
            return this.dataSourceStoreStatus;
        }

        /**
         * @return dataSourceStoreStatusCode
         */
        public String getDataSourceStoreStatusCode() {
            return this.dataSourceStoreStatusCode;
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
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long checkTime; 
            private Long createTime; 
            private String dataSourceStoreFrom; 
            private String dataSourceStoreId; 
            private String dataSourceStoreStatus; 
            private String dataSourceStoreStatusCode; 
            private String logProjectName; 
            private String logRegionId; 
            private String logStoreName; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(DataSourceStores model) {
                this.checkTime = model.checkTime;
                this.createTime = model.createTime;
                this.dataSourceStoreFrom = model.dataSourceStoreFrom;
                this.dataSourceStoreId = model.dataSourceStoreId;
                this.dataSourceStoreStatus = model.dataSourceStoreStatus;
                this.dataSourceStoreStatusCode = model.dataSourceStoreStatusCode;
                this.logProjectName = model.logProjectName;
                this.logRegionId = model.logRegionId;
                this.logStoreName = model.logStoreName;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The check time.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder checkTime(Long checkTime) {
                this.checkTime = checkTime;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The data source origin. Valid values:</p>
             * <ul>
             * <li>center</li>
             * <li>custom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>center</p>
             */
            public Builder dataSourceStoreFrom(String dataSourceStoreFrom) {
                this.dataSourceStoreFrom = dataSourceStoreFrom;
                return this;
            }

            /**
             * <p>The log store ID.</p>
             * 
             * <strong>example:</strong>
             * <p>di_xxxx_source_1</p>
             */
            public Builder dataSourceStoreId(String dataSourceStoreId) {
                this.dataSourceStoreId = dataSourceStoreId;
                return this;
            }

            /**
             * <p>The log store status. Valid values:</p>
             * <ul>
             * <li>normal</li>
             * <li>abnormal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder dataSourceStoreStatus(String dataSourceStoreStatus) {
                this.dataSourceStoreStatus = dataSourceStoreStatus;
                return this;
            }

            /**
             * <p>The log store status code.</p>
             * 
             * <strong>example:</strong>
             * <p>LogStoreNotExist</p>
             */
            public Builder dataSourceStoreStatusCode(String dataSourceStoreStatusCode) {
                this.dataSourceStoreStatusCode = dataSourceStoreStatusCode;
                return this;
            }

            /**
             * <p>The Simple Log Service project name.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun-cloudsiem-data-173326*******-cn-hangzhou</p>
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
             * <p>audit-activity</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DataSourceStores build() {
                return new DataSourceStores(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourcesResponseBody</p>
     */
    public static class DataSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataSourceFrom")
        private String dataSourceFrom;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("DataSourceRecognizeEnabled")
        private Boolean dataSourceRecognizeEnabled;

        @com.aliyun.core.annotation.NameInMap("DataSourceRecognizer")
        private String dataSourceRecognizer;

        @com.aliyun.core.annotation.NameInMap("DataSourceReferences")
        private java.util.List<DataSourceReferences> dataSourceReferences;

        @com.aliyun.core.annotation.NameInMap("DataSourceStatus")
        private String dataSourceStatus;

        @com.aliyun.core.annotation.NameInMap("DataSourceStores")
        private java.util.List<DataSourceStores> dataSourceStores;

        @com.aliyun.core.annotation.NameInMap("DataSourceTemplateId")
        private String dataSourceTemplateId;

        @com.aliyun.core.annotation.NameInMap("DataSourceType")
        private String dataSourceType;

        @com.aliyun.core.annotation.NameInMap("LogProjectName")
        private String logProjectName;

        @com.aliyun.core.annotation.NameInMap("LogRegionId")
        private String logRegionId;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("LogUserId")
        private Long logUserId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private DataSources(Builder builder) {
            this.createTime = builder.createTime;
            this.dataSourceFrom = builder.dataSourceFrom;
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceName = builder.dataSourceName;
            this.dataSourceRecognizeEnabled = builder.dataSourceRecognizeEnabled;
            this.dataSourceRecognizer = builder.dataSourceRecognizer;
            this.dataSourceReferences = builder.dataSourceReferences;
            this.dataSourceStatus = builder.dataSourceStatus;
            this.dataSourceStores = builder.dataSourceStores;
            this.dataSourceTemplateId = builder.dataSourceTemplateId;
            this.dataSourceType = builder.dataSourceType;
            this.logProjectName = builder.logProjectName;
            this.logRegionId = builder.logRegionId;
            this.logStoreName = builder.logStoreName;
            this.logUserId = builder.logUserId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSources create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSourceFrom
         */
        public String getDataSourceFrom() {
            return this.dataSourceFrom;
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
         * @return dataSourceRecognizeEnabled
         */
        public Boolean getDataSourceRecognizeEnabled() {
            return this.dataSourceRecognizeEnabled;
        }

        /**
         * @return dataSourceRecognizer
         */
        public String getDataSourceRecognizer() {
            return this.dataSourceRecognizer;
        }

        /**
         * @return dataSourceReferences
         */
        public java.util.List<DataSourceReferences> getDataSourceReferences() {
            return this.dataSourceReferences;
        }

        /**
         * @return dataSourceStatus
         */
        public String getDataSourceStatus() {
            return this.dataSourceStatus;
        }

        /**
         * @return dataSourceStores
         */
        public java.util.List<DataSourceStores> getDataSourceStores() {
            return this.dataSourceStores;
        }

        /**
         * @return dataSourceTemplateId
         */
        public String getDataSourceTemplateId() {
            return this.dataSourceTemplateId;
        }

        /**
         * @return dataSourceType
         */
        public String getDataSourceType() {
            return this.dataSourceType;
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
         * @return logUserId
         */
        public Long getLogUserId() {
            return this.logUserId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String dataSourceFrom; 
            private String dataSourceId; 
            private String dataSourceName; 
            private Boolean dataSourceRecognizeEnabled; 
            private String dataSourceRecognizer; 
            private java.util.List<DataSourceReferences> dataSourceReferences; 
            private String dataSourceStatus; 
            private java.util.List<DataSourceStores> dataSourceStores; 
            private String dataSourceTemplateId; 
            private String dataSourceType; 
            private String logProjectName; 
            private String logRegionId; 
            private String logStoreName; 
            private Long logUserId; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(DataSources model) {
                this.createTime = model.createTime;
                this.dataSourceFrom = model.dataSourceFrom;
                this.dataSourceId = model.dataSourceId;
                this.dataSourceName = model.dataSourceName;
                this.dataSourceRecognizeEnabled = model.dataSourceRecognizeEnabled;
                this.dataSourceRecognizer = model.dataSourceRecognizer;
                this.dataSourceReferences = model.dataSourceReferences;
                this.dataSourceStatus = model.dataSourceStatus;
                this.dataSourceStores = model.dataSourceStores;
                this.dataSourceTemplateId = model.dataSourceTemplateId;
                this.dataSourceType = model.dataSourceType;
                this.logProjectName = model.logProjectName;
                this.logRegionId = model.logRegionId;
                this.logStoreName = model.logStoreName;
                this.logUserId = model.logUserId;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The data source origin. Valid values:</p>
             * <ul>
             * <li>center</li>
             * <li>custom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>center</p>
             */
            public Builder dataSourceFrom(String dataSourceFrom) {
                this.dataSourceFrom = dataSourceFrom;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-scpfegri73oyoknbc90c</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>The data source name.</p>
             * 
             * <strong>example:</strong>
             * <p>AD_LOG</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>Indicates whether automatic discovery of new Logstores is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
                this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
                return this;
            }

            /**
             * <p>The data source recognizer.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud_sas_account_snapshot</p>
             */
            public Builder dataSourceRecognizer(String dataSourceRecognizer) {
                this.dataSourceRecognizer = dataSourceRecognizer;
                return this;
            }

            /**
             * <p>The list of data ingestion IDs associated with the data source.</p>
             */
            public Builder dataSourceReferences(java.util.List<DataSourceReferences> dataSourceReferences) {
                this.dataSourceReferences = dataSourceReferences;
                return this;
            }

            /**
             * <p>The data source status. Valid values:</p>
             * <ul>
             * <li>unconfigured</li>
             * <li>normal</li>
             * <li>abnormal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>unconfigured</p>
             */
            public Builder dataSourceStatus(String dataSourceStatus) {
                this.dataSourceStatus = dataSourceStatus;
                return this;
            }

            /**
             * <p>The list of log services.</p>
             */
            public Builder dataSourceStores(java.util.List<DataSourceStores> dataSourceStores) {
                this.dataSourceStores = dataSourceStores;
                return this;
            }

            /**
             * <p>The data source template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud_sas_account_snapshot_log_173326*******</p>
             */
            public Builder dataSourceTemplateId(String dataSourceTemplateId) {
                this.dataSourceTemplateId = dataSourceTemplateId;
                return this;
            }

            /**
             * <p>The data source type. Valid values:</p>
             * <ul>
             * <li>preset</li>
             * <li>custom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * <p>The Simple Log Service project name.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun-cloudsiem-data-173326*******-cn-hangzhou</p>
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
             * <p>audit-activity</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * <p>The data ingestion user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>173326*******</p>
             */
            public Builder logUserId(Long logUserId) {
                this.logUserId = logUserId;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DataSources build() {
                return new DataSources(this);
            } 

        } 

    }
}
