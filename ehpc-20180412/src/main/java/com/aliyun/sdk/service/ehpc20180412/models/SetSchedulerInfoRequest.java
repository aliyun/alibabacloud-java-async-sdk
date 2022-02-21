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

        private Builder(SetSchedulerInfoRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.pbsInfo = response.pbsInfo;
            this.regionId = response.regionId;
            this.scheduler = response.scheduler;
            this.slurmInfo = response.slurmInfo;
        } 

        /**
         * ClusterId.
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
         * RegionId.
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
             * AclUsers.
             */
            public Builder aclUsers(String aclUsers) {
                this.aclUsers = aclUsers;
                return this;
            }

            /**
             * Queue.
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
            private String mem; 
            private Integer nodes; 
            private String queue; 
            private String user; 

            /**
             * Cpus.
             */
            public Builder cpus(Integer cpus) {
                this.cpus = cpus;
                return this;
            }

            /**
             * Mem.
             */
            public Builder mem(String mem) {
                this.mem = mem;
                return this;
            }

            /**
             * Nodes.
             */
            public Builder nodes(Integer nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * Queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * User.
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

        private PbsInfo(Builder builder) {
            this.aclLimit = builder.aclLimit;
            this.jobHistoryDuration = builder.jobHistoryDuration;
            this.resourceLimit = builder.resourceLimit;
            this.schedInterval = builder.schedInterval;
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

        public static final class Builder {
            private java.util.List < AclLimit> aclLimit; 
            private Integer jobHistoryDuration; 
            private java.util.List < ResourceLimit> resourceLimit; 
            private Integer schedInterval; 

            /**
             * AclLimit.
             */
            public Builder aclLimit(java.util.List < AclLimit> aclLimit) {
                this.aclLimit = aclLimit;
                return this;
            }

            /**
             * JobHistoryDuration.
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
             * SchedInterval.
             */
            public Builder schedInterval(Integer schedInterval) {
                this.schedInterval = schedInterval;
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
             * SchedName.
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
             * BackfillInterval.
             */
            public Builder backfillInterval(Integer backfillInterval) {
                this.backfillInterval = backfillInterval;
                return this;
            }

            /**
             * SchedInterval.
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
