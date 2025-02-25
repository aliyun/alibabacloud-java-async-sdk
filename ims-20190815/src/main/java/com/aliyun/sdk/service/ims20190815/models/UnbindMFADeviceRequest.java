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
 * {@link UnbindMFADeviceRequest} extends {@link RequestModel}
 *
 * <p>UnbindMFADeviceRequest</p>
 */
public class UnbindMFADeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userPrincipalName;

    private UnbindMFADeviceRequest(Builder builder) {
        super(builder);
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindMFADeviceRequest create() {
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

    public static final class Builder extends Request.Builder<UnbindMFADeviceRequest, Builder> {
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(UnbindMFADeviceRequest request) {
            super(request);
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * <p>The logon name of the RAM user.</p>
         * <p>This parameter is required.</p>
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
        public UnbindMFADeviceRequest build() {
            return new UnbindMFADeviceRequest(this);
        } 

    } 

}
