// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductsAsEndUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductsAsEndUserResponseBody</p>
 */
public class ListProductsAsEndUserResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("ProductSummaries")
    private java.util.List < ProductSummaries> productSummaries;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public java.util.List < ProductSummaries> getProductSummaries() {
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
        private java.util.List < ProductSummaries> productSummaries; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The products.
         */
        public Builder productSummaries(java.util.List < ProductSummaries> productSummaries) {
            this.productSummaries = productSummaries;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProductsAsEndUserResponseBody build() {
            return new ListProductsAsEndUserResponseBody(this);
        } 

    } 

    public static class ProductSummaries extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("HasDefaultLaunchOption")
        private Boolean hasDefaultLaunchOption;

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

        private ProductSummaries(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.hasDefaultLaunchOption = builder.hasDefaultLaunchOption;
            this.productArn = builder.productArn;
            this.productId = builder.productId;
            this.productName = builder.productName;
            this.productType = builder.productType;
            this.providerName = builder.providerName;
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

        public static final class Builder {
            private String createTime; 
            private String description; 
            private Boolean hasDefaultLaunchOption; 
            private String productArn; 
            private String productId; 
            private String productName; 
            private String productType; 
            private String providerName; 

            /**
             * The time when the product was created.
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
             * Indicates whether the default launch option exists. Valid values:
             * <p>
             * 
             * *   true: The default launch option exists. In this case, the PortfolioId parameter is not required when the product is launched or when the information about the product instance is updated.
             * *   false: The default launch option does not exist. In this case, the PortfolioId parameter is required when the product is launched or when the information about the product instance is updated. For more information about how to obtain the value of the PortfolioId parameter, see [ListLaunchOptions](~~ListLaunchOptions~~).
             * 
             * > If the product is added to only one product portfolio, the default launch option exists. If the product is added to multiple product portfolios, multiple launch options exist at the same time. However, no default launch options exist.
             */
            public Builder hasDefaultLaunchOption(Boolean hasDefaultLaunchOption) {
                this.hasDefaultLaunchOption = hasDefaultLaunchOption;
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

            public ProductSummaries build() {
                return new ProductSummaries(this);
            } 

        } 

    }
}
