// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link GetProductVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetProductVersionResponseBody</p>
 */
public class GetProductVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProductVersionDetail")
    private ProductVersionDetail productVersionDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProductVersionResponseBody(Builder builder) {
        this.productVersionDetail = builder.productVersionDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productVersionDetail
     */
    public ProductVersionDetail getProductVersionDetail() {
        return this.productVersionDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ProductVersionDetail productVersionDetail; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetProductVersionResponseBody model) {
            this.productVersionDetail = model.productVersionDetail;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the product version.</p>
         */
        public Builder productVersionDetail(ProductVersionDetail productVersionDetail) {
            this.productVersionDetail = productVersionDetail;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProductVersionResponseBody build() {
            return new GetProductVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProductVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetProductVersionResponseBody</p>
     */
    public static class ProductVersionDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Guidance")
        private String guidance;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductVersionId")
        private String productVersionId;

        @com.aliyun.core.annotation.NameInMap("ProductVersionName")
        private String productVersionName;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("TemplateUrl")
        private String templateUrl;

        private ProductVersionDetail(Builder builder) {
            this.active = builder.active;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.guidance = builder.guidance;
            this.productId = builder.productId;
            this.productVersionId = builder.productVersionId;
            this.productVersionName = builder.productVersionName;
            this.templateType = builder.templateType;
            this.templateUrl = builder.templateUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductVersionDetail create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return guidance
         */
        public String getGuidance() {
            return this.guidance;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return productVersionId
         */
        public String getProductVersionId() {
            return this.productVersionId;
        }

        /**
         * @return productVersionName
         */
        public String getProductVersionName() {
            return this.productVersionName;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        /**
         * @return templateUrl
         */
        public String getTemplateUrl() {
            return this.templateUrl;
        }

        public static final class Builder {
            private Boolean active; 
            private String createTime; 
            private String description; 
            private String guidance; 
            private String productId; 
            private String productVersionId; 
            private String productVersionName; 
            private String templateType; 
            private String templateUrl; 

            private Builder() {
            } 

            private Builder(ProductVersionDetail model) {
                this.active = model.active;
                this.createTime = model.createTime;
                this.description = model.description;
                this.guidance = model.guidance;
                this.productId = model.productId;
                this.productVersionId = model.productVersionId;
                this.productVersionName = model.productVersionName;
                this.templateType = model.templateType;
                this.templateUrl = model.templateUrl;
            } 

            /**
             * <p>Indicates whether the product version is visible to end users. Valid values:</p>
             * <ul>
             * <li>true: The product version is visible to end users. This is the default value.</li>
             * <li>false: The product version is invisible to end users.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The time when the product version was created.</p>
             * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-12T06:10:37Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the product version.</p>
             * 
             * <strong>example:</strong>
             * <p>The description of the product version.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The recommendation information. Valid values:</p>
             * <ul>
             * <li>Default: No recommendation information is provided. This is the default value.</li>
             * <li>Recommended: the recommendation version.</li>
             * <li>Latest: the latest version.</li>
             * <li>Deprecated: the version that is about to be deprecated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder guidance(String guidance) {
                this.guidance = guidance;
                return this;
            }

            /**
             * <p>The ID of the product to which the product version belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>prod-bp18r7q127****</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The ID of the product version.</p>
             * 
             * <strong>example:</strong>
             * <p>pv-bp15e79d26****</p>
             */
            public Builder productVersionId(String productVersionId) {
                this.productVersionId = productVersionId;
                return this;
            }

            /**
             * <p>The name of the product version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder productVersionName(String productVersionName) {
                this.productVersionName = productVersionName;
                return this;
            }

            /**
             * <p>The type of the product template. Valid values:</p>
             * <ul>
             * <li>RosTerraformTemplate: The Terraform template that is supported by Resource Orchestration Service (ROS).</li>
             * <li>RosStandardTemplate: The standard ROS template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RosTerraformTemplate</p>
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * <p>The URL of the template.</p>
             */
            public Builder templateUrl(String templateUrl) {
                this.templateUrl = templateUrl;
                return this;
            }

            public ProductVersionDetail build() {
                return new ProductVersionDetail(this);
            } 

        } 

    }
}
