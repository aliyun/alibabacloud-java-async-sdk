// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceInspectionRunResponseBody</p>
 */
public class GetInstanceInspectionRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aiSummary")
    private AiSummary aiSummary;

    @com.aliyun.core.annotation.NameInMap("configSnapshot")
    private ConfigSnapshot configSnapshot;

    @com.aliyun.core.annotation.NameInMap("finishedAt")
    private String finishedAt;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("instanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("notification")
    private Notification notification;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("report")
    private Report report;

    @com.aliyun.core.annotation.NameInMap("requestedAt")
    private String requestedAt;

    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("summary")
    private Summary summary;

    @com.aliyun.core.annotation.NameInMap("timeRange")
    private TimeRange timeRange;

    @com.aliyun.core.annotation.NameInMap("triggerSource")
    private String triggerSource;

    private GetInstanceInspectionRunResponseBody(Builder builder) {
        this.aiSummary = builder.aiSummary;
        this.configSnapshot = builder.configSnapshot;
        this.finishedAt = builder.finishedAt;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.items = builder.items;
        this.notification = builder.notification;
        this.regionId = builder.regionId;
        this.report = builder.report;
        this.requestedAt = builder.requestedAt;
        this.runId = builder.runId;
        this.status = builder.status;
        this.summary = builder.summary;
        this.timeRange = builder.timeRange;
        this.triggerSource = builder.triggerSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceInspectionRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiSummary
     */
    public AiSummary getAiSummary() {
        return this.aiSummary;
    }

    /**
     * @return configSnapshot
     */
    public ConfigSnapshot getConfigSnapshot() {
        return this.configSnapshot;
    }

    /**
     * @return finishedAt
     */
    public String getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return report
     */
    public Report getReport() {
        return this.report;
    }

    /**
     * @return requestedAt
     */
    public String getRequestedAt() {
        return this.requestedAt;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return summary
     */
    public Summary getSummary() {
        return this.summary;
    }

    /**
     * @return timeRange
     */
    public TimeRange getTimeRange() {
        return this.timeRange;
    }

    /**
     * @return triggerSource
     */
    public String getTriggerSource() {
        return this.triggerSource;
    }

    public static final class Builder {
        private AiSummary aiSummary; 
        private ConfigSnapshot configSnapshot; 
        private String finishedAt; 
        private String instanceId; 
        private String instanceName; 
        private java.util.List<Items> items; 
        private Notification notification; 
        private String regionId; 
        private Report report; 
        private String requestedAt; 
        private String runId; 
        private String status; 
        private Summary summary; 
        private TimeRange timeRange; 
        private String triggerSource; 

        private Builder() {
        } 

        private Builder(GetInstanceInspectionRunResponseBody model) {
            this.aiSummary = model.aiSummary;
            this.configSnapshot = model.configSnapshot;
            this.finishedAt = model.finishedAt;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.items = model.items;
            this.notification = model.notification;
            this.regionId = model.regionId;
            this.report = model.report;
            this.requestedAt = model.requestedAt;
            this.runId = model.runId;
            this.status = model.status;
            this.summary = model.summary;
            this.timeRange = model.timeRange;
            this.triggerSource = model.triggerSource;
        } 

        /**
         * <p>每次巡检结果由 LLM 总结；包含生成状态及成功后的原文，未生成时为空。</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder aiSummary(AiSummary aiSummary) {
            this.aiSummary = aiSummary;
            return this;
        }

        /**
         * configSnapshot.
         */
        public Builder configSnapshot(ConfigSnapshot configSnapshot) {
            this.configSnapshot = configSnapshot;
            return this;
        }

        /**
         * finishedAt.
         */
        public Builder finishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * instanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * notification.
         */
        public Builder notification(Notification notification) {
            this.notification = notification;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * report.
         */
        public Builder report(Report report) {
            this.report = report;
            return this;
        }

        /**
         * requestedAt.
         */
        public Builder requestedAt(String requestedAt) {
            this.requestedAt = requestedAt;
            return this;
        }

        /**
         * runId.
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * summary.
         */
        public Builder summary(Summary summary) {
            this.summary = summary;
            return this;
        }

        /**
         * timeRange.
         */
        public Builder timeRange(TimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * triggerSource.
         */
        public Builder triggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }

        public GetInstanceInspectionRunResponseBody build() {
            return new GetInstanceInspectionRunResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class AiSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("text")
        @com.aliyun.core.annotation.Validation(maxLength = 200)
        private String text;

        private AiSummary(Builder builder) {
            this.status = builder.status;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiSummary create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String status; 
            private String text; 

            private Builder() {
            } 

            private Builder(AiSummary model) {
                this.status = model.status;
                this.text = model.text;
            } 

            /**
             * <p>Pending 等待、Running 生成中、Succeeded 已生成、Failed 生成失败；不改变巡检结果。</p>
             * 
             * <strong>example:</strong>
             * <p>Succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>仅生成成功时返回，最多 200 字，不由前端拼接或截取。</p>
             * 
             * <strong>example:</strong>
             * <p>本次巡检未发现风险，实例运行正常。</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public AiSummary build() {
                return new AiSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class ConfigSnapshotItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("parameters")
        @com.aliyun.core.annotation.Validation(required = true)
        private Object parameters;

        @com.aliyun.core.annotation.NameInMap("templateCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String templateCode;

        private ConfigSnapshotItems(Builder builder) {
            this.parameters = builder.parameters;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigSnapshotItems create() {
            return builder().build();
        }

        /**
         * @return parameters
         */
        public Object getParameters() {
            return this.parameters;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private Object parameters; 
            private String templateCode; 

            private Builder() {
            } 

            private Builder(ConfigSnapshotItems model) {
                this.parameters = model.parameters;
                this.templateCode = model.templateCode;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;lookback&quot;:&quot;1h&quot;,&quot;consumerDelayThresholdSeconds&quot;:600}</p>
             */
            public Builder parameters(Object parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq.consumer-health</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public ConfigSnapshotItems build() {
                return new ConfigSnapshotItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class ResourceScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerGroups")
        private java.util.List<String> consumerGroups;

        @com.aliyun.core.annotation.NameInMap("mode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mode;

        @com.aliyun.core.annotation.NameInMap("topics")
        private java.util.List<String> topics;

        private ResourceScope(Builder builder) {
            this.consumerGroups = builder.consumerGroups;
            this.mode = builder.mode;
            this.topics = builder.topics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceScope create() {
            return builder().build();
        }

        /**
         * @return consumerGroups
         */
        public java.util.List<String> getConsumerGroups() {
            return this.consumerGroups;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return topics
         */
        public java.util.List<String> getTopics() {
            return this.topics;
        }

        public static final class Builder {
            private java.util.List<String> consumerGroups; 
            private String mode; 
            private java.util.List<String> topics; 

            private Builder() {
            } 

            private Builder(ResourceScope model) {
                this.consumerGroups = model.consumerGroups;
                this.mode = model.mode;
                this.topics = model.topics;
            } 

            /**
             * consumerGroups.
             */
            public Builder consumerGroups(java.util.List<String> consumerGroups) {
                this.consumerGroups = consumerGroups;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>All</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * topics.
             */
            public Builder topics(java.util.List<String> topics) {
                this.topics = topics;
                return this;
            }

            public ResourceScope build() {
                return new ResourceScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class Schedule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cron")
        @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
        private String cron;

        @com.aliyun.core.annotation.NameInMap("enabled")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean enabled;

        private Schedule(Builder builder) {
            this.cron = builder.cron;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schedule create() {
            return builder().build();
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private String cron; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(Schedule model) {
                this.cron = model.cron;
                this.enabled = model.enabled;
            } 

            /**
             * cron.
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public Schedule build() {
                return new Schedule(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class ConfigSnapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ConfigSnapshotItems> items;

        @com.aliyun.core.annotation.NameInMap("resourceScope")
        @com.aliyun.core.annotation.Validation(required = true)
        private ResourceScope resourceScope;

        @com.aliyun.core.annotation.NameInMap("schedule")
        @com.aliyun.core.annotation.Validation(required = true)
        private Schedule schedule;

        private ConfigSnapshot(Builder builder) {
            this.items = builder.items;
            this.resourceScope = builder.resourceScope;
            this.schedule = builder.schedule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigSnapshot create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<ConfigSnapshotItems> getItems() {
            return this.items;
        }

        /**
         * @return resourceScope
         */
        public ResourceScope getResourceScope() {
            return this.resourceScope;
        }

        /**
         * @return schedule
         */
        public Schedule getSchedule() {
            return this.schedule;
        }

        public static final class Builder {
            private java.util.List<ConfigSnapshotItems> items; 
            private ResourceScope resourceScope; 
            private Schedule schedule; 

            private Builder() {
            } 

            private Builder(ConfigSnapshot model) {
                this.items = model.items;
                this.resourceScope = model.resourceScope;
                this.schedule = model.schedule;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;templateCode&quot;:&quot;rmq.consumer-health&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;1h&quot;}},{&quot;templateCode&quot;:&quot;rmq.traffic-capacity&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;6h&quot;}}]</p>
             */
            public Builder items(java.util.List<ConfigSnapshotItems> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;mode&quot;:&quot;All&quot;}</p>
             */
            public Builder resourceScope(ResourceScope resourceScope) {
                this.resourceScope = resourceScope;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;enabled&quot;:true,&quot;cron&quot;:&quot;0 3 * * *&quot;}</p>
             */
            public Builder schedule(Schedule schedule) {
                this.schedule = schedule;
                return this;
            }

            public ConfigSnapshot build() {
                return new ConfigSnapshot(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class EffectiveConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("parameters")
        private Object parameters;

        @com.aliyun.core.annotation.NameInMap("templateCode")
        private String templateCode;

        private EffectiveConfig(Builder builder) {
            this.parameters = builder.parameters;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectiveConfig create() {
            return builder().build();
        }

        /**
         * @return parameters
         */
        public Object getParameters() {
            return this.parameters;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private Object parameters; 
            private String templateCode; 

            private Builder() {
            } 

            private Builder(EffectiveConfig model) {
                this.parameters = model.parameters;
                this.templateCode = model.templateCode;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;lookback&quot;:&quot;1h&quot;,&quot;consumerDelayThresholdSeconds&quot;:600}</p>
             */
            public Builder parameters(Object parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq.consumer-health</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public EffectiveConfig build() {
                return new EffectiveConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bad")
        private Boolean bad;

        @com.aliyun.core.annotation.NameInMap("good")
        private Boolean good;

        @com.aliyun.core.annotation.NameInMap("k")
        private String k;

        @com.aliyun.core.annotation.NameInMap("v")
        private String v;

        private Metrics(Builder builder) {
            this.bad = builder.bad;
            this.good = builder.good;
            this.k = builder.k;
            this.v = builder.v;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return bad
         */
        public Boolean getBad() {
            return this.bad;
        }

        /**
         * @return good
         */
        public Boolean getGood() {
            return this.good;
        }

        /**
         * @return k
         */
        public String getK() {
            return this.k;
        }

        /**
         * @return v
         */
        public String getV() {
            return this.v;
        }

        public static final class Builder {
            private Boolean bad; 
            private Boolean good; 
            private String k; 
            private String v; 

            private Builder() {
            } 

            private Builder(Metrics model) {
                this.bad = model.bad;
                this.good = model.good;
                this.k = model.k;
                this.v = model.v;
            } 

            /**
             * bad.
             */
            public Builder bad(Boolean bad) {
                this.bad = bad;
                return this;
            }

            /**
             * good.
             */
            public Builder good(Boolean good) {
                this.good = good;
                return this;
            }

            /**
             * k.
             */
            public Builder k(String k) {
                this.k = k;
                return this;
            }

            /**
             * v.
             */
            public Builder v(String v) {
                this.v = v;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class ResourceSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("infoCount")
        private Integer infoCount;

        @com.aliyun.core.annotation.NameInMap("riskCount")
        private Integer riskCount;

        private ResourceSummary(Builder builder) {
            this.infoCount = builder.infoCount;
            this.riskCount = builder.riskCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSummary create() {
            return builder().build();
        }

        /**
         * @return infoCount
         */
        public Integer getInfoCount() {
            return this.infoCount;
        }

        /**
         * @return riskCount
         */
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public static final class Builder {
            private Integer infoCount; 
            private Integer riskCount; 

            private Builder() {
            } 

            private Builder(ResourceSummary model) {
                this.infoCount = model.infoCount;
                this.riskCount = model.riskCount;
            } 

            /**
             * infoCount.
             */
            public Builder infoCount(Integer infoCount) {
                this.infoCount = infoCount;
                return this;
            }

            /**
             * riskCount.
             */
            public Builder riskCount(Integer riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            public ResourceSummary build() {
                return new ResourceSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class ItemsTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private ItemsTimeRange(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemsTimeRange create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(ItemsTimeRange model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public ItemsTimeRange build() {
                return new ItemsTimeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("effectiveConfig")
        private EffectiveConfig effectiveConfig;

        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("headline")
        private String headline;

        @com.aliyun.core.annotation.NameInMap("metrics")
        private java.util.List<Metrics> metrics;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("observedAt")
        private String observedAt;

        @com.aliyun.core.annotation.NameInMap("resourceCount")
        private Long resourceCount;

        @com.aliyun.core.annotation.NameInMap("resourceSummary")
        private ResourceSummary resourceSummary;

        @com.aliyun.core.annotation.NameInMap("resourceTypes")
        private java.util.List<String> resourceTypes;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("templateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("timeRange")
        private ItemsTimeRange timeRange;

        private Items(Builder builder) {
            this.description = builder.description;
            this.effectiveConfig = builder.effectiveConfig;
            this.errorCode = builder.errorCode;
            this.headline = builder.headline;
            this.metrics = builder.metrics;
            this.name = builder.name;
            this.observedAt = builder.observedAt;
            this.resourceCount = builder.resourceCount;
            this.resourceSummary = builder.resourceSummary;
            this.resourceTypes = builder.resourceTypes;
            this.result = builder.result;
            this.severity = builder.severity;
            this.status = builder.status;
            this.templateCode = builder.templateCode;
            this.timeRange = builder.timeRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return effectiveConfig
         */
        public EffectiveConfig getEffectiveConfig() {
            return this.effectiveConfig;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return headline
         */
        public String getHeadline() {
            return this.headline;
        }

        /**
         * @return metrics
         */
        public java.util.List<Metrics> getMetrics() {
            return this.metrics;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return observedAt
         */
        public String getObservedAt() {
            return this.observedAt;
        }

        /**
         * @return resourceCount
         */
        public Long getResourceCount() {
            return this.resourceCount;
        }

        /**
         * @return resourceSummary
         */
        public ResourceSummary getResourceSummary() {
            return this.resourceSummary;
        }

        /**
         * @return resourceTypes
         */
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return timeRange
         */
        public ItemsTimeRange getTimeRange() {
            return this.timeRange;
        }

        public static final class Builder {
            private String description; 
            private EffectiveConfig effectiveConfig; 
            private String errorCode; 
            private String headline; 
            private java.util.List<Metrics> metrics; 
            private String name; 
            private String observedAt; 
            private Long resourceCount; 
            private ResourceSummary resourceSummary; 
            private java.util.List<String> resourceTypes; 
            private String result; 
            private String severity; 
            private String status; 
            private String templateCode; 
            private ItemsTimeRange timeRange; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.description = model.description;
                this.effectiveConfig = model.effectiveConfig;
                this.errorCode = model.errorCode;
                this.headline = model.headline;
                this.metrics = model.metrics;
                this.name = model.name;
                this.observedAt = model.observedAt;
                this.resourceCount = model.resourceCount;
                this.resourceSummary = model.resourceSummary;
                this.resourceTypes = model.resourceTypes;
                this.result = model.result;
                this.severity = model.severity;
                this.status = model.status;
                this.templateCode = model.templateCode;
                this.timeRange = model.timeRange;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * effectiveConfig.
             */
            public Builder effectiveConfig(EffectiveConfig effectiveConfig) {
                this.effectiveConfig = effectiveConfig;
                return this;
            }

            /**
             * errorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * headline.
             */
            public Builder headline(String headline) {
                this.headline = headline;
                return this;
            }

            /**
             * metrics.
             */
            public Builder metrics(java.util.List<Metrics> metrics) {
                this.metrics = metrics;
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
             * observedAt.
             */
            public Builder observedAt(String observedAt) {
                this.observedAt = observedAt;
                return this;
            }

            /**
             * resourceCount.
             */
            public Builder resourceCount(Long resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * resourceSummary.
             */
            public Builder resourceSummary(ResourceSummary resourceSummary) {
                this.resourceSummary = resourceSummary;
                return this;
            }

            /**
             * resourceTypes.
             */
            public Builder resourceTypes(java.util.List<String> resourceTypes) {
                this.resourceTypes = resourceTypes;
                return this;
            }

            /**
             * result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>Pending 等待、Running 生成中、Succeeded 已生成、Failed 生成失败；不改变巡检结果。</p>
             * 
             * <strong>example:</strong>
             * <p>Succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq.consumer-health</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * timeRange.
             */
            public Builder timeRange(ItemsTimeRange timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class Notification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("eventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Notification(Builder builder) {
            this.eventId = builder.eventId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Notification create() {
            return builder().build();
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String eventId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Notification model) {
                this.eventId = model.eventId;
                this.status = model.status;
            } 

            /**
             * eventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>Pending 等待、Running 生成中、Succeeded 已生成、Failed 生成失败；不改变巡检结果。</p>
             * 
             * <strong>example:</strong>
             * <p>Succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Notification build() {
                return new Notification(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class CoverageTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private CoverageTimeRange(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoverageTimeRange create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(CoverageTimeRange model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public CoverageTimeRange build() {
                return new CoverageTimeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class Coverage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("diagnosisStatus")
        private String diagnosisStatus;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("observedAt")
        private String observedAt;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("templateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("timeRange")
        private CoverageTimeRange timeRange;

        private Coverage(Builder builder) {
            this.diagnosisStatus = builder.diagnosisStatus;
            this.name = builder.name;
            this.observedAt = builder.observedAt;
            this.result = builder.result;
            this.status = builder.status;
            this.templateCode = builder.templateCode;
            this.timeRange = builder.timeRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Coverage create() {
            return builder().build();
        }

        /**
         * @return diagnosisStatus
         */
        public String getDiagnosisStatus() {
            return this.diagnosisStatus;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return observedAt
         */
        public String getObservedAt() {
            return this.observedAt;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return timeRange
         */
        public CoverageTimeRange getTimeRange() {
            return this.timeRange;
        }

        public static final class Builder {
            private String diagnosisStatus; 
            private String name; 
            private String observedAt; 
            private String result; 
            private String status; 
            private String templateCode; 
            private CoverageTimeRange timeRange; 

            private Builder() {
            } 

            private Builder(Coverage model) {
                this.diagnosisStatus = model.diagnosisStatus;
                this.name = model.name;
                this.observedAt = model.observedAt;
                this.result = model.result;
                this.status = model.status;
                this.templateCode = model.templateCode;
                this.timeRange = model.timeRange;
            } 

            /**
             * diagnosisStatus.
             */
            public Builder diagnosisStatus(String diagnosisStatus) {
                this.diagnosisStatus = diagnosisStatus;
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
             * observedAt.
             */
            public Builder observedAt(String observedAt) {
                this.observedAt = observedAt;
                return this;
            }

            /**
             * result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>Pending 等待、Running 生成中、Succeeded 已生成、Failed 生成失败；不改变巡检结果。</p>
             * 
             * <strong>example:</strong>
             * <p>Succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq.consumer-health</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * timeRange.
             */
            public Builder timeRange(CoverageTimeRange timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            public Coverage build() {
                return new Coverage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Resource(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.id = model.id;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class FindingsTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private FindingsTimeRange(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FindingsTimeRange create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(FindingsTimeRange model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public FindingsTimeRange build() {
                return new FindingsTimeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class Findings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alternatives")
        private java.util.List<String> alternatives;

        @com.aliyun.core.annotation.NameInMap("boundary")
        private String boundary;

        @com.aliyun.core.annotation.NameInMap("cause")
        private String cause;

        @com.aliyun.core.annotation.NameInMap("confidence")
        private String confidence;

        @com.aliyun.core.annotation.NameInMap("evidence")
        private java.util.List<String> evidence;

        @com.aliyun.core.annotation.NameInMap("impact")
        private String impact;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("missingEvidence")
        private java.util.List<String> missingEvidence;

        @com.aliyun.core.annotation.NameInMap("observations")
        private java.util.List<String> observations;

        @com.aliyun.core.annotation.NameInMap("observedAt")
        private String observedAt;

        @com.aliyun.core.annotation.NameInMap("recommendations")
        private java.util.List<String> recommendations;

        @com.aliyun.core.annotation.NameInMap("resource")
        private Resource resource;

        @com.aliyun.core.annotation.NameInMap("riskType")
        private String riskType;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("templateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("timeRange")
        private FindingsTimeRange timeRange;

        @com.aliyun.core.annotation.NameInMap("verification")
        private java.util.List<String> verification;

        private Findings(Builder builder) {
            this.alternatives = builder.alternatives;
            this.boundary = builder.boundary;
            this.cause = builder.cause;
            this.confidence = builder.confidence;
            this.evidence = builder.evidence;
            this.impact = builder.impact;
            this.location = builder.location;
            this.missingEvidence = builder.missingEvidence;
            this.observations = builder.observations;
            this.observedAt = builder.observedAt;
            this.recommendations = builder.recommendations;
            this.resource = builder.resource;
            this.riskType = builder.riskType;
            this.source = builder.source;
            this.templateCode = builder.templateCode;
            this.timeRange = builder.timeRange;
            this.verification = builder.verification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Findings create() {
            return builder().build();
        }

        /**
         * @return alternatives
         */
        public java.util.List<String> getAlternatives() {
            return this.alternatives;
        }

        /**
         * @return boundary
         */
        public String getBoundary() {
            return this.boundary;
        }

        /**
         * @return cause
         */
        public String getCause() {
            return this.cause;
        }

        /**
         * @return confidence
         */
        public String getConfidence() {
            return this.confidence;
        }

        /**
         * @return evidence
         */
        public java.util.List<String> getEvidence() {
            return this.evidence;
        }

        /**
         * @return impact
         */
        public String getImpact() {
            return this.impact;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return missingEvidence
         */
        public java.util.List<String> getMissingEvidence() {
            return this.missingEvidence;
        }

        /**
         * @return observations
         */
        public java.util.List<String> getObservations() {
            return this.observations;
        }

        /**
         * @return observedAt
         */
        public String getObservedAt() {
            return this.observedAt;
        }

        /**
         * @return recommendations
         */
        public java.util.List<String> getRecommendations() {
            return this.recommendations;
        }

        /**
         * @return resource
         */
        public Resource getResource() {
            return this.resource;
        }

        /**
         * @return riskType
         */
        public String getRiskType() {
            return this.riskType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return timeRange
         */
        public FindingsTimeRange getTimeRange() {
            return this.timeRange;
        }

        /**
         * @return verification
         */
        public java.util.List<String> getVerification() {
            return this.verification;
        }

        public static final class Builder {
            private java.util.List<String> alternatives; 
            private String boundary; 
            private String cause; 
            private String confidence; 
            private java.util.List<String> evidence; 
            private String impact; 
            private String location; 
            private java.util.List<String> missingEvidence; 
            private java.util.List<String> observations; 
            private String observedAt; 
            private java.util.List<String> recommendations; 
            private Resource resource; 
            private String riskType; 
            private String source; 
            private String templateCode; 
            private FindingsTimeRange timeRange; 
            private java.util.List<String> verification; 

            private Builder() {
            } 

            private Builder(Findings model) {
                this.alternatives = model.alternatives;
                this.boundary = model.boundary;
                this.cause = model.cause;
                this.confidence = model.confidence;
                this.evidence = model.evidence;
                this.impact = model.impact;
                this.location = model.location;
                this.missingEvidence = model.missingEvidence;
                this.observations = model.observations;
                this.observedAt = model.observedAt;
                this.recommendations = model.recommendations;
                this.resource = model.resource;
                this.riskType = model.riskType;
                this.source = model.source;
                this.templateCode = model.templateCode;
                this.timeRange = model.timeRange;
                this.verification = model.verification;
            } 

            /**
             * alternatives.
             */
            public Builder alternatives(java.util.List<String> alternatives) {
                this.alternatives = alternatives;
                return this;
            }

            /**
             * boundary.
             */
            public Builder boundary(String boundary) {
                this.boundary = boundary;
                return this;
            }

            /**
             * cause.
             */
            public Builder cause(String cause) {
                this.cause = cause;
                return this;
            }

            /**
             * confidence.
             */
            public Builder confidence(String confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * evidence.
             */
            public Builder evidence(java.util.List<String> evidence) {
                this.evidence = evidence;
                return this;
            }

            /**
             * impact.
             */
            public Builder impact(String impact) {
                this.impact = impact;
                return this;
            }

            /**
             * location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * missingEvidence.
             */
            public Builder missingEvidence(java.util.List<String> missingEvidence) {
                this.missingEvidence = missingEvidence;
                return this;
            }

            /**
             * observations.
             */
            public Builder observations(java.util.List<String> observations) {
                this.observations = observations;
                return this;
            }

            /**
             * observedAt.
             */
            public Builder observedAt(String observedAt) {
                this.observedAt = observedAt;
                return this;
            }

            /**
             * recommendations.
             */
            public Builder recommendations(java.util.List<String> recommendations) {
                this.recommendations = recommendations;
                return this;
            }

            /**
             * resource.
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * riskType.
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq.consumer-health</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * timeRange.
             */
            public Builder timeRange(FindingsTimeRange timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            /**
             * verification.
             */
            public Builder verification(java.util.List<String> verification) {
                this.verification = verification;
                return this;
            }

            public Findings build() {
                return new Findings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class ReportSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("infoCount")
        private Integer infoCount;

        @com.aliyun.core.annotation.NameInMap("riskCount")
        private Integer riskCount;

        private ReportSummary(Builder builder) {
            this.infoCount = builder.infoCount;
            this.riskCount = builder.riskCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportSummary create() {
            return builder().build();
        }

        /**
         * @return infoCount
         */
        public Integer getInfoCount() {
            return this.infoCount;
        }

        /**
         * @return riskCount
         */
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public static final class Builder {
            private Integer infoCount; 
            private Integer riskCount; 

            private Builder() {
            } 

            private Builder(ReportSummary model) {
                this.infoCount = model.infoCount;
                this.riskCount = model.riskCount;
            } 

            /**
             * infoCount.
             */
            public Builder infoCount(Integer infoCount) {
                this.infoCount = infoCount;
                return this;
            }

            /**
             * riskCount.
             */
            public Builder riskCount(Integer riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            public ReportSummary build() {
                return new ReportSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class ReportTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private ReportTimeRange(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportTimeRange create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(ReportTimeRange model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public ReportTimeRange build() {
                return new ReportTimeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class Report extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("completion")
        private String completion;

        @com.aliyun.core.annotation.NameInMap("coverage")
        private java.util.List<Coverage> coverage;

        @com.aliyun.core.annotation.NameInMap("findings")
        private java.util.List<Findings> findings;

        @com.aliyun.core.annotation.NameInMap("finishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("html")
        private String html;

        @com.aliyun.core.annotation.NameInMap("inspectionRunId")
        private String inspectionRunId;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("instanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("markdown")
        private String markdown;

        @com.aliyun.core.annotation.NameInMap("overview")
        private String overview;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("reportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("reportSummary")
        private ReportSummary reportSummary;

        @com.aliyun.core.annotation.NameInMap("templateVersion")
        private String templateVersion;

        @com.aliyun.core.annotation.NameInMap("timeRange")
        private ReportTimeRange timeRange;

        private Report(Builder builder) {
            this.completion = builder.completion;
            this.coverage = builder.coverage;
            this.findings = builder.findings;
            this.finishedAt = builder.finishedAt;
            this.html = builder.html;
            this.inspectionRunId = builder.inspectionRunId;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.markdown = builder.markdown;
            this.overview = builder.overview;
            this.regionId = builder.regionId;
            this.reportId = builder.reportId;
            this.reportSummary = builder.reportSummary;
            this.templateVersion = builder.templateVersion;
            this.timeRange = builder.timeRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Report create() {
            return builder().build();
        }

        /**
         * @return completion
         */
        public String getCompletion() {
            return this.completion;
        }

        /**
         * @return coverage
         */
        public java.util.List<Coverage> getCoverage() {
            return this.coverage;
        }

        /**
         * @return findings
         */
        public java.util.List<Findings> getFindings() {
            return this.findings;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
        }

        /**
         * @return html
         */
        public String getHtml() {
            return this.html;
        }

        /**
         * @return inspectionRunId
         */
        public String getInspectionRunId() {
            return this.inspectionRunId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return markdown
         */
        public String getMarkdown() {
            return this.markdown;
        }

        /**
         * @return overview
         */
        public String getOverview() {
            return this.overview;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return reportSummary
         */
        public ReportSummary getReportSummary() {
            return this.reportSummary;
        }

        /**
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return timeRange
         */
        public ReportTimeRange getTimeRange() {
            return this.timeRange;
        }

        public static final class Builder {
            private String completion; 
            private java.util.List<Coverage> coverage; 
            private java.util.List<Findings> findings; 
            private String finishedAt; 
            private String html; 
            private String inspectionRunId; 
            private String instanceId; 
            private String instanceName; 
            private String markdown; 
            private String overview; 
            private String regionId; 
            private String reportId; 
            private ReportSummary reportSummary; 
            private String templateVersion; 
            private ReportTimeRange timeRange; 

            private Builder() {
            } 

            private Builder(Report model) {
                this.completion = model.completion;
                this.coverage = model.coverage;
                this.findings = model.findings;
                this.finishedAt = model.finishedAt;
                this.html = model.html;
                this.inspectionRunId = model.inspectionRunId;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.markdown = model.markdown;
                this.overview = model.overview;
                this.regionId = model.regionId;
                this.reportId = model.reportId;
                this.reportSummary = model.reportSummary;
                this.templateVersion = model.templateVersion;
                this.timeRange = model.timeRange;
            } 

            /**
             * completion.
             */
            public Builder completion(String completion) {
                this.completion = completion;
                return this;
            }

            /**
             * coverage.
             */
            public Builder coverage(java.util.List<Coverage> coverage) {
                this.coverage = coverage;
                return this;
            }

            /**
             * findings.
             */
            public Builder findings(java.util.List<Findings> findings) {
                this.findings = findings;
                return this;
            }

            /**
             * finishedAt.
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * html.
             */
            public Builder html(String html) {
                this.html = html;
                return this;
            }

            /**
             * inspectionRunId.
             */
            public Builder inspectionRunId(String inspectionRunId) {
                this.inspectionRunId = inspectionRunId;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * instanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * markdown.
             */
            public Builder markdown(String markdown) {
                this.markdown = markdown;
                return this;
            }

            /**
             * overview.
             */
            public Builder overview(String overview) {
                this.overview = overview;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * reportId.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * reportSummary.
             */
            public Builder reportSummary(ReportSummary reportSummary) {
                this.reportSummary = reportSummary;
                return this;
            }

            /**
             * templateVersion.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * timeRange.
             */
            public Builder timeRange(ReportTimeRange timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            public Report build() {
                return new Report(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("infoCount")
        private Integer infoCount;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("riskCount")
        private Integer riskCount;

        private Summary(Builder builder) {
            this.infoCount = builder.infoCount;
            this.result = builder.result;
            this.riskCount = builder.riskCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return infoCount
         */
        public Integer getInfoCount() {
            return this.infoCount;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return riskCount
         */
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public static final class Builder {
            private Integer infoCount; 
            private String result; 
            private Integer riskCount; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.infoCount = model.infoCount;
                this.result = model.result;
                this.riskCount = model.riskCount;
            } 

            /**
             * infoCount.
             */
            public Builder infoCount(Integer infoCount) {
                this.infoCount = infoCount;
                return this;
            }

            /**
             * result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * riskCount.
             */
            public Builder riskCount(Integer riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionRunResponseBody</p>
     */
    public static class TimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private TimeRange(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeRange create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(TimeRange model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public TimeRange build() {
                return new TimeRange(this);
            } 

        } 

    }
}
