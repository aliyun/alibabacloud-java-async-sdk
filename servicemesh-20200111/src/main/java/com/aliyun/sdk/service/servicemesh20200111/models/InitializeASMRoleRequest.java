// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeASMRoleRequest} extends {@link RequestModel}
 *
 * <p>InitializeASMRoleRequest</p>
 */
public class InitializeASMRoleRequest extends Request {
    private InitializeASMRoleRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeASMRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<InitializeASMRoleRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(InitializeASMRoleRequest response) {
            super(response);
        } 

        @Override
        public InitializeASMRoleRequest build() {
            return new InitializeASMRoleRequest(this);
        } 

    } 

}
