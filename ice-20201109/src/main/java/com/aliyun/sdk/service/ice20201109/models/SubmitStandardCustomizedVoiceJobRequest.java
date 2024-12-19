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
         * <ul>
         * <li>The material assets IDs of the materials for training.</li>
         * <li>Separate multiple media IDs with commas (,).</li>
         * </ul>
         * <blockquote>
         * <p>: The total duration of all materials must be within 15 to 30 minutes. The duration of each material must be greater than 1 minute.</p>
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
         * <ul>
         * <li><p>The media asset ID of the authentication audio.</p>
         * </li>
         * <li><p>Upload an audio file for identity authentication. If the voiceprint extracted from the uploaded file differs from that of the training file, the job fails.</p>
         * <p>**</p>
         * <p><strong>Note</strong>: Clearly read and record the following text: I confirm to customize human voice cloning and provide audio files that contain my voice for training. I promise that I am responsible for the customized content and that the content complies with laws and regulations.</p>
         * </li>
         * </ul>
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
         * <p>The URL of the sample audio file.</p>
         * <ul>
         * <li><p>If this parameter is specified, a sample audio file is generated at the specified Object Storage Service (OSS) URL after the training is complete.</p>
         * </li>
         * <li><p>If this parameter is not specified, no sample audio file is generated.</p>
         * <p>**</p>
         * <p><strong>Note</strong>: The URL must be a valid public OSS URL within your Alibaba Cloud account.</p>
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
         * <p>The voice name.</p>
         * <ul>
         * <li>The name can be up to 32 characters in length.</li>
         * </ul>
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
