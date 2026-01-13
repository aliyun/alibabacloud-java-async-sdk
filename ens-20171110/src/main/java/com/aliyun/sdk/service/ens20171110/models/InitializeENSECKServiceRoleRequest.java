// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link InitializeENSECKServiceRoleRequest} extends {@link RequestModel}
 *
 * <p>InitializeENSECKServiceRoleRequest</p>
 */
public class InitializeENSECKServiceRoleRequest extends Request {
    private InitializeENSECKServiceRoleRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeENSECKServiceRoleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<InitializeENSECKServiceRoleRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(InitializeENSECKServiceRoleRequest request) {
            super(request);
        } 

        @Override
        public InitializeENSECKServiceRoleRequest build() {
            return new InitializeENSECKServiceRoleRequest(this);
        } 

    } 

}
