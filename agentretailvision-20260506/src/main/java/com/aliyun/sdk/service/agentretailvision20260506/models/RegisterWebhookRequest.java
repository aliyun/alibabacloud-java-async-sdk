// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentretailvision20260506.models;

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
 * {@link RegisterWebhookRequest} extends {@link RequestModel}
 *
 * <p>RegisterWebhookRequest</p>
 */
public class RegisterWebhookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackSecret")
    private String callbackSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    private RegisterWebhookRequest(Builder builder) {
        super(builder);
        this.callbackSecret = builder.callbackSecret;
        this.callbackUrl = builder.callbackUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterWebhookRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callbackSecret
     */
    public String getCallbackSecret() {
        return this.callbackSecret;
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public static final class Builder extends Request.Builder<RegisterWebhookRequest, Builder> {
        private String callbackSecret; 
        private String callbackUrl; 

        private Builder() {
            super();
        } 

        private Builder(RegisterWebhookRequest request) {
            super(request);
            this.callbackSecret = request.callbackSecret;
            this.callbackUrl = request.callbackUrl;
        } 

        /**
         * CallbackSecret.
         */
        public Builder callbackSecret(String callbackSecret) {
            this.putQueryParameter("CallbackSecret", callbackSecret);
            this.callbackSecret = callbackSecret;
            return this;
        }

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        @Override
        public RegisterWebhookRequest build() {
            return new RegisterWebhookRequest(this);
        } 

    } 

}
