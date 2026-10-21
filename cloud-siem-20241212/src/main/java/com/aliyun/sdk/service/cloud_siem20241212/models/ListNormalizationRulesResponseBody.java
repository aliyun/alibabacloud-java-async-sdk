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
 * {@link ListNormalizationRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNormalizationRulesResponseBody</p>
 */
public class ListNormalizationRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("NormalizationRules")
    private java.util.List<NormalizationRules> normalizationRules;

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

    private ListNormalizationRulesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.normalizationRules = builder.normalizationRules;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNormalizationRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return normalizationRules
     */
    public java.util.List<NormalizationRules> getNormalizationRules() {
        return this.normalizationRules;
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
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<NormalizationRules> normalizationRules; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(ListNormalizationRulesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.normalizationRules = model.normalizationRules;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
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
         * <p>The pagination token for the next query. You do not need to specify this parameter for the first query or if no more results exist. If a next query is required, set this parameter to the NextToken value returned by the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of normalization rules.</p>
         */
        public Builder normalizationRules(java.util.List<NormalizationRules> normalizationRules) {
            this.normalizationRules = normalizationRules;
            return this;
        }

        /**
         * <p>The page number of the current page.</p>
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
         * <p>2</p>
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
         * <p>5</p>
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

        public ListNormalizationRulesResponseBody build() {
            return new ListNormalizationRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNormalizationRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNormalizationRulesResponseBody</p>
     */
    public static class NormalizationRuleReferences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataIngestionId")
        private String dataIngestionId;

        private NormalizationRuleReferences(Builder builder) {
            this.dataIngestionId = builder.dataIngestionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationRuleReferences create() {
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

            private Builder(NormalizationRuleReferences model) {
                this.dataIngestionId = model.dataIngestionId;
            } 

            /**
             * <p>The data ingestion ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud_bot_flow_ingestion_173326*******</p>
             */
            public Builder dataIngestionId(String dataIngestionId) {
                this.dataIngestionId = dataIngestionId;
                return this;
            }

            public NormalizationRuleReferences build() {
                return new NormalizationRuleReferences(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNormalizationRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNormalizationRulesResponseBody</p>
     */
    public static class NormalizationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("ExtendContentPacked")
        private String extendContentPacked;

        @com.aliyun.core.annotation.NameInMap("ExtendFieldStoreMode")
        private String extendFieldStoreMode;

        @com.aliyun.core.annotation.NameInMap("NormalizationCategoryId")
        private String normalizationCategoryId;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldSource")
        private String normalizationFieldSource;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleDescription")
        private String normalizationRuleDescription;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleExpression")
        private String normalizationRuleExpression;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleFormat")
        private String normalizationRuleFormat;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleId")
        private String normalizationRuleId;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleMode")
        private String normalizationRuleMode;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleName")
        private String normalizationRuleName;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleReferences")
        private java.util.List<NormalizationRuleReferences> normalizationRuleReferences;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleStatus")
        private String normalizationRuleStatus;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleType")
        private String normalizationRuleType;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleVersion")
        private String normalizationRuleVersion;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaId")
        private String normalizationSchemaId;

        @com.aliyun.core.annotation.NameInMap("NormalizationSecurityDomainId")
        private String normalizationSecurityDomainId;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VendorId")
        private String vendorId;

        private NormalizationRules(Builder builder) {
            this.createTime = builder.createTime;
            this.extendContentPacked = builder.extendContentPacked;
            this.extendFieldStoreMode = builder.extendFieldStoreMode;
            this.normalizationCategoryId = builder.normalizationCategoryId;
            this.normalizationFieldSource = builder.normalizationFieldSource;
            this.normalizationRuleDescription = builder.normalizationRuleDescription;
            this.normalizationRuleExpression = builder.normalizationRuleExpression;
            this.normalizationRuleFormat = builder.normalizationRuleFormat;
            this.normalizationRuleId = builder.normalizationRuleId;
            this.normalizationRuleMode = builder.normalizationRuleMode;
            this.normalizationRuleName = builder.normalizationRuleName;
            this.normalizationRuleReferences = builder.normalizationRuleReferences;
            this.normalizationRuleStatus = builder.normalizationRuleStatus;
            this.normalizationRuleType = builder.normalizationRuleType;
            this.normalizationRuleVersion = builder.normalizationRuleVersion;
            this.normalizationSchemaId = builder.normalizationSchemaId;
            this.normalizationSecurityDomainId = builder.normalizationSecurityDomainId;
            this.productId = builder.productId;
            this.updateTime = builder.updateTime;
            this.vendorId = builder.vendorId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationRules create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return extendContentPacked
         */
        public String getExtendContentPacked() {
            return this.extendContentPacked;
        }

        /**
         * @return extendFieldStoreMode
         */
        public String getExtendFieldStoreMode() {
            return this.extendFieldStoreMode;
        }

        /**
         * @return normalizationCategoryId
         */
        public String getNormalizationCategoryId() {
            return this.normalizationCategoryId;
        }

        /**
         * @return normalizationFieldSource
         */
        public String getNormalizationFieldSource() {
            return this.normalizationFieldSource;
        }

        /**
         * @return normalizationRuleDescription
         */
        public String getNormalizationRuleDescription() {
            return this.normalizationRuleDescription;
        }

        /**
         * @return normalizationRuleExpression
         */
        public String getNormalizationRuleExpression() {
            return this.normalizationRuleExpression;
        }

        /**
         * @return normalizationRuleFormat
         */
        public String getNormalizationRuleFormat() {
            return this.normalizationRuleFormat;
        }

        /**
         * @return normalizationRuleId
         */
        public String getNormalizationRuleId() {
            return this.normalizationRuleId;
        }

        /**
         * @return normalizationRuleMode
         */
        public String getNormalizationRuleMode() {
            return this.normalizationRuleMode;
        }

        /**
         * @return normalizationRuleName
         */
        public String getNormalizationRuleName() {
            return this.normalizationRuleName;
        }

        /**
         * @return normalizationRuleReferences
         */
        public java.util.List<NormalizationRuleReferences> getNormalizationRuleReferences() {
            return this.normalizationRuleReferences;
        }

        /**
         * @return normalizationRuleStatus
         */
        public String getNormalizationRuleStatus() {
            return this.normalizationRuleStatus;
        }

        /**
         * @return normalizationRuleType
         */
        public String getNormalizationRuleType() {
            return this.normalizationRuleType;
        }

        /**
         * @return normalizationRuleVersion
         */
        public String getNormalizationRuleVersion() {
            return this.normalizationRuleVersion;
        }

        /**
         * @return normalizationSchemaId
         */
        public String getNormalizationSchemaId() {
            return this.normalizationSchemaId;
        }

        /**
         * @return normalizationSecurityDomainId
         */
        public String getNormalizationSecurityDomainId() {
            return this.normalizationSecurityDomainId;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vendorId
         */
        public String getVendorId() {
            return this.vendorId;
        }

        public static final class Builder {
            private Long createTime; 
            private String extendContentPacked; 
            private String extendFieldStoreMode; 
            private String normalizationCategoryId; 
            private String normalizationFieldSource; 
            private String normalizationRuleDescription; 
            private String normalizationRuleExpression; 
            private String normalizationRuleFormat; 
            private String normalizationRuleId; 
            private String normalizationRuleMode; 
            private String normalizationRuleName; 
            private java.util.List<NormalizationRuleReferences> normalizationRuleReferences; 
            private String normalizationRuleStatus; 
            private String normalizationRuleType; 
            private String normalizationRuleVersion; 
            private String normalizationSchemaId; 
            private String normalizationSecurityDomainId; 
            private String productId; 
            private Long updateTime; 
            private String vendorId; 

            private Builder() {
            } 

            private Builder(NormalizationRules model) {
                this.createTime = model.createTime;
                this.extendContentPacked = model.extendContentPacked;
                this.extendFieldStoreMode = model.extendFieldStoreMode;
                this.normalizationCategoryId = model.normalizationCategoryId;
                this.normalizationFieldSource = model.normalizationFieldSource;
                this.normalizationRuleDescription = model.normalizationRuleDescription;
                this.normalizationRuleExpression = model.normalizationRuleExpression;
                this.normalizationRuleFormat = model.normalizationRuleFormat;
                this.normalizationRuleId = model.normalizationRuleId;
                this.normalizationRuleMode = model.normalizationRuleMode;
                this.normalizationRuleName = model.normalizationRuleName;
                this.normalizationRuleReferences = model.normalizationRuleReferences;
                this.normalizationRuleStatus = model.normalizationRuleStatus;
                this.normalizationRuleType = model.normalizationRuleType;
                this.normalizationRuleVersion = model.normalizationRuleVersion;
                this.normalizationSchemaId = model.normalizationSchemaId;
                this.normalizationSecurityDomainId = model.normalizationSecurityDomainId;
                this.productId = model.productId;
                this.updateTime = model.updateTime;
                this.vendorId = model.vendorId;
            } 

            /**
             * <p>The creation time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Specifies whether non-standard fields are packed into the extend_content field. Valid values:</p>
             * <ul>
             * <li>enabled: Enabled.</li>
             * <li>disabled: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder extendContentPacked(String extendContentPacked) {
                this.extendContentPacked = extendContentPacked;
                return this;
            }

            /**
             * <p>The extended field storage mode. Valid values:</p>
             * <ul>
             * <li>flat: ingested as-is.</li>
             * <li>reject: not ingested.</li>
             * <li>pack: packed into the extend_content field.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>flat</p>
             */
            public Builder extendFieldStoreMode(String extendFieldStoreMode) {
                this.extendFieldStoreMode = extendFieldStoreMode;
                return this;
            }

            /**
             * <p>The normalization rule category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>NETWORK_CATEGORY</p>
             */
            public Builder normalizationCategoryId(String normalizationCategoryId) {
                this.normalizationCategoryId = normalizationCategoryId;
                return this;
            }

            /**
             * <p>The field source.</p>
             * 
             * <strong>example:</strong>
             * <p>normalized</p>
             */
            public Builder normalizationFieldSource(String normalizationFieldSource) {
                this.normalizationFieldSource = normalizationFieldSource;
                return this;
            }

            /**
             * <p>The normalization rule description.</p>
             * 
             * <strong>example:</strong>
             * <p>normalization_rule_Z57np</p>
             */
            public Builder normalizationRuleDescription(String normalizationRuleDescription) {
                this.normalizationRuleDescription = normalizationRuleDescription;
                return this;
            }

            /**
             * <p>The normalization rule expression.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>| pack-fields -include=\&quot;[\s\S]+\&quot; as extend_content</li>
             * </ul>
             */
            public Builder normalizationRuleExpression(String normalizationRuleExpression) {
                this.normalizationRuleExpression = normalizationRuleExpression;
                return this;
            }

            /**
             * <p>The normalization rule format.</p>
             * 
             * <strong>example:</strong>
             * <p>SPL</p>
             */
            public Builder normalizationRuleFormat(String normalizationRuleFormat) {
                this.normalizationRuleFormat = normalizationRuleFormat;
                return this;
            }

            /**
             * <p>The normalization rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>nr-z0b2ssjteut85uoh9nzp</p>
             */
            public Builder normalizationRuleId(String normalizationRuleId) {
                this.normalizationRuleId = normalizationRuleId;
                return this;
            }

            /**
             * <p>The normalization rule mode. Valid values:</p>
             * <ul>
             * <li>both</li>
             * <li>scan</li>
             * <li>realtime</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>both</p>
             */
            public Builder normalizationRuleMode(String normalizationRuleMode) {
                this.normalizationRuleMode = normalizationRuleMode;
                return this;
            }

            /**
             * <p>The normalization rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>normalization_rule_Z57np</p>
             */
            public Builder normalizationRuleName(String normalizationRuleName) {
                this.normalizationRuleName = normalizationRuleName;
                return this;
            }

            /**
             * <p>The list of associated collection policies.</p>
             */
            public Builder normalizationRuleReferences(java.util.List<NormalizationRuleReferences> normalizationRuleReferences) {
                this.normalizationRuleReferences = normalizationRuleReferences;
                return this;
            }

            /**
             * <p>The normalization rule status.</p>
             * 
             * <strong>example:</strong>
             * <p>started</p>
             */
            public Builder normalizationRuleStatus(String normalizationRuleStatus) {
                this.normalizationRuleStatus = normalizationRuleStatus;
                return this;
            }

            /**
             * <p>The normalization rule type. Valid values:</p>
             * <ul>
             * <li>predefined: predefined normalization rule.</li>
             * <li>custom: custom normalization rule.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>predefined</p>
             */
            public Builder normalizationRuleType(String normalizationRuleType) {
                this.normalizationRuleType = normalizationRuleType;
                return this;
            }

            /**
             * <p>The current version of the normalization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>V1</p>
             */
            public Builder normalizationRuleVersion(String normalizationRuleVersion) {
                this.normalizationRuleVersion = normalizationRuleVersion;
                return this;
            }

            /**
             * <p>The normalization schema ID.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP_ACTIVITY</p>
             */
            public Builder normalizationSchemaId(String normalizationSchemaId) {
                this.normalizationSchemaId = normalizationSchemaId;
                return this;
            }

            /**
             * <p>The security domain ID.</p>
             * 
             * <strong>example:</strong>
             * <p>NETWORK_AND_WEB_SECURITY</p>
             */
            public Builder normalizationSecurityDomainId(String normalizationSecurityDomainId) {
                this.normalizationSecurityDomainId = normalizationSecurityDomainId;
                return this;
            }

            /**
             * <p>The product ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud_sas</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The vendor ID associated with the normalization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud</p>
             */
            public Builder vendorId(String vendorId) {
                this.vendorId = vendorId;
                return this;
            }

            public NormalizationRules build() {
                return new NormalizationRules(this);
            } 

        } 

    }
}
