// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpaClusterBaseLineListRequest} extends {@link RequestModel}
 *
 * <p>GetOpaClusterBaseLineListRequest</p>
 */
public class GetOpaClusterBaseLineListRequest extends Request {
    private GetOpaClusterBaseLineListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpaClusterBaseLineListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetOpaClusterBaseLineListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetOpaClusterBaseLineListRequest request) {
            super(request);
        } 

        @Override
        public GetOpaClusterBaseLineListRequest build() {
            return new GetOpaClusterBaseLineListRequest(this);
        } 

    } 

}
