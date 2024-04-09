// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnlockUsersRequest} extends {@link RequestModel}
 *
 * <p>UnlockUsersRequest</p>
 */
public class UnlockUsersRequest extends Request {
    @Query
    @NameInMap("AutoLockTime")
    private String autoLockTime;

    @Body
    @NameInMap("Users")
    @Validation(required = true)
    private java.util.List < String > users;

    private UnlockUsersRequest(Builder builder) {
        super(builder);
        this.autoLockTime = builder.autoLockTime;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnlockUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoLockTime
     */
    public String getAutoLockTime() {
        return this.autoLockTime;
    }

    /**
     * @return users
     */
    public java.util.List < String > getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<UnlockUsersRequest, Builder> {
        private String autoLockTime; 
        private java.util.List < String > users; 

        private Builder() {
            super();
        } 

        private Builder(UnlockUsersRequest request) {
            super(request);
            this.autoLockTime = request.autoLockTime;
            this.users = request.users;
        } 

        /**
         * The date on which the convenience users are automatically locked.
         */
        public Builder autoLockTime(String autoLockTime) {
            this.putQueryParameter("AutoLockTime", autoLockTime);
            this.autoLockTime = autoLockTime;
            return this;
        }

        /**
         * The usernames of the convenience users that you want to unlock.
         */
        public Builder users(java.util.List < String > users) {
            this.putBodyParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public UnlockUsersRequest build() {
            return new UnlockUsersRequest(this);
        } 

    } 

}
