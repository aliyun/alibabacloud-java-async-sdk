// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link LockUsersRequest} extends {@link RequestModel}
 *
 * <p>LockUsersRequest</p>
 */
public class LockUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogoutSession")
    private Boolean logoutSession;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Users")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> users;

    private LockUsersRequest(Builder builder) {
        super(builder);
        this.logoutSession = builder.logoutSession;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LockUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logoutSession
     */
    public Boolean getLogoutSession() {
        return this.logoutSession;
    }

    /**
     * @return users
     */
    public java.util.List<String> getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<LockUsersRequest, Builder> {
        private Boolean logoutSession; 
        private java.util.List<String> users; 

        private Builder() {
            super();
        } 

        private Builder(LockUsersRequest request) {
            super(request);
            this.logoutSession = request.logoutSession;
            this.users = request.users;
        } 

        /**
         * LogoutSession.
         */
        public Builder logoutSession(Boolean logoutSession) {
            this.putQueryParameter("LogoutSession", logoutSession);
            this.logoutSession = logoutSession;
            return this;
        }

        /**
         * <p>The usernames of the convenience users that you want to lock.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder users(java.util.List<String> users) {
            this.putBodyParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public LockUsersRequest build() {
            return new LockUsersRequest(this);
        } 

    } 

}
