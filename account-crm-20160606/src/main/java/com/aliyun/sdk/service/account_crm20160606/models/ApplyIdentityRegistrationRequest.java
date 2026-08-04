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
 * {@link ApplyIdentityRegistrationRequest} extends {@link RequestModel}
 *
 * <p>ApplyIdentityRegistrationRequest</p>
 */
public class ApplyIdentityRegistrationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerId")
    private String customerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocBackPic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String docBackPic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocFrontPic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String docFrontPic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocNum")
    private String docNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocType")
    private String docType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(required = true)
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FullName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fullName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegisteredAddress")
    private String registeredAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegisteredCountry")
    private String registeredCountry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegisteredNum")
    private String registeredNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tel")
    private String tel;

    private ApplyIdentityRegistrationRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.customerId = builder.customerId;
        this.docBackPic = builder.docBackPic;
        this.docFrontPic = builder.docFrontPic;
        this.docNum = builder.docNum;
        this.docType = builder.docType;
        this.email = builder.email;
        this.fullName = builder.fullName;
        this.registeredAddress = builder.registeredAddress;
        this.registeredCountry = builder.registeredCountry;
        this.registeredNum = builder.registeredNum;
        this.source = builder.source;
        this.tel = builder.tel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyIdentityRegistrationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountType
     */
    public Integer getAccountType() {
        return this.accountType;
    }

    /**
     * @return customerId
     */
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * @return docBackPic
     */
    public String getDocBackPic() {
        return this.docBackPic;
    }

    /**
     * @return docFrontPic
     */
    public String getDocFrontPic() {
        return this.docFrontPic;
    }

    /**
     * @return docNum
     */
    public String getDocNum() {
        return this.docNum;
    }

    /**
     * @return docType
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return fullName
     */
    public String getFullName() {
        return this.fullName;
    }

    /**
     * @return registeredAddress
     */
    public String getRegisteredAddress() {
        return this.registeredAddress;
    }

    /**
     * @return registeredCountry
     */
    public String getRegisteredCountry() {
        return this.registeredCountry;
    }

    /**
     * @return registeredNum
     */
    public String getRegisteredNum() {
        return this.registeredNum;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return tel
     */
    public String getTel() {
        return this.tel;
    }

    public static final class Builder extends Request.Builder<ApplyIdentityRegistrationRequest, Builder> {
        private Integer accountType; 
        private String customerId; 
        private String docBackPic; 
        private String docFrontPic; 
        private String docNum; 
        private String docType; 
        private String email; 
        private String fullName; 
        private String registeredAddress; 
        private String registeredCountry; 
        private String registeredNum; 
        private String source; 
        private String tel; 

        private Builder() {
            super();
        } 

        private Builder(ApplyIdentityRegistrationRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.customerId = request.customerId;
            this.docBackPic = request.docBackPic;
            this.docFrontPic = request.docFrontPic;
            this.docNum = request.docNum;
            this.docType = request.docType;
            this.email = request.email;
            this.fullName = request.fullName;
            this.registeredAddress = request.registeredAddress;
            this.registeredCountry = request.registeredCountry;
            this.registeredNum = request.registeredNum;
            this.source = request.source;
            this.tel = request.tel;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder accountType(Integer accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * CustomerId.
         */
        public Builder customerId(String customerId) {
            this.putQueryParameter("CustomerId", customerId);
            this.customerId = customerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder docBackPic(String docBackPic) {
            this.putQueryParameter("DocBackPic", docBackPic);
            this.docBackPic = docBackPic;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder docFrontPic(String docFrontPic) {
            this.putQueryParameter("DocFrontPic", docFrontPic);
            this.docFrontPic = docFrontPic;
            return this;
        }

        /**
         * DocNum.
         */
        public Builder docNum(String docNum) {
            this.putQueryParameter("DocNum", docNum);
            this.docNum = docNum;
            return this;
        }

        /**
         * DocType.
         */
        public Builder docType(String docType) {
            this.putQueryParameter("DocType", docType);
            this.docType = docType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fullName(String fullName) {
            this.putQueryParameter("FullName", fullName);
            this.fullName = fullName;
            return this;
        }

        /**
         * RegisteredAddress.
         */
        public Builder registeredAddress(String registeredAddress) {
            this.putQueryParameter("RegisteredAddress", registeredAddress);
            this.registeredAddress = registeredAddress;
            return this;
        }

        /**
         * RegisteredCountry.
         */
        public Builder registeredCountry(String registeredCountry) {
            this.putQueryParameter("RegisteredCountry", registeredCountry);
            this.registeredCountry = registeredCountry;
            return this;
        }

        /**
         * RegisteredNum.
         */
        public Builder registeredNum(String registeredNum) {
            this.putQueryParameter("RegisteredNum", registeredNum);
            this.registeredNum = registeredNum;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * Tel.
         */
        public Builder tel(String tel) {
            this.putQueryParameter("Tel", tel);
            this.tel = tel;
            return this;
        }

        @Override
        public ApplyIdentityRegistrationRequest build() {
            return new ApplyIdentityRegistrationRequest(this);
        } 

    } 

}
