// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectAudioForCustomizedVoiceJobRequest} extends {@link RequestModel}
 *
 * <p>DetectAudioForCustomizedVoiceJobRequest</p>
 */
public class DetectAudioForCustomizedVoiceJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AudioRecordId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 20, minimum = 1)
    private Integer audioRecordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String voiceId;

    private DetectAudioForCustomizedVoiceJobRequest(Builder builder) {
        super(builder);
        this.audioRecordId = builder.audioRecordId;
        this.recordUrl = builder.recordUrl;
        this.voiceId = builder.voiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectAudioForCustomizedVoiceJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioRecordId
     */
    public Integer getAudioRecordId() {
        return this.audioRecordId;
    }

    /**
     * @return recordUrl
     */
    public String getRecordUrl() {
        return this.recordUrl;
    }

    /**
     * @return voiceId
     */
    public String getVoiceId() {
        return this.voiceId;
    }

    public static final class Builder extends Request.Builder<DetectAudioForCustomizedVoiceJobRequest, Builder> {
        private Integer audioRecordId; 
        private String recordUrl; 
        private String voiceId; 

        private Builder() {
            super();
        } 

        private Builder(DetectAudioForCustomizedVoiceJobRequest request) {
            super(request);
            this.audioRecordId = request.audioRecordId;
            this.recordUrl = request.recordUrl;
            this.voiceId = request.voiceId;
        } 

        /**
         * AudioRecordId.
         */
        public Builder audioRecordId(Integer audioRecordId) {
            this.putQueryParameter("AudioRecordId", audioRecordId);
            this.audioRecordId = audioRecordId;
            return this;
        }

        /**
         * RecordUrl.
         */
        public Builder recordUrl(String recordUrl) {
            this.putQueryParameter("RecordUrl", recordUrl);
            this.recordUrl = recordUrl;
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
        public DetectAudioForCustomizedVoiceJobRequest build() {
            return new DetectAudioForCustomizedVoiceJobRequest(this);
        } 

    } 

}
