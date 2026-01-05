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
 * {@link GetProductAsEndUserResponseBody} extends {@link TeaModel}
 *
 * <p>GetProductAsEndUserResponseBody</p>
 */
public class GetProductAsEndUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProductSummary")
    private ProductSummary productSummary;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProductAsEndUserResponseBody(Builder builder) {
        this.productSummary = builder.productSummary;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductAsEndUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productSummary
     */
    public ProductSummary getProductSummary() {
        return this.productSummary;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ProductSummary productSummary; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetProductAsEndUserResponseBody model) {
            this.productSummary = model.productSummary;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the product.</p>
         */
        public Builder productSummary(ProductSummary productSummary) {
            this.productSummary = productSummary;
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

        public GetProductAsEndUserResponseBody build() {
            return new GetProductAsEndUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProductAsEndUserResponseBody} extends {@link TeaModel}
     *
     * <p>GetProductAsEndUserResponseBody</p>
     */
    public static class ProductSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HasDefaultLaunchOption")
        private Boolean hasDefaultLaunchOption;

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

        private ProductSummary(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.hasDefaultLaunchOption = builder.hasDefaultLaunchOption;
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

        public static ProductSummary create() {
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
         * @return hasDefaultLaunchOption
         */
        public Boolean getHasDefaultLaunchOption() {
            return this.hasDefaultLaunchOption;
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
            private Boolean hasDefaultLaunchOption; 
            private String productArn; 
            private String productId; 
            private String productName; 
            private String productType; 
            private String providerName; 
            private String templateType; 

            private Builder() {
            } 

            private Builder(ProductSummary model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.hasDefaultLaunchOption = model.hasDefaultLaunchOption;
                this.productArn = model.productArn;
                this.productId = model.productId;
                this.productName = model.productName;
                this.productType = model.productType;
                this.providerName = model.providerName;
                this.templateType = model.templateType;
            } 

            /**
             * <p>The time when the product was created.</p>
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
             * <p>The description of the product.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the default launch option exists. Valid values:</p>
             * <ul>
             * <li>true: The default launch option exists. In this case, the PortfolioId parameter is not required when the product is launched or when the information about the product instance is updated.</li>
             * <li>false: The default launch option does not exist. In this case, the PortfolioId parameter is required when the product is launched or when the information about the product instance is updated. For more information about how to obtain the value of the PortfolioId parameter, see <a href="~~ListLaunchOptions~~">ListLaunchOptions</a>.</li>
             * </ul>
             * <blockquote>
             * <p>If the product is added to only one product portfolio, the default launch option exists. If the product is added to multiple product portfolios, multiple launch options exist at the same time. However, no default launch options exist.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasDefaultLaunchOption(Boolean hasDefaultLaunchOption) {
                this.hasDefaultLaunchOption = hasDefaultLaunchOption;
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
             * <p>DEMO-Create an ECS instance.</p>
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

            public ProductSummary build() {
                return new ProductSummary(this);
            } 

        } 

    }
}
