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
 * {@link IncidentResponsePlanForSNSModify} extends {@link TeaModel}
 *
 * <p>IncidentResponsePlanForSNSModify</p>
 */
public class IncidentResponsePlanForSNSModify extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoRecoverSeconds")
    private Long autoRecoverSeconds;

    @com.aliyun.core.annotation.NameInMap("escalationId")
    private java.util.List<String> escalationId;

    @com.aliyun.core.annotation.NameInMap("pushingSetting")
    private PushingSetting pushingSetting;

    @com.aliyun.core.annotation.NameInMap("repeatNotifySetting")
    private RepeatNotifySetting repeatNotifySetting;

    private IncidentResponsePlanForSNSModify(Builder builder) {
        this.autoRecoverSeconds = builder.autoRecoverSeconds;
        this.escalationId = builder.escalationId;
        this.pushingSetting = builder.pushingSetting;
        this.repeatNotifySetting = builder.repeatNotifySetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentResponsePlanForSNSModify create() {
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
     * @return escalationId
     */
    public java.util.List<String> getEscalationId() {
        return this.escalationId;
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

    public static final class Builder {
        private Long autoRecoverSeconds; 
        private java.util.List<String> escalationId; 
        private PushingSetting pushingSetting; 
        private RepeatNotifySetting repeatNotifySetting; 

        private Builder() {
        } 

        private Builder(IncidentResponsePlanForSNSModify model) {
            this.autoRecoverSeconds = model.autoRecoverSeconds;
            this.escalationId = model.escalationId;
            this.pushingSetting = model.pushingSetting;
            this.repeatNotifySetting = model.repeatNotifySetting;
        } 

        /**
         * autoRecoverSeconds.
         */
        public Builder autoRecoverSeconds(Long autoRecoverSeconds) {
            this.autoRecoverSeconds = autoRecoverSeconds;
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

        public IncidentResponsePlanForSNSModify build() {
            return new IncidentResponsePlanForSNSModify(this);
        } 

    } 

    /**
     * 
     * {@link IncidentResponsePlanForSNSModify} extends {@link TeaModel}
     *
     * <p>IncidentResponsePlanForSNSModify</p>
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
     * {@link IncidentResponsePlanForSNSModify} extends {@link TeaModel}
     *
     * <p>IncidentResponsePlanForSNSModify</p>
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
