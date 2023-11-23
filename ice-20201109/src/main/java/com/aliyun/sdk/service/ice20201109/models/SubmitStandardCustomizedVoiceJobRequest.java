// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitStandardCustomizedVoiceJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitStandardCustomizedVoiceJobRequest</p>
 */
public class SubmitStandardCustomizedVoiceJobRequest extends Request {
    @Query
    @NameInMap("Audios")
    private String audios;

    @Query
    @NameInMap("Authentication")
    private String authentication;

    @Query
    @NameInMap("DemoAudioMediaURL")
    private String demoAudioMediaURL;

    @Query
    @NameInMap("Gender")
    private String gender;

    @Query
    @NameInMap("VoiceName")
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
         * Audios.
         */
        public Builder audios(String audios) {
            this.putQueryParameter("Audios", audios);
            this.audios = audios;
            return this;
        }

        /**
         * Authentication.
         */
        public Builder authentication(String authentication) {
            this.putQueryParameter("Authentication", authentication);
            this.authentication = authentication;
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
         * VoiceName.
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
