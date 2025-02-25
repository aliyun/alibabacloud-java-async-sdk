// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link DeleteUserRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserRequest</p>
 */
public class DeleteUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
    private String userPrincipalName;

    private DeleteUserRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<DeleteUserRequest, Builder> {
        private String userId; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserRequest request) {
            super(request);
            this.userId = request.userId;
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * <p>The ID of the RAM user.</p>
         * <blockquote>
         * <p> You must specify only one of the following parameters: <code>UserPrincipalName</code> and <code>UserId</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20732900249392****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The logon name of the RAM user.</p>
         * <blockquote>
         * <p> You must specify only one of the following parameters: <code>UserPrincipalName</code> and <code>UserId</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public DeleteUserRequest build() {
            return new DeleteUserRequest(this);
        } 

    } 

}
