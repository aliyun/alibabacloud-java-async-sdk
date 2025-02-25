// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ListCmsInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCmsInstancesResponseBody</p>
 */
public class ListCmsInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCmsInstancesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCmsInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCmsInstancesResponseBody build() {
            return new ListCmsInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCmsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCmsInstancesResponseBody</p>
     */
    public static class Products extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Descr")
        private String descr;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Instance")
        private String instance;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Prod")
        private String prod;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Products(Builder builder) {
            this.descr = builder.descr;
            this.id = builder.id;
            this.instance = builder.instance;
            this.name = builder.name;
            this.prod = builder.prod;
            this.source = builder.source;
            this.state = builder.state;
            this.time = builder.time;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Products create() {
            return builder().build();
        }

        /**
         * @return descr
         */
        public String getDescr() {
            return this.descr;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return prod
         */
        public String getProd() {
            return this.prod;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String descr; 
            private String id; 
            private String instance; 
            private String name; 
            private String prod; 
            private String source; 
            private String state; 
            private String time; 
            private String type; 
            private String url; 

            /**
             * Descr.
             */
            public Builder descr(String descr) {
                this.descr = descr;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Instance.
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Prod.
             */
            public Builder prod(String prod) {
                this.prod = prod;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Products build() {
                return new Products(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCmsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCmsInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableTag")
        private Boolean enableTag;

        @com.aliyun.core.annotation.NameInMap("Products")
        private java.util.List<Products> products;

        private Data(Builder builder) {
            this.enableTag = builder.enableTag;
            this.products = builder.products;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enableTag
         */
        public Boolean getEnableTag() {
            return this.enableTag;
        }

        /**
         * @return products
         */
        public java.util.List<Products> getProducts() {
            return this.products;
        }

        public static final class Builder {
            private Boolean enableTag; 
            private java.util.List<Products> products; 

            /**
             * EnableTag.
             */
            public Builder enableTag(Boolean enableTag) {
                this.enableTag = enableTag;
                return this;
            }

            /**
             * Products.
             */
            public Builder products(java.util.List<Products> products) {
                this.products = products;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
