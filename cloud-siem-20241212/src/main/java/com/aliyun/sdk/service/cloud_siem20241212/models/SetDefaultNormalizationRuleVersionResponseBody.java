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
 * {@link SetDefaultNormalizationRuleVersionResponseBody} extends {@link TeaModel}
 *
 * <p>SetDefaultNormalizationRuleVersionResponseBody</p>
 */
public class SetDefaultNormalizationRuleVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleVersion")
    private NormalizationRuleVersion normalizationRuleVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetDefaultNormalizationRuleVersionResponseBody(Builder builder) {
        this.normalizationRuleVersion = builder.normalizationRuleVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDefaultNormalizationRuleVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return normalizationRuleVersion
     */
    public NormalizationRuleVersion getNormalizationRuleVersion() {
        return this.normalizationRuleVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NormalizationRuleVersion normalizationRuleVersion; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SetDefaultNormalizationRuleVersionResponseBody model) {
            this.normalizationRuleVersion = model.normalizationRuleVersion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The normalization rule version.</p>
         */
        public Builder normalizationRuleVersion(NormalizationRuleVersion normalizationRuleVersion) {
            this.normalizationRuleVersion = normalizationRuleVersion;
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

        public SetDefaultNormalizationRuleVersionResponseBody build() {
            return new SetDefaultNormalizationRuleVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SetDefaultNormalizationRuleVersionResponseBody} extends {@link TeaModel}
     *
     * <p>SetDefaultNormalizationRuleVersionResponseBody</p>
     */
    public static class NormalizationRuleVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

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

        @com.aliyun.core.annotation.NameInMap("NormalizationSecurityDomainId")
        private String normalizationSecurityDomainId;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VendorId")
        private String vendorId;

        private NormalizationRuleVersion(Builder builder) {
            this.createTime = builder.createTime;
            this.normalizationCategoryId = builder.normalizationCategoryId;
            this.normalizationRuleDescription = builder.normalizationRuleDescription;
            this.normalizationRuleExpression = builder.normalizationRuleExpression;
            this.normalizationRuleFormat = builder.normalizationRuleFormat;
            this.normalizationRuleId = builder.normalizationRuleId;
            this.normalizationRuleName = builder.normalizationRuleName;
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

        public static NormalizationRuleVersion create() {
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
            private String normalizationCategoryId; 
            private String normalizationRuleDescription; 
            private String normalizationRuleExpression; 
            private String normalizationRuleFormat; 
            private String normalizationRuleId; 
            private String normalizationRuleName; 
            private String normalizationRuleStatus; 
            private String normalizationRuleType; 
            private Integer normalizationRuleVersion; 
            private String normalizationSchemaId; 
            private String normalizationSecurityDomainId; 
            private String productId; 
            private Long updateTime; 
            private String vendorId; 

            private Builder() {
            } 

            private Builder(NormalizationRuleVersion model) {
                this.createTime = model.createTime;
                this.normalizationCategoryId = model.normalizationCategoryId;
                this.normalizationRuleDescription = model.normalizationRuleDescription;
                this.normalizationRuleExpression = model.normalizationRuleExpression;
                this.normalizationRuleFormat = model.normalizationRuleFormat;
                this.normalizationRuleId = model.normalizationRuleId;
                this.normalizationRuleName = model.normalizationRuleName;
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
             * <p>The time when the normalization rule version was created. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
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
            public Builder normalizationRuleVersion(Integer normalizationRuleVersion) {
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
             * <p>The normalization security domain ID.</p>
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
             * <p>The time when the normalization rule version was last updated. The value is a UNIX timestamp in milliseconds.</p>
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

            public NormalizationRuleVersion build() {
                return new NormalizationRuleVersion(this);
            } 

        } 

    }
}
