// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetCurrentVersionPublishRequest} extends {@link RequestModel}
 *
 * <p>GetCurrentVersionPublishRequest</p>
 */
public class GetCurrentVersionPublishRequest extends Request {
    private GetCurrentVersionPublishRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCurrentVersionPublishRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetCurrentVersionPublishRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetCurrentVersionPublishRequest request) {
            super(request);
        } 

        @Override
        public GetCurrentVersionPublishRequest build() {
            return new GetCurrentVersionPublishRequest(this);
        } 

    } 

}
