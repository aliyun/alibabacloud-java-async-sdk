// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ChatappEmbedSignUpRequest} extends {@link RequestModel}
 *
 * <p>ChatappEmbedSignUpRequest</p>
 */
public class ChatappEmbedSignUpRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputToken;

    private ChatappEmbedSignUpRequest(Builder builder) {
        super(builder);
        this.inputToken = builder.inputToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatappEmbedSignUpRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inputToken
     */
    public String getInputToken() {
        return this.inputToken;
    }

    public static final class Builder extends Request.Builder<ChatappEmbedSignUpRequest, Builder> {
        private String inputToken; 

        private Builder() {
            super();
        } 

        private Builder(ChatappEmbedSignUpRequest request) {
            super(request);
            this.inputToken = request.inputToken;
        } 

        /**
         * <p>The InputToken returned after the embedded signup flow is complete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wlelkelwidilwloe-ewlwols0lwsllsld</p>
         */
        public Builder inputToken(String inputToken) {
            this.putBodyParameter("InputToken", inputToken);
            this.inputToken = inputToken;
            return this;
        }

        @Override
        public ChatappEmbedSignUpRequest build() {
            return new ChatappEmbedSignUpRequest(this);
        } 

    } 

}
