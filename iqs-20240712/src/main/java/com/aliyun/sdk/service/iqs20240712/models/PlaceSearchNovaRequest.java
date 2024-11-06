// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PlaceSearchNovaRequest} extends {@link RequestModel}
 *
 * <p>PlaceSearchNovaRequest</p>
 */
public class PlaceSearchNovaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keywords")
    private String keywords;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("types")
    private String types;

    private PlaceSearchNovaRequest(Builder builder) {
        super(builder);
        this.keywords = builder.keywords;
        this.page = builder.page;
        this.region = builder.region;
        this.size = builder.size;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PlaceSearchNovaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return this.keywords;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<PlaceSearchNovaRequest, Builder> {
        private String keywords; 
        private Integer page; 
        private String region; 
        private Integer size; 
        private String types; 

        private Builder() {
            super();
        } 

        private Builder(PlaceSearchNovaRequest request) {
            super(request);
            this.keywords = request.keywords;
            this.page = request.page;
            this.region = request.region;
            this.size = request.size;
            this.types = request.types;
        } 

        /**
         * keywords.
         */
        public Builder keywords(String keywords) {
            this.putQueryParameter("keywords", keywords);
            this.keywords = keywords;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * types.
         */
        public Builder types(String types) {
            this.putQueryParameter("types", types);
            this.types = types;
            return this;
        }

        @Override
        public PlaceSearchNovaRequest build() {
            return new PlaceSearchNovaRequest(this);
        } 

    } 

}
