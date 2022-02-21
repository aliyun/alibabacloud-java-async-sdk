// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetUserPasswordRequest} extends {@link RequestModel}
 *
 * <p>ResetUserPasswordRequest</p>
 */
public class ResetUserPasswordRequest extends Request {
    @Body
    @NameInMap("Users")
    @Validation(required = true)
    private java.util.List < String > users;

    private ResetUserPasswordRequest(Builder builder) {
        super(builder);
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetUserPasswordRequest create() {
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

    public static final class Builder extends Request.Builder<ResetUserPasswordRequest, Builder> {
        private java.util.List < String > users; 

        private Builder() {
            super();
        } 

        private Builder(ResetUserPasswordRequest response) {
            super(response);
            this.users = response.users;
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
        public ResetUserPasswordRequest build() {
            return new ResetUserPasswordRequest(this);
        } 

    } 

}
