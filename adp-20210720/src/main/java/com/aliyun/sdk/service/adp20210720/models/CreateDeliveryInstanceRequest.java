// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeliveryInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDeliveryInstanceRequest</p>
 */
public class CreateDeliveryInstanceRequest extends Request {
    @Body
    @NameInMap("clusterUID")
    private String clusterUID;

    @Body
    @NameInMap("deliverableConfigUID")
    private String deliverableConfigUID;

    @Body
    @NameInMap("deliverableUID")
    private String deliverableUID;

    @Body
    @NameInMap("envUID")
    private String envUID;

    @Body
    @NameInMap("foundation")
    private Foundation foundation;

    @Body
    @NameInMap("products")
    private java.util.List < Products> products;

    @Body
    @NameInMap("templateUID")
    private String templateUID;

    private CreateDeliveryInstanceRequest(Builder builder) {
        super(builder);
        this.clusterUID = builder.clusterUID;
        this.deliverableConfigUID = builder.deliverableConfigUID;
        this.deliverableUID = builder.deliverableUID;
        this.envUID = builder.envUID;
        this.foundation = builder.foundation;
        this.products = builder.products;
        this.templateUID = builder.templateUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeliveryInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterUID
     */
    public String getClusterUID() {
        return this.clusterUID;
    }

    /**
     * @return deliverableConfigUID
     */
    public String getDeliverableConfigUID() {
        return this.deliverableConfigUID;
    }

    /**
     * @return deliverableUID
     */
    public String getDeliverableUID() {
        return this.deliverableUID;
    }

    /**
     * @return envUID
     */
    public String getEnvUID() {
        return this.envUID;
    }

    /**
     * @return foundation
     */
    public Foundation getFoundation() {
        return this.foundation;
    }

    /**
     * @return products
     */
    public java.util.List < Products> getProducts() {
        return this.products;
    }

    /**
     * @return templateUID
     */
    public String getTemplateUID() {
        return this.templateUID;
    }

    public static final class Builder extends Request.Builder<CreateDeliveryInstanceRequest, Builder> {
        private String clusterUID; 
        private String deliverableConfigUID; 
        private String deliverableUID; 
        private String envUID; 
        private Foundation foundation; 
        private java.util.List < Products> products; 
        private String templateUID; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeliveryInstanceRequest request) {
            super(request);
            this.clusterUID = request.clusterUID;
            this.deliverableConfigUID = request.deliverableConfigUID;
            this.deliverableUID = request.deliverableUID;
            this.envUID = request.envUID;
            this.foundation = request.foundation;
            this.products = request.products;
            this.templateUID = request.templateUID;
        } 

        /**
         * clusterUID.
         */
        public Builder clusterUID(String clusterUID) {
            this.putBodyParameter("clusterUID", clusterUID);
            this.clusterUID = clusterUID;
            return this;
        }

        /**
         * deliverableConfigUID.
         */
        public Builder deliverableConfigUID(String deliverableConfigUID) {
            this.putBodyParameter("deliverableConfigUID", deliverableConfigUID);
            this.deliverableConfigUID = deliverableConfigUID;
            return this;
        }

        /**
         * deliverableUID.
         */
        public Builder deliverableUID(String deliverableUID) {
            this.putBodyParameter("deliverableUID", deliverableUID);
            this.deliverableUID = deliverableUID;
            return this;
        }

        /**
         * envUID.
         */
        public Builder envUID(String envUID) {
            this.putBodyParameter("envUID", envUID);
            this.envUID = envUID;
            return this;
        }

        /**
         * foundation.
         */
        public Builder foundation(Foundation foundation) {
            this.putBodyParameter("foundation", foundation);
            this.foundation = foundation;
            return this;
        }

        /**
         * products.
         */
        public Builder products(java.util.List < Products> products) {
            this.putBodyParameter("products", products);
            this.products = products;
            return this;
        }

        /**
         * templateUID.
         */
        public Builder templateUID(String templateUID) {
            this.putBodyParameter("templateUID", templateUID);
            this.templateUID = templateUID;
            return this;
        }

        @Override
        public CreateDeliveryInstanceRequest build() {
            return new CreateDeliveryInstanceRequest(this);
        } 

    } 

    public static class Foundation extends TeaModel {
        @NameInMap("clusterConfig")
        private String clusterConfig;

        @NameInMap("foundationReferenceUID")
        private String foundationReferenceUID;

        @NameInMap("foundationVersion")
        private String foundationVersion;

        @NameInMap("foundationVersionUID")
        private String foundationVersionUID;

        @NameInMap("reusable")
        private String reusable;

        private Foundation(Builder builder) {
            this.clusterConfig = builder.clusterConfig;
            this.foundationReferenceUID = builder.foundationReferenceUID;
            this.foundationVersion = builder.foundationVersion;
            this.foundationVersionUID = builder.foundationVersionUID;
            this.reusable = builder.reusable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Foundation create() {
            return builder().build();
        }

        /**
         * @return clusterConfig
         */
        public String getClusterConfig() {
            return this.clusterConfig;
        }

        /**
         * @return foundationReferenceUID
         */
        public String getFoundationReferenceUID() {
            return this.foundationReferenceUID;
        }

        /**
         * @return foundationVersion
         */
        public String getFoundationVersion() {
            return this.foundationVersion;
        }

        /**
         * @return foundationVersionUID
         */
        public String getFoundationVersionUID() {
            return this.foundationVersionUID;
        }

        /**
         * @return reusable
         */
        public String getReusable() {
            return this.reusable;
        }

        public static final class Builder {
            private String clusterConfig; 
            private String foundationReferenceUID; 
            private String foundationVersion; 
            private String foundationVersionUID; 
            private String reusable; 

            /**
             * clusterConfig.
             */
            public Builder clusterConfig(String clusterConfig) {
                this.clusterConfig = clusterConfig;
                return this;
            }

            /**
             * foundationReferenceUID.
             */
            public Builder foundationReferenceUID(String foundationReferenceUID) {
                this.foundationReferenceUID = foundationReferenceUID;
                return this;
            }

            /**
             * foundationVersion.
             */
            public Builder foundationVersion(String foundationVersion) {
                this.foundationVersion = foundationVersion;
                return this;
            }

            /**
             * foundationVersionUID.
             */
            public Builder foundationVersionUID(String foundationVersionUID) {
                this.foundationVersionUID = foundationVersionUID;
                return this;
            }

            /**
             * reusable.
             */
            public Builder reusable(String reusable) {
                this.reusable = reusable;
                return this;
            }

            public Foundation build() {
                return new Foundation(this);
            } 

        } 

    }
    public static class Products extends TeaModel {
        @NameInMap("namespace")
        private String namespace;

        @NameInMap("order")
        private String order;

        @NameInMap("productName")
        private String productName;

        @NameInMap("productType")
        private String productType;

        @NameInMap("productUID")
        private String productUID;

        @NameInMap("productVersion")
        private String productVersion;

        @NameInMap("productVersionSpecName")
        private String productVersionSpecName;

        @NameInMap("productVersionSpecUID")
        private String productVersionSpecUID;

        @NameInMap("productVersionUID")
        private String productVersionUID;

        private Products(Builder builder) {
            this.namespace = builder.namespace;
            this.order = builder.order;
            this.productName = builder.productName;
            this.productType = builder.productType;
            this.productUID = builder.productUID;
            this.productVersion = builder.productVersion;
            this.productVersionSpecName = builder.productVersionSpecName;
            this.productVersionSpecUID = builder.productVersionSpecUID;
            this.productVersionUID = builder.productVersionUID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Products create() {
            return builder().build();
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return order
         */
        public String getOrder() {
            return this.order;
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
         * @return productUID
         */
        public String getProductUID() {
            return this.productUID;
        }

        /**
         * @return productVersion
         */
        public String getProductVersion() {
            return this.productVersion;
        }

        /**
         * @return productVersionSpecName
         */
        public String getProductVersionSpecName() {
            return this.productVersionSpecName;
        }

        /**
         * @return productVersionSpecUID
         */
        public String getProductVersionSpecUID() {
            return this.productVersionSpecUID;
        }

        /**
         * @return productVersionUID
         */
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public static final class Builder {
            private String namespace; 
            private String order; 
            private String productName; 
            private String productType; 
            private String productUID; 
            private String productVersion; 
            private String productVersionSpecName; 
            private String productVersionSpecUID; 
            private String productVersionUID; 

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * order.
             */
            public Builder order(String order) {
                this.order = order;
                return this;
            }

            /**
             * productName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * productType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * productUID.
             */
            public Builder productUID(String productUID) {
                this.productUID = productUID;
                return this;
            }

            /**
             * productVersion.
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
                return this;
            }

            /**
             * productVersionSpecName.
             */
            public Builder productVersionSpecName(String productVersionSpecName) {
                this.productVersionSpecName = productVersionSpecName;
                return this;
            }

            /**
             * productVersionSpecUID.
             */
            public Builder productVersionSpecUID(String productVersionSpecUID) {
                this.productVersionSpecUID = productVersionSpecUID;
                return this;
            }

            /**
             * productVersionUID.
             */
            public Builder productVersionUID(String productVersionUID) {
                this.productVersionUID = productVersionUID;
                return this;
            }

            public Products build() {
                return new Products(this);
            } 

        } 

    }
}
