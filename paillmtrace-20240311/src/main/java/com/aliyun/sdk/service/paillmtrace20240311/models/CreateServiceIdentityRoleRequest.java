// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311.models;

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
 * {@link CreateServiceIdentityRoleRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceIdentityRoleRequest</p>
 */
public class CreateServiceIdentityRoleRequest extends Request {
    private CreateServiceIdentityRoleRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceIdentityRoleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CreateServiceIdentityRoleRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CreateServiceIdentityRoleRequest request) {
            super(request);
        } 

        @Override
        public CreateServiceIdentityRoleRequest build() {
            return new CreateServiceIdentityRoleRequest(this);
        } 

    } 

}
