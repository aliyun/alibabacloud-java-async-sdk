// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkastreaming20260202.models;

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
 * {@link StopComputeJobRequest} extends {@link RequestModel}
 *
 * <p>StopComputeJobRequest</p>
 */
public class StopComputeJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StopStrategy")
    private String stopStrategy;

    private StopComputeJobRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.jobName = builder.jobName;
        this.regionId = builder.regionId;
        this.stopStrategy = builder.stopStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopComputeJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stopStrategy
     */
    public String getStopStrategy() {
        return this.stopStrategy;
    }

    public static final class Builder extends Request.Builder<StopComputeJobRequest, Builder> {
        private String instanceId; 
        private String jobName; 
        private String regionId; 
        private String stopStrategy; 

        private Builder() {
            super();
        } 

        private Builder(StopComputeJobRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.jobName = request.jobName;
            this.regionId = request.regionId;
            this.stopStrategy = request.stopStrategy;
        } 

        /**
         * <p>The ID of the computing instance, excluding the region name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_streaming-cn-pe333xxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the computing job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>order_enrichment</p>
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The job stop strategy. Default value: <code>CANCEL</code> if omitted.</p>
         * <ul>
         * <li><code>CANCEL</code>: Stops the job directly and skips the current savepoint.</li>
         * <li><code>STOP_WITH_SAVEPOINT</code>: Creates a savepoint and then stops the job.</li>
         * <li><code>STOP_WITH_DRAIN</code>: Stops the job in drain mode and creates a savepoint, triggering the output of event time windows.</li>
         * </ul>
         * <p>Strategies with savepoints apply only to running production jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>STOP_WITH_SAVEPOINT</p>
         */
        public Builder stopStrategy(String stopStrategy) {
            this.putQueryParameter("StopStrategy", stopStrategy);
            this.stopStrategy = stopStrategy;
            return this;
        }

        @Override
        public StopComputeJobRequest build() {
            return new StopComputeJobRequest(this);
        } 

    } 

}
