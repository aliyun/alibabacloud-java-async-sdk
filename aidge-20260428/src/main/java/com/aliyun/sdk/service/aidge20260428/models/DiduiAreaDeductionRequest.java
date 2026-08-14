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
 * {@link DiduiAreaDeductionRequest} extends {@link RequestModel}
 *
 * <p>DiduiAreaDeductionRequest</p>
 */
public class DiduiAreaDeductionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Products")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Products> products;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RagId")
    private String ragId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReqId")
    private String reqId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetImageUrl;

    private DiduiAreaDeductionRequest(Builder builder) {
        super(builder);
        this.products = builder.products;
        this.ragId = builder.ragId;
        this.reqId = builder.reqId;
        this.targetImageUrl = builder.targetImageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiduiAreaDeductionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return products
     */
    public java.util.List<Products> getProducts() {
        return this.products;
    }

    /**
     * @return ragId
     */
    public String getRagId() {
        return this.ragId;
    }

    /**
     * @return reqId
     */
    public String getReqId() {
        return this.reqId;
    }

    /**
     * @return targetImageUrl
     */
    public String getTargetImageUrl() {
        return this.targetImageUrl;
    }

    public static final class Builder extends Request.Builder<DiduiAreaDeductionRequest, Builder> {
        private java.util.List<Products> products; 
        private String ragId; 
        private String reqId; 
        private String targetImageUrl; 

        private Builder() {
            super();
        } 

        private Builder(DiduiAreaDeductionRequest request) {
            super(request);
            this.products = request.products;
            this.ragId = request.ragId;
            this.reqId = request.reqId;
            this.targetImageUrl = request.targetImageUrl;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder products(java.util.List<Products> products) {
            String productsShrink = shrink(products, "Products", "json");
            this.putQueryParameter("Products", productsShrink);
            this.products = products;
            return this;
        }

        /**
         * RagId.
         */
        public Builder ragId(String ragId) {
            this.putQueryParameter("RagId", ragId);
            this.ragId = ragId;
            return this;
        }

        /**
         * ReqId.
         */
        public Builder reqId(String reqId) {
            this.putQueryParameter("ReqId", reqId);
            this.reqId = reqId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/didui.jpg">https://example.com/didui.jpg</a></p>
         */
        public Builder targetImageUrl(String targetImageUrl) {
            this.putQueryParameter("TargetImageUrl", targetImageUrl);
            this.targetImageUrl = targetImageUrl;
            return this;
        }

        @Override
        public DiduiAreaDeductionRequest build() {
            return new DiduiAreaDeductionRequest(this);
        } 

    } 

    /**
     * 
     * {@link DiduiAreaDeductionRequest} extends {@link TeaModel}
     *
     * <p>DiduiAreaDeductionRequest</p>
     */
    public static class Boxes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bottom")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double bottom;

        @com.aliyun.core.annotation.NameInMap("Left")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double left;

        @com.aliyun.core.annotation.NameInMap("Right")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double right;

        @com.aliyun.core.annotation.NameInMap("Top")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>689</p>
             */
            public Builder bottom(Double bottom) {
                this.bottom = bottom;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>763</p>
             */
            public Builder left(Double left) {
                this.left = left;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>904</p>
             */
            public Builder right(Double right) {
                this.right = right;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>606</p>
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
     * {@link DiduiAreaDeductionRequest} extends {@link TeaModel}
     *
     * <p>DiduiAreaDeductionRequest</p>
     */
    public static class Products extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Boxes")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Boxes> boxes;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             */
            public Builder boxes(java.util.List<Boxes> boxes) {
                this.boxes = boxes;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>6901234579</p>
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
}
