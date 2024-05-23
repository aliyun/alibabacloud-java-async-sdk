// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomizedVoiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomizedVoiceRequest</p>
 */
public class UpdateCustomizedVoiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DemoAudioMediaId")
    private String demoAudioMediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String voiceId;

    private UpdateCustomizedVoiceRequest(Builder builder) {
        super(builder);
        this.demoAudioMediaId = builder.demoAudioMediaId;
        this.voiceId = builder.voiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomizedVoiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return demoAudioMediaId
     */
    public String getDemoAudioMediaId() {
        return this.demoAudioMediaId;
    }

    /**
     * @return voiceId
     */
    public String getVoiceId() {
        return this.voiceId;
    }

    public static final class Builder extends Request.Builder<UpdateCustomizedVoiceRequest, Builder> {
        private String demoAudioMediaId; 
        private String voiceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomizedVoiceRequest request) {
            super(request);
            this.demoAudioMediaId = request.demoAudioMediaId;
            this.voiceId = request.voiceId;
        } 

        /**
         * DemoAudioMediaId.
         */
        public Builder demoAudioMediaId(String demoAudioMediaId) {
            this.putQueryParameter("DemoAudioMediaId", demoAudioMediaId);
            this.demoAudioMediaId = demoAudioMediaId;
            return this;
        }

        /**
         * VoiceId.
         */
        public Builder voiceId(String voiceId) {
            this.putQueryParameter("VoiceId", voiceId);
            this.voiceId = voiceId;
            return this;
        }

        @Override
        public UpdateCustomizedVoiceRequest build() {
            return new UpdateCustomizedVoiceRequest(this);
        } 

    } 

}
