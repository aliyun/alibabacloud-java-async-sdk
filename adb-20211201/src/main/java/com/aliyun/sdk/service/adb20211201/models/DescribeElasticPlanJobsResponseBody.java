// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticPlanJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticPlanJobsResponseBody</p>
 */
public class DescribeElasticPlanJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    private java.util.List < Jobs> jobs;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * Details of the scaling plan jobs.
         */
        public Builder jobs(java.util.List < Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of scaling plan jobs returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
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
        @NameInMap("ElasticAcu")
        private String elasticAcu;

        @NameInMap("ElasticPlanName")
        private String elasticPlanName;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("InstanceSize")
        private Integer instanceSize;

        @NameInMap("ReserveAcu")
        private String reserveAcu;

        @NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TargetSize")
        private String targetSize;

        @NameInMap("TotalAcu")
        private String totalAcu;

        @NameInMap("Type")
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
             * > *   If the Type parameter is set to EXECUTOR, ElasticAcu indicates the amount of elastic resources in the current resource group.
             * > *   If the Type parameter is set to WORKER, ElasticAcu indicates the total amount of elastic storage resources in the current cluster.
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
             * The time when the scaling plan job was complete.
             * <p>
             * 
             * >  The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The number of instances.
             * <p>
             * 
             * > *   If the Type parameter is set to EXECUTOR, InstanceSize indicates the number of compute nodes.
             * > *   If the Type parameter is set to EXECUTOR, InstanceSize indicates the number of replica sets at the storage layer in the cluster.
             */
            public Builder instanceSize(Integer instanceSize) {
                this.instanceSize = instanceSize;
                return this;
            }

            /**
             * The amount of reserved resources.
             * <p>
             * 
             * > *   If the Type parameter is set to EXECUTOR, ReserveAcu indicates the amount of reserved resources in the current resource group.
             * > *   If the Type parameter is set to WORKER, ReserveAcu indicates the total amount of reserved storage resources in the current cluster.
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
             * The time when the scaling plan job was enabled.
             * <p>
             * 
             * >  The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The state of the scaling plan job.
             * <p>
             * 
             * Valid values:
             * 
             * *   RUNNING: The job is running.
             * *   SUCCESSFUL: The job is successfully run.
             * *   FAILED: The job fails.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The amount of elastic resources after scaling.
             */
            public Builder targetSize(String targetSize) {
                this.targetSize = targetSize;
                return this;
            }

            /**
             * The total amount of resources.
             * <p>
             * 
             * > *   If the Type parameter is set to EXECUTOR, TotalAcu indicates the total amount of computing resources in the current resource group.
             * > *   If the Type parameter is set to WORKER, TotalAcu indicates the total amount of storage resources in the cluster.
             */
            public Builder totalAcu(String totalAcu) {
                this.totalAcu = totalAcu;
                return this;
            }

            /**
             * The type of the scaling plan job.
             * <p>
             * 
             * Valid values:
             * 
             * *   EXECUTOR: interactive resource groups, which fall into the computing resource category.
             * *   WORKER: EIUs.
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
