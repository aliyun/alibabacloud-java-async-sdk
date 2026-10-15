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
 * {@link MerchandisePriceTagDetectionResponseBody} extends {@link TeaModel}
 *
 * <p>MerchandisePriceTagDetectionResponseBody</p>
 */
public class MerchandisePriceTagDetectionResponseBody extends TeaModel {
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

    private MerchandisePriceTagDetectionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MerchandisePriceTagDetectionResponseBody create() {
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

        private Builder(MerchandisePriceTagDetectionResponseBody model) {
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
         * <p>The scenario recognition result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The return message or failure description.</p>
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

        public MerchandisePriceTagDetectionResponseBody build() {
            return new MerchandisePriceTagDetectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MerchandisePriceTagDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePriceTagDetectionResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bbox2d")
        private java.util.List<Double> bbox2d;

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
        public java.util.List<Double> getBbox2d() {
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
            private java.util.List<Double> bbox2d; 
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
             * <p>The bounding box coordinates.</p>
             */
            public Builder bbox2d(java.util.List<Double> bbox2d) {
                this.bbox2d = bbox2d;
                return this;
            }

            /**
             * <p>The label.</p>
             * 
             * <strong>example:</strong>
             * <p>price_tag</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The recognized text.</p>
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
     * {@link MerchandisePriceTagDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePriceTagDetectionResponseBody</p>
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
             * <p>The coverage.</p>
             * 
             * <strong>example:</strong>
             * <p>complete</p>
             */
            public Builder coverage(String coverage) {
                this.coverage = coverage;
                return this;
            }

            /**
             * <p>The region list.</p>
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
     * {@link MerchandisePriceTagDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePriceTagDetectionResponseBody</p>
     */
    public static class Location extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bottom")
        private String bottom;

        @com.aliyun.core.annotation.NameInMap("Left")
        private String left;

        @com.aliyun.core.annotation.NameInMap("Right")
        private String right;

        @com.aliyun.core.annotation.NameInMap("top")
        private String top;

        private Location(Builder builder) {
            this.bottom = builder.bottom;
            this.left = builder.left;
            this.right = builder.right;
            this.top = builder.top;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Location create() {
            return builder().build();
        }

        /**
         * @return bottom
         */
        public String getBottom() {
            return this.bottom;
        }

        /**
         * @return left
         */
        public String getLeft() {
            return this.left;
        }

        /**
         * @return right
         */
        public String getRight() {
            return this.right;
        }

        /**
         * @return top
         */
        public String getTop() {
            return this.top;
        }

        public static final class Builder {
            private String bottom; 
            private String left; 
            private String right; 
            private String top; 

            private Builder() {
            } 

            private Builder(Location model) {
                this.bottom = model.bottom;
                this.left = model.left;
                this.right = model.right;
                this.top = model.top;
            } 

            /**
             * <p>The bottom boundary of the detection box.</p>
             * 
             * <strong>example:</strong>
             * <p>369</p>
             */
            public Builder bottom(String bottom) {
                this.bottom = bottom;
                return this;
            }

            /**
             * <p>The left boundary of the detection box.</p>
             * 
             * <strong>example:</strong>
             * <p>796</p>
             */
            public Builder left(String left) {
                this.left = left;
                return this;
            }

            /**
             * <p>The right boundary of the detection box.</p>
             * 
             * <strong>example:</strong>
             * <p>820</p>
             */
            public Builder right(String right) {
                this.right = right;
                return this;
            }

            /**
             * <p>The top boundary of the detection box.</p>
             * 
             * <strong>example:</strong>
             * <p>338</p>
             */
            public Builder top(String top) {
                this.top = top;
                return this;
            }

            public Location build() {
                return new Location(this);
            } 

        } 

    }
    /**
     * 
     * {@link MerchandisePriceTagDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePriceTagDetectionResponseBody</p>
     */
    public static class PriceTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Location")
        private Location location;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private String originalPrice;

        @com.aliyun.core.annotation.NameInMap("Price")
        private String price;

        @com.aliyun.core.annotation.NameInMap("SkuCode")
        private String skuCode;

        @com.aliyun.core.annotation.NameInMap("SkuName")
        private String skuName;

        private PriceTags(Builder builder) {
            this.location = builder.location;
            this.originalPrice = builder.originalPrice;
            this.price = builder.price;
            this.skuCode = builder.skuCode;
            this.skuName = builder.skuName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceTags create() {
            return builder().build();
        }

        /**
         * @return location
         */
        public Location getLocation() {
            return this.location;
        }

        /**
         * @return originalPrice
         */
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return skuCode
         */
        public String getSkuCode() {
            return this.skuCode;
        }

        /**
         * @return skuName
         */
        public String getSkuName() {
            return this.skuName;
        }

        public static final class Builder {
            private Location location; 
            private String originalPrice; 
            private String price; 
            private String skuCode; 
            private String skuName; 

            private Builder() {
            } 

            private Builder(PriceTags model) {
                this.location = model.location;
                this.originalPrice = model.originalPrice;
                this.price = model.price;
                this.skuCode = model.skuCode;
                this.skuName = model.skuName;
            } 

            /**
             * <p>The location.</p>
             */
            public Builder location(Location location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder originalPrice(String originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The selling price, retained as a string to avoid being parsed as a reserved word or reserved character.</p>
             * 
             * <strong>example:</strong>
             * <p>5.50</p>
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * <p>The associated product code.</p>
             * 
             * <strong>example:</strong>
             * <p>001</p>
             */
            public Builder skuCode(String skuCode) {
                this.skuCode = skuCode;
                return this;
            }

            /**
             * <p>The associated product name.</p>
             * 
             * <strong>example:</strong>
             * <p>sku_test</p>
             */
            public Builder skuName(String skuName) {
                this.skuName = skuName;
                return this;
            }

            public PriceTags build() {
                return new PriceTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link MerchandisePriceTagDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePriceTagDetectionResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Grounding")
        private Grounding grounding;

        @com.aliyun.core.annotation.NameInMap("PriceTags")
        private java.util.List<PriceTags> priceTags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.grounding = builder.grounding;
            this.priceTags = builder.priceTags;
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
         * @return priceTags
         */
        public java.util.List<PriceTags> getPriceTags() {
            return this.priceTags;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Grounding grounding; 
            private java.util.List<PriceTags> priceTags; 
            private String type; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.grounding = model.grounding;
                this.priceTags = model.priceTags;
                this.type = model.type;
            } 

            /**
             * <p>The localization information.</p>
             */
            public Builder grounding(Grounding grounding) {
                this.grounding = grounding;
                return this;
            }

            /**
             * <p>The price tag list. This can be an empty array if no price tags are recognized under normal conditions.</p>
             */
            public Builder priceTags(java.util.List<PriceTags> priceTags) {
                this.priceTags = priceTags;
                return this;
            }

            /**
             * <p>The value is fixed to priceTag.</p>
             * 
             * <strong>example:</strong>
             * <p>priceTag</p>
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
     * {@link MerchandisePriceTagDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandisePriceTagDetectionResponseBody</p>
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
             * <p>The detection and recognition result details.</p>
             */
            public Builder result(Result result) {
                this.result = result;
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
