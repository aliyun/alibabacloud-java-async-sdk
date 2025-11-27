// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link ListActionPlanActivitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListActionPlanActivitiesResponseBody</p>
 */
public class ListActionPlanActivitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActionPlanActivities")
    private java.util.List<ActionPlanActivities> actionPlanActivities;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListActionPlanActivitiesResponseBody(Builder builder) {
        this.actionPlanActivities = builder.actionPlanActivities;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListActionPlanActivitiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionPlanActivities
     */
    public java.util.List<ActionPlanActivities> getActionPlanActivities() {
        return this.actionPlanActivities;
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
        private java.util.List<ActionPlanActivities> actionPlanActivities; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListActionPlanActivitiesResponseBody model) {
            this.actionPlanActivities = model.actionPlanActivities;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of execution details of the execution plan.</p>
         */
        public Builder actionPlanActivities(java.util.List<ActionPlanActivities> actionPlanActivities) {
            this.actionPlanActivities = actionPlanActivities;
            return this;
        }

        /**
         * <p>The maximum number of records returned in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Indicates the read position returned by the current call. An empty value means all data has been read.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1d2db86scXXXXXXXXXX</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total data count under the current request conditions (optional; not returned by default).</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListActionPlanActivitiesResponseBody build() {
            return new ListActionPlanActivitiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListActionPlanActivitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListActionPlanActivitiesResponseBody</p>
     */
    public static class Jobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobOperationType")
        private String jobOperationType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private Jobs(Builder builder) {
            this.jobId = builder.jobId;
            this.jobOperationType = builder.jobOperationType;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobOperationType
         */
        public String getJobOperationType() {
            return this.jobOperationType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String jobId; 
            private String jobOperationType; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(Jobs model) {
                this.jobId = model.jobId;
                this.jobOperationType = model.jobOperationType;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The ID of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>job-hz12dqq8y3ormo1hz49h</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The operation type of the execution plan activity on the job. Possible values are as follows:</p>
             * <ul>
             * <li>Create</li>
             * <li>Delete</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Create</p>
             */
            public Builder jobOperationType(String jobOperationType) {
                this.jobOperationType = jobOperationType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListActionPlanActivitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListActionPlanActivitiesResponseBody</p>
     */
    public static class ActionPlanActivities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionPlanActivityId")
        private String actionPlanActivityId;

        @com.aliyun.core.annotation.NameInMap("CreatedCapacity")
        private Float createdCapacity;

        @com.aliyun.core.annotation.NameInMap("DestroyCapacity")
        private Float destroyCapacity;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Jobs")
        private java.util.List<Jobs> jobs;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ActionPlanActivities(Builder builder) {
            this.actionPlanActivityId = builder.actionPlanActivityId;
            this.createdCapacity = builder.createdCapacity;
            this.destroyCapacity = builder.destroyCapacity;
            this.endTime = builder.endTime;
            this.jobs = builder.jobs;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionPlanActivities create() {
            return builder().build();
        }

        /**
         * @return actionPlanActivityId
         */
        public String getActionPlanActivityId() {
            return this.actionPlanActivityId;
        }

        /**
         * @return createdCapacity
         */
        public Float getCreatedCapacity() {
            return this.createdCapacity;
        }

        /**
         * @return destroyCapacity
         */
        public Float getDestroyCapacity() {
            return this.destroyCapacity;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return jobs
         */
        public java.util.List<Jobs> getJobs() {
            return this.jobs;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String actionPlanActivityId; 
            private Float createdCapacity; 
            private Float destroyCapacity; 
            private String endTime; 
            private java.util.List<Jobs> jobs; 
            private String startTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(ActionPlanActivities model) {
                this.actionPlanActivityId = model.actionPlanActivityId;
                this.createdCapacity = model.createdCapacity;
                this.destroyCapacity = model.destroyCapacity;
                this.endTime = model.endTime;
                this.jobs = model.jobs;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * <p>The activity ID of the execution plan.</p>
             * 
             * <strong>example:</strong>
             * <p>et-4119e3f60eb34fc4</p>
             */
            public Builder actionPlanActivityId(String actionPlanActivityId) {
                this.actionPlanActivityId = actionPlanActivityId;
                return this;
            }

            /**
             * <p>The increased capacity of this execution plan activity.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder createdCapacity(Float createdCapacity) {
                this.createdCapacity = createdCapacity;
                return this;
            }

            /**
             * <p>The capacity released by this execution plan activity.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder destroyCapacity(Float destroyCapacity) {
                this.destroyCapacity = destroyCapacity;
                return this;
            }

            /**
             * <p>The end time of the execution plan activity.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-10 18:28:05</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The list of Instant jobs involved in the execution plan.</p>
             */
            public Builder jobs(java.util.List<Jobs> jobs) {
                this.jobs = jobs;
                return this;
            }

            /**
             * <p>The start time of the implementation of the planned activity.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-10 18:28:05</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The implementation status of the execution plan activity. Valid values:</p>
             * <ul>
             * <li>InProcess</li>
             * <li>Completed</li>
             * <li>Failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InProcess</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ActionPlanActivities build() {
                return new ActionPlanActivities(this);
            } 

        } 

    }
}
