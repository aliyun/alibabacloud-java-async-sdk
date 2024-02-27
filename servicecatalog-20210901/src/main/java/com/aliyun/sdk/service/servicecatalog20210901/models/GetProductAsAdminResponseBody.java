// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductAsAdminResponseBody} extends {@link TeaModel}
 *
 * <p>GetProductAsAdminResponseBody</p>
 */
public class GetProductAsAdminResponseBody extends TeaModel {
    @NameInMap("ProductDetail")
    private ProductDetail productDetail;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagOptions")
    private java.util.List < TagOptions> tagOptions;

    private GetProductAsAdminResponseBody(Builder builder) {
        this.productDetail = builder.productDetail;
        this.requestId = builder.requestId;
        this.tagOptions = builder.tagOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductAsAdminResponseBody create() {
        return builder().build();
    }

    /**
     * @return productDetail
     */
    public ProductDetail getProductDetail() {
        return this.productDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tagOptions
     */
    public java.util.List < TagOptions> getTagOptions() {
        return this.tagOptions;
    }

    public static final class Builder {
        private ProductDetail productDetail; 
        private String requestId; 
        private java.util.List < TagOptions> tagOptions; 

        /**
         * The information about the product.
         */
        public Builder productDetail(ProductDetail productDetail) {
            this.productDetail = productDetail;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The tag options associated with the product.
         */
        public Builder tagOptions(java.util.List < TagOptions> tagOptions) {
            this.tagOptions = tagOptions;
            return this;
        }

        public GetProductAsAdminResponseBody build() {
            return new GetProductAsAdminResponseBody(this);
        } 

    } 

    public static class ProductDetail extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ProductArn")
        private String productArn;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("ProductType")
        private String productType;

        @NameInMap("ProviderName")
        private String providerName;

        @NameInMap("TemplateType")
        private String templateType;

        private ProductDetail(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.productArn = builder.productArn;
            this.productId = builder.productId;
            this.productName = builder.productName;
            this.productType = builder.productType;
            this.providerName = builder.providerName;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductDetail create() {
            return builder().build();
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
         * @return productArn
         */
        public String getProductArn() {
            return this.productArn;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return providerName
         */
        public String getProviderName() {
            return this.providerName;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String productArn; 
            private String productId; 
            private String productName; 
            private String productType; 
            private String providerName; 
            private String templateType; 

            /**
             * The creation time.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the product.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the product.
             */
            public Builder productArn(String productArn) {
                this.productArn = productArn;
                return this;
            }

            /**
             * The ID of the product.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * The name of the product.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * The type of the product.
             * <p>
             * 
             * The value is fixed as Ros, which indicates Resource Orchestration Service (ROS).
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * The provider of the product.
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            public ProductDetail build() {
                return new ProductDetail(this);
            } 

        } 

    }
    public static class TagOptions extends TeaModel {
        @NameInMap("Active")
        private Boolean active;

        @NameInMap("Key")
        private String key;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("TagOptionId")
        private String tagOptionId;

        @NameInMap("Value")
        private String value;

        private TagOptions(Builder builder) {
            this.active = builder.active;
            this.key = builder.key;
            this.owner = builder.owner;
            this.tagOptionId = builder.tagOptionId;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagOptions create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return tagOptionId
         */
        public String getTagOptionId() {
            return this.tagOptionId;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean active; 
            private String key; 
            private String owner; 
            private String tagOptionId; 
            private String value; 

            /**
             * Indicates whether the tag option is enabled. Valid values:
             * <p>
             * 
             * - true (default)
             * - false
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * The key of the tag option.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The ID of the owner of the tag option.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The ID of the tag option.
             */
            public Builder tagOptionId(String tagOptionId) {
                this.tagOptionId = tagOptionId;
                return this;
            }

            /**
             * The value of the tag option.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagOptions build() {
                return new TagOptions(this);
            } 

        } 

    }
}
