// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link IMBotInfo} extends {@link TeaModel}
 *
 * <p>IMBotInfo</p>
 */
public class IMBotInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentRuntimeId")
    private String agentRuntimeId;

    @com.aliyun.core.annotation.NameInMap("botBizId")
    private String botBizId;

    @com.aliyun.core.annotation.NameInMap("botBizType")
    private String botBizType;

    @com.aliyun.core.annotation.NameInMap("botMode")
    private String botMode;

    @com.aliyun.core.annotation.NameInMap("botName")
    private String botName;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("currentInstances")
    private Long currentInstances;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("imChannelServerResourceName")
    private String imChannelServerResourceName;

    @com.aliyun.core.annotation.NameInMap("lastMessageTime")
    private String lastMessageTime;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private IMBotMetadata metadata;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    private IMBotInfo(Builder builder) {
        this.agentRuntimeId = builder.agentRuntimeId;
        this.botBizId = builder.botBizId;
        this.botBizType = builder.botBizType;
        this.botMode = builder.botMode;
        this.botName = builder.botName;
        this.createdAt = builder.createdAt;
        this.currentInstances = builder.currentInstances;
        this.description = builder.description;
        this.id = builder.id;
        this.imChannelServerResourceName = builder.imChannelServerResourceName;
        this.lastMessageTime = builder.lastMessageTime;
        this.metadata = builder.metadata;
        this.status = builder.status;
        this.tenantId = builder.tenantId;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IMBotInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRuntimeId
     */
    public String getAgentRuntimeId() {
        return this.agentRuntimeId;
    }

    /**
     * @return botBizId
     */
    public String getBotBizId() {
        return this.botBizId;
    }

    /**
     * @return botBizType
     */
    public String getBotBizType() {
        return this.botBizType;
    }

    /**
     * @return botMode
     */
    public String getBotMode() {
        return this.botMode;
    }

    /**
     * @return botName
     */
    public String getBotName() {
        return this.botName;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return currentInstances
     */
    public Long getCurrentInstances() {
        return this.currentInstances;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return imChannelServerResourceName
     */
    public String getImChannelServerResourceName() {
        return this.imChannelServerResourceName;
    }

    /**
     * @return lastMessageTime
     */
    public String getLastMessageTime() {
        return this.lastMessageTime;
    }

    /**
     * @return metadata
     */
    public IMBotMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String agentRuntimeId; 
        private String botBizId; 
        private String botBizType; 
        private String botMode; 
        private String botName; 
        private String createdAt; 
        private Long currentInstances; 
        private String description; 
        private String id; 
        private String imChannelServerResourceName; 
        private String lastMessageTime; 
        private IMBotMetadata metadata; 
        private String status; 
        private String tenantId; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(IMBotInfo model) {
            this.agentRuntimeId = model.agentRuntimeId;
            this.botBizId = model.botBizId;
            this.botBizType = model.botBizType;
            this.botMode = model.botMode;
            this.botName = model.botName;
            this.createdAt = model.createdAt;
            this.currentInstances = model.currentInstances;
            this.description = model.description;
            this.id = model.id;
            this.imChannelServerResourceName = model.imChannelServerResourceName;
            this.lastMessageTime = model.lastMessageTime;
            this.metadata = model.metadata;
            this.status = model.status;
            this.tenantId = model.tenantId;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * agentRuntimeId.
         */
        public Builder agentRuntimeId(String agentRuntimeId) {
            this.agentRuntimeId = agentRuntimeId;
            return this;
        }

        /**
         * botBizId.
         */
        public Builder botBizId(String botBizId) {
            this.botBizId = botBizId;
            return this;
        }

        /**
         * <p>dingtalk、wecom、feishu、custom</p>
         */
        public Builder botBizType(String botBizType) {
            this.botBizType = botBizType;
            return this;
        }

        /**
         * <p>standard、custom</p>
         */
        public Builder botMode(String botMode) {
            this.botMode = botMode;
            return this;
        }

        /**
         * botName.
         */
        public Builder botName(String botName) {
            this.botName = botName;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>可选；来自账号元数据 scaling.currentInstances，同一租户下各 Bot 响应中值相同</p>
         */
        public Builder currentInstances(Long currentInstances) {
            this.currentInstances = currentInstances;
            return this;
        }

        /**
         * <p>Bot 描述信息</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * imChannelServerResourceName.
         */
        public Builder imChannelServerResourceName(String imChannelServerResourceName) {
            this.imChannelServerResourceName = imChannelServerResourceName;
            return this;
        }

        /**
         * <p>可选</p>
         */
        public Builder lastMessageTime(String lastMessageTime) {
            this.lastMessageTime = lastMessageTime;
            return this;
        }

        /**
         * metadata.
         */
        public Builder metadata(IMBotMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * tenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public IMBotInfo build() {
            return new IMBotInfo(this);
        } 

    } 

}
