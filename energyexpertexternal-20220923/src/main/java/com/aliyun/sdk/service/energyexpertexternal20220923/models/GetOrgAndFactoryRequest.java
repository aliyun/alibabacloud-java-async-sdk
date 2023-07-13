// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrgAndFactoryRequest} extends {@link RequestModel}
 *
 * <p>GetOrgAndFactoryRequest</p>
 */
public class GetOrgAndFactoryRequest extends Request {
    private GetOrgAndFactoryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrgAndFactoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetOrgAndFactoryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetOrgAndFactoryRequest request) {
            super(request);
        } 

        @Override
        public GetOrgAndFactoryRequest build() {
            return new GetOrgAndFactoryRequest(this);
        } 

    } 

}
