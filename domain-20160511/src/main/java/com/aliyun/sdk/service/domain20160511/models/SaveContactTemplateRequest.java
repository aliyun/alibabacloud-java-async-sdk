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
 * {@link SaveContactTemplateRequest} extends {@link RequestModel}
 *
 * <p>SaveContactTemplateRequest</p>
 */
public class SaveContactTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CCity")
    private String cCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CCompany")
    private String cCompany;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CCountry")
    private String cCountry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CName")
    private String cName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CProvince")
    private String cProvince;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CVenu")
    private String cVenu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactTemplateId")
    private Long contactTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultTemplate")
    private Boolean defaultTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ECity")
    private String eCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ECompany")
    private String eCompany;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EName")
    private String eName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EProvince")
    private String eProvince;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EVenu")
    private String eVenu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostalCode")
    private String postalCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegType")
    private String regType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelArea")
    private String telArea;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelExt")
    private String telExt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelMain")
    private String telMain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SaveContactTemplateRequest(Builder builder) {
        super(builder);
        this.cCity = builder.cCity;
        this.cCompany = builder.cCompany;
        this.cCountry = builder.cCountry;
        this.cName = builder.cName;
        this.cProvince = builder.cProvince;
        this.cVenu = builder.cVenu;
        this.contactTemplateId = builder.contactTemplateId;
        this.defaultTemplate = builder.defaultTemplate;
        this.eCity = builder.eCity;
        this.eCompany = builder.eCompany;
        this.eName = builder.eName;
        this.eProvince = builder.eProvince;
        this.eVenu = builder.eVenu;
        this.email = builder.email;
        this.lang = builder.lang;
        this.postalCode = builder.postalCode;
        this.regType = builder.regType;
        this.telArea = builder.telArea;
        this.telExt = builder.telExt;
        this.telMain = builder.telMain;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveContactTemplateRequest create() {
        return builder().build();
    }

@Override
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
     * @return contactTemplateId
     */
    public Long getContactTemplateId() {
        return this.contactTemplateId;
    }

    /**
     * @return defaultTemplate
     */
    public Boolean getDefaultTemplate() {
        return this.defaultTemplate;
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveContactTemplateRequest, Builder> {
        private String cCity; 
        private String cCompany; 
        private String cCountry; 
        private String cName; 
        private String cProvince; 
        private String cVenu; 
        private Long contactTemplateId; 
        private Boolean defaultTemplate; 
        private String eCity; 
        private String eCompany; 
        private String eName; 
        private String eProvince; 
        private String eVenu; 
        private String email; 
        private String lang; 
        private String postalCode; 
        private String regType; 
        private String telArea; 
        private String telExt; 
        private String telMain; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveContactTemplateRequest request) {
            super(request);
            this.cCity = request.cCity;
            this.cCompany = request.cCompany;
            this.cCountry = request.cCountry;
            this.cName = request.cName;
            this.cProvince = request.cProvince;
            this.cVenu = request.cVenu;
            this.contactTemplateId = request.contactTemplateId;
            this.defaultTemplate = request.defaultTemplate;
            this.eCity = request.eCity;
            this.eCompany = request.eCompany;
            this.eName = request.eName;
            this.eProvince = request.eProvince;
            this.eVenu = request.eVenu;
            this.email = request.email;
            this.lang = request.lang;
            this.postalCode = request.postalCode;
            this.regType = request.regType;
            this.telArea = request.telArea;
            this.telExt = request.telExt;
            this.telMain = request.telMain;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * CCity.
         */
        public Builder cCity(String cCity) {
            this.putQueryParameter("CCity", cCity);
            this.cCity = cCity;
            return this;
        }

        /**
         * CCompany.
         */
        public Builder cCompany(String cCompany) {
            this.putQueryParameter("CCompany", cCompany);
            this.cCompany = cCompany;
            return this;
        }

        /**
         * CCountry.
         */
        public Builder cCountry(String cCountry) {
            this.putQueryParameter("CCountry", cCountry);
            this.cCountry = cCountry;
            return this;
        }

        /**
         * CName.
         */
        public Builder cName(String cName) {
            this.putQueryParameter("CName", cName);
            this.cName = cName;
            return this;
        }

        /**
         * CProvince.
         */
        public Builder cProvince(String cProvince) {
            this.putQueryParameter("CProvince", cProvince);
            this.cProvince = cProvince;
            return this;
        }

        /**
         * CVenu.
         */
        public Builder cVenu(String cVenu) {
            this.putQueryParameter("CVenu", cVenu);
            this.cVenu = cVenu;
            return this;
        }

        /**
         * ContactTemplateId.
         */
        public Builder contactTemplateId(Long contactTemplateId) {
            this.putQueryParameter("ContactTemplateId", contactTemplateId);
            this.contactTemplateId = contactTemplateId;
            return this;
        }

        /**
         * DefaultTemplate.
         */
        public Builder defaultTemplate(Boolean defaultTemplate) {
            this.putQueryParameter("DefaultTemplate", defaultTemplate);
            this.defaultTemplate = defaultTemplate;
            return this;
        }

        /**
         * ECity.
         */
        public Builder eCity(String eCity) {
            this.putQueryParameter("ECity", eCity);
            this.eCity = eCity;
            return this;
        }

        /**
         * ECompany.
         */
        public Builder eCompany(String eCompany) {
            this.putQueryParameter("ECompany", eCompany);
            this.eCompany = eCompany;
            return this;
        }

        /**
         * EName.
         */
        public Builder eName(String eName) {
            this.putQueryParameter("EName", eName);
            this.eName = eName;
            return this;
        }

        /**
         * EProvince.
         */
        public Builder eProvince(String eProvince) {
            this.putQueryParameter("EProvince", eProvince);
            this.eProvince = eProvince;
            return this;
        }

        /**
         * EVenu.
         */
        public Builder eVenu(String eVenu) {
            this.putQueryParameter("EVenu", eVenu);
            this.eVenu = eVenu;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PostalCode.
         */
        public Builder postalCode(String postalCode) {
            this.putQueryParameter("PostalCode", postalCode);
            this.postalCode = postalCode;
            return this;
        }

        /**
         * RegType.
         */
        public Builder regType(String regType) {
            this.putQueryParameter("RegType", regType);
            this.regType = regType;
            return this;
        }

        /**
         * TelArea.
         */
        public Builder telArea(String telArea) {
            this.putQueryParameter("TelArea", telArea);
            this.telArea = telArea;
            return this;
        }

        /**
         * TelExt.
         */
        public Builder telExt(String telExt) {
            this.putQueryParameter("TelExt", telExt);
            this.telExt = telExt;
            return this;
        }

        /**
         * TelMain.
         */
        public Builder telMain(String telMain) {
            this.putQueryParameter("TelMain", telMain);
            this.telMain = telMain;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveContactTemplateRequest build() {
            return new SaveContactTemplateRequest(this);
        } 

    } 

}
