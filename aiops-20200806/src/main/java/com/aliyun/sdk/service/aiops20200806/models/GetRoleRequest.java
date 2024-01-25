// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRoleRequest} extends {@link RequestModel}
 *
 * <p>GetRoleRequest</p>
 */
public class GetRoleRequest extends Request {
    private GetRoleRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetRoleRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetRoleRequest request) {
            super(request);
        } 

        @Override
        public GetRoleRequest build() {
            return new GetRoleRequest(this);
        } 

    } 

}
