// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductsRequest} extends {@link RequestModel}
 *
 * <p>ListProductsRequest</p>
 */
public class ListProductsRequest extends Request {
    @Query
    @NameInMap("description")
    private String description;

    @Query
    @NameInMap("fuzzy")
    private String fuzzy;

    @Query
    @NameInMap("name")
    private String name;

    @Query
    @NameInMap("pageNum")
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageNum;

    @Query
    @NameInMap("pageSize")
    @Validation(required = true, maximum = 100)
    private Integer pageSize;

    private ListProductsRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.fuzzy = builder.fuzzy;
        this.name = builder.name;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    public static final class Builder extends Request.Builder<ListProductsRequest, Builder> {
        private String description; 
        private String fuzzy; 
        private String name; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListProductsRequest request) {
            super(request);
            this.description = request.description;
            this.fuzzy = request.fuzzy;
            this.name = request.name;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
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

        @Override
        public ListProductsRequest build() {
            return new ListProductsRequest(this);
        } 

    } 

}
