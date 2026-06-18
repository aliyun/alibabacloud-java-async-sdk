// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link SubmitAudioNoteRequest} extends {@link RequestModel}
 *
 * <p>SubmitAudioNoteRequest</p>
 */
public class SubmitAudioNoteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LlmModelId")
    private Long llmModelId;

    private SubmitAudioNoteRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.bizId = builder.bizId;
        this.filePath = builder.filePath;
        this.llmModelId = builder.llmModelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAudioNoteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return llmModelId
     */
    public Long getLlmModelId() {
        return this.llmModelId;
    }

    public static final class Builder extends Request.Builder<SubmitAudioNoteRequest, Builder> {
        private String agentId; 
        private String bizId; 
        private String filePath; 
        private Long llmModelId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAudioNoteRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.bizId = request.bizId;
            this.filePath = request.filePath;
            this.llmModelId = request.llmModelId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>audio-note/100/uuid/test.wav</p>
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * LlmModelId.
         */
        public Builder llmModelId(Long llmModelId) {
            this.putQueryParameter("LlmModelId", llmModelId);
            this.llmModelId = llmModelId;
            return this;
        }

        @Override
        public SubmitAudioNoteRequest build() {
            return new SubmitAudioNoteRequest(this);
        } 

    } 

}
