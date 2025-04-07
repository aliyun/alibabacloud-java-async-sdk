// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

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
 * {@link NearbySearchNovaRequest} extends {@link RequestModel}
 *
 * <p>NearbySearchNovaRequest</p>
 */
public class NearbySearchNovaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cityLimit")
    private Boolean cityLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keywords")
    private String keywords;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("latitude")
    private String latitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("longitude")
    private String longitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("radius")
    private Integer radius;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sortRule")
    private String sortRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("types")
    private String types;

    private NearbySearchNovaRequest(Builder builder) {
        super(builder);
        this.cityLimit = builder.cityLimit;
        this.keywords = builder.keywords;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.page = builder.page;
        this.radius = builder.radius;
        this.size = builder.size;
        this.sortRule = builder.sortRule;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NearbySearchNovaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cityLimit
     */
    public Boolean getCityLimit() {
        return this.cityLimit;
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return this.keywords;
    }

    /**
     * @return latitude
     */
    public String getLatitude() {
        return this.latitude;
    }

    /**
     * @return longitude
     */
    public String getLongitude() {
        return this.longitude;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return radius
     */
    public Integer getRadius() {
        return this.radius;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return sortRule
     */
    public String getSortRule() {
        return this.sortRule;
    }

    /**
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<NearbySearchNovaRequest, Builder> {
        private Boolean cityLimit; 
        private String keywords; 
        private String latitude; 
        private String longitude; 
        private Integer page; 
        private Integer radius; 
        private Integer size; 
        private String sortRule; 
        private String types; 

        private Builder() {
            super();
        } 

        private Builder(NearbySearchNovaRequest request) {
            super(request);
            this.cityLimit = request.cityLimit;
            this.keywords = request.keywords;
            this.latitude = request.latitude;
            this.longitude = request.longitude;
            this.page = request.page;
            this.radius = request.radius;
            this.size = request.size;
            this.sortRule = request.sortRule;
            this.types = request.types;
        } 

        /**
         * cityLimit.
         */
        public Builder cityLimit(Boolean cityLimit) {
            this.putQueryParameter("cityLimit", cityLimit);
            this.cityLimit = cityLimit;
            return this;
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
         * latitude.
         */
        public Builder latitude(String latitude) {
            this.putQueryParameter("latitude", latitude);
            this.latitude = latitude;
            return this;
        }

        /**
         * longitude.
         */
        public Builder longitude(String longitude) {
            this.putQueryParameter("longitude", longitude);
            this.longitude = longitude;
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
         * radius.
         */
        public Builder radius(Integer radius) {
            this.putQueryParameter("radius", radius);
            this.radius = radius;
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
         * sortRule.
         */
        public Builder sortRule(String sortRule) {
            this.putQueryParameter("sortRule", sortRule);
            this.sortRule = sortRule;
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
        public NearbySearchNovaRequest build() {
            return new NearbySearchNovaRequest(this);
        } 

    } 

}
