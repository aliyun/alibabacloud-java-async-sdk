// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceIdentityRoleRequest} extends {@link RequestModel}
 *
 * <p>GetServiceIdentityRoleRequest</p>
 */
public class GetServiceIdentityRoleRequest extends Request {
    private GetServiceIdentityRoleRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceIdentityRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetServiceIdentityRoleRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetServiceIdentityRoleRequest request) {
            super(request);
        } 

        @Override
        public GetServiceIdentityRoleRequest build() {
            return new GetServiceIdentityRoleRequest(this);
        } 

    } 

}
