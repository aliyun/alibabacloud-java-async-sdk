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
 * {@link IncidentResponsePlanForSNSView} extends {@link TeaModel}
 *
 * <p>IncidentResponsePlanForSNSView</p>
 */
public class IncidentResponsePlanForSNSView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoRecoverSeconds")
    private Long autoRecoverSeconds;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

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

    private IncidentResponsePlanForSNSView(Builder builder) {
        this.autoRecoverSeconds = builder.autoRecoverSeconds;
        this.createTime = builder.createTime;
        this.enable = builder.enable;
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentResponsePlanForSNSView create() {
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
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
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

    public static final class Builder {
        private Long autoRecoverSeconds; 
        private String createTime; 
        private Boolean enable; 
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

        private Builder() {
        } 

        private Builder(IncidentResponsePlanForSNSView model) {
            this.autoRecoverSeconds = model.autoRecoverSeconds;
            this.createTime = model.createTime;
            this.enable = model.enable;
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
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
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

        public IncidentResponsePlanForSNSView build() {
            return new IncidentResponsePlanForSNSView(this);
        } 

    } 

    /**
     * 
     * {@link IncidentResponsePlanForSNSView} extends {@link TeaModel}
     *
     * <p>IncidentResponsePlanForSNSView</p>
     */
    public static class PushingSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alertActionIds")
        private java.util.List<String> alertActionIds;

        @com.aliyun.core.annotation.NameInMap("restoreActionIds")
        private java.util.List<String> restoreActionIds;

        @com.aliyun.core.annotation.NameInMap("templateUuid")
        private String templateUuid;

        private PushingSetting(Builder builder) {
            this.alertActionIds = builder.alertActionIds;
            this.restoreActionIds = builder.restoreActionIds;
            this.templateUuid = builder.templateUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushingSetting create() {
            return builder().build();
        }

        /**
         * @return alertActionIds
         */
        public java.util.List<String> getAlertActionIds() {
            return this.alertActionIds;
        }

        /**
         * @return restoreActionIds
         */
        public java.util.List<String> getRestoreActionIds() {
            return this.restoreActionIds;
        }

        /**
         * @return templateUuid
         */
        public String getTemplateUuid() {
            return this.templateUuid;
        }

        public static final class Builder {
            private java.util.List<String> alertActionIds; 
            private java.util.List<String> restoreActionIds; 
            private String templateUuid; 

            private Builder() {
            } 

            private Builder(PushingSetting model) {
                this.alertActionIds = model.alertActionIds;
                this.restoreActionIds = model.restoreActionIds;
                this.templateUuid = model.templateUuid;
            } 

            /**
             * alertActionIds.
             */
            public Builder alertActionIds(java.util.List<String> alertActionIds) {
                this.alertActionIds = alertActionIds;
                return this;
            }

            /**
             * restoreActionIds.
             */
            public Builder restoreActionIds(java.util.List<String> restoreActionIds) {
                this.restoreActionIds = restoreActionIds;
                return this;
            }

            /**
             * templateUuid.
             */
            public Builder templateUuid(String templateUuid) {
                this.templateUuid = templateUuid;
                return this;
            }

            public PushingSetting build() {
                return new PushingSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link IncidentResponsePlanForSNSView} extends {@link TeaModel}
     *
     * <p>IncidentResponsePlanForSNSView</p>
     */
    public static class RepeatNotifySetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endIncidentState")
        private String endIncidentState;

        @com.aliyun.core.annotation.NameInMap("repeatInterval")
        private Integer repeatInterval;

        private RepeatNotifySetting(Builder builder) {
            this.endIncidentState = builder.endIncidentState;
            this.repeatInterval = builder.repeatInterval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepeatNotifySetting create() {
            return builder().build();
        }

        /**
         * @return endIncidentState
         */
        public String getEndIncidentState() {
            return this.endIncidentState;
        }

        /**
         * @return repeatInterval
         */
        public Integer getRepeatInterval() {
            return this.repeatInterval;
        }

        public static final class Builder {
            private String endIncidentState; 
            private Integer repeatInterval; 

            private Builder() {
            } 

            private Builder(RepeatNotifySetting model) {
                this.endIncidentState = model.endIncidentState;
                this.repeatInterval = model.repeatInterval;
            } 

            /**
             * endIncidentState.
             */
            public Builder endIncidentState(String endIncidentState) {
                this.endIncidentState = endIncidentState;
                return this;
            }

            /**
             * repeatInterval.
             */
            public Builder repeatInterval(Integer repeatInterval) {
                this.repeatInterval = repeatInterval;
                return this;
            }

            public RepeatNotifySetting build() {
                return new RepeatNotifySetting(this);
            } 

        } 

    }
}
