// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HasDefaultRoleRequest} extends {@link RequestModel}
 *
 * <p>HasDefaultRoleRequest</p>
 */
public class HasDefaultRoleRequest extends Request {
    private HasDefaultRoleRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HasDefaultRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<HasDefaultRoleRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(HasDefaultRoleRequest request) {
            super(request);
        } 

        @Override
        public HasDefaultRoleRequest build() {
            return new HasDefaultRoleRequest(this);
        } 

    } 

}
