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
         * <p>The sequence number of the recording file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder audioRecordId(Integer audioRecordId) {
            this.putQueryParameter("AudioRecordId", audioRecordId);
            this.audioRecordId = audioRecordId;
            return this;
        }

        /**
         * <p>The URL of the recording file.</p>
         * <blockquote>
         * <p>: The URL must be an Object Storage Service (OSS) URL within your Alibaba Cloud account. The OSS bucket must be in the same region in which IMS is activated.</p>
         * </blockquote>
         * <blockquote>
         * <p>: The audio file must be in the WAV or PCM format and must be a 16-bit mono audio file at 48000 Hz.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://your-bucket.oss-cn-hangzhou.aliyuncs.com/record1.wav">https://your-bucket.oss-cn-hangzhou.aliyuncs.com/record1.wav</a></p>
         */
        public Builder recordUrl(String recordUrl) {
            this.putQueryParameter("RecordUrl", recordUrl);
            this.recordUrl = recordUrl;
            return this;
        }

        /**
         * <p>The voice ID.</p>
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
        public DetectAudioForCustomizedVoiceJobRequest build() {
            return new DetectAudioForCustomizedVoiceJobRequest(this);
        } 

    } 

}
