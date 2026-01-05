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
 * {@link ListProductsAsEndUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductsAsEndUserResponseBody</p>
 */
public class ListProductsAsEndUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("ProductSummaries")
    private java.util.List<ProductSummaries> productSummaries;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListProductsAsEndUserResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productSummaries = builder.productSummaries;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductsAsEndUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return productSummaries
     */
    public java.util.List<ProductSummaries> getProductSummaries() {
        return this.productSummaries;
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

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<ProductSummaries> productSummaries; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListProductsAsEndUserResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.productSummaries = model.productSummaries;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The products.</p>
         */
        public Builder productSummaries(java.util.List<ProductSummaries> productSummaries) {
            this.productSummaries = productSummaries;
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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProductsAsEndUserResponseBody build() {
            return new ListProductsAsEndUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProductsAsEndUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductsAsEndUserResponseBody</p>
     */
    public static class ProductSummaries extends TeaModel {
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

        private ProductSummaries(Builder builder) {
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

        public static ProductSummaries create() {
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

            private Builder(ProductSummaries model) {
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
             * <li>false: The default launch option does not exist. In this case, the PortfolioId parameter is required when the product is launched or when the information about the product instance is updated. For more information about the PortfolioId parameter, see <a href="~~ListLaunchOptions~~">ListLaunchOptions</a>.</li>
             * </ul>
             * <blockquote>
             * <p> If the product is added to only one product portfolio, the default launch option exists. If the product is added to multiple product portfolios, multiple launch options exist at the same time. However, no default launch options exist.</p>
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
             * <p>The product ID.</p>
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
             * <p>The value is set to Ros, which indicates Resource Orchestration Service (ROS).</p>
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
             * <li>RosTerraformTemplate: the Terraform template that is supported by ROS.</li>
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

            public ProductSummaries build() {
                return new ProductSummaries(this);
            } 

        } 

    }
}
