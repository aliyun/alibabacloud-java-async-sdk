// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConcurrentConversationQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetConcurrentConversationQuotaRequest</p>
 */
public class GetConcurrentConversationQuotaRequest extends Request {
    private GetConcurrentConversationQuotaRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConcurrentConversationQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetConcurrentConversationQuotaRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetConcurrentConversationQuotaRequest request) {
            super(request);
        } 

        @Override
        public GetConcurrentConversationQuotaRequest build() {
            return new GetConcurrentConversationQuotaRequest(this);
        } 

    } 

}
