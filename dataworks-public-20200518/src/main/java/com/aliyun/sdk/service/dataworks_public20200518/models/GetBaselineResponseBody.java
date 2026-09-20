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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetBaselineResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>1031203110005</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameters are invalid</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecb967ec-c137-48a5-860****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

            private Builder() {
            } 

            private Builder(DingRobots model) {
                this.atAll = model.atAll;
                this.webUrl = model.webUrl;
            } 

            /**
             * <p>Indicates whether to @ all members.</p>
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
    public static class TopicSlowConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MinOver")
        private Integer minOver;

        @com.aliyun.core.annotation.NameInMap("OverFactor")
        private Double overFactor;

        private TopicSlowConfig(Builder builder) {
            this.minOver = builder.minOver;
            this.overFactor = builder.overFactor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicSlowConfig create() {
            return builder().build();
        }

        /**
         * @return minOver
         */
        public Integer getMinOver() {
            return this.minOver;
        }

        /**
         * @return overFactor
         */
        public Double getOverFactor() {
            return this.overFactor;
        }

        public static final class Builder {
            private Integer minOver; 
            private Double overFactor; 

            private Builder() {
            } 

            private Builder(TopicSlowConfig model) {
                this.minOver = model.minOver;
                this.overFactor = model.overFactor;
            } 

            /**
             * MinOver.
             */
            public Builder minOver(Integer minOver) {
                this.minOver = minOver;
                return this;
            }

            /**
             * OverFactor.
             */
            public Builder overFactor(Double overFactor) {
                this.overFactor = overFactor;
                return this;
            }

            public TopicSlowConfig build() {
                return new TopicSlowConfig(this);
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

        @com.aliyun.core.annotation.NameInMap("TopicSlowConfig")
        private TopicSlowConfig topicSlowConfig;

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
            this.topicSlowConfig = builder.topicSlowConfig;
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
         * @return topicSlowConfig
         */
        public TopicSlowConfig getTopicSlowConfig() {
            return this.topicSlowConfig;
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
            private TopicSlowConfig topicSlowConfig; 
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
                this.topicSlowConfig = model.topicSlowConfig;
                this.topicTypes = model.topicTypes;
                this.webhooks = model.webhooks;
            } 

            /**
             * <p>The event alerting interval, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder alertInterval(Integer alertInterval) {
                this.alertInterval = alertInterval;
                return this;
            }

            /**
             * <p>The maximum number of event alerting notifications.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alertMaximum(Integer alertMaximum) {
                this.alertMaximum = alertMaximum;
                return this;
            }

            /**
             * <p>The list of alert methods.</p>
             */
            public Builder alertMethods(java.util.List<String> alertMethods) {
                this.alertMethods = alertMethods;
                return this;
            }

            /**
             * <p>The alert recipient details.</p>
             * <ul>
             * <li>If AlertRecipientType is set to OWNER: empty.</li>
             * <li>If AlertRecipientType is set to SHIFT_SCHEDULE: the UID of the shift schedule.</li>
             * <li>If AlertRecipientType is set to OTHER: a list of UIDs. Separate multiple UIDs with commas (,).</li>
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
             * <p>The type of alert recipient. Valid values:</p>
             * <ul>
             * <li>OWNER: node owner.</li>
             * <li>OTHER: specified users.</li>
             * <li>SHIFT_SCHEDULE: shift schedule.</li>
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
             * <p>The alerting type. Valid values:</p>
             * <ul>
             * <li>BASELINE: baseline.</li>
             * <li>TOPIC: event.</li>
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
             * <p>The baseline alert switch. This is a baseline-specific configuration. Valid values:</p>
             * <ul>
             * <li>true: started.</li>
             * <li>false: stopped.</li>
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
             * <p>The list of DingTalk chatbots.</p>
             */
            public Builder dingRobots(java.util.List<DingRobots> dingRobots) {
                this.dingRobots = dingRobots;
                return this;
            }

            /**
             * <p>The silence end time, in the HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder silenceEndTime(String silenceEndTime) {
                this.silenceEndTime = silenceEndTime;
                return this;
            }

            /**
             * <p>The silence start time, in the HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder silenceStartTime(String silenceStartTime) {
                this.silenceStartTime = silenceStartTime;
                return this;
            }

            /**
             * TopicSlowConfig.
             */
            public Builder topicSlowConfig(TopicSlowConfig topicSlowConfig) {
                this.topicSlowConfig = topicSlowConfig;
                return this;
            }

            /**
             * <p>The list of event alerting types. This is an event-specific configuration.</p>
             */
            public Builder topicTypes(java.util.List<String> topicTypes) {
                this.topicTypes = topicTypes;
                return this;
            }

            /**
             * <p>The list of webhooks.</p>
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

            private Builder() {
            } 

            private Builder(OverTimeSettings model) {
                this.cycle = model.cycle;
                this.time = model.time;
            } 

            /**
             * <p>The cycle corresponding to the committed time. The value is 1 for daily baselines. You can configure up to 24 cycles for hourly baselines.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cycle(Integer cycle) {
                this.cycle = cycle;
                return this;
            }

            /**
             * <p>The committed time in hh:mm format, where hh ranges from 0 to 47 and mm ranges from 0 to 59.</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.alertEnabled = model.alertEnabled;
                this.alertMarginThreshold = model.alertMarginThreshold;
                this.alertSettings = model.alertSettings;
                this.baselineId = model.baselineId;
                this.baselineName = model.baselineName;
                this.baselineType = model.baselineType;
                this.enabled = model.enabled;
                this.nodeIds = model.nodeIds;
                this.overTimeSettings = model.overTimeSettings;
                this.owner = model.owner;
                this.priority = model.priority;
                this.projectId = model.projectId;
            } 

            /**
             * <p>Indicates whether alerting is started. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder alertEnabled(Boolean alertEnabled) {
                this.alertEnabled = alertEnabled;
                return this;
            }

            /**
             * <p>The alert margin threshold, in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
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
             * <p>The ID of the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * <p>The name of the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>Test baseline</p>
             */
            public Builder baselineName(String baselineName) {
                this.baselineName = baselineName;
                return this;
            }

            /**
             * <p>The type of the baseline. Valid values:</p>
             * <ul>
             * <li>DAILY: daily baseline.</li>
             * <li>HOURLY: hourly baseline.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DAILY</p>
             */
            public Builder baselineType(String baselineType) {
                this.baselineType = baselineType;
                return this;
            }

            /**
             * <p>Indicates whether the baseline is started.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The list of upstream nodes of the baseline.</p>
             */
            public Builder nodeIds(java.util.List<Long> nodeIds) {
                this.nodeIds = nodeIds;
                return this;
            }

            /**
             * <p>The baseline committed time settings.</p>
             */
            public Builder overTimeSettings(java.util.List<OverTimeSettings> overTimeSettings) {
                this.overTimeSettings = overTimeSettings;
                return this;
            }

            /**
             * <p>The owner.</p>
             * 
             * <strong>example:</strong>
             * <p>9527952****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The priority of the baseline. Valid values: 1, 3, 5, 7, and 8.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
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
