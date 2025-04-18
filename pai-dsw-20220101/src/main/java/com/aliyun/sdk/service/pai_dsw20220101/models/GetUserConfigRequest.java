// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link GetUserConfigRequest} extends {@link RequestModel}
 *
 * <p>GetUserConfigRequest</p>
 */
public class GetUserConfigRequest extends Request {
    private GetUserConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetUserConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetUserConfigRequest request) {
            super(request);
        } 

        @Override
        public GetUserConfigRequest build() {
            return new GetUserConfigRequest(this);
        } 

    } 

}
