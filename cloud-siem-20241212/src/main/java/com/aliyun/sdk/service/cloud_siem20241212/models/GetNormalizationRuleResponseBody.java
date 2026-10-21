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
         * <p>The normalization rule.</p>
         */
        public Builder normalizationRule(NormalizationRule normalizationRule) {
            this.normalizationRule = normalizationRule;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
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

        @com.aliyun.core.annotation.NameInMap("NormalizationSecurityDomainId")
        private String normalizationSecurityDomainId;

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
            this.extendFieldStoreMode = builder.extendFieldStoreMode;
            this.normalizationCategoryId = builder.normalizationCategoryId;
            this.normalizationFieldSource = builder.normalizationFieldSource;
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
            this.normalizationSecurityDomainId = builder.normalizationSecurityDomainId;
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
         * @return normalizationSecurityDomainId
         */
        public String getNormalizationSecurityDomainId() {
            return this.normalizationSecurityDomainId;
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
            private String extendFieldStoreMode; 
            private String normalizationCategoryId; 
            private String normalizationFieldSource; 
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
            private String normalizationSecurityDomainId; 
            private String orderField; 
            private String productId; 
            private Long updateTime; 
            private String vendorId; 

            private Builder() {
            } 

            private Builder(NormalizationRule model) {
                this.createTime = model.createTime;
                this.extendContentPacked = model.extendContentPacked;
                this.extendFieldStoreMode = model.extendFieldStoreMode;
                this.normalizationCategoryId = model.normalizationCategoryId;
                this.normalizationFieldSource = model.normalizationFieldSource;
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
                this.normalizationSecurityDomainId = model.normalizationSecurityDomainId;
                this.orderField = model.orderField;
                this.productId = model.productId;
                this.updateTime = model.updateTime;
                this.vendorId = model.vendorId;
            } 

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Specifies whether to pack non-standard fields into the extended field extend_content. Valid values:</p>
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
             * <p>The storage mode for extended fields. Valid values: flat (ingest as-is), reject (do not ingest), and pack (pack into the extend_content field).</p>
             * 
             * <strong>example:</strong>
             * <p>flat</p>
             */
            public Builder extendFieldStoreMode(String extendFieldStoreMode) {
                this.extendFieldStoreMode = extendFieldStoreMode;
                return this;
            }

            /**
             * <p>The category ID of the normalization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>NETWORK_CATEGORY</p>
             */
            public Builder normalizationCategoryId(String normalizationCategoryId) {
                this.normalizationCategoryId = normalizationCategoryId;
                return this;
            }

            /**
             * <p>The field source:</p>
             * <ul>
             * <li>&quot;native&quot;: raw logs</li>
             * <li>&quot;normalized&quot;: normalized logs</li>
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
             * <p>The description of the normalization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>normalization_rule_Z57np</p>
             */
            public Builder normalizationRuleDescription(String normalizationRuleDescription) {
                this.normalizationRuleDescription = normalizationRuleDescription;
                return this;
            }

            /**
             * <p>The expression of the normalization rule.</p>
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
             * <p>The format of the normalization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>SPL</p>
             */
            public Builder normalizationRuleFormat(String normalizationRuleFormat) {
                this.normalizationRuleFormat = normalizationRuleFormat;
                return this;
            }

            /**
             * <p>The ID of the normalization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>nr-z0b2ssjteut85uoh9nzp</p>
             */
            public Builder normalizationRuleId(String normalizationRuleId) {
                this.normalizationRuleId = normalizationRuleId;
                return this;
            }

            /**
             * <p>The IDs of the normalization rules.</p>
             */
            public Builder normalizationRuleIds(java.util.List<String> normalizationRuleIds) {
                this.normalizationRuleIds = normalizationRuleIds;
                return this;
            }

            /**
             * <p>The mode of the normalization rule. Valid values:</p>
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
             * <p>The name of the normalization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>normalization_rule_Z57np</p>
             */
            public Builder normalizationRuleName(String normalizationRuleName) {
                this.normalizationRuleName = normalizationRuleName;
                return this;
            }

            /**
             * <p>The status of the normalization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>started</p>
             */
            public Builder normalizationRuleStatus(String normalizationRuleStatus) {
                this.normalizationRuleStatus = normalizationRuleStatus;
                return this;
            }

            /**
             * <p>The type of the normalization rule. Valid values:</p>
             * <ul>
             * <li>predefined: predefined normalization rule</li>
             * <li>custom: custom normalization rule</li>
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
             * <p>The version of the normalization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>V1</p>
             */
            public Builder normalizationRuleVersion(Integer normalizationRuleVersion) {
                this.normalizationRuleVersion = normalizationRuleVersion;
                return this;
            }

            /**
             * <p>The ID of the normalization schema.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP_ACTIVITY</p>
             */
            public Builder normalizationSchemaId(String normalizationSchemaId) {
                this.normalizationSchemaId = normalizationSchemaId;
                return this;
            }

            /**
             * <p>The ID of the normalization security domain.</p>
             * 
             * <strong>example:</strong>
             * <p>NETWORK_AND_WEB_SECURITY</p>
             */
            public Builder normalizationSecurityDomainId(String normalizationSecurityDomainId) {
                this.normalizationSecurityDomainId = normalizationSecurityDomainId;
                return this;
            }

            /**
             * <p>The field used to sort the rule list. Valid values:</p>
             * <ul>
             * <li>GmtModified: sort by modification time</li>
             * <li>Id: sort by rule ID (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GmtModified</p>
             */
            public Builder orderField(String orderField) {
                this.orderField = orderField;
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
             * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the vendor corresponding to the normalization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud</p>
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
