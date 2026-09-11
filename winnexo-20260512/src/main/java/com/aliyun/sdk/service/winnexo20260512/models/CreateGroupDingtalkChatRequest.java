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
 * {@link CreateGroupDingtalkChatRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupDingtalkChatRequest</p>
 */
public class CreateGroupDingtalkChatRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

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

    private CreateGroupDingtalkChatRequest(Builder builder) {
        super(builder);
        this.chatId = builder.chatId;
        this.chatName = builder.chatName;
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.groupId = builder.groupId;
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

    public static CreateGroupDingtalkChatRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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

    public static final class Builder extends Request.Builder<CreateGroupDingtalkChatRequest, Builder> {
        private String chatId; 
        private String chatName; 
        private String description; 
        private String directoryId; 
        private String groupId; 
        private String historyStartTime; 
        private String notes; 
        private String operatingObjectName; 
        private String sourceTags; 
        private String tenantId; 
        private UpdateFrequency updateFrequency; 

        private Builder() {
            super();
        } 

        private Builder(CreateGroupDingtalkChatRequest request) {
            super(request);
            this.chatId = request.chatId;
            this.chatName = request.chatName;
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.groupId = request.groupId;
            this.historyStartTime = request.historyStartTime;
            this.notes = request.notes;
            this.operatingObjectName = request.operatingObjectName;
            this.sourceTags = request.sourceTags;
            this.tenantId = request.tenantId;
            this.updateFrequency = request.updateFrequency;
        } 

        /**
         * <p>The session ID, typically used for JSSDK.</p>
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
         * <p>The group chat name.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomerProjectGroup</p>
         */
        public Builder chatName(String chatName) {
            this.putBodyParameter("chatName", chatName);
            this.chatName = chatName;
            return this;
        }

        /**
         * <p>The description of the AI assistant.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer chat history</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The directory ID.</p>
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
         * <p>The project group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleGroupId</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The start time for collecting chat history.</p>
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
         * <p>The meeting notes content (optional). This participates in auxiliary analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>Focus on identifying customer demands and to-do items</p>
         */
        public Builder notes(String notes) {
            this.putBodyParameter("notes", notes);
            this.notes = notes;
            return this;
        }

        /**
         * <p>The name of the digital employee (operating object name, optional).</p>
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
         * <p>The source tags.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Customer&quot;,&quot;GroupChat&quot;]</p>
         */
        public Builder sourceTags(String sourceTags) {
            this.putBodyParameter("sourceTags", sourceTags);
            this.sourceTags = sourceTags;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass this explicitly with --tenant-id.</p>
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
         * <p>The feature update frequency.</p>
         */
        public Builder updateFrequency(UpdateFrequency updateFrequency) {
            String updateFrequencyShrink = shrink(updateFrequency, "updateFrequency", "json");
            this.putBodyParameter("updateFrequency", updateFrequencyShrink);
            this.updateFrequency = updateFrequency;
            return this;
        }

        @Override
        public CreateGroupDingtalkChatRequest build() {
            return new CreateGroupDingtalkChatRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateGroupDingtalkChatRequest} extends {@link TeaModel}
     *
     * <p>CreateGroupDingtalkChatRequest</p>
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
             * <p>The cron expression for timed scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>0 2 * * *</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>Specifies whether the throttling rule is enabled. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The preset mode. You can ignore this parameter.</p>
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
