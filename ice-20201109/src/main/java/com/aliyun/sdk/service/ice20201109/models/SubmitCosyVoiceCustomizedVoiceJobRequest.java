// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SubmitCosyVoiceCustomizedVoiceJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitCosyVoiceCustomizedVoiceJobRequest</p>
 */
public class SubmitCosyVoiceCustomizedVoiceJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Audios")
    private String audios;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DemoAudioMediaURL")
    private String demoAudioMediaURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Gender")
    private String gender;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceName")
    private String voiceName;

    private SubmitCosyVoiceCustomizedVoiceJobRequest(Builder builder) {
        super(builder);
        this.audios = builder.audios;
        this.demoAudioMediaURL = builder.demoAudioMediaURL;
        this.gender = builder.gender;
        this.model = builder.model;
        this.voiceName = builder.voiceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitCosyVoiceCustomizedVoiceJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audios
     */
    public String getAudios() {
        return this.audios;
    }

    /**
     * @return demoAudioMediaURL
     */
    public String getDemoAudioMediaURL() {
        return this.demoAudioMediaURL;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return voiceName
     */
    public String getVoiceName() {
        return this.voiceName;
    }

    public static final class Builder extends Request.Builder<SubmitCosyVoiceCustomizedVoiceJobRequest, Builder> {
        private String audios; 
        private String demoAudioMediaURL; 
        private String gender; 
        private String model; 
        private String voiceName; 

        private Builder() {
            super();
        } 

        private Builder(SubmitCosyVoiceCustomizedVoiceJobRequest request) {
            super(request);
            this.audios = request.audios;
            this.demoAudioMediaURL = request.demoAudioMediaURL;
            this.gender = request.gender;
            this.model = request.model;
            this.voiceName = request.voiceName;
        } 

        /**
         * Audios.
         */
        public Builder audios(String audios) {
            this.putQueryParameter("Audios", audios);
            this.audios = audios;
            return this;
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
         * Gender.
         */
        public Builder gender(String gender) {
            this.putQueryParameter("Gender", gender);
            this.gender = gender;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * VoiceName.
         */
        public Builder voiceName(String voiceName) {
            this.putQueryParameter("VoiceName", voiceName);
            this.voiceName = voiceName;
            return this;
        }

        @Override
        public SubmitCosyVoiceCustomizedVoiceJobRequest build() {
            return new SubmitCosyVoiceCustomizedVoiceJobRequest(this);
        } 

    } 

}
