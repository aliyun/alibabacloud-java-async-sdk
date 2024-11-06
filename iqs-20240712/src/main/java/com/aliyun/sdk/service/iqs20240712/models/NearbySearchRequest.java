// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link NearbySearchRequest} extends {@link RequestModel}
 *
 * <p>NearbySearchRequest</p>
 */
public class NearbySearchRequest extends Request {
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
    private Long radius;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("types")
    private String types;

    private NearbySearchRequest(Builder builder) {
        super(builder);
        this.keywords = builder.keywords;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.page = builder.page;
        this.radius = builder.radius;
        this.size = builder.size;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NearbySearchRequest create() {
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
    public Long getRadius() {
        return this.radius;
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

    public static final class Builder extends Request.Builder<NearbySearchRequest, Builder> {
        private String keywords; 
        private String latitude; 
        private String longitude; 
        private Integer page; 
        private Long radius; 
        private Integer size; 
        private String types; 

        private Builder() {
            super();
        } 

        private Builder(NearbySearchRequest request) {
            super(request);
            this.keywords = request.keywords;
            this.latitude = request.latitude;
            this.longitude = request.longitude;
            this.page = request.page;
            this.radius = request.radius;
            this.size = request.size;
            this.types = request.types;
        } 

        /**
         * <p>搜索的关键词</p>
         */
        public Builder keywords(String keywords) {
            this.putQueryParameter("keywords", keywords);
            this.keywords = keywords;
            return this;
        }

        /**
         * <p>搜索范围中心的纬度坐标。小数精度均不得超过六位</p>
         */
        public Builder latitude(String latitude) {
            this.putQueryParameter("latitude", latitude);
            this.latitude = latitude;
            return this;
        }

        /**
         * <p>搜索范围中心的经度坐标。小数精度均不得超过六位</p>
         */
        public Builder longitude(String longitude) {
            this.putQueryParameter("longitude", longitude);
            this.longitude = longitude;
            return this;
        }

        /**
         * <p>搜索的页数</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;total_count&quot;: 6851, &quot;page_number&quot;: 54, &quot;page_size&quot;: 100}</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>搜索的范围，以米为单位。</p>
         */
        public Builder radius(Long radius) {
            this.putQueryParameter("radius", radius);
            this.radius = radius;
            return this;
        }

        /**
         * <p>搜索结果每页所包含的结果数量</p>
         * 
         * <strong>example:</strong>
         * <p>812788</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>目标类型的枚举值，以 <code>|</code> 标记分隔</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;synonym&quot;,&quot;stopword&quot;,&quot;correction&quot;,&quot;ner&quot;,&quot;term_weighting&quot;,&quot;category_prediction&quot;]</p>
         */
        public Builder types(String types) {
            this.putQueryParameter("types", types);
            this.types = types;
            return this;
        }

        @Override
        public NearbySearchRequest build() {
            return new NearbySearchRequest(this);
        } 

    } 

}
