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
         * NormalizationRules.
         */
        public Builder normalizationRules(java.util.List<NormalizationRules> normalizationRules) {
            this.normalizationRules = normalizationRules;
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

        /**
         * TotalPage.
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
             * DataIngestionId.
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

        @com.aliyun.core.annotation.NameInMap("NormalizationCategoryId")
        private String normalizationCategoryId;

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

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VendorId")
        private String vendorId;

        private NormalizationRules(Builder builder) {
            this.createTime = builder.createTime;
            this.extendContentPacked = builder.extendContentPacked;
            this.normalizationCategoryId = builder.normalizationCategoryId;
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
         * @return normalizationCategoryId
         */
        public String getNormalizationCategoryId() {
            return this.normalizationCategoryId;
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
            private String normalizationCategoryId; 
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
            private String productId; 
            private Long updateTime; 
            private String vendorId; 

            private Builder() {
            } 

            private Builder(NormalizationRules model) {
                this.createTime = model.createTime;
                this.extendContentPacked = model.extendContentPacked;
                this.normalizationCategoryId = model.normalizationCategoryId;
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
                this.productId = model.productId;
                this.updateTime = model.updateTime;
                this.vendorId = model.vendorId;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExtendContentPacked.
             */
            public Builder extendContentPacked(String extendContentPacked) {
                this.extendContentPacked = extendContentPacked;
                return this;
            }

            /**
             * NormalizationCategoryId.
             */
            public Builder normalizationCategoryId(String normalizationCategoryId) {
                this.normalizationCategoryId = normalizationCategoryId;
                return this;
            }

            /**
             * NormalizationRuleDescription.
             */
            public Builder normalizationRuleDescription(String normalizationRuleDescription) {
                this.normalizationRuleDescription = normalizationRuleDescription;
                return this;
            }

            /**
             * NormalizationRuleExpression.
             */
            public Builder normalizationRuleExpression(String normalizationRuleExpression) {
                this.normalizationRuleExpression = normalizationRuleExpression;
                return this;
            }

            /**
             * NormalizationRuleFormat.
             */
            public Builder normalizationRuleFormat(String normalizationRuleFormat) {
                this.normalizationRuleFormat = normalizationRuleFormat;
                return this;
            }

            /**
             * NormalizationRuleId.
             */
            public Builder normalizationRuleId(String normalizationRuleId) {
                this.normalizationRuleId = normalizationRuleId;
                return this;
            }

            /**
             * NormalizationRuleMode.
             */
            public Builder normalizationRuleMode(String normalizationRuleMode) {
                this.normalizationRuleMode = normalizationRuleMode;
                return this;
            }

            /**
             * NormalizationRuleName.
             */
            public Builder normalizationRuleName(String normalizationRuleName) {
                this.normalizationRuleName = normalizationRuleName;
                return this;
            }

            /**
             * NormalizationRuleReferences.
             */
            public Builder normalizationRuleReferences(java.util.List<NormalizationRuleReferences> normalizationRuleReferences) {
                this.normalizationRuleReferences = normalizationRuleReferences;
                return this;
            }

            /**
             * NormalizationRuleStatus.
             */
            public Builder normalizationRuleStatus(String normalizationRuleStatus) {
                this.normalizationRuleStatus = normalizationRuleStatus;
                return this;
            }

            /**
             * NormalizationRuleType.
             */
            public Builder normalizationRuleType(String normalizationRuleType) {
                this.normalizationRuleType = normalizationRuleType;
                return this;
            }

            /**
             * NormalizationRuleVersion.
             */
            public Builder normalizationRuleVersion(String normalizationRuleVersion) {
                this.normalizationRuleVersion = normalizationRuleVersion;
                return this;
            }

            /**
             * NormalizationSchemaId.
             */
            public Builder normalizationSchemaId(String normalizationSchemaId) {
                this.normalizationSchemaId = normalizationSchemaId;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VendorId.
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
