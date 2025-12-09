// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

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
 * {@link GetApiMcpServerUserConfigRequest} extends {@link RequestModel}
 *
 * <p>GetApiMcpServerUserConfigRequest</p>
 */
public class GetApiMcpServerUserConfigRequest extends Request {
    private GetApiMcpServerUserConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiMcpServerUserConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetApiMcpServerUserConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetApiMcpServerUserConfigRequest request) {
            super(request);
        } 

        @Override
        public GetApiMcpServerUserConfigRequest build() {
            return new GetApiMcpServerUserConfigRequest(this);
        } 

    } 

}
