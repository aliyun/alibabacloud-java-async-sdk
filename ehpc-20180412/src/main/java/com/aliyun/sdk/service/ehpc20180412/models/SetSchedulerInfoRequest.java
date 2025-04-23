// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link SetSchedulerInfoRequest} extends {@link RequestModel}
 *
 * <p>SetSchedulerInfoRequest</p>
 */
public class SetSchedulerInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PbsInfo")
    private java.util.List<PbsInfo> pbsInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Scheduler> scheduler;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlurmInfo")
    private java.util.List<SlurmInfo> slurmInfo;

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
    public java.util.List<PbsInfo> getPbsInfo() {
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
    public java.util.List<Scheduler> getScheduler() {
        return this.scheduler;
    }

    /**
     * @return slurmInfo
     */
    public java.util.List<SlurmInfo> getSlurmInfo() {
        return this.slurmInfo;
    }

    public static final class Builder extends Request.Builder<SetSchedulerInfoRequest, Builder> {
        private String clusterId; 
        private java.util.List<PbsInfo> pbsInfo; 
        private String regionId; 
        private java.util.List<Scheduler> scheduler; 
        private java.util.List<SlurmInfo> slurmInfo; 

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
         * <p>The ID of the E-HPC cluster.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The information about PBS schedulers.</p>
         */
        public Builder pbsInfo(java.util.List<PbsInfo> pbsInfo) {
            this.putQueryParameter("PbsInfo", pbsInfo);
            this.pbsInfo = pbsInfo;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/188593.html">ListRegions</a> operation to obtain the IDs of regions supported by Elastic High Performance Computing (E-HPC).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The scheduler information.</p>
         * <p>This parameter is required.</p>
         */
        public Builder scheduler(java.util.List<Scheduler> scheduler) {
            this.putQueryParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * <p>The information about Slurm schedulers.</p>
         */
        public Builder slurmInfo(java.util.List<SlurmInfo> slurmInfo) {
            this.putQueryParameter("SlurmInfo", slurmInfo);
            this.slurmInfo = slurmInfo;
            return this;
        }

        @Override
        public SetSchedulerInfoRequest build() {
            return new SetSchedulerInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetSchedulerInfoRequest} extends {@link TeaModel}
     *
     * <p>SetSchedulerInfoRequest</p>
     */
    public static class AclLimit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclUsers")
        private String aclUsers;

        @com.aliyun.core.annotation.NameInMap("Queue")
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

            private Builder() {
            } 

            private Builder(AclLimit model) {
                this.aclUsers = model.aclUsers;
                this.queue = model.queue;
            } 

            /**
             * <p>The user that can use the queue. Separate multiple users with commas (<code>,</code>).</p>
             * <p>If you specify users, you must specify the PbsInfo.N.AclLimit.N.Queue parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>user1,user2</p>
             */
            public Builder aclUsers(String aclUsers) {
                this.aclUsers = aclUsers;
                return this;
            }

            /**
             * <p>AclLimit specifies the queue that has limits when it is used. Valid values of N: 0 to 100.</p>
             * <p>If you set <code>PbsInfo.N.AclLimit.N.Queue</code> to <code>workq</code> and <code>PbsInfo.N.AclLimit.N.AclUsers</code> to <code>user1,user2</code>, workq can be used only by user1 and user2.</p>
             * 
             * <strong>example:</strong>
             * <p>workq</p>
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
    /**
     * 
     * {@link SetSchedulerInfoRequest} extends {@link TeaModel}
     *
     * <p>SetSchedulerInfoRequest</p>
     */
    public static class ResourceLimit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpus")
        private Integer cpus;

        @com.aliyun.core.annotation.NameInMap("MaxJobs")
        private Integer maxJobs;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private String mem;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private Integer nodes;

        @com.aliyun.core.annotation.NameInMap("Queue")
        private String queue;

        @com.aliyun.core.annotation.NameInMap("User")
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

            private Builder() {
            } 

            private Builder(ResourceLimit model) {
                this.cpus = model.cpus;
                this.maxJobs = model.maxJobs;
                this.mem = model.mem;
                this.nodes = model.nodes;
                this.queue = model.queue;
                this.user = model.user;
            } 

            /**
             * <p>The maximum number of vCPUs that can be used for nodes in a queue.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpus(Integer cpus) {
                this.cpus = cpus;
                return this;
            }

            /**
             * <p>The maximum number of jobs that can be submitted to the cluster. If the total number of running jobs and queuing jobs exceeds the value, no more jobs can be submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxJobs(Integer maxJobs) {
                this.maxJobs = maxJobs;
                return this;
            }

            /**
             * <p>The maximum memory resources that can be used in a queue. Units:</p>
             * <ul>
             * <li>gb</li>
             * <li>mb</li>
             * <li>kb</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2gb</p>
             */
            public Builder mem(String mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>The maximum number of nodes that can be used in a queue.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodes(Integer nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>PbsInfo specifies the number of PBS schedulers that can be configured in the cluster. Valid values of N: 0 to 100.</p>
             * <p>ResourceLimit specifies the maximum number of queue resources that can be used. Valid values of N: 0 to 100.</p>
             * <p>Queue specifies the name of the queue that is used to run jobs.</p>
             * <p>If one of the User, Cpus, Nodes, and Mem parameters is set in ResourceLimit, you must specify the Queue parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>workq</p>
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * <p>The name of the user that runs jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>user1</p>
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
    /**
     * 
     * {@link SetSchedulerInfoRequest} extends {@link TeaModel}
     *
     * <p>SetSchedulerInfoRequest</p>
     */
    public static class PbsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclLimit")
        private java.util.List<AclLimit> aclLimit;

        @com.aliyun.core.annotation.NameInMap("JobHistoryDuration")
        private Integer jobHistoryDuration;

        @com.aliyun.core.annotation.NameInMap("ResourceLimit")
        private java.util.List<ResourceLimit> resourceLimit;

        @com.aliyun.core.annotation.NameInMap("SchedInterval")
        private Integer schedInterval;

        @com.aliyun.core.annotation.NameInMap("SchedMaxJobs")
        private Integer schedMaxJobs;

        @com.aliyun.core.annotation.NameInMap("SchedMaxQueuedJobs")
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
        public java.util.List<AclLimit> getAclLimit() {
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
        public java.util.List<ResourceLimit> getResourceLimit() {
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
            private java.util.List<AclLimit> aclLimit; 
            private Integer jobHistoryDuration; 
            private java.util.List<ResourceLimit> resourceLimit; 
            private Integer schedInterval; 
            private Integer schedMaxJobs; 
            private Integer schedMaxQueuedJobs; 

            private Builder() {
            } 

            private Builder(PbsInfo model) {
                this.aclLimit = model.aclLimit;
                this.jobHistoryDuration = model.jobHistoryDuration;
                this.resourceLimit = model.resourceLimit;
                this.schedInterval = model.schedInterval;
                this.schedMaxJobs = model.schedMaxJobs;
                this.schedMaxQueuedJobs = model.schedMaxQueuedJobs;
            } 

            /**
             * <p>The information about limits on the queue.</p>
             */
            public Builder aclLimit(java.util.List<AclLimit> aclLimit) {
                this.aclLimit = aclLimit;
                return this;
            }

            /**
             * <p>The retention period of jobs. After the retention period is exceeded, job data is deleted. Unit: days.<br>Valid values: 1 to 30.<br>Default value: 14.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder jobHistoryDuration(Integer jobHistoryDuration) {
                this.jobHistoryDuration = jobHistoryDuration;
                return this;
            }

            /**
             * <p>The information about the nodes that are used by cluster users.</p>
             */
            public Builder resourceLimit(java.util.List<ResourceLimit> resourceLimit) {
                this.resourceLimit = resourceLimit;
                return this;
            }

            /**
             * <p>PbsInfo specifies the number of PBS schedulers that can be configured in the cluster. Valid values of N: 0 to 100.</p>
             * <p>SchedInterval specifies the scheduling period. Unit: seconds.</p>
             * <p>A scheduling period is the interval between two consecutive running jobs. If you set SchedInterval to 60, another job can be run 60 seconds after a job starts running.</p>
             * <p>Default value: 60.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder schedInterval(Integer schedInterval) {
                this.schedInterval = schedInterval;
                return this;
            }

            /**
             * <p>The maximum number of jobs that can be scheduled in the cluster. If the total number of running jobs and queuing jobs exceeds the value, no more jobs can be submitted. Default value: 20000.</p>
             * 
             * <strong>example:</strong>
             * <p>20000</p>
             */
            public Builder schedMaxJobs(Integer schedMaxJobs) {
                this.schedMaxJobs = schedMaxJobs;
                return this;
            }

            /**
             * <p>The maximum number of queuing jobs that can be scheduled in the cluster. If the number of queuing jobs exceeds the value, no more jobs can be submitted. Default value: 10000.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
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
    /**
     * 
     * {@link SetSchedulerInfoRequest} extends {@link TeaModel}
     *
     * <p>SetSchedulerInfoRequest</p>
     */
    public static class Scheduler extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SchedName")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(Scheduler model) {
                this.schedName = model.schedName;
            } 

            /**
             * <p>The name of the scheduler. Valid values:</p>
             * <ul>
             * <li>pbs</li>
             * <li>pbs19</li>
             * <li>slurm</li>
             * <li>slurm19</li>
             * <li>slurm20</li>
             * </ul>
             * <blockquote>
             * <p> If you set Scheduler.N.SchedName to pbs or pbs19, you must specify at least one of the PbsInfo.N.SchedInterval, PbsInfo.N.JobHistoryDuration, PbsInfo.N.ResourceLimit, and PbsInfo.N.AclLimit parameters. If you set Scheduler.N.SchedName to slurm, slurm19, or slurm20, you must specify at least one of the SlurmInfo.N.SchedInterval and SlurmInfo.N.BackfillInterval parameters.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>pbs</p>
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
    /**
     * 
     * {@link SetSchedulerInfoRequest} extends {@link TeaModel}
     *
     * <p>SetSchedulerInfoRequest</p>
     */
    public static class SlurmInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackfillInterval")
        private Integer backfillInterval;

        @com.aliyun.core.annotation.NameInMap("SchedInterval")
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

            private Builder() {
            } 

            private Builder(SlurmInfo model) {
                this.backfillInterval = model.backfillInterval;
                this.schedInterval = model.schedInterval;
            } 

            /**
             * <p>The backfill scheduling period. Unit: seconds.</p>
             * <p>Default value: 60.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder backfillInterval(Integer backfillInterval) {
                this.backfillInterval = backfillInterval;
                return this;
            }

            /**
             * <p>SlurmInfo specifies the number of Slurm schedulers that can be configured in the cluster. Valid values of N: 0 to 100.</p>
             * <p>SchedInterval specifies the scheduling period. Unit: seconds.</p>
             * <p>Default value: 60.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
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
