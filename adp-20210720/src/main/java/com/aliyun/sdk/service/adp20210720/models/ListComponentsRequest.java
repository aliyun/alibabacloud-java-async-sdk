// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListComponentsRequest} extends {@link RequestModel}
 *
 * <p>ListComponentsRequest</p>
 */
public class ListComponentsRequest extends Request {
    @Query
    @NameInMap("category")
    private String category;

    @Query
    @NameInMap("fuzzy")
    private String fuzzy;

    @Query
    @NameInMap("name")
    private String name;

    @Query
    @NameInMap("pageNum")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNum;

    @Query
    @NameInMap("pageSize")
    @Validation(maximum = 100)
    private Integer pageSize;

    @Query
    @NameInMap("public")
    private Boolean _public;

    private ListComponentsRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.fuzzy = builder.fuzzy;
        this.name = builder.name;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this._public = builder._public;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComponentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return fuzzy
     */
    public String getFuzzy() {
        return this.fuzzy;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return _public
     */
    public Boolean get_public() {
        return this._public;
    }

    public static final class Builder extends Request.Builder<ListComponentsRequest, Builder> {
        private String category; 
        private String fuzzy; 
        private String name; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Boolean _public; 

        private Builder() {
            super();
        } 

        private Builder(ListComponentsRequest request) {
            super(request);
            this.category = request.category;
            this.fuzzy = request.fuzzy;
            this.name = request.name;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this._public = request._public;
        } 

        /**
         * category.
         */
        public Builder category(String category) {
            this.putQueryParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * fuzzy.
         */
        public Builder fuzzy(String fuzzy) {
            this.putQueryParameter("fuzzy", fuzzy);
            this.fuzzy = fuzzy;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * public.
         */
        public Builder _public(Boolean _public) {
            this.putQueryParameter("public", _public);
            this._public = _public;
            return this;
        }

        @Override
        public ListComponentsRequest build() {
            return new ListComponentsRequest(this);
        } 

    } 

}
