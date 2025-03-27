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
 * {@link ListInfraredRemoteControllersRequest} extends {@link RequestModel}
 *
 * <p>ListInfraredRemoteControllersRequest</p>
 */
public class ListInfraredRemoteControllersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Brand")
    private String brand;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Province")
    private String province;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceProvider")
    private String serviceProvider;

    private ListInfraredRemoteControllersRequest(Builder builder) {
        super(builder);
        this.brand = builder.brand;
        this.category = builder.category;
        this.city = builder.city;
        this.hotelId = builder.hotelId;
        this.province = builder.province;
        this.serviceProvider = builder.serviceProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInfraredRemoteControllersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brand
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return serviceProvider
     */
    public String getServiceProvider() {
        return this.serviceProvider;
    }

    public static final class Builder extends Request.Builder<ListInfraredRemoteControllersRequest, Builder> {
        private String brand; 
        private String category; 
        private String city; 
        private String hotelId; 
        private String province; 
        private String serviceProvider; 

        private Builder() {
            super();
        } 

        private Builder(ListInfraredRemoteControllersRequest request) {
            super(request);
            this.brand = request.brand;
            this.category = request.category;
            this.city = request.city;
            this.hotelId = request.hotelId;
            this.province = request.province;
            this.serviceProvider = request.serviceProvider;
        } 

        /**
         * Brand.
         */
        public Builder brand(String brand) {
            this.putBodyParameter("Brand", brand);
            this.brand = brand;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder category(String category) {
            this.putBodyParameter("Category", category);
            this.category = category;
            return this;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>af7***536</p>
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
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

        /**
         * ServiceProvider.
         */
        public Builder serviceProvider(String serviceProvider) {
            this.putBodyParameter("ServiceProvider", serviceProvider);
            this.serviceProvider = serviceProvider;
            return this;
        }

        @Override
        public ListInfraredRemoteControllersRequest build() {
            return new ListInfraredRemoteControllersRequest(this);
        } 

    } 

}
