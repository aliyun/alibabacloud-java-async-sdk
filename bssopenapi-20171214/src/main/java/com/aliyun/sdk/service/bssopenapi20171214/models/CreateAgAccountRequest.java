// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAgAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateAgAccountRequest</p>
 */
public class CreateAgAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountAttr")
    private String accountAttr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CityName")
    private String cityName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseName")
    private String enterpriseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstName")
    private String firstName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastName")
    private String lastName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginEmail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NationCode")
    private String nationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Postcode")
    private String postcode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvinceName")
    private String provinceName;

    private CreateAgAccountRequest(Builder builder) {
        super(builder);
        this.accountAttr = builder.accountAttr;
        this.cityName = builder.cityName;
        this.enterpriseName = builder.enterpriseName;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.loginEmail = builder.loginEmail;
        this.nationCode = builder.nationCode;
        this.postcode = builder.postcode;
        this.provinceName = builder.provinceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountAttr
     */
    public String getAccountAttr() {
        return this.accountAttr;
    }

    /**
     * @return cityName
     */
    public String getCityName() {
        return this.cityName;
    }

    /**
     * @return enterpriseName
     */
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    /**
     * @return firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @return lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * @return loginEmail
     */
    public String getLoginEmail() {
        return this.loginEmail;
    }

    /**
     * @return nationCode
     */
    public String getNationCode() {
        return this.nationCode;
    }

    /**
     * @return postcode
     */
    public String getPostcode() {
        return this.postcode;
    }

    /**
     * @return provinceName
     */
    public String getProvinceName() {
        return this.provinceName;
    }

    public static final class Builder extends Request.Builder<CreateAgAccountRequest, Builder> {
        private String accountAttr; 
        private String cityName; 
        private String enterpriseName; 
        private String firstName; 
        private String lastName; 
        private String loginEmail; 
        private String nationCode; 
        private String postcode; 
        private String provinceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgAccountRequest request) {
            super(request);
            this.accountAttr = request.accountAttr;
            this.cityName = request.cityName;
            this.enterpriseName = request.enterpriseName;
            this.firstName = request.firstName;
            this.lastName = request.lastName;
            this.loginEmail = request.loginEmail;
            this.nationCode = request.nationCode;
            this.postcode = request.postcode;
            this.provinceName = request.provinceName;
        } 

        /**
         * <p>The attribute of the account. To view the attribute of the account, use the account to log on to the Alibaba Cloud Management Console, move the pointer over the profile picture in the upper-right corner, and then click <strong>Security Settings</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder accountAttr(String accountAttr) {
            this.putQueryParameter("AccountAttr", accountAttr);
            this.accountAttr = accountAttr;
            return this;
        }

        /**
         * <p>The name of the city.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        public Builder cityName(String cityName) {
            this.putQueryParameter("CityName", cityName);
            this.cityName = cityName;
            return this;
        }

        /**
         * <p>The name of the enterprise.</p>
         * 
         * <strong>example:</strong>
         * <p>Dongguan ChuangNeng Electric Appliance Co., Ltd</p>
         */
        public Builder enterpriseName(String enterpriseName) {
            this.putQueryParameter("EnterpriseName", enterpriseName);
            this.enterpriseName = enterpriseName;
            return this;
        }

        /**
         * <p>The first name.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhicheng</p>
         */
        public Builder firstName(String firstName) {
            this.putQueryParameter("FirstName", firstName);
            this.firstName = firstName;
            return this;
        }

        /**
         * <p>The last name.</p>
         * <p>The last name can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Wu</p>
         */
        public Builder lastName(String lastName) {
            this.putQueryParameter("LastName", lastName);
            this.lastName = lastName;
            return this;
        }

        /**
         * <p>The email address used to log on to the account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>email</p>
         */
        public Builder loginEmail(String loginEmail) {
            this.putQueryParameter("LoginEmail", loginEmail);
            this.loginEmail = loginEmail;
            return this;
        }

        /**
         * <p>The country code.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        public Builder nationCode(String nationCode) {
            this.putQueryParameter("NationCode", nationCode);
            this.nationCode = nationCode;
            return this;
        }

        /**
         * <p>The zip code.</p>
         * 
         * <strong>example:</strong>
         * <p>350000</p>
         */
        public Builder postcode(String postcode) {
            this.putQueryParameter("Postcode", postcode);
            this.postcode = postcode;
            return this;
        }

        /**
         * <p>The name of the province. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        public Builder provinceName(String provinceName) {
            this.putQueryParameter("ProvinceName", provinceName);
            this.provinceName = provinceName;
            return this;
        }

        @Override
        public CreateAgAccountRequest build() {
            return new CreateAgAccountRequest(this);
        } 

    } 

}
