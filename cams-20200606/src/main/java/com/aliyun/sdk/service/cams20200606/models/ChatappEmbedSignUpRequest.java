// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChatappEmbedSignUpRequest} extends {@link RequestModel}
 *
 * <p>ChatappEmbedSignUpRequest</p>
 */
public class ChatappEmbedSignUpRequest extends Request {
    @Body
    @NameInMap("InputToken")
    @Validation(required = true)
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
         * The InputToken returned by the embedded signup.
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
