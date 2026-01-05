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
 * {@link GetProductAsAdminResponseBody} extends {@link TeaModel}
 *
 * <p>GetProductAsAdminResponseBody</p>
 */
public class GetProductAsAdminResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProductDetail")
    private ProductDetail productDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagOptions")
    private java.util.List<TagOptions> tagOptions;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<TagOptions> getTagOptions() {
        return this.tagOptions;
    }

    public static final class Builder {
        private ProductDetail productDetail; 
        private String requestId; 
        private java.util.List<TagOptions> tagOptions; 

        private Builder() {
        } 

        private Builder(GetProductAsAdminResponseBody model) {
            this.productDetail = model.productDetail;
            this.requestId = model.requestId;
            this.tagOptions = model.tagOptions;
        } 

        /**
         * <p>The information about the product.</p>
         */
        public Builder productDetail(ProductDetail productDetail) {
            this.productDetail = productDetail;
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

        /**
         * <p>The tag options associated with the product.</p>
         */
        public Builder tagOptions(java.util.List<TagOptions> tagOptions) {
            this.tagOptions = tagOptions;
            return this;
        }

        public GetProductAsAdminResponseBody build() {
            return new GetProductAsAdminResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProductAsAdminResponseBody} extends {@link TeaModel}
     *
     * <p>GetProductAsAdminResponseBody</p>
     */
    public static class ProductDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ProductArn")
        private String productArn;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("ProviderName")
        private String providerName;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
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

            private Builder() {
            } 

            private Builder(ProductDetail model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.productArn = model.productArn;
                this.productId = model.productId;
                this.productName = model.productName;
                this.productType = model.productType;
                this.providerName = model.providerName;
                this.templateType = model.templateType;
            } 

            /**
             * <p>The creation time.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-12T06:10:37Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a product description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:servicecatalog:cn-hangzhou:146611588617****:product/prod-bp18r7q127****</p>
             */
            public Builder productArn(String productArn) {
                this.productArn = productArn;
                return this;
            }

            /**
             * <p>The ID of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>prod-bp18r7q127****</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The name of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>DEMO-Create an ECS instance</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The type of the product.</p>
             * <p>The value is fixed as Ros, which indicates Resource Orchestration Service (ROS).</p>
             * 
             * <strong>example:</strong>
             * <p>Ros</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The provider of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>IT team</p>
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            /**
             * <p>The type of the product template. Valid values:</p>
             * <ul>
             * <li>RosTerraformTemplate: the Terraform template that is supported by Resource Orchestration Service (ROS).</li>
             * <li>RosStandardTemplate: the standard ROS template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RosTerraformTemplate</p>
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
    /**
     * 
     * {@link GetProductAsAdminResponseBody} extends {@link TeaModel}
     *
     * <p>GetProductAsAdminResponseBody</p>
     */
    public static class TagOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("TagOptionId")
        private String tagOptionId;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(TagOptions model) {
                this.active = model.active;
                this.key = model.key;
                this.owner = model.owner;
                this.tagOptionId = model.tagOptionId;
                this.value = model.value;
            } 

            /**
             * <p>Indicates whether the tag option is enabled. Valid values:</p>
             * <ul>
             * <li>true (default)</li>
             * <li>false</li>
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
             * <p>The key of the tag option.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The ID of the owner of the tag option.</p>
             * 
             * <strong>example:</strong>
             * <p>133413081827****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the tag option.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-bp1q65xd3j****</p>
             */
            public Builder tagOptionId(String tagOptionId) {
                this.tagOptionId = tagOptionId;
                return this;
            }

            /**
             * <p>The value of the tag option.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
