// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link UpdateAgAccountAddressInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateAgAccountAddressInfoRequest</p>
 */
public class UpdateAgAccountAddressInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address2")
    private String address2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mpk")
    private String mpk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PK")
    private String pk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostCode")
    private String postCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Province")
    private String province;

    private UpdateAgAccountAddressInfoRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.address2 = builder.address2;
        this.appName = builder.appName;
        this.city = builder.city;
        this.mpk = builder.mpk;
        this.pk = builder.pk;
        this.postCode = builder.postCode;
        this.province = builder.province;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgAccountAddressInfoRequest create() {
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
     * @return address2
     */
    public String getAddress2() {
        return this.address2;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return mpk
     */
    public String getMpk() {
        return this.mpk;
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    /**
     * @return postCode
     */
    public String getPostCode() {
        return this.postCode;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    public static final class Builder extends Request.Builder<UpdateAgAccountAddressInfoRequest, Builder> {
        private String address; 
        private String address2; 
        private String appName; 
        private String city; 
        private String mpk; 
        private String pk; 
        private String postCode; 
        private String province; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgAccountAddressInfoRequest request) {
            super(request);
            this.address = request.address;
            this.address2 = request.address2;
            this.appName = request.appName;
            this.city = request.city;
            this.mpk = request.mpk;
            this.pk = request.pk;
            this.postCode = request.postCode;
            this.province = request.province;
        } 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * Address2.
         */
        public Builder address2(String address2) {
            this.putQueryParameter("Address2", address2);
            this.address2 = address2;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
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
         * Mpk.
         */
        public Builder mpk(String mpk) {
            this.putQueryParameter("Mpk", mpk);
            this.mpk = mpk;
            return this;
        }

        /**
         * PK.
         */
        public Builder pk(String pk) {
            this.putQueryParameter("PK", pk);
            this.pk = pk;
            return this;
        }

        /**
         * PostCode.
         */
        public Builder postCode(String postCode) {
            this.putQueryParameter("PostCode", postCode);
            this.postCode = postCode;
            return this;
        }

        /**
         * Province.
         */
        public Builder province(String province) {
            this.putQueryParameter("Province", province);
            this.province = province;
            return this;
        }

        @Override
        public UpdateAgAccountAddressInfoRequest build() {
            return new UpdateAgAccountAddressInfoRequest(this);
        } 

    } 

}
