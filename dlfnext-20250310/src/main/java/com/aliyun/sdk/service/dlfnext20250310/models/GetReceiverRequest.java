// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link GetReceiverRequest} extends {@link RequestModel}
 *
 * <p>GetReceiverRequest</p>
 */
public class GetReceiverRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("receiver")
    private String receiver;

    private GetReceiverRequest(Builder builder) {
        super(builder);
        this.receiver = builder.receiver;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReceiverRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return receiver
     */
    public String getReceiver() {
        return this.receiver;
    }

    public static final class Builder extends Request.Builder<GetReceiverRequest, Builder> {
        private String receiver; 

        private Builder() {
            super();
        } 

        private Builder(GetReceiverRequest request) {
            super(request);
            this.receiver = request.receiver;
        } 

        /**
         * receiver.
         */
        public Builder receiver(String receiver) {
            this.putPathParameter("receiver", receiver);
            this.receiver = receiver;
            return this;
        }

        @Override
        public GetReceiverRequest build() {
            return new GetReceiverRequest(this);
        } 

    } 

}
