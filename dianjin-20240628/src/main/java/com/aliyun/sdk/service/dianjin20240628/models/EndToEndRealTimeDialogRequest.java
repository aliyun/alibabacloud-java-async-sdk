// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link EndToEndRealTimeDialogRequest} extends {@link RequestModel}
 *
 * <p>EndToEndRealTimeDialogRequest</p>
 */
public class EndToEndRealTimeDialogRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("asrModelId")
    private String asrModelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("inputFormat")
    private String inputFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("outputFormat")
    private String outputFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pitchRate")
    private Integer pitchRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sampleRate")
    private String sampleRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("speechRate")
    private Integer speechRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ttsModelId")
    private String ttsModelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("voiceCode")
    private String voiceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("volume")
    private Integer volume;

    private EndToEndRealTimeDialogRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.asrModelId = builder.asrModelId;
        this.inputFormat = builder.inputFormat;
        this.outputFormat = builder.outputFormat;
        this.pitchRate = builder.pitchRate;
        this.sampleRate = builder.sampleRate;
        this.speechRate = builder.speechRate;
        this.ttsModelId = builder.ttsModelId;
        this.voiceCode = builder.voiceCode;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EndToEndRealTimeDialogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return asrModelId
     */
    public String getAsrModelId() {
        return this.asrModelId;
    }

    /**
     * @return inputFormat
     */
    public String getInputFormat() {
        return this.inputFormat;
    }

    /**
     * @return outputFormat
     */
    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * @return pitchRate
     */
    public Integer getPitchRate() {
        return this.pitchRate;
    }

    /**
     * @return sampleRate
     */
    public String getSampleRate() {
        return this.sampleRate;
    }

    /**
     * @return speechRate
     */
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    /**
     * @return ttsModelId
     */
    public String getTtsModelId() {
        return this.ttsModelId;
    }

    /**
     * @return voiceCode
     */
    public String getVoiceCode() {
        return this.voiceCode;
    }

    /**
     * @return volume
     */
    public Integer getVolume() {
        return this.volume;
    }

    public static final class Builder extends Request.Builder<EndToEndRealTimeDialogRequest, Builder> {
        private String workspaceId; 
        private String asrModelId; 
        private String inputFormat; 
        private String outputFormat; 
        private Integer pitchRate; 
        private String sampleRate; 
        private Integer speechRate; 
        private String ttsModelId; 
        private String voiceCode; 
        private Integer volume; 

        private Builder() {
            super();
        } 

        private Builder(EndToEndRealTimeDialogRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.asrModelId = request.asrModelId;
            this.inputFormat = request.inputFormat;
            this.outputFormat = request.outputFormat;
            this.pitchRate = request.pitchRate;
            this.sampleRate = request.sampleRate;
            this.speechRate = request.speechRate;
            this.ttsModelId = request.ttsModelId;
            this.voiceCode = request.voiceCode;
            this.volume = request.volume;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * asrModelId.
         */
        public Builder asrModelId(String asrModelId) {
            this.putQueryParameter("asrModelId", asrModelId);
            this.asrModelId = asrModelId;
            return this;
        }

        /**
         * inputFormat.
         */
        public Builder inputFormat(String inputFormat) {
            this.putQueryParameter("inputFormat", inputFormat);
            this.inputFormat = inputFormat;
            return this;
        }

        /**
         * outputFormat.
         */
        public Builder outputFormat(String outputFormat) {
            this.putQueryParameter("outputFormat", outputFormat);
            this.outputFormat = outputFormat;
            return this;
        }

        /**
         * pitchRate.
         */
        public Builder pitchRate(Integer pitchRate) {
            this.putQueryParameter("pitchRate", pitchRate);
            this.pitchRate = pitchRate;
            return this;
        }

        /**
         * sampleRate.
         */
        public Builder sampleRate(String sampleRate) {
            this.putQueryParameter("sampleRate", sampleRate);
            this.sampleRate = sampleRate;
            return this;
        }

        /**
         * speechRate.
         */
        public Builder speechRate(Integer speechRate) {
            this.putQueryParameter("speechRate", speechRate);
            this.speechRate = speechRate;
            return this;
        }

        /**
         * ttsModelId.
         */
        public Builder ttsModelId(String ttsModelId) {
            this.putQueryParameter("ttsModelId", ttsModelId);
            this.ttsModelId = ttsModelId;
            return this;
        }

        /**
         * voiceCode.
         */
        public Builder voiceCode(String voiceCode) {
            this.putQueryParameter("voiceCode", voiceCode);
            this.voiceCode = voiceCode;
            return this;
        }

        /**
         * volume.
         */
        public Builder volume(Integer volume) {
            this.putQueryParameter("volume", volume);
            this.volume = volume;
            return this;
        }

        @Override
        public EndToEndRealTimeDialogRequest build() {
            return new EndToEndRealTimeDialogRequest(this);
        } 

    } 

}
