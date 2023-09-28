// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductVersionsResponseBody</p>
 */
public class ListProductVersionsResponseBody extends TeaModel {
    @NameInMap("ProductVersionDetails")
    private java.util.List < ProductVersionDetails> productVersionDetails;

    @NameInMap("RequestId")
    private String requestId;

    private ListProductVersionsResponseBody(Builder builder) {
        this.productVersionDetails = builder.productVersionDetails;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return productVersionDetails
     */
    public java.util.List < ProductVersionDetails> getProductVersionDetails() {
        return this.productVersionDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ProductVersionDetails> productVersionDetails; 
        private String requestId; 

        /**
         * The versions of the product.
         */
        public Builder productVersionDetails(java.util.List < ProductVersionDetails> productVersionDetails) {
            this.productVersionDetails = productVersionDetails;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProductVersionsResponseBody build() {
            return new ListProductVersionsResponseBody(this);
        } 

    } 

    public static class ProductVersionDetails extends TeaModel {
        @NameInMap("Active")
        private Boolean active;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Guidance")
        private String guidance;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("ProductVersionId")
        private String productVersionId;

        @NameInMap("ProductVersionName")
        private String productVersionName;

        @NameInMap("TemplateType")
        private String templateType;

        @NameInMap("TemplateUrl")
        private String templateUrl;

        private ProductVersionDetails(Builder builder) {
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

        public static ProductVersionDetails create() {
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

            /**
             * Indicates whether the product version is enabled. Valid values:
             * <p>
             * 
             * true: The product version is enabled. This is the default value. false: The product version is disabled.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * The time when the product version was created.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the product version.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The recommendation information. Valid values:
             * <p>
             * 
             * *   Default: No recommendation information is provided. This is the default value.
             * *   Recommended: the recommended version.
             * *   Latest: the latest version.
             * *   Deprecated: the version that is about to be discontinued.
             */
            public Builder guidance(String guidance) {
                this.guidance = guidance;
                return this;
            }

            /**
             * The ID of the product to which the product version belongs.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * The ID of the product version.
             */
            public Builder productVersionId(String productVersionId) {
                this.productVersionId = productVersionId;
                return this;
            }

            /**
             * The name of the product version.
             */
            public Builder productVersionName(String productVersionName) {
                this.productVersionName = productVersionName;
                return this;
            }

            /**
             * The type of the template.
             * <p>
             * 
             * The value is fixed as RosTerraformTemplate, which indicates the Terraform template that is supported by Resource Orchestration Service (ROS).
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * The URL of the template.
             */
            public Builder templateUrl(String templateUrl) {
                this.templateUrl = templateUrl;
                return this;
            }

            public ProductVersionDetails build() {
                return new ProductVersionDetails(this);
            } 

        } 

    }
}
