// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSchedulerInfoRequest} extends {@link RequestModel}
 *
 * <p>SetSchedulerInfoRequest</p>
 */
public class SetSchedulerInfoRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("PbsInfo")
    private java.util.List < PbsInfo> pbsInfo;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Scheduler")
    @Validation(required = true)
    private java.util.List < Scheduler> scheduler;

    @Query
    @NameInMap("SlurmInfo")
    private java.util.List < SlurmInfo> slurmInfo;

    private SetSchedulerInfoRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.pbsInfo = builder.pbsInfo;
        this.regionId = builder.regionId;
        this.scheduler = builder.scheduler;
        this.slurmInfo = builder.slurmInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSchedulerInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return pbsInfo
     */
    public java.util.List < PbsInfo> getPbsInfo() {
        return this.pbsInfo;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scheduler
     */
    public java.util.List < Scheduler> getScheduler() {
        return this.scheduler;
    }

    /**
     * @return slurmInfo
     */
    public java.util.List < SlurmInfo> getSlurmInfo() {
        return this.slurmInfo;
    }

    public static final class Builder extends Request.Builder<SetSchedulerInfoRequest, Builder> {
        private String clusterId; 
        private java.util.List < PbsInfo> pbsInfo; 
        private String regionId; 
        private java.util.List < Scheduler> scheduler; 
        private java.util.List < SlurmInfo> slurmInfo; 

        private Builder() {
            super();
        } 

        private Builder(SetSchedulerInfoRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.pbsInfo = request.pbsInfo;
            this.regionId = request.regionId;
            this.scheduler = request.scheduler;
            this.slurmInfo = request.slurmInfo;
        } 

        /**
         * The ID of the cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * PbsInfo.
         */
        public Builder pbsInfo(java.util.List < PbsInfo> pbsInfo) {
            this.putQueryParameter("PbsInfo", pbsInfo);
            this.pbsInfo = pbsInfo;
            return this;
        }

        /**
         * The ID of the region.
         * <p>
         * 
         * You can call the [ListRegions](~~188593~~) operation to obtain the IDs of regions supported by Elastic High Performance Computing (E-HPC).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Scheduler.
         */
        public Builder scheduler(java.util.List < Scheduler> scheduler) {
            this.putQueryParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * SlurmInfo.
         */
        public Builder slurmInfo(java.util.List < SlurmInfo> slurmInfo) {
            this.putQueryParameter("SlurmInfo", slurmInfo);
            this.slurmInfo = slurmInfo;
            return this;
        }

        @Override
        public SetSchedulerInfoRequest build() {
            return new SetSchedulerInfoRequest(this);
        } 

    } 

    public static class AclLimit extends TeaModel {
        @NameInMap("AclUsers")
        private String aclUsers;

        @NameInMap("Queue")
        private String queue;

        private AclLimit(Builder builder) {
            this.aclUsers = builder.aclUsers;
            this.queue = builder.queue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclLimit create() {
            return builder().build();
        }

        /**
         * @return aclUsers
         */
        public String getAclUsers() {
            return this.aclUsers;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        public static final class Builder {
            private String aclUsers; 
            private String queue; 

            /**
             * The user that can use the queue. Separate multiple users with commas (`,`).
             * <p>
             * 
             * If you specify users, you must specify the PbsInfo.N.AclLimit.N.Queue parameter.
             */
            public Builder aclUsers(String aclUsers) {
                this.aclUsers = aclUsers;
                return this;
            }

            /**
             * AclLimit specifies the queue that has limits when it is used. Valid values of N: 0 to 100.
             * <p>
             * 
             * If you set `PbsInfo.N.AclLimit.N.Queue` to `workq` and `PbsInfo.N.AclLimit.N.AclUsers` to `user1,user2`, workq can be used only by user1 and user2.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            public AclLimit build() {
                return new AclLimit(this);
            } 

        } 

    }
    public static class ResourceLimit extends TeaModel {
        @NameInMap("Cpus")
        private Integer cpus;

        @NameInMap("MaxJobs")
        private Integer maxJobs;

        @NameInMap("Mem")
        private String mem;

        @NameInMap("Nodes")
        private Integer nodes;

        @NameInMap("Queue")
        private String queue;

        @NameInMap("User")
        private String user;

        private ResourceLimit(Builder builder) {
            this.cpus = builder.cpus;
            this.maxJobs = builder.maxJobs;
            this.mem = builder.mem;
            this.nodes = builder.nodes;
            this.queue = builder.queue;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceLimit create() {
            return builder().build();
        }

        /**
         * @return cpus
         */
        public Integer getCpus() {
            return this.cpus;
        }

        /**
         * @return maxJobs
         */
        public Integer getMaxJobs() {
            return this.maxJobs;
        }

        /**
         * @return mem
         */
        public String getMem() {
            return this.mem;
        }

        /**
         * @return nodes
         */
        public Integer getNodes() {
            return this.nodes;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private Integer cpus; 
            private Integer maxJobs; 
            private String mem; 
            private Integer nodes; 
            private String queue; 
            private String user; 

            /**
             * The maximum number of vCPUs that can be used for nodes in a queue.
             */
            public Builder cpus(Integer cpus) {
                this.cpus = cpus;
                return this;
            }

            /**
             * The maximum number of jobs that can be submitted to the cluster. If the total number of running jobs and queuing jobs exceeds the value, no more jobs can be submitted.
             */
            public Builder maxJobs(Integer maxJobs) {
                this.maxJobs = maxJobs;
                return this;
            }

            /**
             * The maximum memory resources that can be used in a queue. Units:
             * <p>
             * 
             * *   gb
             * *   mb
             * *   kb
             */
            public Builder mem(String mem) {
                this.mem = mem;
                return this;
            }

            /**
             * The maximum number of nodes that can be used in a queue.
             */
            public Builder nodes(Integer nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * PbsInfo specifies the number of PBS schedulers that can be configured in the cluster. Valid values of N: 0 to 100.
             * <p>
             * 
             * ResourceLimit specifies the maximum number of queue resources that can be used. Valid values of N: 0 to 100.
             * 
             * Queue specifies the name of the queue that is used to run jobs.
             * 
             * If one of the User, Cpus, Nodes, and Mem parameters is set in ResourceLimit, you must specify the Queue parameter.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * The name of the user that runs jobs.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public ResourceLimit build() {
                return new ResourceLimit(this);
            } 

        } 

    }
    public static class PbsInfo extends TeaModel {
        @NameInMap("AclLimit")
        private java.util.List < AclLimit> aclLimit;

        @NameInMap("JobHistoryDuration")
        private Integer jobHistoryDuration;

        @NameInMap("ResourceLimit")
        private java.util.List < ResourceLimit> resourceLimit;

        @NameInMap("SchedInterval")
        private Integer schedInterval;

        @NameInMap("SchedMaxJobs")
        private Integer schedMaxJobs;

        @NameInMap("SchedMaxQueuedJobs")
        private Integer schedMaxQueuedJobs;

        private PbsInfo(Builder builder) {
            this.aclLimit = builder.aclLimit;
            this.jobHistoryDuration = builder.jobHistoryDuration;
            this.resourceLimit = builder.resourceLimit;
            this.schedInterval = builder.schedInterval;
            this.schedMaxJobs = builder.schedMaxJobs;
            this.schedMaxQueuedJobs = builder.schedMaxQueuedJobs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PbsInfo create() {
            return builder().build();
        }

        /**
         * @return aclLimit
         */
        public java.util.List < AclLimit> getAclLimit() {
            return this.aclLimit;
        }

        /**
         * @return jobHistoryDuration
         */
        public Integer getJobHistoryDuration() {
            return this.jobHistoryDuration;
        }

        /**
         * @return resourceLimit
         */
        public java.util.List < ResourceLimit> getResourceLimit() {
            return this.resourceLimit;
        }

        /**
         * @return schedInterval
         */
        public Integer getSchedInterval() {
            return this.schedInterval;
        }

        /**
         * @return schedMaxJobs
         */
        public Integer getSchedMaxJobs() {
            return this.schedMaxJobs;
        }

        /**
         * @return schedMaxQueuedJobs
         */
        public Integer getSchedMaxQueuedJobs() {
            return this.schedMaxQueuedJobs;
        }

        public static final class Builder {
            private java.util.List < AclLimit> aclLimit; 
            private Integer jobHistoryDuration; 
            private java.util.List < ResourceLimit> resourceLimit; 
            private Integer schedInterval; 
            private Integer schedMaxJobs; 
            private Integer schedMaxQueuedJobs; 

            /**
             * AclLimit.
             */
            public Builder aclLimit(java.util.List < AclLimit> aclLimit) {
                this.aclLimit = aclLimit;
                return this;
            }

            /**
             * The retention period of jobs. After the retention period is exceeded, job data is deleted. Unit: days.
             * <p>
             * 
             * Valid values: 1 to 30
             * 
             * Default value: 14
             */
            public Builder jobHistoryDuration(Integer jobHistoryDuration) {
                this.jobHistoryDuration = jobHistoryDuration;
                return this;
            }

            /**
             * ResourceLimit.
             */
            public Builder resourceLimit(java.util.List < ResourceLimit> resourceLimit) {
                this.resourceLimit = resourceLimit;
                return this;
            }

            /**
             * PbsInfo specifies the number of PBS schedulers that can be configured in the cluster. Valid values of N: 0 to 100.
             * <p>
             * 
             * SchedInterval specifies the scheduling period. Unit: seconds.
             * 
             * A scheduling period is the interval between two consecutive running jobs. If you set SchedInterval to 60, another job can be run 60 seconds after a job starts running.
             * 
             * Default value: 60
             */
            public Builder schedInterval(Integer schedInterval) {
                this.schedInterval = schedInterval;
                return this;
            }

            /**
             * The maximum number of jobs that can be scheduled in the cluster. If the total number of running jobs and queuing jobs exceeds the value, no more jobs can be submitted. Default value: 20000.
             */
            public Builder schedMaxJobs(Integer schedMaxJobs) {
                this.schedMaxJobs = schedMaxJobs;
                return this;
            }

            /**
             * The maximum number of queuing jobs that can be scheduled in the cluster. If the number of queuing jobs exceeds the value, no more jobs can be submitted. Default value: 10000.
             */
            public Builder schedMaxQueuedJobs(Integer schedMaxQueuedJobs) {
                this.schedMaxQueuedJobs = schedMaxQueuedJobs;
                return this;
            }

            public PbsInfo build() {
                return new PbsInfo(this);
            } 

        } 

    }
    public static class Scheduler extends TeaModel {
        @NameInMap("SchedName")
        @Validation(required = true)
        private String schedName;

        private Scheduler(Builder builder) {
            this.schedName = builder.schedName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scheduler create() {
            return builder().build();
        }

        /**
         * @return schedName
         */
        public String getSchedName() {
            return this.schedName;
        }

        public static final class Builder {
            private String schedName; 

            /**
             * The name of the scheduler. Valid values:
             * <p>
             * 
             * *   pbs
             * *   pbs19
             * *   slurm
             * *   slurm19
             * *   slurm20
             * 
             * >  If you set Scheduler.N.SchedName to pbs or pbs19, you must specify at least one of the PbsInfo.N.SchedInterval, PbsInfo.N.JobHistoryDuration, and PbsInfo.N.AclLimit parameters. If you set Scheduler.N.SchedName to slurm, slurm19, or slurm20, you must specify at least one of the SlurmInfo.N.SchedInterval and SlurmInfo.N.BackfillInterval parameters.
             */
            public Builder schedName(String schedName) {
                this.schedName = schedName;
                return this;
            }

            public Scheduler build() {
                return new Scheduler(this);
            } 

        } 

    }
    public static class SlurmInfo extends TeaModel {
        @NameInMap("BackfillInterval")
        private Integer backfillInterval;

        @NameInMap("SchedInterval")
        private Integer schedInterval;

        private SlurmInfo(Builder builder) {
            this.backfillInterval = builder.backfillInterval;
            this.schedInterval = builder.schedInterval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlurmInfo create() {
            return builder().build();
        }

        /**
         * @return backfillInterval
         */
        public Integer getBackfillInterval() {
            return this.backfillInterval;
        }

        /**
         * @return schedInterval
         */
        public Integer getSchedInterval() {
            return this.schedInterval;
        }

        public static final class Builder {
            private Integer backfillInterval; 
            private Integer schedInterval; 

            /**
             * The backfill scheduling period. Unit: seconds.
             * <p>
             * 
             * Default value: 60
             */
            public Builder backfillInterval(Integer backfillInterval) {
                this.backfillInterval = backfillInterval;
                return this;
            }

            /**
             * SlurmInfo specifies the number of Slurm schedulers that can be configured in the cluster. Valid values of N: 0 to 100.
             * <p>
             * 
             * SchedInterval specifies the scheduling period. Unit: seconds.
             * 
             * Default value: 60
             */
            public Builder schedInterval(Integer schedInterval) {
                this.schedInterval = schedInterval;
                return this;
            }

            public SlurmInfo build() {
                return new SlurmInfo(this);
            } 

        } 

    }
}
