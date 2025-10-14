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
 * {@link GetNormalizationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetNormalizationRuleResponseBody</p>
 */
public class GetNormalizationRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NormalizationRule")
    private NormalizationRule normalizationRule;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNormalizationRuleResponseBody(Builder builder) {
        this.normalizationRule = builder.normalizationRule;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNormalizationRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return normalizationRule
     */
    public NormalizationRule getNormalizationRule() {
        return this.normalizationRule;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NormalizationRule normalizationRule; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetNormalizationRuleResponseBody model) {
            this.normalizationRule = model.normalizationRule;
            this.requestId = model.requestId;
        } 

        /**
         * NormalizationRule.
         */
        public Builder normalizationRule(NormalizationRule normalizationRule) {
            this.normalizationRule = normalizationRule;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNormalizationRuleResponseBody build() {
            return new GetNormalizationRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNormalizationRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetNormalizationRuleResponseBody</p>
     */
    public static class NormalizationRule extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleIds")
        private java.util.List<String> normalizationRuleIds;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleMode")
        private String normalizationRuleMode;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleName")
        private String normalizationRuleName;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleStatus")
        private String normalizationRuleStatus;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleType")
        private String normalizationRuleType;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleVersion")
        private Integer normalizationRuleVersion;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaId")
        private String normalizationSchemaId;

        @com.aliyun.core.annotation.NameInMap("OrderField")
        private String orderField;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VendorId")
        private String vendorId;

        private NormalizationRule(Builder builder) {
            this.createTime = builder.createTime;
            this.extendContentPacked = builder.extendContentPacked;
            this.normalizationCategoryId = builder.normalizationCategoryId;
            this.normalizationRuleDescription = builder.normalizationRuleDescription;
            this.normalizationRuleExpression = builder.normalizationRuleExpression;
            this.normalizationRuleFormat = builder.normalizationRuleFormat;
            this.normalizationRuleId = builder.normalizationRuleId;
            this.normalizationRuleIds = builder.normalizationRuleIds;
            this.normalizationRuleMode = builder.normalizationRuleMode;
            this.normalizationRuleName = builder.normalizationRuleName;
            this.normalizationRuleStatus = builder.normalizationRuleStatus;
            this.normalizationRuleType = builder.normalizationRuleType;
            this.normalizationRuleVersion = builder.normalizationRuleVersion;
            this.normalizationSchemaId = builder.normalizationSchemaId;
            this.orderField = builder.orderField;
            this.productId = builder.productId;
            this.updateTime = builder.updateTime;
            this.vendorId = builder.vendorId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationRule create() {
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
         * @return normalizationRuleIds
         */
        public java.util.List<String> getNormalizationRuleIds() {
            return this.normalizationRuleIds;
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
        public Integer getNormalizationRuleVersion() {
            return this.normalizationRuleVersion;
        }

        /**
         * @return normalizationSchemaId
         */
        public String getNormalizationSchemaId() {
            return this.normalizationSchemaId;
        }

        /**
         * @return orderField
         */
        public String getOrderField() {
            return this.orderField;
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
            private java.util.List<String> normalizationRuleIds; 
            private String normalizationRuleMode; 
            private String normalizationRuleName; 
            private String normalizationRuleStatus; 
            private String normalizationRuleType; 
            private Integer normalizationRuleVersion; 
            private String normalizationSchemaId; 
            private String orderField; 
            private String productId; 
            private Long updateTime; 
            private String vendorId; 

            private Builder() {
            } 

            private Builder(NormalizationRule model) {
                this.createTime = model.createTime;
                this.extendContentPacked = model.extendContentPacked;
                this.normalizationCategoryId = model.normalizationCategoryId;
                this.normalizationRuleDescription = model.normalizationRuleDescription;
                this.normalizationRuleExpression = model.normalizationRuleExpression;
                this.normalizationRuleFormat = model.normalizationRuleFormat;
                this.normalizationRuleId = model.normalizationRuleId;
                this.normalizationRuleIds = model.normalizationRuleIds;
                this.normalizationRuleMode = model.normalizationRuleMode;
                this.normalizationRuleName = model.normalizationRuleName;
                this.normalizationRuleStatus = model.normalizationRuleStatus;
                this.normalizationRuleType = model.normalizationRuleType;
                this.normalizationRuleVersion = model.normalizationRuleVersion;
                this.normalizationSchemaId = model.normalizationSchemaId;
                this.orderField = model.orderField;
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
             * NormalizationRuleIds.
             */
            public Builder normalizationRuleIds(java.util.List<String> normalizationRuleIds) {
                this.normalizationRuleIds = normalizationRuleIds;
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
            public Builder normalizationRuleVersion(Integer normalizationRuleVersion) {
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
             * OrderField.
             */
            public Builder orderField(String orderField) {
                this.orderField = orderField;
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

            public NormalizationRule build() {
                return new NormalizationRule(this);
            } 

        } 

    }
}
