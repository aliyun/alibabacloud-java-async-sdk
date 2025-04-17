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
         * <p>The batch operation mode. Set the value to <strong>AllTogether</strong>. In this mode, if all instances are stopped, a success message is returned. If an instance fails the verification, none of the instances can be stopped and an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AllTogether</p>
         */
        public Builder batchOptimization(String batchOptimization) {
            this.putQueryParameter("BatchOptimization", batchOptimization);
            this.batchOptimization = batchOptimization;
            return this;
        }

        /**
         * <p>Specifies whether to forcefully stop the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: forcefully stops the instance. If an instance fails to stop due to system or network issues, a forced stop can be triggered, <strong>though it may result in data loss.</strong></li>
         * <li><strong>false</strong>: does not forcefully stop the instance. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceStop(Boolean forceStop) {
            this.putQueryParameter("ForceStop", forceStop);
            this.forceStop = forceStop;
            return this;
        }

        /**
         * <p>The node IDs.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
