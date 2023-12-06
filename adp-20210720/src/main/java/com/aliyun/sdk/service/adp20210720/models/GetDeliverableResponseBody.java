// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeliverableResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeliverableResponseBody</p>
 */
public class GetDeliverableResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private GetDeliverableResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeliverableResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String msg; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public GetDeliverableResponseBody build() {
            return new GetDeliverableResponseBody(this);
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

        private Foundation(Builder builder) {
            this.clusterConfig = builder.clusterConfig;
            this.foundationReferenceUID = builder.foundationReferenceUID;
            this.foundationVersion = builder.foundationVersion;
            this.foundationVersionUID = builder.foundationVersionUID;
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

        public static final class Builder {
            private String clusterConfig; 
            private String foundationReferenceUID; 
            private String foundationVersion; 
            private String foundationVersionUID; 

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

            public Foundation build() {
                return new Foundation(this);
            } 

        } 

    }
    public static class Products extends TeaModel {
        @NameInMap("namespace")
        private String namespace;

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
    public static class Data extends TeaModel {
        @NameInMap("foundation")
        private Foundation foundation;

        @NameInMap("products")
        private java.util.List < Products> products;

        @NameInMap("uid")
        private String uid;

        private Data(Builder builder) {
            this.foundation = builder.foundation;
            this.products = builder.products;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private Foundation foundation; 
            private java.util.List < Products> products; 
            private String uid; 

            /**
             * foundation.
             */
            public Builder foundation(Foundation foundation) {
                this.foundation = foundation;
                return this;
            }

            /**
             * products.
             */
            public Builder products(java.util.List < Products> products) {
                this.products = products;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
