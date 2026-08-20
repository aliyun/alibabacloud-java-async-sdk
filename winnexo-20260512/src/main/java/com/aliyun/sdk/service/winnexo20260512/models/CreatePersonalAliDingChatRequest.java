// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link CreatePersonalAliDingChatRequest} extends {@link RequestModel}
 *
 * <p>CreatePersonalAliDingChatRequest</p>
 */
public class CreatePersonalAliDingChatRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chatId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chatId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chatName")
    private String chatName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("historyStartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String historyStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("notes")
    private String notes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceTags")
    private String sourceTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("updateFrequency")
    private UpdateFrequency updateFrequency;

    private CreatePersonalAliDingChatRequest(Builder builder) {
        super(builder);
        this.chatId = builder.chatId;
        this.chatName = builder.chatName;
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.historyStartTime = builder.historyStartTime;
        this.notes = builder.notes;
        this.operatingObjectName = builder.operatingObjectName;
        this.sourceTags = builder.sourceTags;
        this.tenantId = builder.tenantId;
        this.updateFrequency = builder.updateFrequency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePersonalAliDingChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chatId
     */
    public String getChatId() {
        return this.chatId;
    }

    /**
     * @return chatName
     */
    public String getChatName() {
        return this.chatName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return historyStartTime
     */
    public String getHistoryStartTime() {
        return this.historyStartTime;
    }

    /**
     * @return notes
     */
    public String getNotes() {
        return this.notes;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return sourceTags
     */
    public String getSourceTags() {
        return this.sourceTags;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return updateFrequency
     */
    public UpdateFrequency getUpdateFrequency() {
        return this.updateFrequency;
    }

    public static final class Builder extends Request.Builder<CreatePersonalAliDingChatRequest, Builder> {
        private String chatId; 
        private String chatName; 
        private String description; 
        private String directoryId; 
        private String historyStartTime; 
        private String notes; 
        private String operatingObjectName; 
        private String sourceTags; 
        private String tenantId; 
        private UpdateFrequency updateFrequency; 

        private Builder() {
            super();
        } 

        private Builder(CreatePersonalAliDingChatRequest request) {
            super(request);
            this.chatId = request.chatId;
            this.chatName = request.chatName;
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.historyStartTime = request.historyStartTime;
            this.notes = request.notes;
            this.operatingObjectName = request.operatingObjectName;
            this.sourceTags = request.sourceTags;
            this.tenantId = request.tenantId;
            this.updateFrequency = request.updateFrequency;
        } 

        /**
         * <p>阿里钉群聊 ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cidxxxxxxxx</p>
         */
        public Builder chatId(String chatId) {
            this.putBodyParameter("chatId", chatId);
            this.chatId = chatId;
            return this;
        }

        /**
         * <p>群聊名称</p>
         * 
         * <strong>example:</strong>
         * <p>客户项目群</p>
         */
        public Builder chatName(String chatName) {
            this.putBodyParameter("chatName", chatName);
            this.chatName = chatName;
            return this;
        }

        /**
         * <p>资源描述</p>
         * 
         * <strong>example:</strong>
         * <p>客户群聊历史</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>目标个人知识目录 ID；不传时使用当前用户默认根目录</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>历史消息起始时间，支持 YYYY-MM-DD 或 YYYY-MM-DD HH:MM:SS</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-01</p>
         */
        public Builder historyStartTime(String historyStartTime) {
            this.putBodyParameter("historyStartTime", historyStartTime);
            this.historyStartTime = historyStartTime;
            return this;
        }

        /**
         * <p>分析指令</p>
         * 
         * <strong>example:</strong>
         * <p>重点识别客户诉求与待办</p>
         */
        public Builder notes(String notes) {
            this.putBodyParameter("notes", notes);
            this.notes = notes;
            return this;
        }

        /**
         * <p>运营对象名称</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>资源标签 JSON 字符串列表</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;客户&quot;,&quot;群聊&quot;]</p>
         */
        public Builder sourceTags(String sourceTags) {
            this.putBodyParameter("sourceTags", sourceTags);
            this.sourceTags = sourceTags;
            return this;
        }

        /**
         * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>Source 级定时同步配置</p>
         */
        public Builder updateFrequency(UpdateFrequency updateFrequency) {
            String updateFrequencyShrink = shrink(updateFrequency, "updateFrequency", "json");
            this.putBodyParameter("updateFrequency", updateFrequencyShrink);
            this.updateFrequency = updateFrequency;
            return this;
        }

        @Override
        public CreatePersonalAliDingChatRequest build() {
            return new CreatePersonalAliDingChatRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePersonalAliDingChatRequest} extends {@link TeaModel}
     *
     * <p>CreatePersonalAliDingChatRequest</p>
     */
    public static class UpdateFrequency extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("preset")
        private String preset;

        private UpdateFrequency(Builder builder) {
            this.cron = builder.cron;
            this.enabled = builder.enabled;
            this.preset = builder.preset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateFrequency create() {
            return builder().build();
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return preset
         */
        public String getPreset() {
            return this.preset;
        }

        public static final class Builder {
            private String cron; 
            private Boolean enabled; 
            private String preset; 

            private Builder() {
            } 

            private Builder(UpdateFrequency model) {
                this.cron = model.cron;
                this.enabled = model.enabled;
                this.preset = model.preset;
            } 

            /**
             * <p>五段 cron；传入时优先于 preset</p>
             * 
             * <strong>example:</strong>
             * <p>0 2 * * *</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>是否启用定时同步，默认 true</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>同步预设：hourly 或 daily_2am</p>
             * 
             * <strong>example:</strong>
             * <p>hourly</p>
             */
            public Builder preset(String preset) {
                this.preset = preset;
                return this;
            }

            public UpdateFrequency build() {
                return new UpdateFrequency(this);
            } 

        } 

    }
}
