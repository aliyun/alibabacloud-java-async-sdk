// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link LocationInfo} extends {@link TeaModel}
 *
 * <p>LocationInfo</p>
 */
public class LocationInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("city")
    private String city;

    @com.aliyun.core.annotation.NameInMap("ip")
    private String ip;

    private LocationInfo(Builder builder) {
        this.city = builder.city;
        this.ip = builder.ip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LocationInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    public static final class Builder {
        private String city; 
        private String ip; 

        private Builder() {
        } 

        private Builder(LocationInfo model) {
            this.city = model.city;
            this.ip = model.ip;
        } 

        /**
         * city.
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * ip.
         */
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        public LocationInfo build() {
            return new LocationInfo(this);
        } 

    } 

}
