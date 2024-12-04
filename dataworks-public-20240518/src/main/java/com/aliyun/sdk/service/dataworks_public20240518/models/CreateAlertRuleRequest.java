// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAlertRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateAlertRuleRequest</p>
 */
public class CreateAlertRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String owner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerCondition")
    @com.aliyun.core.annotation.Validation(required = true)
    private TriggerCondition triggerCondition;

    private CreateAlertRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.enabled = builder.enabled;
        this.name = builder.name;
        this.notification = builder.notification;
        this.owner = builder.owner;
        this.triggerCondition = builder.triggerCondition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertRuleRequest create() {
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
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
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

    public static final class Builder extends Request.Builder<CreateAlertRuleRequest, Builder> {
        private String regionId; 
        private Boolean enabled; 
        private String name; 
        private Notification notification; 
        private String owner; 
        private TriggerCondition triggerCondition; 

        private Builder() {
            super();
        } 

        private Builder(CreateAlertRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.enabled = request.enabled;
            this.name = request.name;
            this.notification = request.notification;
            this.owner = request.owner;
            this.triggerCondition = request.triggerCondition;
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
         * <p>Indicates whether the rule is enabled.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xm_create_test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The configuration for the alert notification.</p>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account used by the creator of the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>279114181716147735</p>
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The conditions for triggering the alert.</p>
         * <p>This parameter is required.</p>
         */
        public Builder triggerCondition(TriggerCondition triggerCondition) {
            String triggerConditionShrink = shrink(triggerCondition, "TriggerCondition", "json");
            this.putQueryParameter("TriggerCondition", triggerConditionShrink);
            this.triggerCondition = triggerCondition;
            return this;
        }

        @Override
        public CreateAlertRuleRequest build() {
            return new CreateAlertRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertRuleRequest</p>
     */
    public static class Receivers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("ReceiverType")
        private String receiverType;

        @com.aliyun.core.annotation.NameInMap("ReceiverValues")
        private java.util.List < String > receiverValues;

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
        public java.util.List < String > getReceiverValues() {
            return this.receiverValues;
        }

        public static final class Builder {
            private String extension; 
            private String receiverType; 
            private java.util.List < String > receiverValues; 

            /**
             * <p>The additional configuration of the alert recipient. If the ReceiverType parameter is set to DingdingUrl, you can set this parameter to {&quot;atAll&quot;:true} to remind all members in a DingTalk group.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;atAll&quot;:true}</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The type of the alert recipient. Valid valves:</p>
             * <ul>
             * <li>AliUid: Alibaba Cloud account ID.</li>
             * <li>Shift Schedules: The personnel in a shift schedule.</li>
             * <li>TaskOwner: The node owner. This parameter is available for custom alerts and event alerts.</li>
             * <li>Owner: The baseline owner. This parameter is available for baseline alerts.</li>
             * <li>WebhookUrl: URL of a custom webhook.</li>
             * <li>DingdingUrl: DingTalk chatbot URL.</li>
             * <li>FeishuUrl: Lark chatbot URL.</li>
             * <li>WeixinUrl: WeCom chatbot URL.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TaskOwner</p>
             */
            public Builder receiverType(String receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            /**
             * <p>The IDs of the alert recipients.</p>
             */
            public Builder receiverValues(java.util.List < String > receiverValues) {
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
     * {@link CreateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertRuleRequest</p>
     */
    public static class Notification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channels")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > channels;

        @com.aliyun.core.annotation.NameInMap("IntervalInMinutes")
        private Integer intervalInMinutes;

        @com.aliyun.core.annotation.NameInMap("Maximum")
        private Integer maximum;

        @com.aliyun.core.annotation.NameInMap("Receivers")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < Receivers> receivers;

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
        public java.util.List < String > getChannels() {
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
        public java.util.List < Receivers> getReceivers() {
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
            private java.util.List < String > channels; 
            private Integer intervalInMinutes; 
            private Integer maximum; 
            private java.util.List < Receivers> receivers; 
            private String silenceEndTime; 
            private String silenceStartTime; 

            /**
             * <p>The alert channels.</p>
             * <p>This parameter is required.</p>
             */
            public Builder channels(java.util.List < String > channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The interval at which an alert notification is sent. Unit: minutes. Valid values: 5 to 10,000.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder intervalInMinutes(Integer intervalInMinutes) {
                this.intervalInMinutes = intervalInMinutes;
                return this;
            }

            /**
             * <p>The maximum number of times an alert notification is sent within one calendar day. Valid values: 1 to 10,000.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maximum(Integer maximum) {
                this.maximum = maximum;
                return this;
            }

            /**
             * <p>The alert recipient.</p>
             * <p>This parameter is required.</p>
             */
            public Builder receivers(java.util.List < Receivers> receivers) {
                this.receivers = receivers;
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

            public Notification build() {
                return new Notification(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertRuleRequest</p>
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

            /**
             * <p>The ID of the scheduling cycle of the instance. Valid values: 1 to 288.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cycleId(Integer cycleId) {
                this.cycleId = cycleId;
                return this;
            }

            /**
             * <p>The timeout period of instance running. The time is in the hh:mm format. Valid values of hh: 0 to 47. Valid values of mm: 0 to 59.</p>
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
     * {@link CreateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertRuleRequest</p>
     */
    public static class CycleUnfinished extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleAndTime")
        private java.util.List < CycleAndTime> cycleAndTime;

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
        public java.util.List < CycleAndTime> getCycleAndTime() {
            return this.cycleAndTime;
        }

        public static final class Builder {
            private java.util.List < CycleAndTime> cycleAndTime; 

            /**
             * <p>The configurations of the scheduling cycle and timeout period of the instance.</p>
             */
            public Builder cycleAndTime(java.util.List < CycleAndTime> cycleAndTime) {
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
     * {@link CreateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertRuleRequest</p>
     */
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRerunAlert")
        private Boolean autoRerunAlert;

        @com.aliyun.core.annotation.NameInMap("StreamTaskIds")
        private java.util.List < Long > streamTaskIds;

        private Error(Builder builder) {
            this.autoRerunAlert = builder.autoRerunAlert;
            this.streamTaskIds = builder.streamTaskIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
            return builder().build();
        }

        /**
         * @return autoRerunAlert
         */
        public Boolean getAutoRerunAlert() {
            return this.autoRerunAlert;
        }

        /**
         * @return streamTaskIds
         */
        public java.util.List < Long > getStreamTaskIds() {
            return this.streamTaskIds;
        }

        public static final class Builder {
            private Boolean autoRerunAlert; 
            private java.util.List < Long > streamTaskIds; 

            /**
             * <p>Indicates whether an alert is triggered if a batch synchronization task is rerun after it fails to run as expected.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRerunAlert(Boolean autoRerunAlert) {
                this.autoRerunAlert = autoRerunAlert;
                return this;
            }

            /**
             * <p>The IDs of the real-time computing tasks. This parameter is required when you monitor real-time computing tasks.</p>
             */
            public Builder streamTaskIds(java.util.List < Long > streamTaskIds) {
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
     * {@link CreateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertRuleRequest</p>
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

            /**
             * <p>The number of instances on which an error occurs. Valid values: 1 to 10,000.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
     * {@link CreateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertRuleRequest</p>
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

            /**
             * <p>The percentage of the number of instances on which an error occurs in the workspace to the total number of instances on the current day. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
     * {@link CreateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertRuleRequest</p>
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

            /**
             * <p>The percentage of fluctuation in the number of auto triggered node instances that are generated in your workspace. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * <p>The way in which the number of auto triggered node instances that are generated in your workspace significantly fluctuates. Valid values:</p>
             * <ul>
             * <li>abs: The number of instances increases or decreases.</li>
             * <li>increase: The number of instances increases.</li>
             * <li>decrease: The number of instances decreases.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>abs</p>
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
     * {@link CreateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertRuleRequest</p>
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

            /**
             * <p>The timeout period. Unit: minutes. Valid values: 1 to 21,600.</p>
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
     * {@link CreateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertRuleRequest</p>
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

            /**
             * <p>The timeout period of the instance that is still running at a specified point in time. The time is in the hh:mm format. Valid values of hh: 0 to 47. Valid values of mm: 0 to 59.</p>
             * 
             * <strong>example:</strong>
             * <p>30:00</p>
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
     * {@link CreateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertRuleRequest</p>
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

            /**
             * <p>The alert configuration. This parameter takes effect only if the Type parameter is set to CycleUnfinished.</p>
             */
            public Builder cycleUnfinished(CycleUnfinished cycleUnfinished) {
                this.cycleUnfinished = cycleUnfinished;
                return this;
            }

            /**
             * <p>The alert configuration. This parameter takes effect only if the Type parameter is set to Error.</p>
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The alert configuration. This parameter takes effect only if the Type parameter is set to InstanceErrorCount.</p>
             */
            public Builder instanceErrorCount(InstanceErrorCount instanceErrorCount) {
                this.instanceErrorCount = instanceErrorCount;
                return this;
            }

            /**
             * <p>The alert configuration. This parameter takes effect only if the Type parameter is set to InstanceErrorPercentage.</p>
             */
            public Builder instanceErrorPercentage(InstanceErrorPercentage instanceErrorPercentage) {
                this.instanceErrorPercentage = instanceErrorPercentage;
                return this;
            }

            /**
             * <p>The alert configuration. This parameter takes effect only if the Type parameter is set to InstanceTransferFluctuate.</p>
             */
            public Builder instanceTransferFluctuate(InstanceTransferFluctuate instanceTransferFluctuate) {
                this.instanceTransferFluctuate = instanceTransferFluctuate;
                return this;
            }

            /**
             * <p>The alert configuration. This parameter takes effect only if the Type parameter is set to Timeout.</p>
             */
            public Builder timeout(Timeout timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The alert configuration. This parameter takes effect only if the Type parameter is set to UnFinished.</p>
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
     * {@link CreateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertRuleRequest</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowTasks")
        private java.util.List < Long > allowTasks;

        @com.aliyun.core.annotation.NameInMap("Ids")
        private java.util.List < Long > ids;

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
        public java.util.List < Long > getAllowTasks() {
            return this.allowTasks;
        }

        /**
         * @return ids
         */
        public java.util.List < Long > getIds() {
            return this.ids;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < Long > allowTasks; 
            private java.util.List < Long > ids; 
            private String type; 

            /**
             * <p>The whitelists of the monitoring tasks.</p>
             */
            public Builder allowTasks(java.util.List < Long > allowTasks) {
                this.allowTasks = allowTasks;
                return this;
            }

            /**
             * <p>The IDs of monitored objects.</p>
             */
            public Builder ids(java.util.List < Long > ids) {
                this.ids = ids;
                return this;
            }

            /**
             * <p>The type of the monitored object. Valid values:</p>
             * <ul>
             * <li>Task: node</li>
             * <li>Baseline: baseline</li>
             * <li>Project: workspace</li>
             * <li>BizProcess: workflow</li>
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
     * {@link CreateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertRuleRequest</p>
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

            /**
             * <p>The extended information about the rule. This parameter is required for some trigger conditions.</p>
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
             * <p>The condition for triggering the alert. Valid values:</p>
             * <ul>
             * <li>Finished: The system sends an alert notification when the instance is successfully run.</li>
             * <li>UnFinished: The system sends an alert notification if the instance is still running at a specified point in time.</li>
             * <li>Error: The system sends an alert notification if an error occurs when the instance is running.</li>
             * <li>CycleUnfinished: The system sends an alert notification if the instance is still running at the end of a specified cycle.</li>
             * <li>Timeout: The system sends an alert notification if the instance is still running after a specified period of time ends.</li>
             * <li>InstanceTransferComplete: The system sends an alert notification if DataWorks generates auto triggered node instances that need to run the next day before 24:00.</li>
             * <li>InstanceTransferFluctuate: The system sends an alert notification when the number of auto triggered node instances that are generated in your workspace significantly fluctuates, in comparison with the average number of auto triggered node instances that are historically generated in the workspace.</li>
             * <li>ExhaustedError: The system sends an alert notification if an error persists after the instance is automatically rerun.</li>
             * <li>InstanceKeyword: The system sends an alert notification if the instance with errors contain specified keywords.</li>
             * <li>InstanceErrorCount: The system sends an alert notification if the number of instances on which an error occurs on the current day reaches a specified threshold.</li>
             * <li>InstanceErrorPercentage: The system sends an alert notification if the proportion of the number of instances on which an error occurs in the workspace to the total number of instances on the current day reaches a specified threshold.</li>
             * <li>ResourceGroupPercentage: The system sends an alert notification if the value of the ResourceGroupPercentage parameter is greater than a specific percentage for a specific period of time.</li>
             * <li>ResourceGroupWaitCount: The system sends an alert notification if the value of the ResourceGroupWaitCount parameter is greater than a specific number for a specific period of time.</li>
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
}
