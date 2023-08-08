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
    @Body
    @NameInMap("Users")
    @Validation(required = true)
    private java.util.List < String > users;

    private UnlockUsersRequest(Builder builder) {
        super(builder);
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
     * @return users
     */
    public java.util.List < String > getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<UnlockUsersRequest, Builder> {
        private java.util.List < String > users; 

        private Builder() {
            super();
        } 

        private Builder(UnlockUsersRequest request) {
            super(request);
            this.users = request.users;
        } 

        /**
         * Users.
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
