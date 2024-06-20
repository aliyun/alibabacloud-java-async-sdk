// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductsResponseBody</p>
 */
public class ListProductsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Products")
    private java.util.List < Products> products;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Services")
    private java.util.List < Services> services;

    private ListProductsResponseBody(Builder builder) {
        this.products = builder.products;
        this.requestId = builder.requestId;
        this.services = builder.services;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductsResponseBody create() {
        return builder().build();
    }

    /**
     * @return products
     */
    public java.util.List < Products> getProducts() {
        return this.products;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return services
     */
    public java.util.List < Services> getServices() {
        return this.services;
    }

    public static final class Builder {
        private java.util.List < Products> products; 
        private String requestId; 
        private java.util.List < Services> services; 

        /**
         * Products.
         */
        public Builder products(java.util.List < Products> products) {
            this.products = products;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Services.
         */
        public Builder services(java.util.List < Services> services) {
            this.services = services;
            return this;
        }

        public ListProductsResponseBody build() {
            return new ListProductsResponseBody(this);
        } 

    } 

    public static class Products extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasPermissionToPurchase")
        private Boolean hasPermissionToPurchase;

        @com.aliyun.core.annotation.NameInMap("IsPurchased")
        private Boolean isPurchased;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductInstanceId")
        private String productInstanceId;

        @com.aliyun.core.annotation.NameInMap("PurchaseUrl")
        private String purchaseUrl;

        private Products(Builder builder) {
            this.hasPermissionToPurchase = builder.hasPermissionToPurchase;
            this.isPurchased = builder.isPurchased;
            this.productCode = builder.productCode;
            this.productInstanceId = builder.productInstanceId;
            this.purchaseUrl = builder.purchaseUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Products create() {
            return builder().build();
        }

        /**
         * @return hasPermissionToPurchase
         */
        public Boolean getHasPermissionToPurchase() {
            return this.hasPermissionToPurchase;
        }

        /**
         * @return isPurchased
         */
        public Boolean getIsPurchased() {
            return this.isPurchased;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productInstanceId
         */
        public String getProductInstanceId() {
            return this.productInstanceId;
        }

        /**
         * @return purchaseUrl
         */
        public String getPurchaseUrl() {
            return this.purchaseUrl;
        }

        public static final class Builder {
            private Boolean hasPermissionToPurchase; 
            private Boolean isPurchased; 
            private String productCode; 
            private String productInstanceId; 
            private String purchaseUrl; 

            /**
             * HasPermissionToPurchase.
             */
            public Builder hasPermissionToPurchase(Boolean hasPermissionToPurchase) {
                this.hasPermissionToPurchase = hasPermissionToPurchase;
                return this;
            }

            /**
             * IsPurchased.
             */
            public Builder isPurchased(Boolean isPurchased) {
                this.isPurchased = isPurchased;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductInstanceId.
             */
            public Builder productInstanceId(String productInstanceId) {
                this.productInstanceId = productInstanceId;
                return this;
            }

            /**
             * PurchaseUrl.
             */
            public Builder purchaseUrl(String purchaseUrl) {
                this.purchaseUrl = purchaseUrl;
                return this;
            }

            public Products build() {
                return new Products(this);
            } 

        } 

    }
    public static class Services extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsOpen")
        private Boolean isOpen;

        @com.aliyun.core.annotation.NameInMap("OpenUrl")
        private String openUrl;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        private Services(Builder builder) {
            this.isOpen = builder.isOpen;
            this.openUrl = builder.openUrl;
            this.serviceCode = builder.serviceCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Services create() {
            return builder().build();
        }

        /**
         * @return isOpen
         */
        public Boolean getIsOpen() {
            return this.isOpen;
        }

        /**
         * @return openUrl
         */
        public String getOpenUrl() {
            return this.openUrl;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        public static final class Builder {
            private Boolean isOpen; 
            private String openUrl; 
            private String serviceCode; 

            /**
             * IsOpen.
             */
            public Builder isOpen(Boolean isOpen) {
                this.isOpen = isOpen;
                return this;
            }

            /**
             * OpenUrl.
             */
            public Builder openUrl(String openUrl) {
                this.openUrl = openUrl;
                return this;
            }

            /**
             * ServiceCode.
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            public Services build() {
                return new Services(this);
            } 

        } 

    }
}
