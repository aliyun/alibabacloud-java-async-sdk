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
 * {@link RgeoCodeRequest} extends {@link RequestModel}
 *
 * <p>RgeoCodeRequest</p>
 */
public class RgeoCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("latitude")
    private String latitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("longitude")
    private String longitude;

    private RgeoCodeRequest(Builder builder) {
        super(builder);
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RgeoCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<RgeoCodeRequest, Builder> {
        private String latitude; 
        private String longitude; 

        private Builder() {
            super();
        } 

        private Builder(RgeoCodeRequest request) {
            super(request);
            this.latitude = request.latitude;
            this.longitude = request.longitude;
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

        @Override
        public RgeoCodeRequest build() {
            return new RgeoCodeRequest(this);
        } 

    } 

}
