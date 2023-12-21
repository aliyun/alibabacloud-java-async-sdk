// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitLongTtsTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitLongTtsTaskRequest</p>
 */
public class SubmitLongTtsTaskRequest extends Request {
    @Body
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("TtsVoiceId")
    @Validation(required = true)
    private String ttsVoiceId;

    private SubmitLongTtsTaskRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.jwtToken = builder.jwtToken;
        this.ttsVoiceId = builder.ttsVoiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitLongTtsTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return ttsVoiceId
     */
    public String getTtsVoiceId() {
        return this.ttsVoiceId;
    }

    public static final class Builder extends Request.Builder<SubmitLongTtsTaskRequest, Builder> {
        private String content; 
        private String jwtToken; 
        private String ttsVoiceId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitLongTtsTaskRequest request) {
            super(request);
            this.content = request.content;
            this.jwtToken = request.jwtToken;
            this.ttsVoiceId = request.ttsVoiceId;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * TtsVoiceId.
         */
        public Builder ttsVoiceId(String ttsVoiceId) {
            this.putBodyParameter("TtsVoiceId", ttsVoiceId);
            this.ttsVoiceId = ttsVoiceId;
            return this;
        }

        @Override
        public SubmitLongTtsTaskRequest build() {
            return new SubmitLongTtsTaskRequest(this);
        } 

    } 

}
