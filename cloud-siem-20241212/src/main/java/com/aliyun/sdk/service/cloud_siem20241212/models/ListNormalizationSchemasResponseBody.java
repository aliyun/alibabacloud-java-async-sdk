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
 * {@link ListNormalizationSchemasResponseBody} extends {@link TeaModel}
 *
 * <p>ListNormalizationSchemasResponseBody</p>
 */
public class ListNormalizationSchemasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("NormalizationSchemas")
    private java.util.List<NormalizationSchemas> normalizationSchemas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListNormalizationSchemasResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.normalizationSchemas = builder.normalizationSchemas;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNormalizationSchemasResponseBody create() {
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
     * @return normalizationSchemas
     */
    public java.util.List<NormalizationSchemas> getNormalizationSchemas() {
        return this.normalizationSchemas;
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
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<NormalizationSchemas> normalizationSchemas; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListNormalizationSchemasResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.normalizationSchemas = model.normalizationSchemas;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
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
         * <p>The pagination token for the next query. You do not need to specify this parameter for the first query or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of normalization schemas.</p>
         */
        public Builder normalizationSchemas(java.util.List<NormalizationSchemas> normalizationSchemas) {
            this.normalizationSchemas = normalizationSchemas;
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

        public ListNormalizationSchemasResponseBody build() {
            return new ListNormalizationSchemasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNormalizationSchemasResponseBody} extends {@link TeaModel}
     *
     * <p>ListNormalizationSchemasResponseBody</p>
     */
    public static class NormalizationSchemas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("NormalizationCategoryId")
        private String normalizationCategoryId;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldSource")
        private String normalizationFieldSource;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaDescription")
        private String normalizationSchemaDescription;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaFrom")
        private String normalizationSchemaFrom;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaId")
        private String normalizationSchemaId;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaName")
        private String normalizationSchemaName;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaTargetLogStore")
        private String normalizationSchemaTargetLogStore;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaType")
        private String normalizationSchemaType;

        @com.aliyun.core.annotation.NameInMap("NormalizationSecurityDomainId")
        private String normalizationSecurityDomainId;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("RecommendEntities")
        private java.util.List<String> recommendEntities;

        @com.aliyun.core.annotation.NameInMap("TargetLogStore")
        private String targetLogStore;

        @com.aliyun.core.annotation.NameInMap("TargetStoreView")
        private String targetStoreView;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VendorId")
        private String vendorId;

        private NormalizationSchemas(Builder builder) {
            this.createTime = builder.createTime;
            this.normalizationCategoryId = builder.normalizationCategoryId;
            this.normalizationFieldSource = builder.normalizationFieldSource;
            this.normalizationSchemaDescription = builder.normalizationSchemaDescription;
            this.normalizationSchemaFrom = builder.normalizationSchemaFrom;
            this.normalizationSchemaId = builder.normalizationSchemaId;
            this.normalizationSchemaName = builder.normalizationSchemaName;
            this.normalizationSchemaTargetLogStore = builder.normalizationSchemaTargetLogStore;
            this.normalizationSchemaType = builder.normalizationSchemaType;
            this.normalizationSecurityDomainId = builder.normalizationSecurityDomainId;
            this.productId = builder.productId;
            this.recommendEntities = builder.recommendEntities;
            this.targetLogStore = builder.targetLogStore;
            this.targetStoreView = builder.targetStoreView;
            this.updateTime = builder.updateTime;
            this.vendorId = builder.vendorId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationSchemas create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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
         * @return normalizationSchemaDescription
         */
        public String getNormalizationSchemaDescription() {
            return this.normalizationSchemaDescription;
        }

        /**
         * @return normalizationSchemaFrom
         */
        public String getNormalizationSchemaFrom() {
            return this.normalizationSchemaFrom;
        }

        /**
         * @return normalizationSchemaId
         */
        public String getNormalizationSchemaId() {
            return this.normalizationSchemaId;
        }

        /**
         * @return normalizationSchemaName
         */
        public String getNormalizationSchemaName() {
            return this.normalizationSchemaName;
        }

        /**
         * @return normalizationSchemaTargetLogStore
         */
        public String getNormalizationSchemaTargetLogStore() {
            return this.normalizationSchemaTargetLogStore;
        }

        /**
         * @return normalizationSchemaType
         */
        public String getNormalizationSchemaType() {
            return this.normalizationSchemaType;
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
         * @return recommendEntities
         */
        public java.util.List<String> getRecommendEntities() {
            return this.recommendEntities;
        }

        /**
         * @return targetLogStore
         */
        public String getTargetLogStore() {
            return this.targetLogStore;
        }

        /**
         * @return targetStoreView
         */
        public String getTargetStoreView() {
            return this.targetStoreView;
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
            private String normalizationCategoryId; 
            private String normalizationFieldSource; 
            private String normalizationSchemaDescription; 
            private String normalizationSchemaFrom; 
            private String normalizationSchemaId; 
            private String normalizationSchemaName; 
            private String normalizationSchemaTargetLogStore; 
            private String normalizationSchemaType; 
            private String normalizationSecurityDomainId; 
            private String productId; 
            private java.util.List<String> recommendEntities; 
            private String targetLogStore; 
            private String targetStoreView; 
            private Long updateTime; 
            private String vendorId; 

            private Builder() {
            } 

            private Builder(NormalizationSchemas model) {
                this.createTime = model.createTime;
                this.normalizationCategoryId = model.normalizationCategoryId;
                this.normalizationFieldSource = model.normalizationFieldSource;
                this.normalizationSchemaDescription = model.normalizationSchemaDescription;
                this.normalizationSchemaFrom = model.normalizationSchemaFrom;
                this.normalizationSchemaId = model.normalizationSchemaId;
                this.normalizationSchemaName = model.normalizationSchemaName;
                this.normalizationSchemaTargetLogStore = model.normalizationSchemaTargetLogStore;
                this.normalizationSchemaType = model.normalizationSchemaType;
                this.normalizationSecurityDomainId = model.normalizationSecurityDomainId;
                this.productId = model.productId;
                this.recommendEntities = model.recommendEntities;
                this.targetLogStore = model.targetLogStore;
                this.targetStoreView = model.targetStoreView;
                this.updateTime = model.updateTime;
                this.vendorId = model.vendorId;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1736386610000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * <p>The field source. Valid values:</p>
             * <ul>
             * <li>normalized: normalized field.</li>
             * <li>native: native field.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normalized</p>
             */
            public Builder normalizationFieldSource(String normalizationFieldSource) {
                this.normalizationFieldSource = normalizationFieldSource;
                return this;
            }

            /**
             * <p>The normalization schema description.</p>
             * 
             * <strong>example:</strong>
             * <p>Network flow log</p>
             */
            public Builder normalizationSchemaDescription(String normalizationSchemaDescription) {
                this.normalizationSchemaDescription = normalizationSchemaDescription;
                return this;
            }

            /**
             * <p>The normalization schema source. Valid values:</p>
             * <ul>
             * <li>preset: predefined.</li>
             * <li>custom: custom.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>preset</p>
             */
            public Builder normalizationSchemaFrom(String normalizationSchemaFrom) {
                this.normalizationSchemaFrom = normalizationSchemaFrom;
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
             * <p>The normalization schema name.</p>
             * 
             * <strong>example:</strong>
             * <p>normalization_rule_Z57np</p>
             */
            public Builder normalizationSchemaName(String normalizationSchemaName) {
                this.normalizationSchemaName = normalizationSchemaName;
                return this;
            }

            /**
             * <p>The LogStore to which the normalization output is written.</p>
             * 
             * <strong>example:</strong>
             * <p>network-activity</p>
             */
            public Builder normalizationSchemaTargetLogStore(String normalizationSchemaTargetLogStore) {
                this.normalizationSchemaTargetLogStore = normalizationSchemaTargetLogStore;
                return this;
            }

            /**
             * <p>The normalization schema type.</p>
             * 
             * <strong>example:</strong>
             * <p>log</p>
             */
            public Builder normalizationSchemaType(String normalizationSchemaType) {
                this.normalizationSchemaType = normalizationSchemaType;
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
             * <p>sas</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * RecommendEntities.
             */
            public Builder recommendEntities(java.util.List<String> recommendEntities) {
                this.recommendEntities = recommendEntities;
                return this;
            }

            /**
             * <p>The Simple Log Service LogStore.</p>
             * 
             * <strong>example:</strong>
             * <p>network-activity</p>
             */
            public Builder targetLogStore(String targetLogStore) {
                this.targetLogStore = targetLogStore;
                return this;
            }

            /**
             * <p>The Simple Log Service StoreView.</p>
             * 
             * <strong>example:</strong>
             * <p>network-activity</p>
             */
            public Builder targetStoreView(String targetStoreView) {
                this.targetStoreView = targetStoreView;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1736386610000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The vendor ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba</p>
             */
            public Builder vendorId(String vendorId) {
                this.vendorId = vendorId;
                return this;
            }

            public NormalizationSchemas build() {
                return new NormalizationSchemas(this);
            } 

        } 

    }
}
