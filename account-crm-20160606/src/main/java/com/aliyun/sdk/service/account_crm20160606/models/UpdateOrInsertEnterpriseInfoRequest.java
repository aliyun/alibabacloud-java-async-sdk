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
 * {@link UpdateOrInsertEnterpriseInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateOrInsertEnterpriseInfoRequest</p>
 */
public class UpdateOrInsertEnterpriseInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Alias")
    private String alias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CityJsonString")
    private java.util.Map<String, ?> cityJsonString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseSize")
    private String enterpriseSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fax")
    private String fax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PK")
    private String pk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvinceJsonString")
    private java.util.Map<String, ?> provinceJsonString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Years")
    private String years;

    private UpdateOrInsertEnterpriseInfoRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.alias = builder.alias;
        this.cityJsonString = builder.cityJsonString;
        this.enterpriseSize = builder.enterpriseSize;
        this.fax = builder.fax;
        this.name = builder.name;
        this.pk = builder.pk;
        this.phone = builder.phone;
        this.provinceJsonString = builder.provinceJsonString;
        this.years = builder.years;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOrInsertEnterpriseInfoRequest create() {
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
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return cityJsonString
     */
    public java.util.Map<String, ?> getCityJsonString() {
        return this.cityJsonString;
    }

    /**
     * @return enterpriseSize
     */
    public String getEnterpriseSize() {
        return this.enterpriseSize;
    }

    /**
     * @return fax
     */
    public String getFax() {
        return this.fax;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return provinceJsonString
     */
    public java.util.Map<String, ?> getProvinceJsonString() {
        return this.provinceJsonString;
    }

    /**
     * @return years
     */
    public String getYears() {
        return this.years;
    }

    public static final class Builder extends Request.Builder<UpdateOrInsertEnterpriseInfoRequest, Builder> {
        private String address; 
        private String alias; 
        private java.util.Map<String, ?> cityJsonString; 
        private String enterpriseSize; 
        private String fax; 
        private String name; 
        private String pk; 
        private String phone; 
        private java.util.Map<String, ?> provinceJsonString; 
        private String years; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOrInsertEnterpriseInfoRequest request) {
            super(request);
            this.address = request.address;
            this.alias = request.alias;
            this.cityJsonString = request.cityJsonString;
            this.enterpriseSize = request.enterpriseSize;
            this.fax = request.fax;
            this.name = request.name;
            this.pk = request.pk;
            this.phone = request.phone;
            this.provinceJsonString = request.provinceJsonString;
            this.years = request.years;
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
         * Alias.
         */
        public Builder alias(String alias) {
            this.putQueryParameter("Alias", alias);
            this.alias = alias;
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
         * EnterpriseSize.
         */
        public Builder enterpriseSize(String enterpriseSize) {
            this.putQueryParameter("EnterpriseSize", enterpriseSize);
            this.enterpriseSize = enterpriseSize;
            return this;
        }

        /**
         * Fax.
         */
        public Builder fax(String fax) {
            this.putQueryParameter("Fax", fax);
            this.fax = fax;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * Phone.
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
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

        /**
         * Years.
         */
        public Builder years(String years) {
            this.putQueryParameter("Years", years);
            this.years = years;
            return this;
        }

        @Override
        public UpdateOrInsertEnterpriseInfoRequest build() {
            return new UpdateOrInsertEnterpriseInfoRequest(this);
        } 

    } 

}
