// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserRequest} extends {@link RequestModel}
 *
 * <p>CreateUserRequest</p>
 */
public class CreateUserRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("email")
    private String email;

    @Body
    @NameInMap("phone")
    private String phone;

    @Body
    @NameInMap("ramId")
    private Long ramId;

    @Body
    @NameInMap("username")
    private String username;

    private CreateUserRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.email = builder.email;
        this.phone = builder.phone;
        this.ramId = builder.ramId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return ramId
     */
    public Long getRamId() {
        return this.ramId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<CreateUserRequest, Builder> {
        private String clientToken; 
        private String email; 
        private String phone; 
        private Long ramId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.email = response.email;
            this.phone = response.phone;
            this.ramId = response.ramId;
            this.username = response.username;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * email.
         */
        public Builder email(String email) {
            this.putBodyParameter("email", email);
            this.email = email;
            return this;
        }

        /**
         * phone.
         */
        public Builder phone(String phone) {
            this.putBodyParameter("phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * ramId.
         */
        public Builder ramId(Long ramId) {
            this.putBodyParameter("ramId", ramId);
            this.ramId = ramId;
            return this;
        }

        /**
         * username.
         */
        public Builder username(String username) {
            this.putBodyParameter("username", username);
            this.username = username;
            return this;
        }

        @Override
        public CreateUserRequest build() {
            return new CreateUserRequest(this);
        } 

    } 

}
