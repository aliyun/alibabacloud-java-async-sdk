// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetChatModelRequest} extends {@link RequestModel}
 *
 * <p>GetChatModelRequest</p>
 */
public class GetChatModelRequest extends Request {
    private GetChatModelRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetChatModelRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetChatModelRequest request) {
            super(request);
        } 

        @Override
        public GetChatModelRequest build() {
            return new GetChatModelRequest(this);
        } 

    } 

}
