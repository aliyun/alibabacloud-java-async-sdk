// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link StopRCInstancesRequest} extends {@link RequestModel}
 *
 * <p>StopRCInstancesRequest</p>
 */
public class StopRCInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchOptimization")
    private String batchOptimization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceStop")
    private Boolean forceStop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private StopRCInstancesRequest(Builder builder) {
        super(builder);
        this.batchOptimization = builder.batchOptimization;
        this.forceStop = builder.forceStop;
        this.instanceIds = builder.instanceIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopRCInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchOptimization
     */
    public String getBatchOptimization() {
        return this.batchOptimization;
    }

    /**
     * @return forceStop
     */
    public Boolean getForceStop() {
        return this.forceStop;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StopRCInstancesRequest, Builder> {
        private String batchOptimization; 
        private Boolean forceStop; 
        private java.util.List<String> instanceIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StopRCInstancesRequest request) {
            super(request);
            this.batchOptimization = request.batchOptimization;
            this.forceStop = request.forceStop;
            this.instanceIds = request.instanceIds;
            this.regionId = request.regionId;
        } 

        /**
         * BatchOptimization.
         */
        public Builder batchOptimization(String batchOptimization) {
            this.putQueryParameter("BatchOptimization", batchOptimization);
            this.batchOptimization = batchOptimization;
            return this;
        }

        /**
         * ForceStop.
         */
        public Builder forceStop(Boolean forceStop) {
            this.putQueryParameter("ForceStop", forceStop);
            this.forceStop = forceStop;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
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

        @Override
        public StopRCInstancesRequest build() {
            return new StopRCInstancesRequest(this);
        } 

    } 

}
