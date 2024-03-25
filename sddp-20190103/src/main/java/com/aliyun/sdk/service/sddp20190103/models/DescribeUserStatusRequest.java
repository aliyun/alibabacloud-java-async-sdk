// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserStatusRequest</p>
 */
public class DescribeUserStatusRequest extends Request {
    @Query
    @NameInMap("FeatureType")
    private Integer featureType;

    @Query
    @NameInMap("Lang")
    private String lang;

    private DescribeUserStatusRequest(Builder builder) {
        super(builder);
        this.featureType = builder.featureType;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureType
     */
    public Integer getFeatureType() {
        return this.featureType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeUserStatusRequest, Builder> {
        private Integer featureType; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserStatusRequest request) {
            super(request);
            this.featureType = request.featureType;
            this.lang = request.lang;
        } 

        /**
         * This parameter is deprecated.
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh_cn**: Simplified Chinese (default)
         * *   **en_us**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeUserStatusRequest build() {
            return new DescribeUserStatusRequest(this);
        } 

    } 

}
