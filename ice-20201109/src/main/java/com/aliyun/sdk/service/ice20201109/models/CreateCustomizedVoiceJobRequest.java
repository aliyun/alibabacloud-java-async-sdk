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
 * {@link CreateCustomizedVoiceJobRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomizedVoiceJobRequest</p>
 */
public class CreateCustomizedVoiceJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Gender")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gender;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scenario")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scenario;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceDesc")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String voiceDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String voiceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceName")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String voiceName;

    private CreateCustomizedVoiceJobRequest(Builder builder) {
        super(builder);
        this.gender = builder.gender;
        this.scenario = builder.scenario;
        this.voiceDesc = builder.voiceDesc;
        this.voiceId = builder.voiceId;
        this.voiceName = builder.voiceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomizedVoiceJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gender
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * @return scenario
     */
    public String getScenario() {
        return this.scenario;
    }

    /**
     * @return voiceDesc
     */
    public String getVoiceDesc() {
        return this.voiceDesc;
    }

    /**
     * @return voiceId
     */
    public String getVoiceId() {
        return this.voiceId;
    }

    /**
     * @return voiceName
     */
    public String getVoiceName() {
        return this.voiceName;
    }

    public static final class Builder extends Request.Builder<CreateCustomizedVoiceJobRequest, Builder> {
        private String gender; 
        private String scenario; 
        private String voiceDesc; 
        private String voiceId; 
        private String voiceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomizedVoiceJobRequest request) {
            super(request);
            this.gender = request.gender;
            this.scenario = request.scenario;
            this.voiceDesc = request.voiceDesc;
            this.voiceId = request.voiceId;
            this.voiceName = request.voiceName;
        } 

        /**
         * <p>The gender. Valid values:</p>
         * <ul>
         * <li>female: female.</li>
         * <li>male: male.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The scenario. Valid values:</p>
         * <ul>
         * <li>story: story.</li>
         * <li>interaction: interaction.</li>
         * <li>navigation: navigation.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>story</p>
         */
        public Builder scenario(String scenario) {
            this.putQueryParameter("Scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        /**
         * <p>The voice description.</p>
         * <ul>
         * <li>The description cannot exceed 256 characters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>This is a personalized voice</p>
         */
        public Builder voiceDesc(String voiceDesc) {
            this.putQueryParameter("VoiceDesc", voiceDesc);
            this.voiceDesc = voiceDesc;
            return this;
        }

        /**
         * <p>The custom voice ID (English name or pinyin of the voice).</p>
         * <ul>
         * <li>The ID cannot be the same as any of your other custom voice IDs.</li>
         * <li>The ID cannot exceed 32 characters.</li>
         * <li>Only letters and numbers are supported.</li>
         * </ul>
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

        /**
         * <p>The voice name (generally a Chinese name).</p>
         * <ul>
         * <li>The name cannot exceed 32 characters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>小专</p>
         */
        public Builder voiceName(String voiceName) {
            this.putQueryParameter("VoiceName", voiceName);
            this.voiceName = voiceName;
            return this;
        }

        @Override
        public CreateCustomizedVoiceJobRequest build() {
            return new CreateCustomizedVoiceJobRequest(this);
        } 

    } 

}
