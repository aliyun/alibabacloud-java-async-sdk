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
 * {@link ListCategoriesRequest} extends {@link RequestModel}
 *
 * <p>ListCategoriesRequest</p>
 */
public class ListCategoriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 99999999999D)
    private Long productId;

    private ListCategoriesRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.name = builder.name;
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCategoriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    public static final class Builder extends Request.Builder<ListCategoriesRequest, Builder> {
        private String language; 
        private String name; 
        private Long productId; 

        private Builder() {
            super();
        } 

        private Builder(ListCategoriesRequest request) {
            super(request);
            this.language = request.language;
            this.name = request.name;
            this.productId = request.productId;
        } 

        /**
         * <p>Multi-language, support, Chinese, English. Value definition: zh: Chinese, en: English.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The name of the classification question. Fuzzy search is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the product. You can call the ListProducts operation to obtain the product ID. The ProductId parameter is the ID of an Alibaba Cloud product. Multiple Categories are displayed for each product.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>18550</p>
         */
        public Builder productId(Long productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public ListCategoriesRequest build() {
            return new ListCategoriesRequest(this);
        } 

    } 

}
