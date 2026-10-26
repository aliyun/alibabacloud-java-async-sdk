// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ModifyAiproEmbedConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyAiproEmbedConfigRequest</p>
 */
public class ModifyAiproEmbedConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentName")
    private String agentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AiProId")
    private String aiProId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChatHistoryStatus")
    private Integer chatHistoryStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemoryEnabled")
    private Integer memoryEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowName")
    private String showName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadEnabled")
    private Integer uploadEnabled;

    private ModifyAiproEmbedConfigRequest(Builder builder) {
        super(builder);
        this.agentName = builder.agentName;
        this.aiProId = builder.aiProId;
        this.chatHistoryStatus = builder.chatHistoryStatus;
        this.config = builder.config;
        this.memoryEnabled = builder.memoryEnabled;
        this.showName = builder.showName;
        this.uploadEnabled = builder.uploadEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAiproEmbedConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return aiProId
     */
    public String getAiProId() {
        return this.aiProId;
    }

    /**
     * @return chatHistoryStatus
     */
    public Integer getChatHistoryStatus() {
        return this.chatHistoryStatus;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return memoryEnabled
     */
    public Integer getMemoryEnabled() {
        return this.memoryEnabled;
    }

    /**
     * @return showName
     */
    public String getShowName() {
        return this.showName;
    }

    /**
     * @return uploadEnabled
     */
    public Integer getUploadEnabled() {
        return this.uploadEnabled;
    }

    public static final class Builder extends Request.Builder<ModifyAiproEmbedConfigRequest, Builder> {
        private String agentName; 
        private String aiProId; 
        private Integer chatHistoryStatus; 
        private String config; 
        private Integer memoryEnabled; 
        private String showName; 
        private Integer uploadEnabled; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAiproEmbedConfigRequest request) {
            super(request);
            this.agentName = request.agentName;
            this.aiProId = request.aiProId;
            this.chatHistoryStatus = request.chatHistoryStatus;
            this.config = request.config;
            this.memoryEnabled = request.memoryEnabled;
            this.showName = request.showName;
            this.uploadEnabled = request.uploadEnabled;
        } 

        /**
         * AgentName.
         */
        public Builder agentName(String agentName) {
            this.putQueryParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * AiProId.
         */
        public Builder aiProId(String aiProId) {
            this.putQueryParameter("AiProId", aiProId);
            this.aiProId = aiProId;
            return this;
        }

        /**
         * ChatHistoryStatus.
         */
        public Builder chatHistoryStatus(Integer chatHistoryStatus) {
            this.putQueryParameter("ChatHistoryStatus", chatHistoryStatus);
            this.chatHistoryStatus = chatHistoryStatus;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * MemoryEnabled.
         */
        public Builder memoryEnabled(Integer memoryEnabled) {
            this.putQueryParameter("MemoryEnabled", memoryEnabled);
            this.memoryEnabled = memoryEnabled;
            return this;
        }

        /**
         * ShowName.
         */
        public Builder showName(String showName) {
            this.putQueryParameter("ShowName", showName);
            this.showName = showName;
            return this;
        }

        /**
         * UploadEnabled.
         */
        public Builder uploadEnabled(Integer uploadEnabled) {
            this.putQueryParameter("UploadEnabled", uploadEnabled);
            this.uploadEnabled = uploadEnabled;
            return this;
        }

        @Override
        public ModifyAiproEmbedConfigRequest build() {
            return new ModifyAiproEmbedConfigRequest(this);
        } 

    } 

}
