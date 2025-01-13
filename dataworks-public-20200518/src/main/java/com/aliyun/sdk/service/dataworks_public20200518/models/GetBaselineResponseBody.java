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
 * {@link GetBaselineResponseBody} extends {@link TeaModel}
 *
 * <p>GetBaselineResponseBody</p>
 */
public class GetBaselineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetBaselineResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBaselineResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetBaselineResponseBody build() {
            return new GetBaselineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBaselineResponseBody} extends {@link TeaModel}
     *
     * <p>GetBaselineResponseBody</p>
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

            /**
             * <p>Indicates whether all members were reminded by using the at sign (@).</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
     * {@link GetBaselineResponseBody} extends {@link TeaModel}
     *
     * <p>GetBaselineResponseBody</p>
     */
    public static class AlertSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertInterval")
        private Integer alertInterval;

        @com.aliyun.core.annotation.NameInMap("AlertMaximum")
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

            /**
             * <p>The interval at which an event alert notification is sent. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder alertInterval(Integer alertInterval) {
                this.alertInterval = alertInterval;
                return this;
            }

            /**
             * <p>The maximum number of times an event alert notification is sent.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alertMaximum(Integer alertMaximum) {
                this.alertMaximum = alertMaximum;
                return this;
            }

            /**
             * <p>The alert notification methods.</p>
             */
            public Builder alertMethods(java.util.List<String> alertMethods) {
                this.alertMethods = alertMethods;
                return this;
            }

            /**
             * <p>The details of the alert recipient.</p>
             * <ul>
             * <li>If the value of AlertRecipientType is OWNER, this parameter is left empty.</li>
             * <li>If the value of AlertRecipientType is SHIFT_SCHEDULE, the value of this parameter is the ID of a shift schedule.</li>
             * <li>If the value of AlertRecipientType is OTHER, the value of this parameter is the UIDs of specified personnel. Multiple UIDs are separated by commas (,).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>123123</p>
             */
            public Builder alertRecipient(String alertRecipient) {
                this.alertRecipient = alertRecipient;
                return this;
            }

            /**
             * <p>The type of the alert recipient. Valid values:</p>
             * <ul>
             * <li>OWNER: indicates the node owner.</li>
             * <li>OTHER: indicates specified personnel.</li>
             * <li>SHIFT_SCHEDULE: indicates personnel in a shift schedule.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OWNER</p>
             */
            public Builder alertRecipientType(String alertRecipientType) {
                this.alertRecipientType = alertRecipientType;
                return this;
            }

            /**
             * <p>The type of the alert. Valid values:</p>
             * <ul>
             * <li>BASELINE: indicates a baseline alert.</li>
             * <li>TOPIC: indicates an event alert.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BASELINE</p>
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * <p>Indicates whether the baseline alerting feature is enabled. The feature is specific to baselines. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
             * <p>The end of the time range for silence. The time is in the HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder silenceEndTime(String silenceEndTime) {
                this.silenceEndTime = silenceEndTime;
                return this;
            }

            /**
             * <p>The beginning of the time range for silence. The time is in the HH:mm:ss format.</p>
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
     * {@link GetBaselineResponseBody} extends {@link TeaModel}
     *
     * <p>GetBaselineResponseBody</p>
     */
    public static class OverTimeSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cycle")
        private Integer cycle;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private OverTimeSettings(Builder builder) {
            this.cycle = builder.cycle;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverTimeSettings create() {
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
             * <p>The cycle that corresponds to the committed completion time. For a day-level baseline, the value of this parameter is 1. For an hour-level baseline, the value of this parameter cannot exceed 24.</p>
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

            public OverTimeSettings build() {
                return new OverTimeSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBaselineResponseBody} extends {@link TeaModel}
     *
     * <p>GetBaselineResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertEnabled")
        private Boolean alertEnabled;

        @com.aliyun.core.annotation.NameInMap("AlertMarginThreshold")
        private Integer alertMarginThreshold;

        @com.aliyun.core.annotation.NameInMap("AlertSettings")
        private java.util.List<AlertSettings> alertSettings;

        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private Long baselineId;

        @com.aliyun.core.annotation.NameInMap("BaselineName")
        private String baselineName;

        @com.aliyun.core.annotation.NameInMap("BaselineType")
        private String baselineType;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("NodeIds")
        private java.util.List<Long> nodeIds;

        @com.aliyun.core.annotation.NameInMap("OverTimeSettings")
        private java.util.List<OverTimeSettings> overTimeSettings;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        private Data(Builder builder) {
            this.alertEnabled = builder.alertEnabled;
            this.alertMarginThreshold = builder.alertMarginThreshold;
            this.alertSettings = builder.alertSettings;
            this.baselineId = builder.baselineId;
            this.baselineName = builder.baselineName;
            this.baselineType = builder.baselineType;
            this.enabled = builder.enabled;
            this.nodeIds = builder.nodeIds;
            this.overTimeSettings = builder.overTimeSettings;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
        public java.util.List<Long> getNodeIds() {
            return this.nodeIds;
        }

        /**
         * @return overTimeSettings
         */
        public java.util.List<OverTimeSettings> getOverTimeSettings() {
            return this.overTimeSettings;
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

        public static final class Builder {
            private Boolean alertEnabled; 
            private Integer alertMarginThreshold; 
            private java.util.List<AlertSettings> alertSettings; 
            private Long baselineId; 
            private String baselineName; 
            private String baselineType; 
            private Boolean enabled; 
            private java.util.List<Long> nodeIds; 
            private java.util.List<OverTimeSettings> overTimeSettings; 
            private String owner; 
            private Integer priority; 
            private Long projectId; 

            /**
             * AlertEnabled.
             */
            public Builder alertEnabled(Boolean alertEnabled) {
                this.alertEnabled = alertEnabled;
                return this;
            }

            /**
             * AlertMarginThreshold.
             */
            public Builder alertMarginThreshold(Integer alertMarginThreshold) {
                this.alertMarginThreshold = alertMarginThreshold;
                return this;
            }

            /**
             * <p>The alert settings.</p>
             */
            public Builder alertSettings(java.util.List<AlertSettings> alertSettings) {
                this.alertSettings = alertSettings;
                return this;
            }

            /**
             * BaselineId.
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * BaselineName.
             */
            public Builder baselineName(String baselineName) {
                this.baselineName = baselineName;
                return this;
            }

            /**
             * BaselineType.
             */
            public Builder baselineType(String baselineType) {
                this.baselineType = baselineType;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * NodeIds.
             */
            public Builder nodeIds(java.util.List<Long> nodeIds) {
                this.nodeIds = nodeIds;
                return this;
            }

            /**
             * OverTimeSettings.
             */
            public Builder overTimeSettings(java.util.List<OverTimeSettings> overTimeSettings) {
                this.overTimeSettings = overTimeSettings;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
