// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link ListSTBServiceProvidersRequest} extends {@link RequestModel}
 *
 * <p>ListSTBServiceProvidersRequest</p>
 */
public class ListSTBServiceProvidersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("City")
    @com.aliyun.core.annotation.Validation(required = true)
    private String city;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Province")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder city(String city) {
            this.putBodyParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
