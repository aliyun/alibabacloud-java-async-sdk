// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link GetChannelSignRequest} extends {@link RequestModel}
 *
 * <p>GetChannelSignRequest</p>
 */
public class GetChannelSignRequest extends Request {
    private GetChannelSignRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChannelSignRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetChannelSignRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetChannelSignRequest request) {
            super(request);
        } 

        @Override
        public GetChannelSignRequest build() {
            return new GetChannelSignRequest(this);
        } 

    } 

}
