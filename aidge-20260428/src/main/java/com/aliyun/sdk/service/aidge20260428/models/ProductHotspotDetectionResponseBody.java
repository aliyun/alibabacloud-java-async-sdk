// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link ProductHotspotDetectionResponseBody} extends {@link TeaModel}
 *
 * <p>ProductHotspotDetectionResponseBody</p>
 */
public class ProductHotspotDetectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ProductHotspotDetectionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductHotspotDetectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ProductHotspotDetectionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The product hotzone recognition result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ProductHotspotDetectionResponseBody build() {
            return new ProductHotspotDetectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ProductHotspotDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>ProductHotspotDetectionResponseBody</p>
     */
    public static class Boxes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bottom")
        private Double bottom;

        @com.aliyun.core.annotation.NameInMap("Left")
        private Double left;

        @com.aliyun.core.annotation.NameInMap("Right")
        private Double right;

        @com.aliyun.core.annotation.NameInMap("Top")
        private Double top;

        private Boxes(Builder builder) {
            this.bottom = builder.bottom;
            this.left = builder.left;
            this.right = builder.right;
            this.top = builder.top;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Boxes create() {
            return builder().build();
        }

        /**
         * @return bottom
         */
        public Double getBottom() {
            return this.bottom;
        }

        /**
         * @return left
         */
        public Double getLeft() {
            return this.left;
        }

        /**
         * @return right
         */
        public Double getRight() {
            return this.right;
        }

        /**
         * @return top
         */
        public Double getTop() {
            return this.top;
        }

        public static final class Builder {
            private Double bottom; 
            private Double left; 
            private Double right; 
            private Double top; 

            private Builder() {
            } 

            private Builder(Boxes model) {
                this.bottom = model.bottom;
                this.left = model.left;
                this.right = model.right;
                this.top = model.top;
            } 

            /**
             * <p>The bottom boundary of the bounding box.</p>
             * 
             * <strong>example:</strong>
             * <p>947</p>
             */
            public Builder bottom(Double bottom) {
                this.bottom = bottom;
                return this;
            }

            /**
             * <p>The left boundary of the bounding box.</p>
             * 
             * <strong>example:</strong>
             * <p>280</p>
             */
            public Builder left(Double left) {
                this.left = left;
                return this;
            }

            /**
             * <p>The right boundary of the bounding box.</p>
             * 
             * <strong>example:</strong>
             * <p>743</p>
             */
            public Builder right(Double right) {
                this.right = right;
                return this;
            }

            /**
             * <p>The top boundary of the bounding box.</p>
             * 
             * <strong>example:</strong>
             * <p>965</p>
             */
            public Builder top(Double top) {
                this.top = top;
                return this;
            }

            public Boxes build() {
                return new Boxes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ProductHotspotDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>ProductHotspotDetectionResponseBody</p>
     */
    public static class Products extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Boxes")
        private java.util.List<Boxes> boxes;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        private Products(Builder builder) {
            this.boxes = builder.boxes;
            this.label = builder.label;
            this.productId = builder.productId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Products create() {
            return builder().build();
        }

        /**
         * @return boxes
         */
        public java.util.List<Boxes> getBoxes() {
            return this.boxes;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        public static final class Builder {
            private java.util.List<Boxes> boxes; 
            private String label; 
            private String productId; 

            private Builder() {
            } 

            private Builder(Products model) {
                this.boxes = model.boxes;
                this.label = model.label;
                this.productId = model.productId;
            } 

            /**
             * <p>The bounding boxes of the detected product instances.</p>
             */
            public Builder boxes(java.util.List<Boxes> boxes) {
                this.boxes = boxes;
                return this;
            }

            /**
             * <p>The product name.</p>
             * 
             * <strong>example:</strong>
             * <p>Beige metal chain-embellished Mary Jane flats</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The product ID generated by the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>product_1</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            public Products build() {
                return new Products(this);
            } 

        } 

    }
    /**
     * 
     * {@link ProductHotspotDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>ProductHotspotDetectionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Products")
        private java.util.List<Products> products;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private java.util.Map<String, Long> usageMap;

        private Data(Builder builder) {
            this.products = builder.products;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return products
         */
        public java.util.List<Products> getProducts() {
            return this.products;
        }

        /**
         * @return usageMap
         */
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private java.util.List<Products> products; 
            private java.util.Map<String, Long> usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.products = model.products;
                this.usageMap = model.usageMap;
            } 

            /**
             * <p>The list of detected products and their bounding boxes.</p>
             */
            public Builder products(java.util.List<Products> products) {
                this.products = products;
                return this;
            }

            /**
             * <p>The usage information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ProcessingCount&quot;:1}</p>
             */
            public Builder usageMap(java.util.Map<String, Long> usageMap) {
                this.usageMap = usageMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
