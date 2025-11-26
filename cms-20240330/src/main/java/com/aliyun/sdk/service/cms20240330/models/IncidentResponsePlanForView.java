// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link IncidentResponsePlanForView} extends {@link TeaModel}
 *
 * <p>IncidentResponsePlanForView</p>
 */
public class IncidentResponsePlanForView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoRecoverSeconds")
    private Long autoRecoverSeconds;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("escalationId")
    private java.util.List<String> escalationId;

    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("pushingSetting")
    private PushingSetting pushingSetting;

    @com.aliyun.core.annotation.NameInMap("repeatNotifySetting")
    private RepeatNotifySetting repeatNotifySetting;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("syncFromType")
    private String syncFromType;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("uuid")
    private String uuid;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private IncidentResponsePlanForView(Builder builder) {
        this.autoRecoverSeconds = builder.autoRecoverSeconds;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.escalationId = builder.escalationId;
        this.mode = builder.mode;
        this.name = builder.name;
        this.pushingSetting = builder.pushingSetting;
        this.repeatNotifySetting = builder.repeatNotifySetting;
        this.source = builder.source;
        this.syncFromType = builder.syncFromType;
        this.type = builder.type;
        this.updateTime = builder.updateTime;
        this.uuid = builder.uuid;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentResponsePlanForView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRecoverSeconds
     */
    public Long getAutoRecoverSeconds() {
        return this.autoRecoverSeconds;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return escalationId
     */
    public java.util.List<String> getEscalationId() {
        return this.escalationId;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pushingSetting
     */
    public PushingSetting getPushingSetting() {
        return this.pushingSetting;
    }

    /**
     * @return repeatNotifySetting
     */
    public RepeatNotifySetting getRepeatNotifySetting() {
        return this.repeatNotifySetting;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return syncFromType
     */
    public String getSyncFromType() {
        return this.syncFromType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private Long autoRecoverSeconds; 
        private String createTime; 
        private String description; 
        private Boolean enabled; 
        private java.util.List<String> escalationId; 
        private String mode; 
        private String name; 
        private PushingSetting pushingSetting; 
        private RepeatNotifySetting repeatNotifySetting; 
        private String source; 
        private String syncFromType; 
        private String type; 
        private String updateTime; 
        private String uuid; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(IncidentResponsePlanForView model) {
            this.autoRecoverSeconds = model.autoRecoverSeconds;
            this.createTime = model.createTime;
            this.description = model.description;
            this.enabled = model.enabled;
            this.escalationId = model.escalationId;
            this.mode = model.mode;
            this.name = model.name;
            this.pushingSetting = model.pushingSetting;
            this.repeatNotifySetting = model.repeatNotifySetting;
            this.source = model.source;
            this.syncFromType = model.syncFromType;
            this.type = model.type;
            this.updateTime = model.updateTime;
            this.uuid = model.uuid;
            this.workspace = model.workspace;
        } 

        /**
         * autoRecoverSeconds.
         */
        public Builder autoRecoverSeconds(Long autoRecoverSeconds) {
            this.autoRecoverSeconds = autoRecoverSeconds;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * escalationId.
         */
        public Builder escalationId(java.util.List<String> escalationId) {
            this.escalationId = escalationId;
            return this;
        }

        /**
         * mode.
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * pushingSetting.
         */
        public Builder pushingSetting(PushingSetting pushingSetting) {
            this.pushingSetting = pushingSetting;
            return this;
        }

        /**
         * repeatNotifySetting.
         */
        public Builder repeatNotifySetting(RepeatNotifySetting repeatNotifySetting) {
            this.repeatNotifySetting = repeatNotifySetting;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * syncFromType.
         */
        public Builder syncFromType(String syncFromType) {
            this.syncFromType = syncFromType;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * uuid.
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public IncidentResponsePlanForView build() {
            return new IncidentResponsePlanForView(this);
        } 

    } 

}
