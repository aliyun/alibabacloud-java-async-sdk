// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetAlertRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlertRuleResponseBody</p>
 */
public class GetAlertRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertRule")
    private AlertRule alertRule;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAlertRuleResponseBody(Builder builder) {
        this.alertRule = builder.alertRule;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlertRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertRule
     */
    public AlertRule getAlertRule() {
        return this.alertRule;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AlertRule alertRule; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAlertRuleResponseBody model) {
            this.alertRule = model.alertRule;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the custom alert rule.</p>
         */
        public Builder alertRule(AlertRule alertRule) {
            this.alertRule = alertRule;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>8abcb91f-d266-4073-b907-2ed****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAlertRuleResponseBody build() {
            return new GetAlertRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertRuleResponseBody</p>
     */
    public static class Receivers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("ReceiverType")
        private String receiverType;

        @com.aliyun.core.annotation.NameInMap("ReceiverValues")
        private java.util.List<String> receiverValues;

        private Receivers(Builder builder) {
            this.extension = builder.extension;
            this.receiverType = builder.receiverType;
            this.receiverValues = builder.receiverValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Receivers create() {
            return builder().build();
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return receiverType
         */
        public String getReceiverType() {
            return this.receiverType;
        }

        /**
         * @return receiverValues
         */
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

        public static final class Builder {
            private String extension; 
            private String receiverType; 
            private java.util.List<String> receiverValues; 

            private Builder() {
            } 

            private Builder(Receivers model) {
                this.extension = model.extension;
                this.receiverType = model.receiverType;
                this.receiverValues = model.receiverValues;
            } 

            /**
             * <p>The additional configuration required by the alert recipient. If ReceiverType is DingdingUrl, you can set {&quot;atAll&quot;:true} to @ all members.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;atAll&quot;:true}</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The type of the alert recipient. Valid values:</p>
             * <ul>
             * <li>AliUid: Alibaba Cloud UID.</li>
             * <li>ShiftSchedule: shift schedule.</li>
             * <li>TaskOwner: node owner. Applicable to custom alerting and event alerting.</li>
             * <li>Owner: owner. Applicable to baseline alerting.</li>
             * <li>WebhookUrl: custom webhook URL.</li>
             * <li>DingdingUrl: DingTalk webhook URL.</li>
             * <li>FeishuUrl: Lark webhook URL.</li>
             * <li>WeixinUrl: WeChat webhook URL.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WebhookUrl</p>
             */
            public Builder receiverType(String receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            /**
             * <p>The values of the alert recipient.</p>
             */
            public Builder receiverValues(java.util.List<String> receiverValues) {
                this.receiverValues = receiverValues;
                return this;
            }

            public Receivers build() {
                return new Receivers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertRuleResponseBody</p>
     */
    public static class Notification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channels")
        private java.util.List<String> channels;

        @com.aliyun.core.annotation.NameInMap("IntervalInMinutes")
        private Integer intervalInMinutes;

        @com.aliyun.core.annotation.NameInMap("Maximum")
        private Integer maximum;

        @com.aliyun.core.annotation.NameInMap("Receivers")
        private java.util.List<Receivers> receivers;

        @com.aliyun.core.annotation.NameInMap("SilenceEndTime")
        private String silenceEndTime;

        @com.aliyun.core.annotation.NameInMap("SilenceStartTime")
        private String silenceStartTime;

        private Notification(Builder builder) {
            this.channels = builder.channels;
            this.intervalInMinutes = builder.intervalInMinutes;
            this.maximum = builder.maximum;
            this.receivers = builder.receivers;
            this.silenceEndTime = builder.silenceEndTime;
            this.silenceStartTime = builder.silenceStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Notification create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        /**
         * @return intervalInMinutes
         */
        public Integer getIntervalInMinutes() {
            return this.intervalInMinutes;
        }

        /**
         * @return maximum
         */
        public Integer getMaximum() {
            return this.maximum;
        }

        /**
         * @return receivers
         */
        public java.util.List<Receivers> getReceivers() {
            return this.receivers;
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

        public static final class Builder {
            private java.util.List<String> channels; 
            private Integer intervalInMinutes; 
            private Integer maximum; 
            private java.util.List<Receivers> receivers; 
            private String silenceEndTime; 
            private String silenceStartTime; 

            private Builder() {
            } 

            private Builder(Notification model) {
                this.channels = model.channels;
                this.intervalInMinutes = model.intervalInMinutes;
                this.maximum = model.maximum;
                this.receivers = model.receivers;
                this.silenceEndTime = model.silenceEndTime;
                this.silenceStartTime = model.silenceStartTime;
            } 

            /**
             * <p>The list of alert channels.</p>
             */
            public Builder channels(java.util.List<String> channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The alert interval, in minutes. Valid values: 5 to 10000.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder intervalInMinutes(Integer intervalInMinutes) {
                this.intervalInMinutes = intervalInMinutes;
                return this;
            }

            /**
             * <p>The maximum number of alerts within a calendar day. Valid values: 1 to 10000.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maximum(Integer maximum) {
                this.maximum = maximum;
                return this;
            }

            /**
             * <p>The alert recipients.</p>
             */
            public Builder receivers(java.util.List<Receivers> receivers) {
                this.receivers = receivers;
                return this;
            }

            /**
             * <p>The end time of the mute period. Format: HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder silenceEndTime(String silenceEndTime) {
                this.silenceEndTime = silenceEndTime;
                return this;
            }

            /**
             * <p>The start time of the mute period. Format: HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder silenceStartTime(String silenceStartTime) {
                this.silenceStartTime = silenceStartTime;
                return this;
            }

            public Notification build() {
                return new Notification(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertRuleResponseBody</p>
     */
    public static class CycleAndTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleId")
        private Integer cycleId;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private CycleAndTime(Builder builder) {
            this.cycleId = builder.cycleId;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CycleAndTime create() {
            return builder().build();
        }

        /**
         * @return cycleId
         */
        public Integer getCycleId() {
            return this.cycleId;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private Integer cycleId; 
            private String time; 

            private Builder() {
            } 

            private Builder(CycleAndTime model) {
                this.cycleId = model.cycleId;
                this.time = model.time;
            } 

            /**
             * <p>The cycle ID. Valid values: 1 to 288.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cycleId(Integer cycleId) {
                this.cycleId = cycleId;
                return this;
            }

            /**
             * <p>The timeout time. Format: hh:mm. Valid values of hh: 0 to 47. Valid values of mm: 0 to 59.</p>
             * 
             * <strong>example:</strong>
             * <p>12:00</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public CycleAndTime build() {
                return new CycleAndTime(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertRuleResponseBody</p>
     */
    public static class CycleUnfinished extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleAndTime")
        private java.util.List<CycleAndTime> cycleAndTime;

        private CycleUnfinished(Builder builder) {
            this.cycleAndTime = builder.cycleAndTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CycleUnfinished create() {
            return builder().build();
        }

        /**
         * @return cycleAndTime
         */
        public java.util.List<CycleAndTime> getCycleAndTime() {
            return this.cycleAndTime;
        }

        public static final class Builder {
            private java.util.List<CycleAndTime> cycleAndTime; 

            private Builder() {
            } 

            private Builder(CycleUnfinished model) {
                this.cycleAndTime = model.cycleAndTime;
            } 

            /**
             * <p>The list of cycle and time configurations.</p>
             */
            public Builder cycleAndTime(java.util.List<CycleAndTime> cycleAndTime) {
                this.cycleAndTime = cycleAndTime;
                return this;
            }

            public CycleUnfinished build() {
                return new CycleUnfinished(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertRuleResponseBody</p>
     */
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRerunAlertEnabled")
        private Boolean autoRerunAlertEnabled;

        @com.aliyun.core.annotation.NameInMap("StreamTaskIds")
        private java.util.List<Long> streamTaskIds;

        private Error(Builder builder) {
            this.autoRerunAlertEnabled = builder.autoRerunAlertEnabled;
            this.streamTaskIds = builder.streamTaskIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
            return builder().build();
        }

        /**
         * @return autoRerunAlertEnabled
         */
        public Boolean getAutoRerunAlertEnabled() {
            return this.autoRerunAlertEnabled;
        }

        /**
         * @return streamTaskIds
         */
        public java.util.List<Long> getStreamTaskIds() {
            return this.streamTaskIds;
        }

        public static final class Builder {
            private Boolean autoRerunAlertEnabled; 
            private java.util.List<Long> streamTaskIds; 

            private Builder() {
            } 

            private Builder(Error model) {
                this.autoRerunAlertEnabled = model.autoRerunAlertEnabled;
                this.streamTaskIds = model.streamTaskIds;
            } 

            /**
             * <p>Specifies whether to generate an alert when a batch task is automatically rerun due to a failure.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRerunAlertEnabled(Boolean autoRerunAlertEnabled) {
                this.autoRerunAlertEnabled = autoRerunAlertEnabled;
                return this;
            }

            /**
             * <p>The IDs of real-time computing nodes to monitor.</p>
             */
            public Builder streamTaskIds(java.util.List<Long> streamTaskIds) {
                this.streamTaskIds = streamTaskIds;
                return this;
            }

            public Error build() {
                return new Error(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertRuleResponseBody</p>
     */
    public static class InstanceErrorCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        private InstanceErrorCount(Builder builder) {
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceErrorCount create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        public static final class Builder {
            private Integer count; 

            private Builder() {
            } 

            private Builder(InstanceErrorCount model) {
                this.count = model.count;
            } 

            /**
             * <p>The number of failed instances. Valid values: 1 to 10000.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            public InstanceErrorCount build() {
                return new InstanceErrorCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertRuleResponseBody</p>
     */
    public static class InstanceErrorPercentage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Integer percentage;

        private InstanceErrorPercentage(Builder builder) {
            this.percentage = builder.percentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceErrorPercentage create() {
            return builder().build();
        }

        /**
         * @return percentage
         */
        public Integer getPercentage() {
            return this.percentage;
        }

        public static final class Builder {
            private Integer percentage; 

            private Builder() {
            } 

            private Builder(InstanceErrorPercentage model) {
                this.percentage = model.percentage;
            } 

            /**
             * <p>The percentage of failed instances. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            public InstanceErrorPercentage build() {
                return new InstanceErrorPercentage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertRuleResponseBody</p>
     */
    public static class InstanceTransferFluctuate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Integer percentage;

        @com.aliyun.core.annotation.NameInMap("Trend")
        private String trend;

        private InstanceTransferFluctuate(Builder builder) {
            this.percentage = builder.percentage;
            this.trend = builder.trend;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTransferFluctuate create() {
            return builder().build();
        }

        /**
         * @return percentage
         */
        public Integer getPercentage() {
            return this.percentage;
        }

        /**
         * @return trend
         */
        public String getTrend() {
            return this.trend;
        }

        public static final class Builder {
            private Integer percentage; 
            private String trend; 

            private Builder() {
            } 

            private Builder(InstanceTransferFluctuate model) {
                this.percentage = model.percentage;
                this.trend = model.trend;
            } 

            /**
             * <p>The fluctuation percentage. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * <p>The fluctuation type. Valid values:</p>
             * <ul>
             * <li>abs: absolute value.</li>
             * <li>increase: increase.</li>
             * <li>decrease: decrease.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder trend(String trend) {
                this.trend = trend;
                return this;
            }

            public InstanceTransferFluctuate build() {
                return new InstanceTransferFluctuate(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertRuleResponseBody</p>
     */
    public static class Timeout extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeoutInMinutes")
        private Integer timeoutInMinutes;

        private Timeout(Builder builder) {
            this.timeoutInMinutes = builder.timeoutInMinutes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Timeout create() {
            return builder().build();
        }

        /**
         * @return timeoutInMinutes
         */
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

        public static final class Builder {
            private Integer timeoutInMinutes; 

            private Builder() {
            } 

            private Builder(Timeout model) {
                this.timeoutInMinutes = model.timeoutInMinutes;
            } 

            /**
             * <p>The timeout duration, in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder timeoutInMinutes(Integer timeoutInMinutes) {
                this.timeoutInMinutes = timeoutInMinutes;
                return this;
            }

            public Timeout build() {
                return new Timeout(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertRuleResponseBody</p>
     */
    public static class UnFinished extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UnFinishedTime")
        private String unFinishedTime;

        private UnFinished(Builder builder) {
            this.unFinishedTime = builder.unFinishedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnFinished create() {
            return builder().build();
        }

        /**
         * @return unFinishedTime
         */
        public String getUnFinishedTime() {
            return this.unFinishedTime;
        }

        public static final class Builder {
            private String unFinishedTime; 

            private Builder() {
            } 

            private Builder(UnFinished model) {
                this.unFinishedTime = model.unFinishedTime;
            } 

            /**
             * <p>The not-completed time. Format: hh:mm. Valid values of hh: 0 to 47. Valid values of mm: 0 to 59.</p>
             * 
             * <strong>example:</strong>
             * <p>12:00</p>
             */
            public Builder unFinishedTime(String unFinishedTime) {
                this.unFinishedTime = unFinishedTime;
                return this;
            }

            public UnFinished build() {
                return new UnFinished(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertRuleResponseBody</p>
     */
    public static class Extension extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleUnfinished")
        private CycleUnfinished cycleUnfinished;

        @com.aliyun.core.annotation.NameInMap("Error")
        private Error error;

        @com.aliyun.core.annotation.NameInMap("InstanceErrorCount")
        private InstanceErrorCount instanceErrorCount;

        @com.aliyun.core.annotation.NameInMap("InstanceErrorPercentage")
        private InstanceErrorPercentage instanceErrorPercentage;

        @com.aliyun.core.annotation.NameInMap("InstanceTransferFluctuate")
        private InstanceTransferFluctuate instanceTransferFluctuate;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Timeout timeout;

        @com.aliyun.core.annotation.NameInMap("UnFinished")
        private UnFinished unFinished;

        private Extension(Builder builder) {
            this.cycleUnfinished = builder.cycleUnfinished;
            this.error = builder.error;
            this.instanceErrorCount = builder.instanceErrorCount;
            this.instanceErrorPercentage = builder.instanceErrorPercentage;
            this.instanceTransferFluctuate = builder.instanceTransferFluctuate;
            this.timeout = builder.timeout;
            this.unFinished = builder.unFinished;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extension create() {
            return builder().build();
        }

        /**
         * @return cycleUnfinished
         */
        public CycleUnfinished getCycleUnfinished() {
            return this.cycleUnfinished;
        }

        /**
         * @return error
         */
        public Error getError() {
            return this.error;
        }

        /**
         * @return instanceErrorCount
         */
        public InstanceErrorCount getInstanceErrorCount() {
            return this.instanceErrorCount;
        }

        /**
         * @return instanceErrorPercentage
         */
        public InstanceErrorPercentage getInstanceErrorPercentage() {
            return this.instanceErrorPercentage;
        }

        /**
         * @return instanceTransferFluctuate
         */
        public InstanceTransferFluctuate getInstanceTransferFluctuate() {
            return this.instanceTransferFluctuate;
        }

        /**
         * @return timeout
         */
        public Timeout getTimeout() {
            return this.timeout;
        }

        /**
         * @return unFinished
         */
        public UnFinished getUnFinished() {
            return this.unFinished;
        }

        public static final class Builder {
            private CycleUnfinished cycleUnfinished; 
            private Error error; 
            private InstanceErrorCount instanceErrorCount; 
            private InstanceErrorPercentage instanceErrorPercentage; 
            private InstanceTransferFluctuate instanceTransferFluctuate; 
            private Timeout timeout; 
            private UnFinished unFinished; 

            private Builder() {
            } 

            private Builder(Extension model) {
                this.cycleUnfinished = model.cycleUnfinished;
                this.error = model.error;
                this.instanceErrorCount = model.instanceErrorCount;
                this.instanceErrorPercentage = model.instanceErrorPercentage;
                this.instanceTransferFluctuate = model.instanceTransferFluctuate;
                this.timeout = model.timeout;
                this.unFinished = model.unFinished;
            } 

            /**
             * <p>The cycle-not-completed alert configuration.</p>
             */
            public Builder cycleUnfinished(CycleUnfinished cycleUnfinished) {
                this.cycleUnfinished = cycleUnfinished;
                return this;
            }

            /**
             * <p>The error alert configuration.</p>
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The instance error count alert configuration.</p>
             */
            public Builder instanceErrorCount(InstanceErrorCount instanceErrorCount) {
                this.instanceErrorCount = instanceErrorCount;
                return this;
            }

            /**
             * <p>The instance error percentage alert configuration.</p>
             */
            public Builder instanceErrorPercentage(InstanceErrorPercentage instanceErrorPercentage) {
                this.instanceErrorPercentage = instanceErrorPercentage;
                return this;
            }

            /**
             * <p>The instance count fluctuation alert configuration.</p>
             */
            public Builder instanceTransferFluctuate(InstanceTransferFluctuate instanceTransferFluctuate) {
                this.instanceTransferFluctuate = instanceTransferFluctuate;
                return this;
            }

            /**
             * <p>The timeout alert configuration.</p>
             */
            public Builder timeout(Timeout timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The not-completed alert configuration.</p>
             */
            public Builder unFinished(UnFinished unFinished) {
                this.unFinished = unFinished;
                return this;
            }

            public Extension build() {
                return new Extension(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertRuleResponseBody</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowTasks")
        private java.util.List<Long> allowTasks;

        @com.aliyun.core.annotation.NameInMap("Ids")
        private java.util.List<Long> ids;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Target(Builder builder) {
            this.allowTasks = builder.allowTasks;
            this.ids = builder.ids;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return allowTasks
         */
        public java.util.List<Long> getAllowTasks() {
            return this.allowTasks;
        }

        /**
         * @return ids
         */
        public java.util.List<Long> getIds() {
            return this.ids;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Long> allowTasks; 
            private java.util.List<Long> ids; 
            private String type; 

            private Builder() {
            } 

            private Builder(Target model) {
                this.allowTasks = model.allowTasks;
                this.ids = model.ids;
                this.type = model.type;
            } 

            /**
             * <p>The whitelist of monitored nodes.</p>
             */
            public Builder allowTasks(java.util.List<Long> allowTasks) {
                this.allowTasks = allowTasks;
                return this;
            }

            /**
             * <p>The list of monitored object IDs.</p>
             */
            public Builder ids(java.util.List<Long> ids) {
                this.ids = ids;
                return this;
            }

            /**
             * <p>The monitored object type. Valid values:</p>
             * <ul>
             * <li>Task: node.</li>
             * <li>Baseline: baseline.</li>
             * <li>Project: workspace.</li>
             * <li>BizProcess: business process flow.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Task</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertRuleResponseBody</p>
     */
    public static class TriggerCondition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extension")
        private Extension extension;

        @com.aliyun.core.annotation.NameInMap("Target")
        private Target target;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TriggerCondition(Builder builder) {
            this.extension = builder.extension;
            this.target = builder.target;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TriggerCondition create() {
            return builder().build();
        }

        /**
         * @return extension
         */
        public Extension getExtension() {
            return this.extension;
        }

        /**
         * @return target
         */
        public Target getTarget() {
            return this.target;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Extension extension; 
            private Target target; 
            private String type; 

            private Builder() {
            } 

            private Builder(TriggerCondition model) {
                this.extension = model.extension;
                this.target = model.target;
                this.type = model.type;
            } 

            /**
             * <p>The extension information. Required for certain trigger conditions.</p>
             */
            public Builder extension(Extension extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The monitored object.</p>
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The type of the alert trigger. Valid values:</p>
             * <ul>
             * <li>Finished: instance completed.</li>
             * <li>UnFinished: instance not completed.</li>
             * <li>Error: instance failed.</li>
             * <li>CycleUnfinished: instance cycle not completed.</li>
             * <li>Timeout: instance timed out.</li>
             * <li>InstanceTransferComplete: node-to-instance conversion completed.</li>
             * <li>InstanceTransferFluctuate: instance count fluctuation.</li>
             * <li>ExhaustedError: instance still failed after automatic reruns.</li>
             * <li>InstanceKeyword: failed instance contains keyword.</li>
             * <li>InstanceErrorCount: number of failed instances.</li>
             * <li>InstanceErrorPercentage: percentage of failed instances.</li>
             * <li>ResourceGroupPercentage: schedule resource utilization.</li>
             * <li>ResourceGroupWaitCount: number of instances waiting for schedule resources.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Error</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TriggerCondition build() {
                return new TriggerCondition(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertRuleResponseBody</p>
     */
    public static class AlertRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Notification")
        private Notification notification;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("TriggerCondition")
        private TriggerCondition triggerCondition;

        private AlertRule(Builder builder) {
            this.enabled = builder.enabled;
            this.id = builder.id;
            this.name = builder.name;
            this.notification = builder.notification;
            this.owner = builder.owner;
            this.triggerCondition = builder.triggerCondition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertRule create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return notification
         */
        public Notification getNotification() {
            return this.notification;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return triggerCondition
         */
        public TriggerCondition getTriggerCondition() {
            return this.triggerCondition;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Long id; 
            private String name; 
            private Notification notification; 
            private String owner; 
            private TriggerCondition triggerCondition; 

            private Builder() {
            } 

            private Builder(AlertRule model) {
                this.enabled = model.enabled;
                this.id = model.id;
                this.name = model.name;
                this.notification = model.notification;
                this.owner = model.owner;
                this.triggerCondition = model.triggerCondition;
            } 

            /**
             * <p>Indicates whether the alert rule is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The ID of the custom alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>16035</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the custom alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>error_rule</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The alert notification configuration.</p>
             */
            public Builder notification(Notification notification) {
                this.notification = notification;
                return this;
            }

            /**
             * <p>The Alibaba Cloud UID of the owner of the custom alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>279961421580845157</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The condition that triggers the alert.</p>
             */
            public Builder triggerCondition(TriggerCondition triggerCondition) {
                this.triggerCondition = triggerCondition;
                return this;
            }

            public AlertRule build() {
                return new AlertRule(this);
            } 

        } 

    }
}
