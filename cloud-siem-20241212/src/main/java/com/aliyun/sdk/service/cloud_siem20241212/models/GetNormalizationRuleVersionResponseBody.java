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
 * {@link GetNormalizationRuleVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetNormalizationRuleVersionResponseBody</p>
 */
public class GetNormalizationRuleVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleVersion")
    private NormalizationRuleVersion normalizationRuleVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNormalizationRuleVersionResponseBody(Builder builder) {
        this.normalizationRuleVersion = builder.normalizationRuleVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNormalizationRuleVersionResponseBody create() {
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

        private Builder(GetNormalizationRuleVersionResponseBody model) {
            this.normalizationRuleVersion = model.normalizationRuleVersion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The version of the normalization rule.</p>
         */
        public Builder normalizationRuleVersion(NormalizationRuleVersion normalizationRuleVersion) {
            this.normalizationRuleVersion = normalizationRuleVersion;
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

        public GetNormalizationRuleVersionResponseBody build() {
            return new GetNormalizationRuleVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNormalizationRuleVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetNormalizationRuleVersionResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleVersionName")
        private String normalizationRuleVersionName;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaId")
        private String normalizationSchemaId;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

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
            this.normalizationRuleVersionName = builder.normalizationRuleVersionName;
            this.normalizationSchemaId = builder.normalizationSchemaId;
            this.productId = builder.productId;
            this.regionId = builder.regionId;
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
         * @return normalizationRuleVersionName
         */
        public String getNormalizationRuleVersionName() {
            return this.normalizationRuleVersionName;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
            private String normalizationRuleVersionName; 
            private String normalizationSchemaId; 
            private String productId; 
            private String regionId; 
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
                this.normalizationRuleVersionName = model.normalizationRuleVersionName;
                this.normalizationSchemaId = model.normalizationSchemaId;
                this.productId = model.productId;
                this.regionId = model.regionId;
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
             * <p>The version name of the normalization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder normalizationRuleVersionName(String normalizationRuleVersionName) {
                this.normalizationRuleVersionName = normalizationRuleVersionName;
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
             * <p>The ID of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud_sas</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The region where the data management center of Threat Analysis is located. Select the region of the management center based on the region where your assets are located. Valid values:</p>
             * <ul>
             * <li>cn-hangzhou: Assets are located in the Chinese mainland.</li>
             * <li>ap-southeast-1: Assets are located outside the Chinese mainland.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * <p>The ID of the vendor that corresponds to the normalization rule.</p>
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
