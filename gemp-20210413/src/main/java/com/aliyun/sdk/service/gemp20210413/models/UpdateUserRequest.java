// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserRequest</p>
 */
public class UpdateUserRequest extends Request {
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
    @NameInMap("userId")
    @Validation(required = true)
    private Long userId;

    @Body
    @NameInMap("username")
    private String username;

    private UpdateUserRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.email = builder.email;
        this.phone = builder.phone;
        this.ramId = builder.ramId;
        this.userId = builder.userId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserRequest create() {
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
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<UpdateUserRequest, Builder> {
        private String clientToken; 
        private String email; 
        private String phone; 
        private Long ramId; 
        private Long userId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.email = response.email;
            this.phone = response.phone;
            this.ramId = response.ramId;
            this.userId = response.userId;
            this.username = response.username;
        } 

        /**
         * 幂等号
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 邮件
         */
        public Builder email(String email) {
            this.putBodyParameter("email", email);
            this.email = email;
            return this;
        }

        /**
         * 手机号
         */
        public Builder phone(String phone) {
            this.putBodyParameter("phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * 用户ramId
         */
        public Builder ramId(Long ramId) {
            this.putBodyParameter("ramId", ramId);
            this.ramId = ramId;
            return this;
        }

        /**
         * 用户ID
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * 用户名
         */
        public Builder username(String username) {
            this.putBodyParameter("username", username);
            this.username = username;
            return this;
        }

        @Override
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

}
