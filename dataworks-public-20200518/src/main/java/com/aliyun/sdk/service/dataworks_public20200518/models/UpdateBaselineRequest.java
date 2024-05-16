// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBaselineRequest} extends {@link RequestModel}
 *
 * <p>UpdateBaselineRequest</p>
 */
public class UpdateBaselineRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertEnabled")
    private Boolean alertEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertMarginThreshold")
    private Integer alertMarginThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertSettings")
    private java.util.List < AlertSettings> alertSettings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaselineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long baselineId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaselineName")
    private String baselineName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaselineType")
    private String baselineType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private String nodeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OvertimeSettings")
    private java.util.List < OvertimeSettings> overtimeSettings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemoveNodeIds")
    private String removeNodeIds;

    private UpdateBaselineRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertEnabled = builder.alertEnabled;
        this.alertMarginThreshold = builder.alertMarginThreshold;
        this.alertSettings = builder.alertSettings;
        this.baselineId = builder.baselineId;
        this.baselineName = builder.baselineName;
        this.baselineType = builder.baselineType;
        this.enabled = builder.enabled;
        this.nodeIds = builder.nodeIds;
        this.overtimeSettings = builder.overtimeSettings;
        this.owner = builder.owner;
        this.priority = builder.priority;
        this.projectId = builder.projectId;
        this.removeNodeIds = builder.removeNodeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBaselineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return alertEnabled
     */
    public Boolean getAlertEnabled() {
        return this.alertEnabled;
    }

    /**
     * @return alertMarginThreshold
     */
    public Integer getAlertMarginThreshold() {
        return this.alertMarginThreshold;
    }

    /**
     * @return alertSettings
     */
    public java.util.List < AlertSettings> getAlertSettings() {
        return this.alertSettings;
    }

    /**
     * @return baselineId
     */
    public Long getBaselineId() {
        return this.baselineId;
    }

    /**
     * @return baselineName
     */
    public String getBaselineName() {
        return this.baselineName;
    }

    /**
     * @return baselineType
     */
    public String getBaselineType() {
        return this.baselineType;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return nodeIds
     */
    public String getNodeIds() {
        return this.nodeIds;
    }

    /**
     * @return overtimeSettings
     */
    public java.util.List < OvertimeSettings> getOvertimeSettings() {
        return this.overtimeSettings;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return removeNodeIds
     */
    public String getRemoveNodeIds() {
        return this.removeNodeIds;
    }

    public static final class Builder extends Request.Builder<UpdateBaselineRequest, Builder> {
        private String regionId; 
        private Boolean alertEnabled; 
        private Integer alertMarginThreshold; 
        private java.util.List < AlertSettings> alertSettings; 
        private Long baselineId; 
        private String baselineName; 
        private String baselineType; 
        private Boolean enabled; 
        private String nodeIds; 
        private java.util.List < OvertimeSettings> overtimeSettings; 
        private String owner; 
        private Integer priority; 
        private Long projectId; 
        private String removeNodeIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBaselineRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertEnabled = request.alertEnabled;
            this.alertMarginThreshold = request.alertMarginThreshold;
            this.alertSettings = request.alertSettings;
            this.baselineId = request.baselineId;
            this.baselineName = request.baselineName;
            this.baselineType = request.baselineType;
            this.enabled = request.enabled;
            this.nodeIds = request.nodeIds;
            this.overtimeSettings = request.overtimeSettings;
            this.owner = request.owner;
            this.priority = request.priority;
            this.projectId = request.projectId;
            this.removeNodeIds = request.removeNodeIds;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AlertEnabled.
         */
        public Builder alertEnabled(Boolean alertEnabled) {
            this.putBodyParameter("AlertEnabled", alertEnabled);
            this.alertEnabled = alertEnabled;
            return this;
        }

        /**
         * AlertMarginThreshold.
         */
        public Builder alertMarginThreshold(Integer alertMarginThreshold) {
            this.putBodyParameter("AlertMarginThreshold", alertMarginThreshold);
            this.alertMarginThreshold = alertMarginThreshold;
            return this;
        }

        /**
         * AlertSettings.
         */
        public Builder alertSettings(java.util.List < AlertSettings> alertSettings) {
            String alertSettingsShrink = shrink(alertSettings, "AlertSettings", "json");
            this.putBodyParameter("AlertSettings", alertSettingsShrink);
            this.alertSettings = alertSettings;
            return this;
        }

        /**
         * BaselineId.
         */
        public Builder baselineId(Long baselineId) {
            this.putBodyParameter("BaselineId", baselineId);
            this.baselineId = baselineId;
            return this;
        }

        /**
         * BaselineName.
         */
        public Builder baselineName(String baselineName) {
            this.putBodyParameter("BaselineName", baselineName);
            this.baselineName = baselineName;
            return this;
        }

        /**
         * BaselineType.
         */
        public Builder baselineType(String baselineType) {
            this.putBodyParameter("BaselineType", baselineType);
            this.baselineType = baselineType;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * NodeIds.
         */
        public Builder nodeIds(String nodeIds) {
            this.putBodyParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * OvertimeSettings.
         */
        public Builder overtimeSettings(java.util.List < OvertimeSettings> overtimeSettings) {
            String overtimeSettingsShrink = shrink(overtimeSettings, "OvertimeSettings", "json");
            this.putBodyParameter("OvertimeSettings", overtimeSettingsShrink);
            this.overtimeSettings = overtimeSettings;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RemoveNodeIds.
         */
        public Builder removeNodeIds(String removeNodeIds) {
            this.putBodyParameter("RemoveNodeIds", removeNodeIds);
            this.removeNodeIds = removeNodeIds;
            return this;
        }

        @Override
        public UpdateBaselineRequest build() {
            return new UpdateBaselineRequest(this);
        } 

    } 

    public static class DingRobots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AtAll")
        private Boolean atAll;

        @com.aliyun.core.annotation.NameInMap("WebUrl")
        private String webUrl;

        private DingRobots(Builder builder) {
            this.atAll = builder.atAll;
            this.webUrl = builder.webUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingRobots create() {
            return builder().build();
        }

        /**
         * @return atAll
         */
        public Boolean getAtAll() {
            return this.atAll;
        }

        /**
         * @return webUrl
         */
        public String getWebUrl() {
            return this.webUrl;
        }

        public static final class Builder {
            private Boolean atAll; 
            private String webUrl; 

            /**
             * AtAll.
             */
            public Builder atAll(Boolean atAll) {
                this.atAll = atAll;
                return this;
            }

            /**
             * WebUrl.
             */
            public Builder webUrl(String webUrl) {
                this.webUrl = webUrl;
                return this;
            }

            public DingRobots build() {
                return new DingRobots(this);
            } 

        } 

    }
    public static class AlertSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertInterval")
        @com.aliyun.core.annotation.Validation(maximum = 1440, minimum = 5)
        private Integer alertInterval;

        @com.aliyun.core.annotation.NameInMap("AlertMaximum")
        @com.aliyun.core.annotation.Validation(maximum = 288, minimum = 1)
        private Integer alertMaximum;

        @com.aliyun.core.annotation.NameInMap("AlertMethods")
        private java.util.List < String > alertMethods;

        @com.aliyun.core.annotation.NameInMap("AlertRecipient")
        private String alertRecipient;

        @com.aliyun.core.annotation.NameInMap("AlertRecipientType")
        private String alertRecipientType;

        @com.aliyun.core.annotation.NameInMap("AlertType")
        private String alertType;

        @com.aliyun.core.annotation.NameInMap("BaselineAlertEnabled")
        private Boolean baselineAlertEnabled;

        @com.aliyun.core.annotation.NameInMap("DingRobots")
        private java.util.List < DingRobots> dingRobots;

        @com.aliyun.core.annotation.NameInMap("SilenceEndTime")
        private String silenceEndTime;

        @com.aliyun.core.annotation.NameInMap("SilenceStartTime")
        private String silenceStartTime;

        @com.aliyun.core.annotation.NameInMap("TopicTypes")
        private java.util.List < String > topicTypes;

        @com.aliyun.core.annotation.NameInMap("Webhooks")
        private java.util.List < String > webhooks;

        private AlertSettings(Builder builder) {
            this.alertInterval = builder.alertInterval;
            this.alertMaximum = builder.alertMaximum;
            this.alertMethods = builder.alertMethods;
            this.alertRecipient = builder.alertRecipient;
            this.alertRecipientType = builder.alertRecipientType;
            this.alertType = builder.alertType;
            this.baselineAlertEnabled = builder.baselineAlertEnabled;
            this.dingRobots = builder.dingRobots;
            this.silenceEndTime = builder.silenceEndTime;
            this.silenceStartTime = builder.silenceStartTime;
            this.topicTypes = builder.topicTypes;
            this.webhooks = builder.webhooks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertSettings create() {
            return builder().build();
        }

        /**
         * @return alertInterval
         */
        public Integer getAlertInterval() {
            return this.alertInterval;
        }

        /**
         * @return alertMaximum
         */
        public Integer getAlertMaximum() {
            return this.alertMaximum;
        }

        /**
         * @return alertMethods
         */
        public java.util.List < String > getAlertMethods() {
            return this.alertMethods;
        }

        /**
         * @return alertRecipient
         */
        public String getAlertRecipient() {
            return this.alertRecipient;
        }

        /**
         * @return alertRecipientType
         */
        public String getAlertRecipientType() {
            return this.alertRecipientType;
        }

        /**
         * @return alertType
         */
        public String getAlertType() {
            return this.alertType;
        }

        /**
         * @return baselineAlertEnabled
         */
        public Boolean getBaselineAlertEnabled() {
            return this.baselineAlertEnabled;
        }

        /**
         * @return dingRobots
         */
        public java.util.List < DingRobots> getDingRobots() {
            return this.dingRobots;
        }

        /**
         * @return silenceEndTime
         */
        public String getSilenceEndTime() {
            return this.silenceEndTime;
        }

        /**
         * @return silenceStartTime
         */
        public String getSilenceStartTime() {
            return this.silenceStartTime;
        }

        /**
         * @return topicTypes
         */
        public java.util.List < String > getTopicTypes() {
            return this.topicTypes;
        }

        /**
         * @return webhooks
         */
        public java.util.List < String > getWebhooks() {
            return this.webhooks;
        }

        public static final class Builder {
            private Integer alertInterval; 
            private Integer alertMaximum; 
            private java.util.List < String > alertMethods; 
            private String alertRecipient; 
            private String alertRecipientType; 
            private String alertType; 
            private Boolean baselineAlertEnabled; 
            private java.util.List < DingRobots> dingRobots; 
            private String silenceEndTime; 
            private String silenceStartTime; 
            private java.util.List < String > topicTypes; 
            private java.util.List < String > webhooks; 

            /**
             * AlertInterval.
             */
            public Builder alertInterval(Integer alertInterval) {
                this.alertInterval = alertInterval;
                return this;
            }

            /**
             * AlertMaximum.
             */
            public Builder alertMaximum(Integer alertMaximum) {
                this.alertMaximum = alertMaximum;
                return this;
            }

            /**
             * AlertMethods.
             */
            public Builder alertMethods(java.util.List < String > alertMethods) {
                this.alertMethods = alertMethods;
                return this;
            }

            /**
             * AlertRecipient.
             */
            public Builder alertRecipient(String alertRecipient) {
                this.alertRecipient = alertRecipient;
                return this;
            }

            /**
             * AlertRecipientType.
             */
            public Builder alertRecipientType(String alertRecipientType) {
                this.alertRecipientType = alertRecipientType;
                return this;
            }

            /**
             * AlertType.
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * BaselineAlertEnabled.
             */
            public Builder baselineAlertEnabled(Boolean baselineAlertEnabled) {
                this.baselineAlertEnabled = baselineAlertEnabled;
                return this;
            }

            /**
             * DingRobots.
             */
            public Builder dingRobots(java.util.List < DingRobots> dingRobots) {
                this.dingRobots = dingRobots;
                return this;
            }

            /**
             * SilenceEndTime.
             */
            public Builder silenceEndTime(String silenceEndTime) {
                this.silenceEndTime = silenceEndTime;
                return this;
            }

            /**
             * SilenceStartTime.
             */
            public Builder silenceStartTime(String silenceStartTime) {
                this.silenceStartTime = silenceStartTime;
                return this;
            }

            /**
             * TopicTypes.
             */
            public Builder topicTypes(java.util.List < String > topicTypes) {
                this.topicTypes = topicTypes;
                return this;
            }

            /**
             * Webhooks.
             */
            public Builder webhooks(java.util.List < String > webhooks) {
                this.webhooks = webhooks;
                return this;
            }

            public AlertSettings build() {
                return new AlertSettings(this);
            } 

        } 

    }
    public static class OvertimeSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cycle")
        private Integer cycle;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private OvertimeSettings(Builder builder) {
            this.cycle = builder.cycle;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OvertimeSettings create() {
            return builder().build();
        }

        /**
         * @return cycle
         */
        public Integer getCycle() {
            return this.cycle;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private Integer cycle; 
            private String time; 

            /**
             * Cycle.
             */
            public Builder cycle(Integer cycle) {
                this.cycle = cycle;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public OvertimeSettings build() {
                return new OvertimeSettings(this);
            } 

        } 

    }
}
