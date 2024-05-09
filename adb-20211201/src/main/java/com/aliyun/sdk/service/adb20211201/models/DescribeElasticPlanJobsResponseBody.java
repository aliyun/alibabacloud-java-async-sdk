// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticPlanJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticPlanJobsResponseBody</p>
 */
public class DescribeElasticPlanJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Jobs")
    private java.util.List < Jobs> jobs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeElasticPlanJobsResponseBody(Builder builder) {
        this.jobs = builder.jobs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticPlanJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobs
     */
    public java.util.List < Jobs> getJobs() {
        return this.jobs;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private java.util.List < Jobs> jobs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The queried scaling plan jobs.
         */
        public Builder jobs(java.util.List < Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of scaling plan jobs.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeElasticPlanJobsResponseBody build() {
            return new DescribeElasticPlanJobsResponseBody(this);
        } 

    } 

    public static class Jobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ElasticAcu")
        private String elasticAcu;

        @com.aliyun.core.annotation.NameInMap("ElasticPlanName")
        private String elasticPlanName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceSize")
        private Integer instanceSize;

        @com.aliyun.core.annotation.NameInMap("ReserveAcu")
        private String reserveAcu;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetSize")
        private String targetSize;

        @com.aliyun.core.annotation.NameInMap("TotalAcu")
        private String totalAcu;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Jobs(Builder builder) {
            this.elasticAcu = builder.elasticAcu;
            this.elasticPlanName = builder.elasticPlanName;
            this.endTime = builder.endTime;
            this.instanceSize = builder.instanceSize;
            this.reserveAcu = builder.reserveAcu;
            this.resourceGroupName = builder.resourceGroupName;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.targetSize = builder.targetSize;
            this.totalAcu = builder.totalAcu;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return elasticAcu
         */
        public String getElasticAcu() {
            return this.elasticAcu;
        }

        /**
         * @return elasticPlanName
         */
        public String getElasticPlanName() {
            return this.elasticPlanName;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceSize
         */
        public Integer getInstanceSize() {
            return this.instanceSize;
        }

        /**
         * @return reserveAcu
         */
        public String getReserveAcu() {
            return this.reserveAcu;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
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

        /**
         * @return targetSize
         */
        public String getTargetSize() {
            return this.targetSize;
        }

        /**
         * @return totalAcu
         */
        public String getTotalAcu() {
            return this.totalAcu;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String elasticAcu; 
            private String elasticPlanName; 
            private String endTime; 
            private Integer instanceSize; 
            private String reserveAcu; 
            private String resourceGroupName; 
            private String startTime; 
            private String status; 
            private String targetSize; 
            private String totalAcu; 
            private String type; 

            /**
             * The amount of elastic resources.
             * <p>
             * 
             * > 
             * 
             * *   If Type is set to EXECUTOR, ElasticAcu indicates the amount of elastic resources in the current resource group.
             * *   If Type is set to WORKER, ElasticAcu indicates the total amount of elastic storage resources in the current cluster.
             */
            public Builder elasticAcu(String elasticAcu) {
                this.elasticAcu = elasticAcu;
                return this;
            }

            /**
             * The name of the scaling plan.
             */
            public Builder elasticPlanName(String elasticPlanName) {
                this.elasticPlanName = elasticPlanName;
                return this;
            }

            /**
             * The end time of the scaling plan job.
             * <p>
             * 
             * >  The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The number of compute nodes or storage replica sets.
             * <p>
             * 
             * > 
             * 
             * *   If Type is set to EXECUTOR, InstanceSize indicates the number of compute nodes in the cluster.
             * *   If Type is set to EXECUTOR, InstanceSize indicates the number of storage replica sets in the cluster.
             */
            public Builder instanceSize(Integer instanceSize) {
                this.instanceSize = instanceSize;
                return this;
            }

            /**
             * The amount of reserved resources.
             * <p>
             * 
             * > 
             * 
             * *   If Type is set to EXECUTOR, ReserveAcu indicates the amount of reserved resources in the current resource group.
             * *   If Type is set to WORKER, ReserveAcu indicates the total amount of reserved storage resources in the current cluster.
             */
            public Builder reserveAcu(String reserveAcu) {
                this.reserveAcu = reserveAcu;
                return this;
            }

            /**
             * The name of the resource group.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * The start time of the scaling plan job.
             * <p>
             * 
             * >  The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The state of the scaling plan job. Valid values:
             * <p>
             * 
             * *   RUNNING
             * *   SUCCESSFUL
             * *   FAILED
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The desired specifications of elastic resources after scaling.
             */
            public Builder targetSize(String targetSize) {
                this.targetSize = targetSize;
                return this;
            }

            /**
             * The total amount of resources.
             * <p>
             * 
             * > 
             * 
             * *   If Type is set to EXECUTOR, TotalAcu indicates the total amount of computing resources in the current resource group.
             * *   If Type is set to WORKER, TotalAcu indicates the total amount of storage resources in the cluster.
             */
            public Builder totalAcu(String totalAcu) {
                this.totalAcu = totalAcu;
                return this;
            }

            /**
             * The type of the scaling plan job. Valid values:
             * <p>
             * 
             * *   EXECUTOR: the interactive resource group type, which indicates the computing resource type.
             * *   WORKER: the EIU type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
