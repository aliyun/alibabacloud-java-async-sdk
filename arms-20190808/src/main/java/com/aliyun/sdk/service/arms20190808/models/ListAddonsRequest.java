// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Regexp")
    private Boolean regexp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Search")
    private String search;

    private ListAddonsRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.category = builder.category;
        this.regexp = builder.regexp;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return search
     */
    public String getSearch() {
        return this.search;
    }

    public static final class Builder extends Request.Builder<ListAddonsRequest, Builder> {
        private String aliyunLang; 
        private String category; 
        private Boolean regexp; 
        private String regionId; 
        private String search; 

        private Builder() {
            super();
        } 

        private Builder(ListAddonsRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.category = request.category;
            this.regexp = request.regexp;
            this.regionId = request.regionId;
            this.search = request.search;
        } 

        /**
         * <p>Language,the default language is Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * <p>Category filter.</p>
         * 
         * <strong>example:</strong>
         * <p>database</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>Whether to enable regular matching.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder regexp(Boolean regexp) {
            this.putQueryParameter("Regexp", regexp);
            this.regexp = regexp;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>A query field can be queried by name or description.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        public Builder search(String search) {
            this.putQueryParameter("Search", search);
            this.search = search;
            return this;
        }

        @Override
        public ListAddonsRequest build() {
            return new ListAddonsRequest(this);
        } 

    } 

}
