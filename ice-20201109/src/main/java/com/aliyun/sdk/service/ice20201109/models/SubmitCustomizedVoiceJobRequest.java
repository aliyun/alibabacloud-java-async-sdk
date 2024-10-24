// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitCustomizedVoiceJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitCustomizedVoiceJobRequest</p>
 */
public class SubmitCustomizedVoiceJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DemoAudioMediaURL")
    private String demoAudioMediaURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String voiceId;

    private SubmitCustomizedVoiceJobRequest(Builder builder) {
        super(builder);
        this.demoAudioMediaURL = builder.demoAudioMediaURL;
        this.voiceId = builder.voiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitCustomizedVoiceJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return demoAudioMediaURL
     */
    public String getDemoAudioMediaURL() {
        return this.demoAudioMediaURL;
    }

    /**
     * @return voiceId
     */
    public String getVoiceId() {
        return this.voiceId;
    }

    public static final class Builder extends Request.Builder<SubmitCustomizedVoiceJobRequest, Builder> {
        private String demoAudioMediaURL; 
        private String voiceId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitCustomizedVoiceJobRequest request) {
            super(request);
            this.demoAudioMediaURL = request.demoAudioMediaURL;
            this.voiceId = request.voiceId;
        } 

        /**
         * DemoAudioMediaURL.
         */
        public Builder demoAudioMediaURL(String demoAudioMediaURL) {
            this.putQueryParameter("DemoAudioMediaURL", demoAudioMediaURL);
            this.demoAudioMediaURL = demoAudioMediaURL;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xiaozhuan</p>
         */
        public Builder voiceId(String voiceId) {
            this.putQueryParameter("VoiceId", voiceId);
            this.voiceId = voiceId;
            return this;
        }

        @Override
        public SubmitCustomizedVoiceJobRequest build() {
            return new SubmitCustomizedVoiceJobRequest(this);
        } 

    } 

}
