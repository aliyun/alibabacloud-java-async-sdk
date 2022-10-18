// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCategoriesRequest} extends {@link RequestModel}
 *
 * <p>ListCategoriesRequest</p>
 */
public class ListCategoriesRequest extends Request {
    @Query
    @NameInMap("Language")
    private String language;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("ProductId")
    @Validation(required = true, maximum = 99999999999D)
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
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ProductId.
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
