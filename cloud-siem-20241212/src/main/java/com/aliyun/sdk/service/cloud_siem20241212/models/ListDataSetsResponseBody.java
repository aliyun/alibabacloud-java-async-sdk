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
 * {@link ListDataSetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSetsResponseBody</p>
 */
public class ListDataSetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSets")
    private java.util.List<DataSets> dataSets;

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

    private ListDataSetsResponseBody(Builder builder) {
        this.dataSets = builder.dataSets;
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

    public static ListDataSetsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSets
     */
    public java.util.List<DataSets> getDataSets() {
        return this.dataSets;
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
        private java.util.List<DataSets> dataSets; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDataSetsResponseBody model) {
            this.dataSets = model.dataSets;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * DataSets.
         */
        public Builder dataSets(java.util.List<DataSets> dataSets) {
            this.dataSets = dataSets;
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

        public ListDataSetsResponseBody build() {
            return new ListDataSetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataSetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSetsResponseBody</p>
     */
    public static class DataSetReferences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSetId")
        private String dataSetId;

        @com.aliyun.core.annotation.NameInMap("DataSetReferenceId")
        private String dataSetReferenceId;

        @com.aliyun.core.annotation.NameInMap("DataSetReferenceName")
        private String dataSetReferenceName;

        @com.aliyun.core.annotation.NameInMap("DataSetReferenceType")
        private String dataSetReferenceType;

        private DataSetReferences(Builder builder) {
            this.dataSetId = builder.dataSetId;
            this.dataSetReferenceId = builder.dataSetReferenceId;
            this.dataSetReferenceName = builder.dataSetReferenceName;
            this.dataSetReferenceType = builder.dataSetReferenceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSetReferences create() {
            return builder().build();
        }

        /**
         * @return dataSetId
         */
        public String getDataSetId() {
            return this.dataSetId;
        }

        /**
         * @return dataSetReferenceId
         */
        public String getDataSetReferenceId() {
            return this.dataSetReferenceId;
        }

        /**
         * @return dataSetReferenceName
         */
        public String getDataSetReferenceName() {
            return this.dataSetReferenceName;
        }

        /**
         * @return dataSetReferenceType
         */
        public String getDataSetReferenceType() {
            return this.dataSetReferenceType;
        }

        public static final class Builder {
            private String dataSetId; 
            private String dataSetReferenceId; 
            private String dataSetReferenceName; 
            private String dataSetReferenceType; 

            private Builder() {
            } 

            private Builder(DataSetReferences model) {
                this.dataSetId = model.dataSetId;
                this.dataSetReferenceId = model.dataSetReferenceId;
                this.dataSetReferenceName = model.dataSetReferenceName;
                this.dataSetReferenceType = model.dataSetReferenceType;
            } 

            /**
             * DataSetId.
             */
            public Builder dataSetId(String dataSetId) {
                this.dataSetId = dataSetId;
                return this;
            }

            /**
             * DataSetReferenceId.
             */
            public Builder dataSetReferenceId(String dataSetReferenceId) {
                this.dataSetReferenceId = dataSetReferenceId;
                return this;
            }

            /**
             * DataSetReferenceName.
             */
            public Builder dataSetReferenceName(String dataSetReferenceName) {
                this.dataSetReferenceName = dataSetReferenceName;
                return this;
            }

            /**
             * DataSetReferenceType.
             */
            public Builder dataSetReferenceType(String dataSetReferenceType) {
                this.dataSetReferenceType = dataSetReferenceType;
                return this;
            }

            public DataSetReferences build() {
                return new DataSetReferences(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataSetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSetsResponseBody</p>
     */
    public static class IpWhitelistRecognizers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRecognizeStatus")
        private String autoRecognizeStatus;

        @com.aliyun.core.annotation.NameInMap("IpWhitelistRecognizerType")
        private String ipWhitelistRecognizerType;

        @com.aliyun.core.annotation.NameInMap("RecognizeScope")
        private String recognizeScope;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private IpWhitelistRecognizers(Builder builder) {
            this.autoRecognizeStatus = builder.autoRecognizeStatus;
            this.ipWhitelistRecognizerType = builder.ipWhitelistRecognizerType;
            this.recognizeScope = builder.recognizeScope;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpWhitelistRecognizers create() {
            return builder().build();
        }

        /**
         * @return autoRecognizeStatus
         */
        public String getAutoRecognizeStatus() {
            return this.autoRecognizeStatus;
        }

        /**
         * @return ipWhitelistRecognizerType
         */
        public String getIpWhitelistRecognizerType() {
            return this.ipWhitelistRecognizerType;
        }

        /**
         * @return recognizeScope
         */
        public String getRecognizeScope() {
            return this.recognizeScope;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String autoRecognizeStatus; 
            private String ipWhitelistRecognizerType; 
            private String recognizeScope; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(IpWhitelistRecognizers model) {
                this.autoRecognizeStatus = model.autoRecognizeStatus;
                this.ipWhitelistRecognizerType = model.ipWhitelistRecognizerType;
                this.recognizeScope = model.recognizeScope;
                this.updateTime = model.updateTime;
            } 

            /**
             * AutoRecognizeStatus.
             */
            public Builder autoRecognizeStatus(String autoRecognizeStatus) {
                this.autoRecognizeStatus = autoRecognizeStatus;
                return this;
            }

            /**
             * IpWhitelistRecognizerType.
             */
            public Builder ipWhitelistRecognizerType(String ipWhitelistRecognizerType) {
                this.ipWhitelistRecognizerType = ipWhitelistRecognizerType;
                return this;
            }

            /**
             * RecognizeScope.
             */
            public Builder recognizeScope(String recognizeScope) {
                this.recognizeScope = recognizeScope;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public IpWhitelistRecognizers build() {
                return new IpWhitelistRecognizers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataSetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSetsResponseBody</p>
     */
    public static class DataSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataSetDescription")
        private String dataSetDescription;

        @com.aliyun.core.annotation.NameInMap("DataSetFieldKeyName")
        private String dataSetFieldKeyName;

        @com.aliyun.core.annotation.NameInMap("DataSetFieldNames")
        private String dataSetFieldNames;

        @com.aliyun.core.annotation.NameInMap("DataSetFileName")
        private String dataSetFileName;

        @com.aliyun.core.annotation.NameInMap("DataSetId")
        private String dataSetId;

        @com.aliyun.core.annotation.NameInMap("DataSetName")
        private String dataSetName;

        @com.aliyun.core.annotation.NameInMap("DataSetReferences")
        private java.util.List<DataSetReferences> dataSetReferences;

        @com.aliyun.core.annotation.NameInMap("DataSetStatus")
        private Integer dataSetStatus;

        @com.aliyun.core.annotation.NameInMap("DataSetType")
        private String dataSetType;

        @com.aliyun.core.annotation.NameInMap("IpWhitelistRecognizers")
        private java.util.List<IpWhitelistRecognizers> ipWhitelistRecognizers;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private DataSets(Builder builder) {
            this.createTime = builder.createTime;
            this.dataSetDescription = builder.dataSetDescription;
            this.dataSetFieldKeyName = builder.dataSetFieldKeyName;
            this.dataSetFieldNames = builder.dataSetFieldNames;
            this.dataSetFileName = builder.dataSetFileName;
            this.dataSetId = builder.dataSetId;
            this.dataSetName = builder.dataSetName;
            this.dataSetReferences = builder.dataSetReferences;
            this.dataSetStatus = builder.dataSetStatus;
            this.dataSetType = builder.dataSetType;
            this.ipWhitelistRecognizers = builder.ipWhitelistRecognizers;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSets create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSetDescription
         */
        public String getDataSetDescription() {
            return this.dataSetDescription;
        }

        /**
         * @return dataSetFieldKeyName
         */
        public String getDataSetFieldKeyName() {
            return this.dataSetFieldKeyName;
        }

        /**
         * @return dataSetFieldNames
         */
        public String getDataSetFieldNames() {
            return this.dataSetFieldNames;
        }

        /**
         * @return dataSetFileName
         */
        public String getDataSetFileName() {
            return this.dataSetFileName;
        }

        /**
         * @return dataSetId
         */
        public String getDataSetId() {
            return this.dataSetId;
        }

        /**
         * @return dataSetName
         */
        public String getDataSetName() {
            return this.dataSetName;
        }

        /**
         * @return dataSetReferences
         */
        public java.util.List<DataSetReferences> getDataSetReferences() {
            return this.dataSetReferences;
        }

        /**
         * @return dataSetStatus
         */
        public Integer getDataSetStatus() {
            return this.dataSetStatus;
        }

        /**
         * @return dataSetType
         */
        public String getDataSetType() {
            return this.dataSetType;
        }

        /**
         * @return ipWhitelistRecognizers
         */
        public java.util.List<IpWhitelistRecognizers> getIpWhitelistRecognizers() {
            return this.ipWhitelistRecognizers;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String dataSetDescription; 
            private String dataSetFieldKeyName; 
            private String dataSetFieldNames; 
            private String dataSetFileName; 
            private String dataSetId; 
            private String dataSetName; 
            private java.util.List<DataSetReferences> dataSetReferences; 
            private Integer dataSetStatus; 
            private String dataSetType; 
            private java.util.List<IpWhitelistRecognizers> ipWhitelistRecognizers; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(DataSets model) {
                this.createTime = model.createTime;
                this.dataSetDescription = model.dataSetDescription;
                this.dataSetFieldKeyName = model.dataSetFieldKeyName;
                this.dataSetFieldNames = model.dataSetFieldNames;
                this.dataSetFileName = model.dataSetFileName;
                this.dataSetId = model.dataSetId;
                this.dataSetName = model.dataSetName;
                this.dataSetReferences = model.dataSetReferences;
                this.dataSetStatus = model.dataSetStatus;
                this.dataSetType = model.dataSetType;
                this.ipWhitelistRecognizers = model.ipWhitelistRecognizers;
                this.updateTime = model.updateTime;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataSetDescription.
             */
            public Builder dataSetDescription(String dataSetDescription) {
                this.dataSetDescription = dataSetDescription;
                return this;
            }

            /**
             * DataSetFieldKeyName.
             */
            public Builder dataSetFieldKeyName(String dataSetFieldKeyName) {
                this.dataSetFieldKeyName = dataSetFieldKeyName;
                return this;
            }

            /**
             * DataSetFieldNames.
             */
            public Builder dataSetFieldNames(String dataSetFieldNames) {
                this.dataSetFieldNames = dataSetFieldNames;
                return this;
            }

            /**
             * DataSetFileName.
             */
            public Builder dataSetFileName(String dataSetFileName) {
                this.dataSetFileName = dataSetFileName;
                return this;
            }

            /**
             * DataSetId.
             */
            public Builder dataSetId(String dataSetId) {
                this.dataSetId = dataSetId;
                return this;
            }

            /**
             * DataSetName.
             */
            public Builder dataSetName(String dataSetName) {
                this.dataSetName = dataSetName;
                return this;
            }

            /**
             * DataSetReferences.
             */
            public Builder dataSetReferences(java.util.List<DataSetReferences> dataSetReferences) {
                this.dataSetReferences = dataSetReferences;
                return this;
            }

            /**
             * DataSetStatus.
             */
            public Builder dataSetStatus(Integer dataSetStatus) {
                this.dataSetStatus = dataSetStatus;
                return this;
            }

            /**
             * DataSetType.
             */
            public Builder dataSetType(String dataSetType) {
                this.dataSetType = dataSetType;
                return this;
            }

            /**
             * IpWhitelistRecognizers.
             */
            public Builder ipWhitelistRecognizers(java.util.List<IpWhitelistRecognizers> ipWhitelistRecognizers) {
                this.ipWhitelistRecognizers = ipWhitelistRecognizers;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DataSets build() {
                return new DataSets(this);
            } 

        } 

    }
}
