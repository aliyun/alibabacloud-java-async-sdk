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
    @NameInMap("NotifyType")
    private Integer notifyType;

    @Body
    @NameInMap("Users")
    @Validation(required = true)
    private java.util.List < String > users;

    private ResetUserPasswordRequest(Builder builder) {
        super(builder);
        this.notifyType = builder.notifyType;
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
     * @return notifyType
     */
    public Integer getNotifyType() {
        return this.notifyType;
    }

    /**
     * @return users
     */
    public java.util.List < String > getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<ResetUserPasswordRequest, Builder> {
        private Integer notifyType; 
        private java.util.List < String > users; 

        private Builder() {
            super();
        } 

        private Builder(ResetUserPasswordRequest request) {
            super(request);
            this.notifyType = request.notifyType;
            this.users = request.users;
        } 

        /**
         * NotifyType.
         */
        public Builder notifyType(Integer notifyType) {
            this.putBodyParameter("NotifyType", notifyType);
            this.notifyType = notifyType;
            return this;
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
