// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSchedulerInfoRequest} extends {@link RequestModel}
 *
 * <p>GetSchedulerInfoRequest</p>
 */
public class GetSchedulerInfoRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Scheduler")
    @Validation(required = true)
    private java.util.List < Scheduler> scheduler;

    private GetSchedulerInfoRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.scheduler = builder.scheduler;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSchedulerInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetSchedulerInfoRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private java.util.List < Scheduler> scheduler; 

        private Builder() {
            super();
        } 

        private Builder(GetSchedulerInfoRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
            this.scheduler = request.scheduler;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the region.
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

        @Override
        public GetSchedulerInfoRequest build() {
            return new GetSchedulerInfoRequest(this);
        } 

    } 

    public static class Scheduler extends TeaModel {
        @NameInMap("SchedName")
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
             * Valid values of N: 0 to 100
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
}
