// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetWafBotAppKeyRequest} extends {@link RequestModel}
 *
 * <p>GetWafBotAppKeyRequest</p>
 */
public class GetWafBotAppKeyRequest extends Request {
    private GetWafBotAppKeyRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWafBotAppKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetWafBotAppKeyRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetWafBotAppKeyRequest request) {
            super(request);
        } 

        @Override
        public GetWafBotAppKeyRequest build() {
            return new GetWafBotAppKeyRequest(this);
        } 

    } 

}
