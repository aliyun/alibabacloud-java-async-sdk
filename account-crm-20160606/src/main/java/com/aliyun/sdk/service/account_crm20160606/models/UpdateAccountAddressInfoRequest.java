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
 * {@link UpdateAccountAddressInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateAccountAddressInfoRequest</p>
 */
public class UpdateAccountAddressInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address2")
    private String address2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CityJsonString")
    private java.util.Map<String, ?> cityJsonString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DistrictJsonString")
    private java.util.Map<String, ?> districtJsonString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PK")
    private String pk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostCode")
    private String postCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvinceJsonString")
    private java.util.Map<String, ?> provinceJsonString;

    private UpdateAccountAddressInfoRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.address2 = builder.address2;
        this.cityJsonString = builder.cityJsonString;
        this.districtJsonString = builder.districtJsonString;
        this.pk = builder.pk;
        this.postCode = builder.postCode;
        this.provinceJsonString = builder.provinceJsonString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAccountAddressInfoRequest create() {
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
     * @return cityJsonString
     */
    public java.util.Map<String, ?> getCityJsonString() {
        return this.cityJsonString;
    }

    /**
     * @return districtJsonString
     */
    public java.util.Map<String, ?> getDistrictJsonString() {
        return this.districtJsonString;
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
     * @return provinceJsonString
     */
    public java.util.Map<String, ?> getProvinceJsonString() {
        return this.provinceJsonString;
    }

    public static final class Builder extends Request.Builder<UpdateAccountAddressInfoRequest, Builder> {
        private String address; 
        private String address2; 
        private java.util.Map<String, ?> cityJsonString; 
        private java.util.Map<String, ?> districtJsonString; 
        private String pk; 
        private String postCode; 
        private java.util.Map<String, ?> provinceJsonString; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAccountAddressInfoRequest request) {
            super(request);
            this.address = request.address;
            this.address2 = request.address2;
            this.cityJsonString = request.cityJsonString;
            this.districtJsonString = request.districtJsonString;
            this.pk = request.pk;
            this.postCode = request.postCode;
            this.provinceJsonString = request.provinceJsonString;
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
         * CityJsonString.
         */
        public Builder cityJsonString(java.util.Map<String, ?> cityJsonString) {
            String cityJsonStringShrink = shrink(cityJsonString, "CityJsonString", "json");
            this.putQueryParameter("CityJsonString", cityJsonStringShrink);
            this.cityJsonString = cityJsonString;
            return this;
        }

        /**
         * DistrictJsonString.
         */
        public Builder districtJsonString(java.util.Map<String, ?> districtJsonString) {
            String districtJsonStringShrink = shrink(districtJsonString, "DistrictJsonString", "json");
            this.putQueryParameter("DistrictJsonString", districtJsonStringShrink);
            this.districtJsonString = districtJsonString;
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
         * ProvinceJsonString.
         */
        public Builder provinceJsonString(java.util.Map<String, ?> provinceJsonString) {
            String provinceJsonStringShrink = shrink(provinceJsonString, "ProvinceJsonString", "json");
            this.putQueryParameter("ProvinceJsonString", provinceJsonStringShrink);
            this.provinceJsonString = provinceJsonString;
            return this;
        }

        @Override
        public UpdateAccountAddressInfoRequest build() {
            return new UpdateAccountAddressInfoRequest(this);
        } 

    } 

}
