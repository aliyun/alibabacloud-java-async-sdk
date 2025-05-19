// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link DescribeISPAreaCityRequest} extends {@link RequestModel}
 *
 * <p>DescribeISPAreaCityRequest</p>
 */
public class DescribeISPAreaCityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    private DescribeISPAreaCityRequest(Builder builder) {
        super(builder);
        this.city = builder.city;
        this.isp = builder.isp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeISPAreaCityRequest create() {
        return builder().build();
    }

@Override
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
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    public static final class Builder extends Request.Builder<DescribeISPAreaCityRequest, Builder> {
        private String city; 
        private String isp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeISPAreaCityRequest request) {
            super(request);
            this.city = request.city;
            this.isp = request.isp;
        } 

        /**
         * City.
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * Isp.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        @Override
        public DescribeISPAreaCityRequest build() {
            return new DescribeISPAreaCityRequest(this);
        } 

    } 

}
