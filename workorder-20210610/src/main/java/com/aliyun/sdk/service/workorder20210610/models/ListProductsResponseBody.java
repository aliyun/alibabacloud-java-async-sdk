// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

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
 * {@link ListProductsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductsResponseBody</p>
 */
public class ListProductsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListProductsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListProductsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The return code of the request result.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return value, that is, product list</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message. If success is set to false, the message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique ID of the API request. The requestID is unique for each call.</p>
         * 
         * <strong>example:</strong>
         * <p>AC0AB2EC-AFBC-44BA-AE77-132A5A1EC0AD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. A value of true indicates that the call is normal.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListProductsResponseBody build() {
            return new ListProductsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductsResponseBody</p>
     */
    public static class ProductList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductId")
        private Long productId;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        private ProductList(Builder builder) {
            this.productId = builder.productId;
            this.productName = builder.productName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductList create() {
            return builder().build();
        }

        /**
         * @return productId
         */
        public Long getProductId() {
            return this.productId;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        public static final class Builder {
            private Long productId; 
            private String productName; 

            private Builder() {
            } 

            private Builder(ProductList model) {
                this.productId = model.productId;
                this.productName = model.productName;
            } 

            /**
             * <p>Alibaba Cloud product ID</p>
             * 
             * <strong>example:</strong>
             * <p>7160</p>
             */
            public Builder productId(Long productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>Alibaba Cloud product name</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            public ProductList build() {
                return new ProductList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private Long directoryId;

        @com.aliyun.core.annotation.NameInMap("DirectoryName")
        private String directoryName;

        @com.aliyun.core.annotation.NameInMap("ProductList")
        private java.util.List<ProductList> productList;

        private Data(Builder builder) {
            this.directoryId = builder.directoryId;
            this.directoryName = builder.directoryName;
            this.productList = builder.productList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return directoryId
         */
        public Long getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return directoryName
         */
        public String getDirectoryName() {
            return this.directoryName;
        }

        /**
         * @return productList
         */
        public java.util.List<ProductList> getProductList() {
            return this.productList;
        }

        public static final class Builder {
            private Long directoryId; 
            private String directoryName; 
            private java.util.List<ProductList> productList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.directoryId = model.directoryId;
                this.directoryName = model.directoryName;
                this.productList = model.productList;
            } 

            /**
             * <p>The ID of the product catalog, which represents the product category, such as elastic computing</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder directoryId(Long directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The name of the product catalog, which represents the product category, such as elastic computing</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder directoryName(String directoryName) {
                this.directoryName = directoryName;
                return this;
            }

            /**
             * <p>List of Alibaba Cloud products</p>
             */
            public Builder productList(java.util.List<ProductList> productList) {
                this.productList = productList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
