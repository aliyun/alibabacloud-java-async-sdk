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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>groups:</p>
         * <ul>
         * <li>name: &quot;node.rules&quot;
         * interval: &quot;60s&quot;
         * rules:<ul>
         * <li>record: &quot;node_namespace_pod:kube_pod_info:&quot;
         * expr: &quot;max(label_replace(kube_pod_info{job=&quot;kubernetes-pods-kube-state-metrics&quot;<br>  }, &quot;pod&quot;, &quot;$1&quot;, &quot;pod&quot;, &quot;(.*)&quot;)) by (node, namespace, pod, cluster)&quot;</li>
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
         * aggTaskGroupConfigType.
         */
        public Builder aggTaskGroupConfigType(String aggTaskGroupConfigType) {
            this.putBodyParameter("aggTaskGroupConfigType", aggTaskGroupConfigType);
            this.aggTaskGroupConfigType = aggTaskGroupConfigType;
            return this;
        }

        /**
         * aggTaskGroupName.
         */
        public Builder aggTaskGroupName(String aggTaskGroupName) {
            this.putBodyParameter("aggTaskGroupName", aggTaskGroupName);
            this.aggTaskGroupName = aggTaskGroupName;
            return this;
        }

        /**
         * cronExpr.
         */
        public Builder cronExpr(String cronExpr) {
            this.putBodyParameter("cronExpr", cronExpr);
            this.cronExpr = cronExpr;
            return this;
        }

        /**
         * delay.
         */
        public Builder delay(Integer delay) {
            this.putBodyParameter("delay", delay);
            this.delay = delay;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * fromTime.
         */
        public Builder fromTime(Long fromTime) {
            this.putBodyParameter("fromTime", fromTime);
            this.fromTime = fromTime;
            return this;
        }

        /**
         * maxRetries.
         */
        public Builder maxRetries(Integer maxRetries) {
            this.putBodyParameter("maxRetries", maxRetries);
            this.maxRetries = maxRetries;
            return this;
        }

        /**
         * maxRunTimeInSeconds.
         */
        public Builder maxRunTimeInSeconds(Integer maxRunTimeInSeconds) {
            this.putBodyParameter("maxRunTimeInSeconds", maxRunTimeInSeconds);
            this.maxRunTimeInSeconds = maxRunTimeInSeconds;
            return this;
        }

        /**
         * precheckString.
         */
        public Builder precheckString(String precheckString) {
            this.putBodyParameter("precheckString", precheckString);
            this.precheckString = precheckString;
            return this;
        }

        /**
         * scheduleMode.
         */
        public Builder scheduleMode(String scheduleMode) {
            this.putBodyParameter("scheduleMode", scheduleMode);
            this.scheduleMode = scheduleMode;
            return this;
        }

        /**
         * scheduleTimeExpr.
         */
        public Builder scheduleTimeExpr(String scheduleTimeExpr) {
            this.putBodyParameter("scheduleTimeExpr", scheduleTimeExpr);
            this.scheduleTimeExpr = scheduleTimeExpr;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
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
         * toTime.
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
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
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
