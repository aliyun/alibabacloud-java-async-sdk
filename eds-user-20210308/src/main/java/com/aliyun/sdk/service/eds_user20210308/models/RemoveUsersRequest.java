// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveUsersRequest} extends {@link RequestModel}
 *
 * <p>RemoveUsersRequest</p>
 */
public class RemoveUsersRequest extends Request {
    @Body
    @NameInMap("Users")
    @Validation(required = true)
    private java.util.List < String > users;

    private RemoveUsersRequest(Builder builder) {
        super(builder);
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveUsersRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveUsersRequest, Builder> {
        private java.util.List < String > users; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUsersRequest request) {
            super(request);
            this.users = request.users;
        } 

        /**
         * The usernames of the convenience users that you want to remove.
         */
        public Builder users(java.util.List < String > users) {
            this.putBodyParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public RemoveUsersRequest build() {
            return new RemoveUsersRequest(this);
        } 

    } 

}
