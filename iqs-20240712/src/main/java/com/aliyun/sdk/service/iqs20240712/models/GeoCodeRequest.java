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
 * {@link GeoCodeRequest} extends {@link RequestModel}
 *
 * <p>GeoCodeRequest</p>
 */
public class GeoCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("city")
    private String city;

    private GeoCodeRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.city = builder.city;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeoCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    public static final class Builder extends Request.Builder<GeoCodeRequest, Builder> {
        private String address; 
        private String city; 

        private Builder() {
            super();
        } 

        private Builder(GeoCodeRequest request) {
            super(request);
            this.address = request.address;
            this.city = request.city;
        } 

        /**
         * address.
         */
        public Builder address(String address) {
            this.putQueryParameter("address", address);
            this.address = address;
            return this;
        }

        /**
         * city.
         */
        public Builder city(String city) {
            this.putQueryParameter("city", city);
            this.city = city;
            return this;
        }

        @Override
        public GeoCodeRequest build() {
            return new GeoCodeRequest(this);
        } 

    } 

}
