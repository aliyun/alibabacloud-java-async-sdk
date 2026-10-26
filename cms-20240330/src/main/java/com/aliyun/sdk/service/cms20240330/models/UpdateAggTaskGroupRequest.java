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
 * {@link UpdateAggTaskGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateAggTaskGroupRequest</p>
 */
public class UpdateAggTaskGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aggTaskGroupConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggTaskGroupConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aggTaskGroupConfigType")
    private String aggTaskGroupConfigType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aggTaskGroupName")
    private String aggTaskGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cronExpr")
    private String cronExpr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("delay")
    @com.aliyun.core.annotation.Validation(maximum = 120)
    private Integer delay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fromTime")
    private Long fromTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxRetries")
    private Integer maxRetries;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxRunTimeInSeconds")
    private Integer maxRunTimeInSeconds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("precheckString")
    private String precheckString;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scheduleMode")
    private String scheduleMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scheduleTimeExpr")
    private String scheduleTimeExpr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetPrometheusId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetPrometheusId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("toTime")
    private Long toTime;

    private UpdateAggTaskGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.groupId = builder.groupId;
        this.aggTaskGroupConfig = builder.aggTaskGroupConfig;
        this.aggTaskGroupConfigType = builder.aggTaskGroupConfigType;
        this.aggTaskGroupName = builder.aggTaskGroupName;
        this.cronExpr = builder.cronExpr;
        this.delay = builder.delay;
        this.description = builder.description;
        this.fromTime = builder.fromTime;
        this.maxRetries = builder.maxRetries;
        this.maxRunTimeInSeconds = builder.maxRunTimeInSeconds;
        this.precheckString = builder.precheckString;
        this.scheduleMode = builder.scheduleMode;
        this.scheduleTimeExpr = builder.scheduleTimeExpr;
        this.status = builder.status;
        this.tags = builder.tags;
        this.targetPrometheusId = builder.targetPrometheusId;
        this.toTime = builder.toTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAggTaskGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return aggTaskGroupConfig
     */
    public String getAggTaskGroupConfig() {
        return this.aggTaskGroupConfig;
    }

    /**
     * @return aggTaskGroupConfigType
     */
    public String getAggTaskGroupConfigType() {
        return this.aggTaskGroupConfigType;
    }

    /**
     * @return aggTaskGroupName
     */
    public String getAggTaskGroupName() {
        return this.aggTaskGroupName;
    }

    /**
     * @return cronExpr
     */
    public String getCronExpr() {
        return this.cronExpr;
    }

    /**
     * @return delay
     */
    public Integer getDelay() {
        return this.delay;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fromTime
     */
    public Long getFromTime() {
        return this.fromTime;
    }

    /**
     * @return maxRetries
     */
    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    /**
     * @return maxRunTimeInSeconds
     */
    public Integer getMaxRunTimeInSeconds() {
        return this.maxRunTimeInSeconds;
    }

    /**
     * @return precheckString
     */
    public String getPrecheckString() {
        return this.precheckString;
    }

    /**
     * @return scheduleMode
     */
    public String getScheduleMode() {
        return this.scheduleMode;
    }

    /**
     * @return scheduleTimeExpr
     */
    public String getScheduleTimeExpr() {
        return this.scheduleTimeExpr;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return targetPrometheusId
     */
    public String getTargetPrometheusId() {
        return this.targetPrometheusId;
    }

    /**
     * @return toTime
     */
    public Long getToTime() {
        return this.toTime;
    }

    public static final class Builder extends Request.Builder<UpdateAggTaskGroupRequest, Builder> {
        private String instanceId; 
        private String groupId; 
        private String aggTaskGroupConfig; 
        private String aggTaskGroupConfigType; 
        private String aggTaskGroupName; 
        private String cronExpr; 
        private Integer delay; 
        private String description; 
        private Long fromTime; 
        private Integer maxRetries; 
        private Integer maxRunTimeInSeconds; 
        private String precheckString; 
        private String scheduleMode; 
        private String scheduleTimeExpr; 
        private String status; 
        private java.util.List<Tags> tags; 
        private String targetPrometheusId; 
        private Long toTime; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAggTaskGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.groupId = request.groupId;
            this.aggTaskGroupConfig = request.aggTaskGroupConfig;
            this.aggTaskGroupConfigType = request.aggTaskGroupConfigType;
            this.aggTaskGroupName = request.aggTaskGroupName;
            this.cronExpr = request.cronExpr;
            this.delay = request.delay;
            this.description = request.description;
            this.fromTime = request.fromTime;
            this.maxRetries = request.maxRetries;
            this.maxRunTimeInSeconds = request.maxRunTimeInSeconds;
            this.precheckString = request.precheckString;
            this.scheduleMode = request.scheduleMode;
            this.scheduleTimeExpr = request.scheduleTimeExpr;
            this.status = request.status;
            this.tags = request.tags;
            this.targetPrometheusId = request.targetPrometheusId;
            this.toTime = request.toTime;
        } 

        /**
         * <p>The Prometheus instance ID of the aggregation node group. Aggregation nodes read data from this instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-pq4apob9jm</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the aggregation task group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aggTaskGroup-xxxx</p>
         */
        public Builder groupId(String groupId) {
            this.putPathParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The configuration of the aggregation task group. Only the RecordingRuleYaml format is supported. The configuration must meet the format requirements of RecordingRule in open-source Prometheus.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>groups:</p>
         * <ul>
         * <li>name: &quot;node.rules&quot;
         * interval: &quot;60s&quot;
         * rules:<ul>
         * <li>record: &quot;node_namespace_pod:kube_pod_info:&quot;
         * expr: &quot;max(label_replace(kube_pod_info{job=\&quot;kubernetes-pods-kube-state-metrics\&quot;\
         *   }, \&quot;pod\&quot;, \&quot;$1\&quot;, \&quot;pod\&quot;, \&quot;(.*)\&quot;)) by (node, namespace, pod, cluster)&quot;</li>
         * </ul>
         * </li>
         * </ul>
         */
        public Builder aggTaskGroupConfig(String aggTaskGroupConfig) {
            this.putBodyParameter("aggTaskGroupConfig", aggTaskGroupConfig);
            this.aggTaskGroupConfig = aggTaskGroupConfig;
            return this;
        }

        /**
         * <p>The configuration type of the aggregation task group. Default value: RecordingRuleYaml, which is the RecordingRule format of open-source Prometheus.</p>
         * 
         * <strong>example:</strong>
         * <p>RecordingRuleYaml</p>
         */
        public Builder aggTaskGroupConfigType(String aggTaskGroupConfigType) {
            this.putBodyParameter("aggTaskGroupConfigType", aggTaskGroupConfigType);
            this.aggTaskGroupConfigType = aggTaskGroupConfigType;
            return this;
        }

        /**
         * <p>The name of the aggregation task group.</p>
         * 
         * <strong>example:</strong>
         * <p>test-group</p>
         */
        public Builder aggTaskGroupName(String aggTaskGroupName) {
            this.putBodyParameter("aggTaskGroupName", aggTaskGroupName);
            this.aggTaskGroupName = aggTaskGroupName;
            return this;
        }

        /**
         * <p>The cron expression used when the scheduling mode is set to Cron. For example, 0/1 * * * * indicates that the task is scheduled every 1 minute starting from minute 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0/1 * * * *</p>
         */
        public Builder cronExpr(String cronExpr) {
            this.putBodyParameter("cronExpr", cronExpr);
            this.cronExpr = cronExpr;
            return this;
        }

        /**
         * <p>The fixed delay time for scheduling, in seconds. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder delay(Integer delay) {
            this.putBodyParameter("delay", delay);
            this.delay = delay;
            return this;
        }

        /**
         * <p>The description of the aggregation task group.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The timestamp of the scheduling start time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1724996015</p>
         */
        public Builder fromTime(Long fromTime) {
            this.putBodyParameter("fromTime", fromTime);
            this.fromTime = fromTime;
            return this;
        }

        /**
         * <p>The maximum number of retries for executing the aggregation task. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxRetries(Integer maxRetries) {
            this.putBodyParameter("maxRetries", maxRetries);
            this.maxRetries = maxRetries;
            return this;
        }

        /**
         * <p>The maximum retry time to execute the aggregation node, in seconds. Default value: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder maxRunTimeInSeconds(Integer maxRunTimeInSeconds) {
            this.putBodyParameter("maxRunTimeInSeconds", maxRunTimeInSeconds);
            this.maxRunTimeInSeconds = maxRunTimeInSeconds;
            return this;
        }

        /**
         * <p>The precheck configuration. By default, this parameter is not configured. The input string must be a valid JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;policy&quot;:&quot;skip&quot;,&quot;prometheusId&quot;:&quot;xxx&quot;,&quot;query&quot;:&quot;scalar(sum(count_over_time(up{job=\&quot;_arms/kubelet/cadvisor\&quot;}[15s])) / 21)&quot;,&quot;threshold&quot;:0.5,&quot;timeout&quot;:15,&quot;type&quot;:&quot;promql&quot;}</p>
         */
        public Builder precheckString(String precheckString) {
            this.putBodyParameter("precheckString", precheckString);
            this.precheckString = precheckString;
            return this;
        }

        /**
         * <p>The scheduling mode. Valid values: Cron and FixedRate. Default value: FixedRate.</p>
         * 
         * <strong>example:</strong>
         * <p>FixedRate</p>
         */
        public Builder scheduleMode(String scheduleMode) {
            this.putBodyParameter("scheduleMode", scheduleMode);
            this.scheduleMode = scheduleMode;
            return this;
        }

        /**
         * <p>The scheduling time expression. Use @s or @m to specify the alignment granularity of the scheduling time window. Default value: @m.</p>
         * 
         * <strong>example:</strong>
         * <p>@m</p>
         */
        public Builder scheduleTimeExpr(String scheduleTimeExpr) {
            this.putBodyParameter("scheduleTimeExpr", scheduleTimeExpr);
            this.scheduleTimeExpr = scheduleTimeExpr;
            return this;
        }

        /**
         * <p>The status of the aggregation task group. Valid values: Running and Stopped. Default value: Running.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tags of the resource group.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The target Prometheus instance ID of the aggregation node group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-pq4apob9jm</p>
         */
        public Builder targetPrometheusId(String targetPrometheusId) {
            this.putBodyParameter("targetPrometheusId", targetPrometheusId);
            this.targetPrometheusId = targetPrometheusId;
            return this;
        }

        /**
         * <p>The timestamp of the scheduling end time, in seconds. A value of 0 indicates that the scheduling does not stop.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder toTime(Long toTime) {
            this.putBodyParameter("toTime", toTime);
            this.toTime = toTime;
            return this;
        }

        @Override
        public UpdateAggTaskGroupRequest build() {
            return new UpdateAggTaskGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAggTaskGroupRequest} extends {@link TeaModel}
     *
     * <p>UpdateAggTaskGroupRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
