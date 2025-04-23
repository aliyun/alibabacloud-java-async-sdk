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
 * {@link GetSchedulerInfoRequest} extends {@link RequestModel}
 *
 * <p>GetSchedulerInfoRequest</p>
 */
public class GetSchedulerInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Scheduler> scheduler;

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
    public java.util.List<Scheduler> getScheduler() {
        return this.scheduler;
    }

    public static final class Builder extends Request.Builder<GetSchedulerInfoRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private java.util.List<Scheduler> scheduler; 

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
         * <p>The cluster ID.</p>
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
         * <p>The region ID of the cluster.</p>
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
         * <p>The detailed settings of the scheduler.</p>
         * <p>This parameter is required.</p>
         */
        public Builder scheduler(java.util.List<Scheduler> scheduler) {
            this.putQueryParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        @Override
        public GetSchedulerInfoRequest build() {
            return new GetSchedulerInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetSchedulerInfoRequest} extends {@link TeaModel}
     *
     * <p>GetSchedulerInfoRequest</p>
     */
    public static class Scheduler extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SchedName")
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
             * <p>The scheduler name. Valid values:</p>
             * <ul>
             * <li>pbs</li>
             * <li>pbs19</li>
             * <li>slurm</li>
             * <li>slurm19</li>
             * <li>slurm20</li>
             * </ul>
             * <p>Valid values of N: 0 to 100.</p>
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
}
