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
 * {@link ListAggTaskGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAggTaskGroupsResponseBody</p>
 */
public class ListAggTaskGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aggTaskGroups")
    private java.util.List<AggTaskGroups> aggTaskGroups;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListAggTaskGroupsResponseBody(Builder builder) {
        this.aggTaskGroups = builder.aggTaskGroups;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggTaskGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggTaskGroups
     */
    public java.util.List<AggTaskGroups> getAggTaskGroups() {
        return this.aggTaskGroups;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AggTaskGroups> aggTaskGroups; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAggTaskGroupsResponseBody model) {
            this.aggTaskGroups = model.aggTaskGroups;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>List of aggregation task groups.</p>
         */
        public Builder aggTaskGroups(java.util.List<AggTaskGroups> aggTaskGroups) {
            this.aggTaskGroups = aggTaskGroups;
            return this;
        }

        /**
         * <p>The maximum number of records returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>aa9d0e569b880xxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7BF1F4D6-B9A8-5F0B-8C1D-4347FFCB798E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAggTaskGroupsResponseBody build() {
            return new ListAggTaskGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAggTaskGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggTaskGroupsResponseBody</p>
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
             * <p>Value of the resource group tag.</p>
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
     * {@link ListAggTaskGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggTaskGroupsResponseBody</p>
     */
    public static class AggTaskGroups extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("interval")
        private String interval;

        @com.aliyun.core.annotation.NameInMap("maxRetries")
        private Integer maxRetries;

        @com.aliyun.core.annotation.NameInMap("maxRunTimeInSeconds")
        private Integer maxRunTimeInSeconds;

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

        private AggTaskGroups(Builder builder) {
            this.aggTaskGroupConfigHash = builder.aggTaskGroupConfigHash;
            this.aggTaskGroupId = builder.aggTaskGroupId;
            this.aggTaskGroupName = builder.aggTaskGroupName;
            this.cronExpr = builder.cronExpr;
            this.delay = builder.delay;
            this.description = builder.description;
            this.fromTime = builder.fromTime;
            this.interval = builder.interval;
            this.maxRetries = builder.maxRetries;
            this.maxRunTimeInSeconds = builder.maxRunTimeInSeconds;
            this.regionId = builder.regionId;
            this.scheduleMode = builder.scheduleMode;
            this.scheduleTimeExpr = builder.scheduleTimeExpr;
            this.sourcePrometheusId = builder.sourcePrometheusId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.targetPrometheusId = builder.targetPrometheusId;
            this.toTime = builder.toTime;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AggTaskGroups create() {
            return builder().build();
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
         * @return interval
         */
        public String getInterval() {
            return this.interval;
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

        public static final class Builder {
            private String aggTaskGroupConfigHash; 
            private String aggTaskGroupId; 
            private String aggTaskGroupName; 
            private String cronExpr; 
            private Integer delay; 
            private String description; 
            private Long fromTime; 
            private String interval; 
            private Integer maxRetries; 
            private Integer maxRunTimeInSeconds; 
            private String regionId; 
            private String scheduleMode; 
            private String scheduleTimeExpr; 
            private String sourcePrometheusId; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String targetPrometheusId; 
            private Long toTime; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(AggTaskGroups model) {
                this.aggTaskGroupConfigHash = model.aggTaskGroupConfigHash;
                this.aggTaskGroupId = model.aggTaskGroupId;
                this.aggTaskGroupName = model.aggTaskGroupName;
                this.cronExpr = model.cronExpr;
                this.delay = model.delay;
                this.description = model.description;
                this.fromTime = model.fromTime;
                this.interval = model.interval;
                this.maxRetries = model.maxRetries;
                this.maxRunTimeInSeconds = model.maxRunTimeInSeconds;
                this.regionId = model.regionId;
                this.scheduleMode = model.scheduleMode;
                this.scheduleTimeExpr = model.scheduleTimeExpr;
                this.sourcePrometheusId = model.sourcePrometheusId;
                this.status = model.status;
                this.tags = model.tags;
                this.targetPrometheusId = model.targetPrometheusId;
                this.toTime = model.toTime;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Hash of the aggregation task group configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>a54136014xxx</p>
             */
            public Builder aggTaskGroupConfigHash(String aggTaskGroupConfigHash) {
                this.aggTaskGroupConfigHash = aggTaskGroupConfigHash;
                return this;
            }

            /**
             * <p>ID of the aggregation task group.</p>
             * 
             * <strong>example:</strong>
             * <p>aggTaskGroup-xxxx</p>
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
             * <p>Cron expression for the aggregation task group when the scheduling mode is set to &quot;Cron&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>0 10 8 1 * ? *</p>
             */
            public Builder cronExpr(String cronExpr) {
                this.cronExpr = cronExpr;
                return this;
            }

            /**
             * <p>Fixed delay time (in seconds) for scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder delay(Integer delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>Description of the aggregation task group.</p>
             * 
             * <strong>example:</strong>
             * <p>workspace api monitor update test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Start time of the schedule in seconds since epoch.</p>
             * 
             * <strong>example:</strong>
             * <p>1757409499000</p>
             */
            public Builder fromTime(Long fromTime) {
                this.fromTime = fromTime;
                return this;
            }

            /**
             * <p>Scheduling interval.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-24 00:00:00,2025-04-24 00:00:00</p>
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>Maximum number of retries for the aggregation task.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxRetries(Integer maxRetries) {
                this.maxRetries = maxRetries;
                return this;
            }

            /**
             * <p>Maximum retry time (in seconds) for the aggregation task.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder maxRunTimeInSeconds(Integer maxRunTimeInSeconds) {
                this.maxRunTimeInSeconds = maxRunTimeInSeconds;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
             * <p>The source Prometheus instance ID of the aggregation task group.</p>
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
             * <p>The second-level timestamp corresponding to the end time of scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder toTime(Long toTime) {
                this.toTime = toTime;
                return this;
            }

            /**
             * <p>Update time of the aggregation task group.</p>
             * 
             * <strong>example:</strong>
             * <p>1757409499000</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public AggTaskGroups build() {
                return new AggTaskGroups(this);
            } 

        } 

    }
}
