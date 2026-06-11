// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListRayJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListRayJobResponseBody</p>
 */
public class ListRayJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("rayJobs")
    private java.util.List<RayJobs> rayJobs;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListRayJobResponseBody(Builder builder) {
        this.rayJobs = builder.rayJobs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRayJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rayJobs
     */
    public java.util.List<RayJobs> getRayJobs() {
        return this.rayJobs;
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
        private java.util.List<RayJobs> rayJobs; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListRayJobResponseBody model) {
            this.rayJobs = model.rayJobs;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * rayJobs.
         */
        public Builder rayJobs(java.util.List<RayJobs> rayJobs) {
            this.rayJobs = rayJobs;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRayJobResponseBody build() {
            return new ListRayJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRayJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListRayJobResponseBody</p>
     */
    public static class RayJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterState")
        private String clusterState;

        @com.aliyun.core.annotation.NameInMap("creatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("cuHours")
        private Double cuHours;

        @com.aliyun.core.annotation.NameInMap("dashboardUrl")
        private String dashboardUrl;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("resourceQueue")
        private String resourceQueue;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("submissionId")
        private String submissionId;

        @com.aliyun.core.annotation.NameInMap("submitTime")
        private Long submitTime;

        private RayJobs(Builder builder) {
            this.clusterState = builder.clusterState;
            this.creatorName = builder.creatorName;
            this.cuHours = builder.cuHours;
            this.dashboardUrl = builder.dashboardUrl;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.name = builder.name;
            this.resourceQueue = builder.resourceQueue;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.submissionId = builder.submissionId;
            this.submitTime = builder.submitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RayJobs create() {
            return builder().build();
        }

        /**
         * @return clusterState
         */
        public String getClusterState() {
            return this.clusterState;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return cuHours
         */
        public Double getCuHours() {
            return this.cuHours;
        }

        /**
         * @return dashboardUrl
         */
        public String getDashboardUrl() {
            return this.dashboardUrl;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceQueue
         */
        public String getResourceQueue() {
            return this.resourceQueue;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submissionId
         */
        public String getSubmissionId() {
            return this.submissionId;
        }

        /**
         * @return submitTime
         */
        public Long getSubmitTime() {
            return this.submitTime;
        }

        public static final class Builder {
            private String clusterState; 
            private String creatorName; 
            private Double cuHours; 
            private String dashboardUrl; 
            private Long duration; 
            private Long endTime; 
            private String name; 
            private String resourceQueue; 
            private Long startTime; 
            private String status; 
            private String submissionId; 
            private Long submitTime; 

            private Builder() {
            } 

            private Builder(RayJobs model) {
                this.clusterState = model.clusterState;
                this.creatorName = model.creatorName;
                this.cuHours = model.cuHours;
                this.dashboardUrl = model.dashboardUrl;
                this.duration = model.duration;
                this.endTime = model.endTime;
                this.name = model.name;
                this.resourceQueue = model.resourceQueue;
                this.startTime = model.startTime;
                this.status = model.status;
                this.submissionId = model.submissionId;
                this.submitTime = model.submitTime;
            } 

            /**
             * clusterState.
             */
            public Builder clusterState(String clusterState) {
                this.clusterState = clusterState;
                return this;
            }

            /**
             * creatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * cuHours.
             */
            public Builder cuHours(Double cuHours) {
                this.cuHours = cuHours;
                return this;
            }

            /**
             * dashboardUrl.
             */
            public Builder dashboardUrl(String dashboardUrl) {
                this.dashboardUrl = dashboardUrl;
                return this;
            }

            /**
             * duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
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
             * resourceQueue.
             */
            public Builder resourceQueue(String resourceQueue) {
                this.resourceQueue = resourceQueue;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
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
             * submissionId.
             */
            public Builder submissionId(String submissionId) {
                this.submissionId = submissionId;
                return this;
            }

            /**
             * submitTime.
             */
            public Builder submitTime(Long submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            public RayJobs build() {
                return new RayJobs(this);
            } 

        } 

    }
}
