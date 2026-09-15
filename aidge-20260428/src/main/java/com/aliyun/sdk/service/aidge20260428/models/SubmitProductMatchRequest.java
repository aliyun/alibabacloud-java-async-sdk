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
 * {@link SubmitProductMatchRequest} extends {@link RequestModel}
 *
 * <p>SubmitProductMatchRequest</p>
 */
public class SubmitProductMatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrandName")
    private String brandName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductUrl")
    private String productUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShopName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shopName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private SubmitProductMatchRequest(Builder builder) {
        super(builder);
        this.brandName = builder.brandName;
        this.category = builder.category;
        this.imageUrl = builder.imageUrl;
        this.itemId = builder.itemId;
        this.productUrl = builder.productUrl;
        this.shopName = builder.shopName;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitProductMatchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brandName
     */
    public String getBrandName() {
        return this.brandName;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
    }

    /**
     * @return productUrl
     */
    public String getProductUrl() {
        return this.productUrl;
    }

    /**
     * @return shopName
     */
    public String getShopName() {
        return this.shopName;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<SubmitProductMatchRequest, Builder> {
        private String brandName; 
        private String category; 
        private String imageUrl; 
        private String itemId; 
        private String productUrl; 
        private String shopName; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(SubmitProductMatchRequest request) {
            super(request);
            this.brandName = request.brandName;
            this.category = request.category;
            this.imageUrl = request.imageUrl;
            this.itemId = request.itemId;
            this.productUrl = request.productUrl;
            this.shopName = request.shopName;
            this.title = request.title;
        } 

        /**
         * <p>The product brand. If this value is not specified, the system attempts to extract the brand from the shop name.</p>
         * 
         * <strong>example:</strong>
         * <p>FILA</p>
         */
        public Builder brandName(String brandName) {
            this.putQueryParameter("BrandName", brandName);
            this.brandName = brandName;
            return this;
        }

        /**
         * <p>The Miaojie product category. Currently used for extension and auditing purposes.</p>
         * 
         * <strong>example:</strong>
         * <p>Children\&quot;s Shoes</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The HTTP or HTTPS URL of the product main image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/items/228516909/main.jpg">https://example.com/items/228516909/main.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The Miaojie product ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>228516909</p>
         */
        public Builder itemId(String itemId) {
            this.putQueryParameter("ItemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * <p>The HTTP or HTTPS URL of the product detail page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/items/228516909">https://example.com/items/228516909</a></p>
         */
        public Builder productUrl(String productUrl) {
            this.putQueryParameter("ProductUrl", productUrl);
            this.productUrl = productUrl;
            return this;
        }

        /**
         * <p>The shop name. This value is also used as the extraction source when the brand name is missing.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FILA斐乐官方旗舰店</p>
         */
        public Builder shopName(String shopName) {
            this.putQueryParameter("ShopName", shopName);
            this.shopName = shopName;
            return this;
        }

        /**
         * <p>The product title.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FILA Kids Training Shoes</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public SubmitProductMatchRequest build() {
            return new SubmitProductMatchRequest(this);
        } 

    } 

}
