// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
         * <p>The properties of the new account. In the console, click Account Properties in the top menu bar to go to the <strong>Security Settings</strong> page and view the properties.</p>
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
         * <p>The name of the city in English.</p>
         * 
         * <strong>example:</strong>
         * <p>北京</p>
         */
        public Builder cityName(String cityName) {
            this.putQueryParameter("CityName", cityName);
            this.cityName = cityName;
            return this;
        }

        /**
         * <p>The name of the enterprise. This is the enterprise name that corresponds to the Unified Social Credit Code.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云测试有限公司</p>
         */
        public Builder enterpriseName(String enterpriseName) {
            this.putQueryParameter("EnterpriseName", enterpriseName);
            this.enterpriseName = enterpriseName;
            return this;
        }

        /**
         * <p>The first name of the user under the level 1 category.</p>
         * 
         * <strong>example:</strong>
         * <p>志成</p>
         */
        public Builder firstName(String firstName) {
            this.putQueryParameter("FirstName", firstName);
            this.firstName = firstName;
            return this;
        }

        /**
         * <p>The last name of the user.</p>
         * <p>Maximum length: 64 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>吴</p>
         */
        public Builder lastName(String lastName) {
            this.putQueryParameter("LastName", lastName);
            this.lastName = lastName;
            return this;
        }

        /**
         * <p>The logon email address of the member account.</p>
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
         * <p>The postal code.</p>
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
         * <p>北京</p>
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
