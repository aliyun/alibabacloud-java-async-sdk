// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAgAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateAgAccountRequest</p>
 */
public class CreateAgAccountRequest extends Request {
    @Query
    @NameInMap("AccountAttr")
    private String accountAttr;

    @Query
    @NameInMap("CityName")
    private String cityName;

    @Query
    @NameInMap("EnterpriseName")
    private String enterpriseName;

    @Query
    @NameInMap("FirstName")
    private String firstName;

    @Query
    @NameInMap("LastName")
    private String lastName;

    @Query
    @NameInMap("LoginEmail")
    @Validation(required = true)
    private String loginEmail;

    @Query
    @NameInMap("NationCode")
    private String nationCode;

    @Query
    @NameInMap("Postcode")
    private String postcode;

    @Query
    @NameInMap("ProvinceName")
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
         * The attribute of the account. To view the attribute of the account, use the account to log on to the Alibaba Cloud Management Console, move the pointer over the profile picture in the upper-right corner, and then click **Security Settings**.
         */
        public Builder accountAttr(String accountAttr) {
            this.putQueryParameter("AccountAttr", accountAttr);
            this.accountAttr = accountAttr;
            return this;
        }

        /**
         * The name of the city.
         */
        public Builder cityName(String cityName) {
            this.putQueryParameter("CityName", cityName);
            this.cityName = cityName;
            return this;
        }

        /**
         * The name of the enterprise.
         */
        public Builder enterpriseName(String enterpriseName) {
            this.putQueryParameter("EnterpriseName", enterpriseName);
            this.enterpriseName = enterpriseName;
            return this;
        }

        /**
         * The first name.
         */
        public Builder firstName(String firstName) {
            this.putQueryParameter("FirstName", firstName);
            this.firstName = firstName;
            return this;
        }

        /**
         * The last name.
         * <p>
         * 
         * The last name can be up to 64 characters in length.
         */
        public Builder lastName(String lastName) {
            this.putQueryParameter("LastName", lastName);
            this.lastName = lastName;
            return this;
        }

        /**
         * The email address used to log on to the account.
         */
        public Builder loginEmail(String loginEmail) {
            this.putQueryParameter("LoginEmail", loginEmail);
            this.loginEmail = loginEmail;
            return this;
        }

        /**
         * The country code.
         */
        public Builder nationCode(String nationCode) {
            this.putQueryParameter("NationCode", nationCode);
            this.nationCode = nationCode;
            return this;
        }

        /**
         * The zip code.
         */
        public Builder postcode(String postcode) {
            this.putQueryParameter("Postcode", postcode);
            this.postcode = postcode;
            return this;
        }

        /**
         * The name of the province. This parameter is optional.
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
