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
 * {@link SubmitStandardCustomizedVoiceJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitStandardCustomizedVoiceJobRequest</p>
 */
public class SubmitStandardCustomizedVoiceJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Audios")
    private String audios;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Authentication")
    private String authentication;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DemoAudioMediaURL")
    private String demoAudioMediaURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Gender")
    private String gender;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceName")
    private String voiceName;

    private SubmitStandardCustomizedVoiceJobRequest(Builder builder) {
        super(builder);
        this.audios = builder.audios;
        this.authentication = builder.authentication;
        this.demoAudioMediaURL = builder.demoAudioMediaURL;
        this.gender = builder.gender;
        this.voiceName = builder.voiceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitStandardCustomizedVoiceJobRequest create() {
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
     * @return authentication
     */
    public String getAuthentication() {
        return this.authentication;
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
     * @return voiceName
     */
    public String getVoiceName() {
        return this.voiceName;
    }

    public static final class Builder extends Request.Builder<SubmitStandardCustomizedVoiceJobRequest, Builder> {
        private String audios; 
        private String authentication; 
        private String demoAudioMediaURL; 
        private String gender; 
        private String voiceName; 

        private Builder() {
            super();
        } 

        private Builder(SubmitStandardCustomizedVoiceJobRequest request) {
            super(request);
            this.audios = request.audios;
            this.authentication = request.authentication;
            this.demoAudioMediaURL = request.demoAudioMediaURL;
            this.gender = request.gender;
            this.voiceName = request.voiceName;
        } 

        /**
         * <p>The list of media asset IDs for training audio materials. Separate multiple media asset IDs with commas (,).</p>
         * <blockquote>
         * <p>Notice: The total duration of all materials must be between 15 and 30 minutes, and the duration of each individual material must be greater than 1 minute.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong>,<strong><strong>571c704445f9a0ee011406c2</strong></strong>,<strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
         */
        public Builder audios(String audios) {
            this.putQueryParameter("Audios", audios);
            this.audios = audios;
            return this;
        }

        /**
         * <p>The media asset ID of the authentication audio. Upload an audio clip to verify your identity. The task fails if the voiceprint does not match the training audio.</p>
         * <blockquote>
         * <p>Notice: Read and record the following statement clearly: I confirm that I am initiating voice cloning customization. The training audio is provided by me. I commit to being responsible for the customized content and guarantee that no illegal or non-compliant content will be created.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
         */
        public Builder authentication(String authentication) {
            this.putQueryParameter("Authentication", authentication);
            this.authentication = authentication;
            return this;
        }

        /**
         * <p>The audio output address for the sample.  </p>
         * <ul>
         * <li>If you specify this parameter, a sample audio file is generated at the specified OSS address after training succeeds.  </li>
         * <li>If you do not specify this parameter, no sample audio is generated.<blockquote>
         * <p>Notice: The address must be a valid public OSS URL under your account.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/demo.mp3">https://your-bucket.oss-cn-shanghai.aliyuncs.com/demo.mp3</a></p>
         */
        public Builder demoAudioMediaURL(String demoAudioMediaURL) {
            this.putQueryParameter("DemoAudioMediaURL", demoAudioMediaURL);
            this.demoAudioMediaURL = demoAudioMediaURL;
            return this;
        }

        /**
         * <p>The gender. Valid values:</p>
         * <ul>
         * <li>female</li>
         * <li>male</li>
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
         * <p>The voice name. The name can be up to 32 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Basic</p>
         */
        public Builder voiceName(String voiceName) {
            this.putQueryParameter("VoiceName", voiceName);
            this.voiceName = voiceName;
            return this;
        }

        @Override
        public SubmitStandardCustomizedVoiceJobRequest build() {
            return new SubmitStandardCustomizedVoiceJobRequest(this);
        } 

    } 

}
