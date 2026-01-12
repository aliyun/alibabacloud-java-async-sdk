// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link ListClothesRequest} extends {@link RequestModel}
 *
 * <p>ListClothesRequest</p>
 */
public class ListClothesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Categories")
    private java.util.List<Long> categories;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClothSize")
    private String clothSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Current")
    private Integer current;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListClothesRequest(Builder builder) {
        super(builder);
        this.categories = builder.categories;
        this.clothSize = builder.clothSize;
        this.current = builder.current;
        this.jwtToken = builder.jwtToken;
        this.name = builder.name;
        this.size = builder.size;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClothesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categories
     */
    public java.util.List<Long> getCategories() {
        return this.categories;
    }

    /**
     * @return clothSize
     */
    public String getClothSize() {
        return this.clothSize;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListClothesRequest, Builder> {
        private java.util.List<Long> categories; 
        private String clothSize; 
        private Integer current; 
        private String jwtToken; 
        private String name; 
        private Integer size; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListClothesRequest request) {
            super(request);
            this.categories = request.categories;
            this.clothSize = request.clothSize;
            this.current = request.current;
            this.jwtToken = request.jwtToken;
            this.name = request.name;
            this.size = request.size;
            this.type = request.type;
        } 

        /**
         * Categories.
         */
        public Builder categories(java.util.List<Long> categories) {
            String categoriesShrink = shrink(categories, "Categories", "json");
            this.putQueryParameter("Categories", categoriesShrink);
            this.categories = categories;
            return this;
        }

        /**
         * ClothSize.
         */
        public Builder clothSize(String clothSize) {
            this.putQueryParameter("ClothSize", clothSize);
            this.clothSize = clothSize;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.putBodyParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListClothesRequest build() {
            return new ListClothesRequest(this);
        } 

    } 

}
