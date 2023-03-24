// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableVirtualMFARequest} extends {@link RequestModel}
 *
 * <p>DisableVirtualMFARequest</p>
 */
public class DisableVirtualMFARequest extends Request {
    @Query
    @NameInMap("UserPrincipalName")
    @Validation(required = true)
    private String userPrincipalName;

    private DisableVirtualMFARequest(Builder builder) {
        super(builder);
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableVirtualMFARequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<DisableVirtualMFARequest, Builder> {
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(DisableVirtualMFARequest request) {
            super(request);
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * The logon name of the RAM user.
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public DisableVirtualMFARequest build() {
            return new DisableVirtualMFARequest(this);
        } 

    } 

}
