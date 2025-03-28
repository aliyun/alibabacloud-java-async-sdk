// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
    private java.util.List<AlertSettings> alertSettings;

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
    private java.util.List<OvertimeSettings> overtimeSettings;

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
    public java.util.List<AlertSettings> getAlertSettings() {
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
    public java.util.List<OvertimeSettings> getOvertimeSettings() {
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
        private java.util.List<AlertSettings> alertSettings; 
        private Long baselineId; 
        private String baselineName; 
        private String baselineType; 
        private Boolean enabled; 
        private String nodeIds; 
        private java.util.List<OvertimeSettings> overtimeSettings; 
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
         * <p>Specifies whether to enable the alerting feature. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder alertEnabled(Boolean alertEnabled) {
            this.putBodyParameter("AlertEnabled", alertEnabled);
            this.alertEnabled = alertEnabled;
            return this;
        }

        /**
         * <p>The alert margin threshold of the baseline. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder alertMarginThreshold(Integer alertMarginThreshold) {
            this.putBodyParameter("AlertMarginThreshold", alertMarginThreshold);
            this.alertMarginThreshold = alertMarginThreshold;
            return this;
        }

        /**
         * <p>The alert settings of the baseline.</p>
         */
        public Builder alertSettings(java.util.List<AlertSettings> alertSettings) {
            String alertSettingsShrink = shrink(alertSettings, "AlertSettings", "json");
            this.putBodyParameter("AlertSettings", alertSettingsShrink);
            this.alertSettings = alertSettings;
            return this;
        }

        /**
         * <p>The baseline ID. You can call the <a href="https://help.aliyun.com/document_detail/2261507.html">ListBaselines</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000010800007</p>
         */
        public Builder baselineId(Long baselineId) {
            this.putBodyParameter("BaselineId", baselineId);
            this.baselineId = baselineId;
            return this;
        }

        /**
         * <p>The name of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>BaselineName</p>
         */
        public Builder baselineName(String baselineName) {
            this.putBodyParameter("BaselineName", baselineName);
            this.baselineName = baselineName;
            return this;
        }

        /**
         * <p>The type of the baseline. Valid values: DAILY and HOURLY.</p>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        public Builder baselineType(String baselineType) {
            this.putBodyParameter("BaselineType", baselineType);
            this.baselineType = baselineType;
            return this;
        }

        /**
         * <p>Specifies whether to enable the baseline. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The ancestor nodes of nodes in the baseline. Separate the ancestor nodes with commas (,). If a large number of ancestor nodes exist, we recommend that you create a zero load node and configure the zero load node as the descendant node of nodes in the baseline to facilitate node management.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        public Builder nodeIds(String nodeIds) {
            this.putBodyParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * <p>The settings of the committed completion time of the baseline.</p>
         */
        public Builder overtimeSettings(java.util.List<OvertimeSettings> overtimeSettings) {
            String overtimeSettingsShrink = shrink(overtimeSettings, "OvertimeSettings", "json");
            this.putBodyParameter("OvertimeSettings", overtimeSettingsShrink);
            this.overtimeSettings = overtimeSettings;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account used by the baseline owner.</p>
         * 
         * <strong>example:</strong>
         * <p>3726346****</p>
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The priority of the baseline. Valid values: {1,3,5,7,8}.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The workspace ID. You can call the <a href="https://help.aliyun.com/document_detail/2261507.html">ListBaselines</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2043</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The ID of the node that you want to disassociate from the baseline. You can specify multiple node IDs. Separate multiple node IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>123,456</p>
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

    /**
     * 
     * {@link UpdateBaselineRequest} extends {@link TeaModel}
     *
     * <p>UpdateBaselineRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(DingRobots model) {
                this.atAll = model.atAll;
                this.webUrl = model.webUrl;
            } 

            /**
             * <p>Specifies whether to remind all members by using the at sign (@). Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder atAll(Boolean atAll) {
                this.atAll = atAll;
                return this;
            }

            /**
             * <p>The webhook URL of the DingTalk chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=xxx">https://oapi.dingtalk.com/robot/send?access_token=xxx</a></p>
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
    /**
     * 
     * {@link UpdateBaselineRequest} extends {@link TeaModel}
     *
     * <p>UpdateBaselineRequest</p>
     */
    public static class AlertSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertInterval")
        @com.aliyun.core.annotation.Validation(maximum = 1440, minimum = 5)
        private Integer alertInterval;

        @com.aliyun.core.annotation.NameInMap("AlertMaximum")
        @com.aliyun.core.annotation.Validation(maximum = 288, minimum = 1)
        private Integer alertMaximum;

        @com.aliyun.core.annotation.NameInMap("AlertMethods")
        private java.util.List<String> alertMethods;

        @com.aliyun.core.annotation.NameInMap("AlertRecipient")
        private String alertRecipient;

        @com.aliyun.core.annotation.NameInMap("AlertRecipientType")
        private String alertRecipientType;

        @com.aliyun.core.annotation.NameInMap("AlertType")
        private String alertType;

        @com.aliyun.core.annotation.NameInMap("BaselineAlertEnabled")
        private Boolean baselineAlertEnabled;

        @com.aliyun.core.annotation.NameInMap("DingRobots")
        private java.util.List<DingRobots> dingRobots;

        @com.aliyun.core.annotation.NameInMap("SilenceEndTime")
        private String silenceEndTime;

        @com.aliyun.core.annotation.NameInMap("SilenceStartTime")
        private String silenceStartTime;

        @com.aliyun.core.annotation.NameInMap("TopicTypes")
        private java.util.List<String> topicTypes;

        @com.aliyun.core.annotation.NameInMap("Webhooks")
        private java.util.List<String> webhooks;

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
        public java.util.List<String> getAlertMethods() {
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
        public java.util.List<DingRobots> getDingRobots() {
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
        public java.util.List<String> getTopicTypes() {
            return this.topicTypes;
        }

        /**
         * @return webhooks
         */
        public java.util.List<String> getWebhooks() {
            return this.webhooks;
        }

        public static final class Builder {
            private Integer alertInterval; 
            private Integer alertMaximum; 
            private java.util.List<String> alertMethods; 
            private String alertRecipient; 
            private String alertRecipientType; 
            private String alertType; 
            private Boolean baselineAlertEnabled; 
            private java.util.List<DingRobots> dingRobots; 
            private String silenceEndTime; 
            private String silenceStartTime; 
            private java.util.List<String> topicTypes; 
            private java.util.List<String> webhooks; 

            private Builder() {
            } 

            private Builder(AlertSettings model) {
                this.alertInterval = model.alertInterval;
                this.alertMaximum = model.alertMaximum;
                this.alertMethods = model.alertMethods;
                this.alertRecipient = model.alertRecipient;
                this.alertRecipientType = model.alertRecipientType;
                this.alertType = model.alertType;
                this.baselineAlertEnabled = model.baselineAlertEnabled;
                this.dingRobots = model.dingRobots;
                this.silenceEndTime = model.silenceEndTime;
                this.silenceStartTime = model.silenceStartTime;
                this.topicTypes = model.topicTypes;
                this.webhooks = model.webhooks;
            } 

            /**
             * <p>The interval at which an event alert notification is sent. Unit: minutes. Minimum value: 5. Maximum value: 1,440.</p>
             * 
             * <strong>example:</strong>
             * <p>1800</p>
             */
            public Builder alertInterval(Integer alertInterval) {
                this.alertInterval = alertInterval;
                return this;
            }

            /**
             * <p>The maximum number of times an event alert notification is sent. Maximum value: 24.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alertMaximum(Integer alertMaximum) {
                this.alertMaximum = alertMaximum;
                return this;
            }

            /**
             * <p>The alert notification methods. Valid values: MAIL, SMS, PHONE, DINGROBOTS, and Webhooks. The value MAIL indicates that alert notifications are sent by email. The value SMS indicates that alert notifications are sent by text message. The value PHONE indicates that alert notifications are sent by phone call. You can use this notification method only in DataWorks Professional Edition or a more advanced edition. The value DINGROBOTS indicates that alert notifications are sent by using a DingTalk chatbot. You can use this notification method only if the RobotUrls parameter is configured. The value Webhooks indicates that alert notifications are sent by WeCom or Lark. You can use this notification method only if the Webhooks parameter is configured.</p>
             */
            public Builder alertMethods(java.util.List<String> alertMethods) {
                this.alertMethods = alertMethods;
                return this;
            }

            /**
             * <p>The details of the alert recipient. If you set AlertRecipientType to OWNER, leave this parameter empty. If you set AlertRecipientType to SHIFT_SCHEDULE, set this parameter to the name of the shift schedule. If you set AlertRecipientType to OTHER, set this parameter to the employee IDs of specified personnel.</p>
             * 
             * <strong>example:</strong>
             * <p>123123</p>
             */
            public Builder alertRecipient(String alertRecipient) {
                this.alertRecipient = alertRecipient;
                return this;
            }

            /**
             * <p>The type of the alert recipient. Valid values: OWNER, OTHER, and SHIFT_SCHEDULE. The value OWNER indicates the node owner. The value OTHER indicates specified personnel. The value SHIFT_SCHEDULE indicates personnel in a shift schedule.</p>
             * 
             * <strong>example:</strong>
             * <p>OWNER</p>
             */
            public Builder alertRecipientType(String alertRecipientType) {
                this.alertRecipientType = alertRecipientType;
                return this;
            }

            /**
             * <p>The type of the alert. Valid values: BASELINE and TOPIC. The value BASELINE indicates a baseline alert. The value TOPIC indicates an event alert.</p>
             * 
             * <strong>example:</strong>
             * <p>BASELINE</p>
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * <p>Specifies whether to enable the baseline alerting feature. This feature is specific to baselines. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder baselineAlertEnabled(Boolean baselineAlertEnabled) {
                this.baselineAlertEnabled = baselineAlertEnabled;
                return this;
            }

            /**
             * <p>The DingTalk chatbots.</p>
             */
            public Builder dingRobots(java.util.List<DingRobots> dingRobots) {
                this.dingRobots = dingRobots;
                return this;
            }

            /**
             * <p>The end time of silence.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder silenceEndTime(String silenceEndTime) {
                this.silenceEndTime = silenceEndTime;
                return this;
            }

            /**
             * <p>The start time of silence.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder silenceStartTime(String silenceStartTime) {
                this.silenceStartTime = silenceStartTime;
                return this;
            }

            /**
             * <p>The types of event alerts, which are event-specific configurations.</p>
             */
            public Builder topicTypes(java.util.List<String> topicTypes) {
                this.topicTypes = topicTypes;
                return this;
            }

            /**
             * <p>The webhook URLs.</p>
             */
            public Builder webhooks(java.util.List<String> webhooks) {
                this.webhooks = webhooks;
                return this;
            }

            public AlertSettings build() {
                return new AlertSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateBaselineRequest} extends {@link TeaModel}
     *
     * <p>UpdateBaselineRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(OvertimeSettings model) {
                this.cycle = model.cycle;
                this.time = model.time;
            } 

            /**
             * <p>The cycle that corresponds to the committed completion time. For a day-level baseline, set this parameter to 1. For an hour-level baseline, set this parameter to a value that is no more than 24.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cycle(Integer cycle) {
                this.cycle = cycle;
                return this;
            }

            /**
             * <p>The committed completion time in the hh:mm format. Valid values of hh: [0,47]. Valid values of mm: [0,59].</p>
             * 
             * <strong>example:</strong>
             * <p>00:00</p>
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
