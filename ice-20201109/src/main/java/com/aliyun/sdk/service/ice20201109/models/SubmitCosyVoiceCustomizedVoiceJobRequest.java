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
         * <p>The media asset ID of the audio material for training. Currently, only one audio material is supported for training.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
         */
        public Builder audios(String audios) {
            this.putQueryParameter("Audios", audios);
            this.audios = audios;
            return this;
        }

        /**
         * <p>The sample audio output URL.  </p>
         * <ul>
         * <li>If you specify this parameter, a sample audio file is generated at the specified OSS URL after the training job succeeds.  <blockquote>
         * <p>Notice: The URL must be a valid public OSS URL under your account.</notice></p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/demo.MP3">https://your-bucket.oss-cn-shanghai.aliyuncs.com/demo.MP3</a></p>
         */
        public Builder demoAudioMediaURL(String demoAudioMediaURL) {
            this.putQueryParameter("DemoAudioMediaURL", demoAudioMediaURL);
            this.demoAudioMediaURL = demoAudioMediaURL;
            return this;
        }

        /**
         * <p>The gender. Valid values:</p>
         * <ul>
         * <li>female: Female.</li>
         * <li>male: Male.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>female</p>
         */
        public Builder gender(String gender) {
            this.putQueryParameter("Gender", gender);
            this.gender = gender;
            return this;
        }

        /**
         * <p>The voice cloning model. Valid values:</p>
         * <ul>
         * <li><strong>cosyvoice-v3-plus</strong></li>
         * <li><strong>cosyvoice-v3-flash</strong></li>
         * <li><strong>cosyvoice-v3.5-plus</strong></li>
         * <li><strong>cosyvoice-v3.5-flash</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cosyvoice-v3-plus</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The name of the voice. The name cannot exceed 32 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>voice name</p>
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
