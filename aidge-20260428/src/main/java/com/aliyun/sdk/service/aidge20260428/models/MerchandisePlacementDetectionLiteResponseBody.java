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
 * {@link MerchandisePlacementDetectionLiteResponseBody} extends {@link TeaModel}
 *
 * <p>MerchandisePlacementDetectionLiteResponseBody</p>
 */
public class MerchandisePlacementDetectionLiteResponseBody extends TeaModel {
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

    private MerchandisePlacementDetectionLiteResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MerchandisePlacementDetectionLiteResponseBody create() {
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

        private Builder(MerchandisePlacementDetectionLiteResponseBody model) {
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
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message or failure description.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>70CBEFDF-BB17-1EB3-8A21-569F3124738F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public MerchandisePlacementDetectionLiteResponseBody build() {
            return new MerchandisePlacementDetectionLiteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MerchandisePlacementDetectionLiteResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePlacementDetectionLiteResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bbox_2d")
        private java.util.List<Long> bbox2d;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Regions(Builder builder) {
            this.bbox2d = builder.bbox2d;
            this.label = builder.label;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return bbox2d
         */
        public java.util.List<Long> getBbox2d() {
            return this.bbox2d;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private java.util.List<Long> bbox2d; 
            private String label; 
            private String text; 

            private Builder() {
            } 

            private Builder(Regions model) {
                this.bbox2d = model.bbox2d;
                this.label = model.label;
                this.text = model.text;
            } 

            /**
             * <p>The 2D bounding box in the format of [top-left x, top-left y, bottom-right x, bottom-right y]. The values range from 0 to 1000. The left coordinate is less than the right coordinate, and the top coordinate is less than the bottom coordinate.</p>
             */
            public Builder bbox2d(java.util.List<Long> bbox2d) {
                this.bbox2d = bbox2d;
                return this;
            }

            /**
             * <p>The target category.</p>
             * 
             * <strong>example:</strong>
             * <p>price_tag</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The confirmable short name or text of up to 24 characters. This field is an empty string when the text is unclear.</p>
             * 
             * <strong>example:</strong>
             * <p>5.50</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
    /**
     * 
     * {@link MerchandisePlacementDetectionLiteResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePlacementDetectionLiteResponseBody</p>
     */
    public static class Grounding extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Coverage")
        private String coverage;

        @com.aliyun.core.annotation.NameInMap("Regions")
        private java.util.List<Regions> regions;

        private Grounding(Builder builder) {
            this.coverage = builder.coverage;
            this.regions = builder.regions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Grounding create() {
            return builder().build();
        }

        /**
         * @return coverage
         */
        public String getCoverage() {
            return this.coverage;
        }

        /**
         * @return regions
         */
        public java.util.List<Regions> getRegions() {
            return this.regions;
        }

        public static final class Builder {
            private String coverage; 
            private java.util.List<Regions> regions; 

            private Builder() {
            } 

            private Builder(Grounding model) {
                this.coverage = model.coverage;
                this.regions = model.regions;
            } 

            /**
             * <p>The coverage status. Valid values:</p>
             * <ul>
             * <li>complete: The relevant visible targets are complete.</li>
             * <li>partial: Only some targets are valid or recognizable.</li>
             * <li>Empty string: No valid supplementary grounding results are obtained.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>complete</p>
             */
            public Builder coverage(String coverage) {
                this.coverage = coverage;
                return this;
            }

            /**
             * <p>The target array, which contains up to 12 items. This array can be empty when no relevant targets are found.</p>
             */
            public Builder regions(java.util.List<Regions> regions) {
                this.regions = regions;
                return this;
            }

            public Grounding build() {
                return new Grounding(this);
            } 

        } 

    }
    /**
     * 
     * {@link MerchandisePlacementDetectionLiteResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePlacementDetectionLiteResponseBody</p>
     */
    public static class Boxes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bottom")
        private Long bottom;

        @com.aliyun.core.annotation.NameInMap("Left")
        private Long left;

        @com.aliyun.core.annotation.NameInMap("Right")
        private Long right;

        @com.aliyun.core.annotation.NameInMap("Top")
        private Long top;

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
        public Long getBottom() {
            return this.bottom;
        }

        /**
         * @return left
         */
        public Long getLeft() {
            return this.left;
        }

        /**
         * @return right
         */
        public Long getRight() {
            return this.right;
        }

        /**
         * @return top
         */
        public Long getTop() {
            return this.top;
        }

        public static final class Builder {
            private Long bottom; 
            private Long left; 
            private Long right; 
            private Long top; 

            private Builder() {
            } 

            private Builder(Boxes model) {
                this.bottom = model.bottom;
                this.left = model.left;
                this.right = model.right;
                this.top = model.top;
            } 

            /**
             * <p>The bottom coordinate.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder bottom(Long bottom) {
                this.bottom = bottom;
                return this;
            }

            /**
             * <p>The left coordinate.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder left(Long left) {
                this.left = left;
                return this;
            }

            /**
             * <p>The right coordinate.</p>
             * 
             * <strong>example:</strong>
             * <p>(\&quot;874\&quot;)</p>
             */
            public Builder right(Long right) {
                this.right = right;
                return this;
            }

            /**
             * <p>The bottom coordinate.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder top(Long top) {
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
     * {@link MerchandisePlacementDetectionLiteResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePlacementDetectionLiteResponseBody</p>
     */
    public static class Products extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Boxes")
        private java.util.List<Boxes> boxes;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private String skuId;

        private Products(Builder builder) {
            this.boxes = builder.boxes;
            this.skuId = builder.skuId;
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
         * @return skuId
         */
        public String getSkuId() {
            return this.skuId;
        }

        public static final class Builder {
            private java.util.List<Boxes> boxes; 
            private String skuId; 

            private Builder() {
            } 

            private Builder(Products model) {
                this.boxes = model.boxes;
                this.skuId = model.skuId;
            } 

            /**
             * <p>The bounding boxes corresponding to the SKU.</p>
             */
            public Builder boxes(java.util.List<Boxes> boxes) {
                this.boxes = boxes;
                return this;
            }

            /**
             * <p>The recognition code, which is obtained by removing the trailing _ce from the recognition name.</p>
             * 
             * <strong>example:</strong>
             * <p>sku_test</p>
             */
            public Builder skuId(String skuId) {
                this.skuId = skuId;
                return this;
            }

            public Products build() {
                return new Products(this);
            } 

        } 

    }
    /**
     * 
     * {@link MerchandisePlacementDetectionLiteResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePlacementDetectionLiteResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Grounding")
        private Grounding grounding;

        @com.aliyun.core.annotation.NameInMap("Products")
        private java.util.List<Products> products;

        @com.aliyun.core.annotation.NameInMap("SkuIds")
        private java.util.List<String> skuIds;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.grounding = builder.grounding;
            this.products = builder.products;
            this.skuIds = builder.skuIds;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return grounding
         */
        public Grounding getGrounding() {
            return this.grounding;
        }

        /**
         * @return products
         */
        public java.util.List<Products> getProducts() {
            return this.products;
        }

        /**
         * @return skuIds
         */
        public java.util.List<String> getSkuIds() {
            return this.skuIds;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Grounding grounding; 
            private java.util.List<Products> products; 
            private java.util.List<String> skuIds; 
            private String type; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.grounding = model.grounding;
                this.products = model.products;
                this.skuIds = model.skuIds;
                this.type = model.type;
            } 

            /**
             * <p>The supplementary element grounding results.</p>
             */
            public Builder grounding(Grounding grounding) {
                this.grounding = grounding;
                return this;
            }

            /**
             * <p>The product items.</p>
             */
            public Builder products(java.util.List<Products> products) {
                this.products = products;
                return this;
            }

            /**
             * <p>The deduplicated list of SkuIds.</p>
             */
            public Builder skuIds(java.util.List<String> skuIds) {
                this.skuIds = skuIds;
                return this;
            }

            /**
             * <p>The result type, which is fixed to sku.</p>
             * 
             * <strong>example:</strong>
             * <p>sku</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link MerchandisePlacementDetectionLiteResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePlacementDetectionLiteResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private java.util.Map<String, Long> usageMap;

        private Data(Builder builder) {
            this.result = builder.result;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return usageMap
         */
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private Result result; 
            private java.util.Map<String, Long> usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.result = model.result;
                this.usageMap = model.usageMap;
            } 

            /**
             * <p>The result.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The usage map. The value is {&quot;ProcessingCount&quot;:1} for a successful call, and an empty object for a failed call.</p>
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
