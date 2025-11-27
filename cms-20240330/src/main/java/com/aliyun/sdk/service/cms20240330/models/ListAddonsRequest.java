// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListAddonsRequest} extends {@link RequestModel}
 *
 * <p>ListAddonsRequest</p>
 */
public class ListAddonsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regexp")
    private Boolean regexp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("search")
    private String search;

    private ListAddonsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aliyunLang = builder.aliyunLang;
        this.category = builder.category;
        this.regexp = builder.regexp;
        this.search = builder.search;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAddonsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return regexp
     */
    public Boolean getRegexp() {
        return this.regexp;
    }

    /**
     * @return search
     */
    public String getSearch() {
        return this.search;
    }

    public static final class Builder extends Request.Builder<ListAddonsRequest, Builder> {
        private String regionId; 
        private String aliyunLang; 
        private String category; 
        private Boolean regexp; 
        private String search; 

        private Builder() {
            super();
        } 

        private Builder(ListAddonsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aliyunLang = request.aliyunLang;
            this.category = request.category;
            this.regexp = request.regexp;
            this.search = request.search;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * aliyunLang.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("aliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
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
         * regexp.
         */
        public Builder regexp(Boolean regexp) {
            this.putQueryParameter("regexp", regexp);
            this.regexp = regexp;
            return this;
        }

        /**
         * search.
         */
        public Builder search(String search) {
            this.putQueryParameter("search", search);
            this.search = search;
            return this;
        }

        @Override
        public ListAddonsRequest build() {
            return new ListAddonsRequest(this);
        } 

    } 

}
