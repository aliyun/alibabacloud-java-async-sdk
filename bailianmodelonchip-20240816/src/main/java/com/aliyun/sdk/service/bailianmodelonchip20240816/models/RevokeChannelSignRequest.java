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
 * {@link RevokeChannelSignRequest} extends {@link RequestModel}
 *
 * <p>RevokeChannelSignRequest</p>
 */
public class RevokeChannelSignRequest extends Request {
    private RevokeChannelSignRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeChannelSignRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<RevokeChannelSignRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(RevokeChannelSignRequest request) {
            super(request);
        } 

        @Override
        public RevokeChannelSignRequest build() {
            return new RevokeChannelSignRequest(this);
        } 

    } 

}
