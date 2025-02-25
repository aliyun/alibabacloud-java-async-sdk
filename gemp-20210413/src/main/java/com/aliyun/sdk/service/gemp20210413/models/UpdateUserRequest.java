// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserRequest</p>
 */
public class UpdateUserRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("email")
    private String email;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ramId")
    private Long ramId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roleIdList")
    private java.util.List < Long > roleIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("username")
    private String username;

    private UpdateUserRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.email = builder.email;
        this.phone = builder.phone;
        this.ramId = builder.ramId;
        this.roleIdList = builder.roleIdList;
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
     * @return roleIdList
     */
    public java.util.List < Long > getRoleIdList() {
        return this.roleIdList;
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
        private java.util.List < Long > roleIdList; 
        private Long userId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.email = request.email;
            this.phone = request.phone;
            this.ramId = request.ramId;
            this.roleIdList = request.roleIdList;
            this.userId = request.userId;
            this.username = request.username;
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
         * roleIdList.
         */
        public Builder roleIdList(java.util.List < Long > roleIdList) {
            this.putBodyParameter("roleIdList", roleIdList);
            this.roleIdList = roleIdList;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
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
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

}
