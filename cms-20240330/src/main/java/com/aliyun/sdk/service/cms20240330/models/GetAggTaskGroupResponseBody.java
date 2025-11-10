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
 * {@link GetAggTaskGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggTaskGroupResponseBody</p>
 */
public class GetAggTaskGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aggTaskGroup")
    private AggTaskGroup aggTaskGroup;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetAggTaskGroupResponseBody(Builder builder) {
        this.aggTaskGroup = builder.aggTaskGroup;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggTaskGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggTaskGroup
     */
    public AggTaskGroup getAggTaskGroup() {
        return this.aggTaskGroup;
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
        private AggTaskGroup aggTaskGroup; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAggTaskGroupResponseBody model) {
            this.aggTaskGroup = model.aggTaskGroup;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Aggregation task group.</p>
         */
        public Builder aggTaskGroup(AggTaskGroup aggTaskGroup) {
            this.aggTaskGroup = aggTaskGroup;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>68DAF543-35DF-5762-BE90-F5C00B5DC036</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the request was successful</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAggTaskGroupResponseBody build() {
            return new GetAggTaskGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAggTaskGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggTaskGroupResponseBody</p>
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
             * <p>Key of the resource group tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the resource group tag.</p>
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
    /**
     * 
     * {@link GetAggTaskGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggTaskGroupResponseBody</p>
     */
    public static class AggTaskGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aggTaskGroupConfig")
        private String aggTaskGroupConfig;

        @com.aliyun.core.annotation.NameInMap("aggTaskGroupConfigHash")
        private String aggTaskGroupConfigHash;

        @com.aliyun.core.annotation.NameInMap("aggTaskGroupId")
        private String aggTaskGroupId;

        @com.aliyun.core.annotation.NameInMap("aggTaskGroupName")
        private String aggTaskGroupName;

        @com.aliyun.core.annotation.NameInMap("cronExpr")
        private String cronExpr;

        @com.aliyun.core.annotation.NameInMap("delay")
        private Integer delay;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("fromTime")
        private Long fromTime;

        @com.aliyun.core.annotation.NameInMap("maxRetries")
        private Integer maxRetries;

        @com.aliyun.core.annotation.NameInMap("maxRunTimeInSeconds")
        private Integer maxRunTimeInSeconds;

        @com.aliyun.core.annotation.NameInMap("precheckString")
        private String precheckString;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("scheduleMode")
        private String scheduleMode;

        @com.aliyun.core.annotation.NameInMap("scheduleTimeExpr")
        private String scheduleTimeExpr;

        @com.aliyun.core.annotation.NameInMap("sourcePrometheusId")
        private String sourcePrometheusId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("targetPrometheusId")
        private String targetPrometheusId;

        @com.aliyun.core.annotation.NameInMap("toTime")
        private Long toTime;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private AggTaskGroup(Builder builder) {
            this.aggTaskGroupConfig = builder.aggTaskGroupConfig;
            this.aggTaskGroupConfigHash = builder.aggTaskGroupConfigHash;
            this.aggTaskGroupId = builder.aggTaskGroupId;
            this.aggTaskGroupName = builder.aggTaskGroupName;
            this.cronExpr = builder.cronExpr;
            this.delay = builder.delay;
            this.description = builder.description;
            this.fromTime = builder.fromTime;
            this.maxRetries = builder.maxRetries;
            this.maxRunTimeInSeconds = builder.maxRunTimeInSeconds;
            this.precheckString = builder.precheckString;
            this.regionId = builder.regionId;
            this.scheduleMode = builder.scheduleMode;
            this.scheduleTimeExpr = builder.scheduleTimeExpr;
            this.sourcePrometheusId = builder.sourcePrometheusId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.targetPrometheusId = builder.targetPrometheusId;
            this.toTime = builder.toTime;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AggTaskGroup create() {
            return builder().build();
        }

        /**
         * @return aggTaskGroupConfig
         */
        public String getAggTaskGroupConfig() {
            return this.aggTaskGroupConfig;
        }

        /**
         * @return aggTaskGroupConfigHash
         */
        public String getAggTaskGroupConfigHash() {
            return this.aggTaskGroupConfigHash;
        }

        /**
         * @return aggTaskGroupId
         */
        public String getAggTaskGroupId() {
            return this.aggTaskGroupId;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return sourcePrometheusId
         */
        public String getSourcePrometheusId() {
            return this.sourcePrometheusId;
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

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String aggTaskGroupConfig; 
            private String aggTaskGroupConfigHash; 
            private String aggTaskGroupId; 
            private String aggTaskGroupName; 
            private String cronExpr; 
            private Integer delay; 
            private String description; 
            private Long fromTime; 
            private Integer maxRetries; 
            private Integer maxRunTimeInSeconds; 
            private String precheckString; 
            private String regionId; 
            private String scheduleMode; 
            private String scheduleTimeExpr; 
            private String sourcePrometheusId; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String targetPrometheusId; 
            private Long toTime; 
            private String updateTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(AggTaskGroup model) {
                this.aggTaskGroupConfig = model.aggTaskGroupConfig;
                this.aggTaskGroupConfigHash = model.aggTaskGroupConfigHash;
                this.aggTaskGroupId = model.aggTaskGroupId;
                this.aggTaskGroupName = model.aggTaskGroupName;
                this.cronExpr = model.cronExpr;
                this.delay = model.delay;
                this.description = model.description;
                this.fromTime = model.fromTime;
                this.maxRetries = model.maxRetries;
                this.maxRunTimeInSeconds = model.maxRunTimeInSeconds;
                this.precheckString = model.precheckString;
                this.regionId = model.regionId;
                this.scheduleMode = model.scheduleMode;
                this.scheduleTimeExpr = model.scheduleTimeExpr;
                this.sourcePrometheusId = model.sourcePrometheusId;
                this.status = model.status;
                this.tags = model.tags;
                this.targetPrometheusId = model.targetPrometheusId;
                this.toTime = model.toTime;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
            } 

            /**
             * <p>Aggregation task group configuration.</p>
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
                this.aggTaskGroupConfig = aggTaskGroupConfig;
                return this;
            }

            /**
             * <p>Summary of the aggregation task group configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>a54136xxx</p>
             */
            public Builder aggTaskGroupConfigHash(String aggTaskGroupConfigHash) {
                this.aggTaskGroupConfigHash = aggTaskGroupConfigHash;
                return this;
            }

            /**
             * <p>ID of the aggregation task group.</p>
             * 
             * <strong>example:</strong>
             * <p>aggTaskGroup-xx</p>
             */
            public Builder aggTaskGroupId(String aggTaskGroupId) {
                this.aggTaskGroupId = aggTaskGroupId;
                return this;
            }

            /**
             * <p>Name of the aggregation task group.</p>
             * 
             * <strong>example:</strong>
             * <p>pipeline-aggtask-group</p>
             */
            public Builder aggTaskGroupName(String aggTaskGroupName) {
                this.aggTaskGroupName = aggTaskGroupName;
                return this;
            }

            /**
             * <p>Scheduling expression for the aggregation task group when the scheduling mode is &quot;Cron&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>0 1 3 * * ? *</p>
             */
            public Builder cronExpr(String cronExpr) {
                this.cronExpr = cronExpr;
                return this;
            }

            /**
             * <p>Fixed delay time (in seconds) for scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder delay(Integer delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>Description of the aggregation task group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Second-level timestamp corresponding to the start time of scheduling (not yet effective).</p>
             * 
             * <strong>example:</strong>
             * <p>1757409495</p>
             */
            public Builder fromTime(Long fromTime) {
                this.fromTime = fromTime;
                return this;
            }

            /**
             * <p>Maximum number of retries for executing the aggregation task.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxRetries(Integer maxRetries) {
                this.maxRetries = maxRetries;
                return this;
            }

            /**
             * <p>Maximum retry time for executing the aggregation task.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder maxRunTimeInSeconds(Integer maxRunTimeInSeconds) {
                this.maxRunTimeInSeconds = maxRunTimeInSeconds;
                return this;
            }

            /**
             * <p>Pre-check configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;policy&quot;:&quot;skip&quot;,&quot;prometheusId&quot;:&quot;rw-xx&quot;,&quot;query&quot;:&quot;noPrecheck&quot;,&quot;threshold&quot;:0.5,&quot;timeout&quot;:15,&quot;type&quot;:&quot;none&quot;}</p>
             */
            public Builder precheckString(String precheckString) {
                this.precheckString = precheckString;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Scheduling mode.</p>
             * 
             * <strong>example:</strong>
             * <p>FixedRate</p>
             */
            public Builder scheduleMode(String scheduleMode) {
                this.scheduleMode = scheduleMode;
                return this;
            }

            /**
             * <p>Scheduling time expression.</p>
             * 
             * <strong>example:</strong>
             * <p>@m</p>
             */
            public Builder scheduleTimeExpr(String scheduleTimeExpr) {
                this.scheduleTimeExpr = scheduleTimeExpr;
                return this;
            }

            /**
             * <p>ID of the source Prometheus instance for the aggregation task group.</p>
             * 
             * <strong>example:</strong>
             * <p>rw-xxx</p>
             */
            public Builder sourcePrometheusId(String sourcePrometheusId) {
                this.sourcePrometheusId = sourcePrometheusId;
                return this;
            }

            /**
             * <p>Status of the aggregation task group.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Resource group tags</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The target Prometheus instance ID of the aggregation task group.</p>
             * 
             * <strong>example:</strong>
             * <p>rw-xxx</p>
             */
            public Builder targetPrometheusId(String targetPrometheusId) {
                this.targetPrometheusId = targetPrometheusId;
                return this;
            }

            /**
             * <p>The second-level timestamp corresponding to the end time of the scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>1757409495</p>
             */
            public Builder toTime(Long toTime) {
                this.toTime = toTime;
                return this;
            }

            /**
             * <p>The update time (timestamp) of the aggregation task group.</p>
             * 
             * <strong>example:</strong>
             * <p>1757409499000</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The user to whom the aggregation task group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123xxx</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public AggTaskGroup build() {
                return new AggTaskGroup(this);
            } 

        } 

    }
}
