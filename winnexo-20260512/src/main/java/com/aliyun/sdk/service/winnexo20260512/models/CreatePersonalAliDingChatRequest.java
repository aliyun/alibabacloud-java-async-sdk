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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

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
        this.appToken = builder.appToken;
        this.chatId = builder.chatId;
        this.chatName = builder.chatName;
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.historyStartTime = builder.historyStartTime;
        this.notes = builder.notes;
        this.operatingObjectName = builder.operatingObjectName;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
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
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
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
     * @return opsUserCode
     */
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    /**
     * @return opsUserId
     */
    public String getOpsUserId() {
        return this.opsUserId;
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
        private String appToken; 
        private String chatId; 
        private String chatName; 
        private String description; 
        private String directoryId; 
        private String historyStartTime; 
        private String notes; 
        private String operatingObjectName; 
        private String opsUserCode; 
        private String opsUserId; 
        private String sourceTags; 
        private String tenantId; 
        private UpdateFrequency updateFrequency; 

        private Builder() {
            super();
        } 

        private Builder(CreatePersonalAliDingChatRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.chatId = request.chatId;
            this.chatName = request.chatName;
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.historyStartTime = request.historyStartTime;
            this.notes = request.notes;
            this.operatingObjectName = request.operatingObjectName;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.sourceTags = request.sourceTags;
            this.tenantId = request.tenantId;
            this.updateFrequency = request.updateFrequency;
        } 

        /**
         * <p>The platform application token issued by the console. If provided, the operation is executed as the user specified by opsUserId or opsUserCode.</p>
         * 
         * <strong>example:</strong>
         * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("appToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>The ID of the DingTalk group chat session.</p>
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
         * <p>The name of the group chat.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer project group</p>
         */
        public Builder chatName(String chatName) {
            this.putBodyParameter("chatName", chatName);
            this.chatName = chatName;
            return this;
        }

        /**
         * <p>The pipeline description.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer group chat history</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The folder ID.</p>
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
         * <p>The content of meeting notes (optional), which is used for auxiliary analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>Focus on identifying customer requirements and to-do items</p>
         */
        public Builder notes(String notes) {
            this.putBodyParameter("notes", notes);
            this.notes = notes;
            return this;
        }

        /**
         * <p>The name of the digital employee (the name of the operating object, optional).</p>
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
         * <p>The proxy user code, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder opsUserCode(String opsUserCode) {
            this.putQueryParameter("opsUserCode", opsUserCode);
            this.opsUserCode = opsUserCode;
            return this;
        }

        /**
         * <p>The proxy user ID, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder opsUserId(String opsUserId) {
            this.putQueryParameter("opsUserId", opsUserId);
            this.opsUserId = opsUserId;
            return this;
        }

        /**
         * <p>The resource tags (optional). The value is a JSON string list, such as [&quot;tagA&quot;,&quot;tagB&quot;].</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Customer&quot;,&quot;Group chat&quot;]</p>
         */
        public Builder sourceTags(String sourceTags) {
            this.putBodyParameter("sourceTags", sourceTags);
            this.sourceTags = sourceTags;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter and is explicitly passed by using the --tenant-id option in winnexo-cli.</p>
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
             * <p>The cron expression for the timed scheduling node.</p>
             * 
             * <strong>example:</strong>
             * <p>0 2 * * *</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p><strong>Enable or disable</strong></p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The preset mode, which can be ignored.</p>
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
