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
 * {@link CreatePersonalFeishuChatRequest} extends {@link RequestModel}
 *
 * <p>CreatePersonalFeishuChatRequest</p>
 */
public class CreatePersonalFeishuChatRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chatId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chatId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("historyStartTime")
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

    private CreatePersonalFeishuChatRequest(Builder builder) {
        super(builder);
        this.chatId = builder.chatId;
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

    public static CreatePersonalFeishuChatRequest create() {
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

    public static final class Builder extends Request.Builder<CreatePersonalFeishuChatRequest, Builder> {
        private String chatId; 
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

        private Builder(CreatePersonalFeishuChatRequest request) {
            super(request);
            this.chatId = request.chatId;
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
         * <p>飞书群聊 ID，以 oc_ 开头</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oc_abc123</p>
         */
        public Builder chatId(String chatId) {
            this.putBodyParameter("chatId", chatId);
            this.chatId = chatId;
            return this;
        }

        /**
         * <p>资源描述</p>
         * 
         * <strong>example:</strong>
         * <p>产品研发群聊天记录</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>目标个人目录 ID；不传时使用当前用户默认个人根目录</p>
         * 
         * <strong>example:</strong>
         * <p>dir_personal_1</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>历史消息起始时间；支持 YYYY-MM-DD 或 YYYY-MM-DD HH:MM:SS，不传则拉取全部可见历史</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-01 00:00:00</p>
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
         * <p>重点提取决策和待办</p>
         */
        public Builder notes(String notes) {
            this.putBodyParameter("notes", notes);
            this.notes = notes;
            return this;
        }

        /**
         * <p>运营对象名称，仅保留用于来源追溯</p>
         * 
         * <strong>example:</strong>
         * <p>研发助手</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>资源标签，JSON 字符串列表</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;研发&quot;]</p>
         */
        public Builder sourceTags(String sourceTags) {
            this.putBodyParameter("sourceTags", sourceTags);
            this.sourceTags = sourceTags;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
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
        public CreatePersonalFeishuChatRequest build() {
            return new CreatePersonalFeishuChatRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePersonalFeishuChatRequest} extends {@link TeaModel}
     *
     * <p>CreatePersonalFeishuChatRequest</p>
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
             * <p>0 * * * *</p>
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
