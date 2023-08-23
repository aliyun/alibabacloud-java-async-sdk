// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSTBServiceProvidersRequest} extends {@link RequestModel}
 *
 * <p>ListSTBServiceProvidersRequest</p>
 */
public class ListSTBServiceProvidersRequest extends Request {
    @Body
    @NameInMap("City")
    @Validation(required = true)
    private String city;

    @Body
    @NameInMap("Province")
    @Validation(required = true)
    private String province;

    private ListSTBServiceProvidersRequest(Builder builder) {
        super(builder);
        this.city = builder.city;
        this.province = builder.province;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSTBServiceProvidersRequest create() {
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
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    public static final class Builder extends Request.Builder<ListSTBServiceProvidersRequest, Builder> {
        private String city; 
        private String province; 

        private Builder() {
            super();
        } 

        private Builder(ListSTBServiceProvidersRequest request) {
            super(request);
            this.city = request.city;
            this.province = request.province;
        } 

        /**
         * City.
         */
        public Builder city(String city) {
            this.putBodyParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * Province.
         */
        public Builder province(String province) {
            this.putBodyParameter("Province", province);
            this.province = province;
            return this;
        }

        @Override
        public ListSTBServiceProvidersRequest build() {
            return new ListSTBServiceProvidersRequest(this);
        } 

    } 

}
