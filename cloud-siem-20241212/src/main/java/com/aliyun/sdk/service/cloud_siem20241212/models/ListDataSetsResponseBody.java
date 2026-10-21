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
         * <p>The list of datasets.</p>
         */
        public Builder dataSets(java.util.List<DataSets> dataSets) {
            this.dataSets = dataSets;
            return this;
        }

        /**
         * <p>The maximum number of results to return when you use the NextToken-based pagination method. Valid values: 1 to 100. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next query.</p>
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
         * <p>157CFBB5-B56F-566F-8991-B3C51799****</p>
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
             * <p>The dataset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dataset-nhcrmjpx1zsorlaq****</p>
             */
            public Builder dataSetId(String dataSetId) {
                this.dataSetId = dataSetId;
                return this;
            }

            /**
             * <p>The ID of the rule or playbook associated with the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>456232</p>
             */
            public Builder dataSetReferenceId(String dataSetReferenceId) {
                this.dataSetReferenceId = dataSetReferenceId;
                return this;
            }

            /**
             * <p>The name of the rule or playbook associated with the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>playbook_name</p>
             */
            public Builder dataSetReferenceName(String dataSetReferenceName) {
                this.dataSetReferenceName = dataSetReferenceName;
                return this;
            }

            /**
             * <p>The type of service associated with the dataset. Valid values:</p>
             * <ul>
             * <li>custom_rule: custom rule.</li>
             * <li>playbook: playbook.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>playbook</p>
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
             * <p>The automatic recognition status. Valid values:</p>
             * <ul>
             * <li>enabled: enabled.</li>
             * <li>disabled: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder autoRecognizeStatus(String autoRecognizeStatus) {
                this.autoRecognizeStatus = autoRecognizeStatus;
                return this;
            }

            /**
             * <p>The IP type identified by the recognizer. Valid values:</p>
             * <ul>
             * <li>sas_vulnerability_scanner_ip: IP addresses of the Security Center vulnerability web scanner.</li>
             * <li>waf_back_source_ip: back-to-origin IP addresses of Web Application Firewall (WAF).</li>
             * <li>ddos_back_source_ip: back-to-origin IP addresses of Anti-DDoS.</li>
             * <li>esa_back_source_ip: back-to-origin node IP addresses of Edge Security Acceleration (ESA).</li>
             * <li>ecs_public_ip: public IP addresses of Elastic Compute Service (ECS) instances.</li>
             * <li>slb_public_ip: public IP addresses of Server Load Balancer (SLB) instances.</li>
             * <li>vpc_eip: elastic IP addresses (EIPs).</li>
             * <li>cdn_back_source_ip: back-to-origin IP addresses of Content Delivery Network (CDN).</li>
             * <li>ga_back_source_ip: back-to-origin IP addresses of Global Accelerator (GA).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>waf_back_source_ip</p>
             */
            public Builder ipWhitelistRecognizerType(String ipWhitelistRecognizerType) {
                this.ipWhitelistRecognizerType = ipWhitelistRecognizerType;
                return this;
            }

            /**
             * <p>The recognition scope. Valid values:</p>
             * <ul>
             * <li>current_account: current account only.</li>
             * <li>rd_accounts: multi-account enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>current_account</p>
             */
            public Builder recognizeScope(String recognizeScope) {
                this.recognizeScope = recognizeScope;
                return this;
            }

            /**
             * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1713787368000</p>
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
             * <p>The creation time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1713787368000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The dataset description.</p>
             * 
             * <strong>example:</strong>
             * <p>lmftest desc</p>
             */
            public Builder dataSetDescription(String dataSetDescription) {
                this.dataSetDescription = dataSetDescription;
                return this;
            }

            /**
             * <p>The unique key name of the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder dataSetFieldKeyName(String dataSetFieldKeyName) {
                this.dataSetFieldKeyName = dataSetFieldKeyName;
                return this;
            }

            /**
             * <p>The field names of the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;ip&quot;,&quot;region&quot;]</p>
             */
            public Builder dataSetFieldNames(String dataSetFieldNames) {
                this.dataSetFieldNames = dataSetFieldNames;
                return this;
            }

            /**
             * <p>The name of the uploaded dataset file.</p>
             * 
             * <strong>example:</strong>
             * <p>cloudsiem-dataset/1358117679873357_174338773****.csv</p>
             */
            public Builder dataSetFileName(String dataSetFileName) {
                this.dataSetFileName = dataSetFileName;
                return this;
            }

            /**
             * <p>The dataset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dataset-t8ha6p7k61rmniqw****</p>
             */
            public Builder dataSetId(String dataSetId) {
                this.dataSetId = dataSetId;
                return this;
            }

            /**
             * <p>The dataset name.</p>
             * 
             * <strong>example:</strong>
             * <p>lmftest</p>
             */
            public Builder dataSetName(String dataSetName) {
                this.dataSetName = dataSetName;
                return this;
            }

            /**
             * <p>The dataset reference data.</p>
             */
            public Builder dataSetReferences(java.util.List<DataSetReferences> dataSetReferences) {
                this.dataSetReferences = dataSetReferences;
                return this;
            }

            /**
             * <p>The dataset status. Valid values:</p>
             * <ul>
             * <li>0: deleted.</li>
             * <li>1: enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dataSetStatus(Integer dataSetStatus) {
                this.dataSetStatus = dataSetStatus;
                return this;
            }

            /**
             * <p>The dataset type. Valid values:</p>
             * <ul>
             * <li>custom: custom dataset.</li>
             * <li>preset: predefined dataset.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>preset</p>
             */
            public Builder dataSetType(String dataSetType) {
                this.dataSetType = dataSetType;
                return this;
            }

            /**
             * <p>The list of recognizers.</p>
             */
            public Builder ipWhitelistRecognizers(java.util.List<IpWhitelistRecognizers> ipWhitelistRecognizers) {
                this.ipWhitelistRecognizers = ipWhitelistRecognizers;
                return this;
            }

            /**
             * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1713787368000</p>
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
