// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAlertRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertRuleRequest</p>
 */
public class UpdateAlertRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerCondition")
    private TriggerCondition triggerCondition;

    private UpdateAlertRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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

    public static UpdateAlertRuleRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateAlertRuleRequest, Builder> {
        private String regionId; 
        private Boolean enabled; 
        private Long id; 
        private String name; 
        private Notification notification; 
        private String owner; 
        private TriggerCondition triggerCondition; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlertRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.enabled = request.enabled;
            this.id = request.id;
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
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Notification.
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * TriggerCondition.
         */
        public Builder triggerCondition(TriggerCondition triggerCondition) {
            String triggerConditionShrink = shrink(triggerCondition, "TriggerCondition", "json");
            this.putQueryParameter("TriggerCondition", triggerConditionShrink);
            this.triggerCondition = triggerCondition;
            return this;
        }

        @Override
        public UpdateAlertRuleRequest build() {
            return new UpdateAlertRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateAlertRuleRequest</p>
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
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * ReceiverType.
             */
            public Builder receiverType(String receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            /**
             * ReceiverValues.
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
     * {@link UpdateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateAlertRuleRequest</p>
     */
    public static class Notification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channels")
        private java.util.List < String > channels;

        @com.aliyun.core.annotation.NameInMap("IntervalInMinutes")
        private Integer intervalInMinutes;

        @com.aliyun.core.annotation.NameInMap("Maximum")
        private Integer maximum;

        @com.aliyun.core.annotation.NameInMap("Receivers")
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
             * Channels.
             */
            public Builder channels(java.util.List < String > channels) {
                this.channels = channels;
                return this;
            }

            /**
             * IntervalInMinutes.
             */
            public Builder intervalInMinutes(Integer intervalInMinutes) {
                this.intervalInMinutes = intervalInMinutes;
                return this;
            }

            /**
             * Maximum.
             */
            public Builder maximum(Integer maximum) {
                this.maximum = maximum;
                return this;
            }

            /**
             * Receivers.
             */
            public Builder receivers(java.util.List < Receivers> receivers) {
                this.receivers = receivers;
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

            public Notification build() {
                return new Notification(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateAlertRuleRequest</p>
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
             * CycleId.
             */
            public Builder cycleId(Integer cycleId) {
                this.cycleId = cycleId;
                return this;
            }

            /**
             * Time.
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
     * {@link UpdateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateAlertRuleRequest</p>
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
             * CycleAndTime.
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
     * {@link UpdateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateAlertRuleRequest</p>
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
             * AutoRerunAlert.
             */
            public Builder autoRerunAlert(Boolean autoRerunAlert) {
                this.autoRerunAlert = autoRerunAlert;
                return this;
            }

            /**
             * StreamTaskIds.
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
     * {@link UpdateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateAlertRuleRequest</p>
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
             * Count.
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
     * {@link UpdateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateAlertRuleRequest</p>
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
             * Percentage.
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
     * {@link UpdateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateAlertRuleRequest</p>
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
             * Percentage.
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * Trend.
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
     * {@link UpdateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateAlertRuleRequest</p>
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
             * TimeoutInMinutes.
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
     * {@link UpdateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateAlertRuleRequest</p>
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
             * UnFinishedTime.
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
     * {@link UpdateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateAlertRuleRequest</p>
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
             * CycleUnfinished.
             */
            public Builder cycleUnfinished(CycleUnfinished cycleUnfinished) {
                this.cycleUnfinished = cycleUnfinished;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * InstanceErrorCount.
             */
            public Builder instanceErrorCount(InstanceErrorCount instanceErrorCount) {
                this.instanceErrorCount = instanceErrorCount;
                return this;
            }

            /**
             * InstanceErrorPercentage.
             */
            public Builder instanceErrorPercentage(InstanceErrorPercentage instanceErrorPercentage) {
                this.instanceErrorPercentage = instanceErrorPercentage;
                return this;
            }

            /**
             * InstanceTransferFluctuate.
             */
            public Builder instanceTransferFluctuate(InstanceTransferFluctuate instanceTransferFluctuate) {
                this.instanceTransferFluctuate = instanceTransferFluctuate;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Timeout timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * UnFinished.
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
     * {@link UpdateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateAlertRuleRequest</p>
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
             * AllowTasks.
             */
            public Builder allowTasks(java.util.List < Long > allowTasks) {
                this.allowTasks = allowTasks;
                return this;
            }

            /**
             * Ids.
             */
            public Builder ids(java.util.List < Long > ids) {
                this.ids = ids;
                return this;
            }

            /**
             * Type.
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
     * {@link UpdateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateAlertRuleRequest</p>
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
             * Extension.
             */
            public Builder extension(Extension extension) {
                this.extension = extension;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            /**
             * Type.
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
