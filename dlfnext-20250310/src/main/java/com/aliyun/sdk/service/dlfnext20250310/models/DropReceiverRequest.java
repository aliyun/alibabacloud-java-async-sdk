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
 * {@link DropReceiverRequest} extends {@link RequestModel}
 *
 * <p>DropReceiverRequest</p>
 */
public class DropReceiverRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("receiver")
    private String receiver;

    private DropReceiverRequest(Builder builder) {
        super(builder);
        this.receiver = builder.receiver;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DropReceiverRequest create() {
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

    public static final class Builder extends Request.Builder<DropReceiverRequest, Builder> {
        private String receiver; 

        private Builder() {
            super();
        } 

        private Builder(DropReceiverRequest request) {
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
        public DropReceiverRequest build() {
            return new DropReceiverRequest(this);
        } 

    } 

}
