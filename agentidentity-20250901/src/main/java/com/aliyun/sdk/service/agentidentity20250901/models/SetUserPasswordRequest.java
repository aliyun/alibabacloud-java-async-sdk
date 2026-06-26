// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link SetUserPasswordRequest} extends {@link RequestModel}
 *
 * <p>SetUserPasswordRequest</p>
 */
public class SetUserPasswordRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GenerateRandomPassword")
    private Boolean generateRandomPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private SetUserPasswordRequest(Builder builder) {
        super(builder);
        this.generateRandomPassword = builder.generateRandomPassword;
        this.password = builder.password;
        this.userName = builder.userName;
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetUserPasswordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return generateRandomPassword
     */
    public Boolean getGenerateRandomPassword() {
        return this.generateRandomPassword;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<SetUserPasswordRequest, Builder> {
        private Boolean generateRandomPassword; 
        private String password; 
        private String userName; 
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(SetUserPasswordRequest request) {
            super(request);
            this.generateRandomPassword = request.generateRandomPassword;
            this.password = request.password;
            this.userName = request.userName;
            this.userPoolName = request.userPoolName;
        } 

        /**
         * GenerateRandomPassword.
         */
        public Builder generateRandomPassword(Boolean generateRandomPassword) {
            this.putBodyParameter("GenerateRandomPassword", generateRandomPassword);
            this.generateRandomPassword = generateRandomPassword;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * UserPoolName.
         */
        public Builder userPoolName(String userPoolName) {
            this.putBodyParameter("UserPoolName", userPoolName);
            this.userPoolName = userPoolName;
            return this;
        }

        @Override
        public SetUserPasswordRequest build() {
            return new SetUserPasswordRequest(this);
        } 

    } 

}
