// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertDevopsUserRequest} extends {@link RequestModel}
 *
 * <p>InsertDevopsUserRequest</p>
 */
public class InsertDevopsUserRequest extends Request {
    @Body
    @NameInMap("Email")
    private String email;

    @Body
    @NameInMap("Phone")
    private String phone;

    @Body
    @NameInMap("UserName")
    private String userName;

    @Body
    @NameInMap("UserPk")
    @Validation(required = true)
    private String userPk;

    private InsertDevopsUserRequest(Builder builder) {
        super(builder);
        this.email = builder.email;
        this.phone = builder.phone;
        this.userName = builder.userName;
        this.userPk = builder.userPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertDevopsUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return userPk
     */
    public String getUserPk() {
        return this.userPk;
    }

    public static final class Builder extends Request.Builder<InsertDevopsUserRequest, Builder> {
        private String email; 
        private String phone; 
        private String userName; 
        private String userPk; 

        private Builder() {
            super();
        } 

        private Builder(InsertDevopsUserRequest response) {
            super(response);
            this.email = response.email;
            this.phone = response.phone;
            this.userName = response.userName;
            this.userPk = response.userPk;
        } 

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putBodyParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.putBodyParameter("Phone", phone);
            this.phone = phone;
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
         * UserPk.
         */
        public Builder userPk(String userPk) {
            this.putBodyParameter("UserPk", userPk);
            this.userPk = userPk;
            return this;
        }

        @Override
        public InsertDevopsUserRequest build() {
            return new InsertDevopsUserRequest(this);
        } 

    } 

}
