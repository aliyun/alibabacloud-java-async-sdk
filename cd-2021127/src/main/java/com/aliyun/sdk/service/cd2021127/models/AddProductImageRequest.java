// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link AddProductImageRequest} extends {@link RequestModel}
 *
 * <p>AddProductImageRequest</p>
 */
public class AddProductImageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductImageList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ProductImageList> productImageList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductName")
    private String productName;

    private AddProductImageRequest(Builder builder) {
        super(builder);
        this.country = builder.country;
        this.productId = builder.productId;
        this.productImageList = builder.productImageList;
        this.productName = builder.productName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddProductImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return productImageList
     */
    public java.util.List<ProductImageList> getProductImageList() {
        return this.productImageList;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    public static final class Builder extends Request.Builder<AddProductImageRequest, Builder> {
        private String country; 
        private String productId; 
        private java.util.List<ProductImageList> productImageList; 
        private String productName; 

        private Builder() {
            super();
        } 

        private Builder(AddProductImageRequest request) {
            super(request);
            this.country = request.country;
            this.productId = request.productId;
            this.productImageList = request.productImageList;
            this.productName = request.productName;
        } 

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putBodyParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>productId</p>
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder productImageList(java.util.List<ProductImageList> productImageList) {
            String productImageListShrink = shrink(productImageList, "ProductImageList", "json");
            this.putBodyParameter("ProductImageList", productImageListShrink);
            this.productImageList = productImageList;
            return this;
        }

        /**
         * ProductName.
         */
        public Builder productName(String productName) {
            this.putBodyParameter("ProductName", productName);
            this.productName = productName;
            return this;
        }

        @Override
        public AddProductImageRequest build() {
            return new AddProductImageRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddProductImageRequest} extends {@link TeaModel}
     *
     * <p>AddProductImageRequest</p>
     */
    public static class ProductImageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductImageCutout")
        private Boolean productImageCutout;

        @com.aliyun.core.annotation.NameInMap("ProductImageId")
        private String productImageId;

        @com.aliyun.core.annotation.NameInMap("ProductImageLabels")
        private java.util.List<String> productImageLabels;

        @com.aliyun.core.annotation.NameInMap("ProductImageType")
        private String productImageType;

        @com.aliyun.core.annotation.NameInMap("ProductImageUrl")
        @com.aliyun.core.annotation.Validation(required = true)
        private String productImageUrl;

        private ProductImageList(Builder builder) {
            this.productImageCutout = builder.productImageCutout;
            this.productImageId = builder.productImageId;
            this.productImageLabels = builder.productImageLabels;
            this.productImageType = builder.productImageType;
            this.productImageUrl = builder.productImageUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductImageList create() {
            return builder().build();
        }

        /**
         * @return productImageCutout
         */
        public Boolean getProductImageCutout() {
            return this.productImageCutout;
        }

        /**
         * @return productImageId
         */
        public String getProductImageId() {
            return this.productImageId;
        }

        /**
         * @return productImageLabels
         */
        public java.util.List<String> getProductImageLabels() {
            return this.productImageLabels;
        }

        /**
         * @return productImageType
         */
        public String getProductImageType() {
            return this.productImageType;
        }

        /**
         * @return productImageUrl
         */
        public String getProductImageUrl() {
            return this.productImageUrl;
        }

        public static final class Builder {
            private Boolean productImageCutout; 
            private String productImageId; 
            private java.util.List<String> productImageLabels; 
            private String productImageType; 
            private String productImageUrl; 

            /**
             * ProductImageCutout.
             */
            public Builder productImageCutout(Boolean productImageCutout) {
                this.productImageCutout = productImageCutout;
                return this;
            }

            /**
             * ProductImageId.
             */
            public Builder productImageId(String productImageId) {
                this.productImageId = productImageId;
                return this;
            }

            /**
             * ProductImageLabels.
             */
            public Builder productImageLabels(java.util.List<String> productImageLabels) {
                this.productImageLabels = productImageLabels;
                return this;
            }

            /**
             * ProductImageType.
             */
            public Builder productImageType(String productImageType) {
                this.productImageType = productImageType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>url</p>
             */
            public Builder productImageUrl(String productImageUrl) {
                this.productImageUrl = productImageUrl;
                return this;
            }

            public ProductImageList build() {
                return new ProductImageList(this);
            } 

        } 

    }
}
