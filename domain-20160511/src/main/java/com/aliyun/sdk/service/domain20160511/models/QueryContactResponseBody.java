// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20160511.models;

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
 * {@link QueryContactResponseBody} extends {@link TeaModel}
 *
 * <p>QueryContactResponseBody</p>
 */
public class QueryContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CCity")
    private String cCity;

    @com.aliyun.core.annotation.NameInMap("CCompany")
    private String cCompany;

    @com.aliyun.core.annotation.NameInMap("CCountry")
    private String cCountry;

    @com.aliyun.core.annotation.NameInMap("CName")
    private String cName;

    @com.aliyun.core.annotation.NameInMap("CProvince")
    private String cProvince;

    @com.aliyun.core.annotation.NameInMap("CVenu")
    private String cVenu;

    @com.aliyun.core.annotation.NameInMap("CreateDate")
    private String createDate;

    @com.aliyun.core.annotation.NameInMap("ECity")
    private String eCity;

    @com.aliyun.core.annotation.NameInMap("ECompany")
    private String eCompany;

    @com.aliyun.core.annotation.NameInMap("EName")
    private String eName;

    @com.aliyun.core.annotation.NameInMap("EProvince")
    private String eProvince;

    @com.aliyun.core.annotation.NameInMap("EVenu")
    private String eVenu;

    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("PostalCode")
    private String postalCode;

    @com.aliyun.core.annotation.NameInMap("RegType")
    private String regType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TelArea")
    private String telArea;

    @com.aliyun.core.annotation.NameInMap("TelExt")
    private String telExt;

    @com.aliyun.core.annotation.NameInMap("TelMain")
    private String telMain;

    @com.aliyun.core.annotation.NameInMap("UpdateDate")
    private String updateDate;

    private QueryContactResponseBody(Builder builder) {
        this.cCity = builder.cCity;
        this.cCompany = builder.cCompany;
        this.cCountry = builder.cCountry;
        this.cName = builder.cName;
        this.cProvince = builder.cProvince;
        this.cVenu = builder.cVenu;
        this.createDate = builder.createDate;
        this.eCity = builder.eCity;
        this.eCompany = builder.eCompany;
        this.eName = builder.eName;
        this.eProvince = builder.eProvince;
        this.eVenu = builder.eVenu;
        this.email = builder.email;
        this.postalCode = builder.postalCode;
        this.regType = builder.regType;
        this.requestId = builder.requestId;
        this.telArea = builder.telArea;
        this.telExt = builder.telExt;
        this.telMain = builder.telMain;
        this.updateDate = builder.updateDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryContactResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cCity
     */
    public String getCCity() {
        return this.cCity;
    }

    /**
     * @return cCompany
     */
    public String getCCompany() {
        return this.cCompany;
    }

    /**
     * @return cCountry
     */
    public String getCCountry() {
        return this.cCountry;
    }

    /**
     * @return cName
     */
    public String getCName() {
        return this.cName;
    }

    /**
     * @return cProvince
     */
    public String getCProvince() {
        return this.cProvince;
    }

    /**
     * @return cVenu
     */
    public String getCVenu() {
        return this.cVenu;
    }

    /**
     * @return createDate
     */
    public String getCreateDate() {
        return this.createDate;
    }

    /**
     * @return eCity
     */
    public String getECity() {
        return this.eCity;
    }

    /**
     * @return eCompany
     */
    public String getECompany() {
        return this.eCompany;
    }

    /**
     * @return eName
     */
    public String getEName() {
        return this.eName;
    }

    /**
     * @return eProvince
     */
    public String getEProvince() {
        return this.eProvince;
    }

    /**
     * @return eVenu
     */
    public String getEVenu() {
        return this.eVenu;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return postalCode
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * @return regType
     */
    public String getRegType() {
        return this.regType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return telArea
     */
    public String getTelArea() {
        return this.telArea;
    }

    /**
     * @return telExt
     */
    public String getTelExt() {
        return this.telExt;
    }

    /**
     * @return telMain
     */
    public String getTelMain() {
        return this.telMain;
    }

    /**
     * @return updateDate
     */
    public String getUpdateDate() {
        return this.updateDate;
    }

    public static final class Builder {
        private String cCity; 
        private String cCompany; 
        private String cCountry; 
        private String cName; 
        private String cProvince; 
        private String cVenu; 
        private String createDate; 
        private String eCity; 
        private String eCompany; 
        private String eName; 
        private String eProvince; 
        private String eVenu; 
        private String email; 
        private String postalCode; 
        private String regType; 
        private String requestId; 
        private String telArea; 
        private String telExt; 
        private String telMain; 
        private String updateDate; 

        private Builder() {
        } 

        private Builder(QueryContactResponseBody model) {
            this.cCity = model.cCity;
            this.cCompany = model.cCompany;
            this.cCountry = model.cCountry;
            this.cName = model.cName;
            this.cProvince = model.cProvince;
            this.cVenu = model.cVenu;
            this.createDate = model.createDate;
            this.eCity = model.eCity;
            this.eCompany = model.eCompany;
            this.eName = model.eName;
            this.eProvince = model.eProvince;
            this.eVenu = model.eVenu;
            this.email = model.email;
            this.postalCode = model.postalCode;
            this.regType = model.regType;
            this.requestId = model.requestId;
            this.telArea = model.telArea;
            this.telExt = model.telExt;
            this.telMain = model.telMain;
            this.updateDate = model.updateDate;
        } 

        /**
         * CCity.
         */
        public Builder cCity(String cCity) {
            this.cCity = cCity;
            return this;
        }

        /**
         * CCompany.
         */
        public Builder cCompany(String cCompany) {
            this.cCompany = cCompany;
            return this;
        }

        /**
         * CCountry.
         */
        public Builder cCountry(String cCountry) {
            this.cCountry = cCountry;
            return this;
        }

        /**
         * CName.
         */
        public Builder cName(String cName) {
            this.cName = cName;
            return this;
        }

        /**
         * CProvince.
         */
        public Builder cProvince(String cProvince) {
            this.cProvince = cProvince;
            return this;
        }

        /**
         * CVenu.
         */
        public Builder cVenu(String cVenu) {
            this.cVenu = cVenu;
            return this;
        }

        /**
         * CreateDate.
         */
        public Builder createDate(String createDate) {
            this.createDate = createDate;
            return this;
        }

        /**
         * ECity.
         */
        public Builder eCity(String eCity) {
            this.eCity = eCity;
            return this;
        }

        /**
         * ECompany.
         */
        public Builder eCompany(String eCompany) {
            this.eCompany = eCompany;
            return this;
        }

        /**
         * EName.
         */
        public Builder eName(String eName) {
            this.eName = eName;
            return this;
        }

        /**
         * EProvince.
         */
        public Builder eProvince(String eProvince) {
            this.eProvince = eProvince;
            return this;
        }

        /**
         * EVenu.
         */
        public Builder eVenu(String eVenu) {
            this.eVenu = eVenu;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * PostalCode.
         */
        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        /**
         * RegType.
         */
        public Builder regType(String regType) {
            this.regType = regType;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TelArea.
         */
        public Builder telArea(String telArea) {
            this.telArea = telArea;
            return this;
        }

        /**
         * TelExt.
         */
        public Builder telExt(String telExt) {
            this.telExt = telExt;
            return this;
        }

        /**
         * TelMain.
         */
        public Builder telMain(String telMain) {
            this.telMain = telMain;
            return this;
        }

        /**
         * UpdateDate.
         */
        public Builder updateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }

        public QueryContactResponseBody build() {
            return new QueryContactResponseBody(this);
        } 

    } 

}
