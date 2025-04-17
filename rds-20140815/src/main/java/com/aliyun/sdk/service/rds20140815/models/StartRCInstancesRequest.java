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
 * {@link StartRCInstancesRequest} extends {@link RequestModel}
 *
 * <p>StartRCInstancesRequest</p>
 */
public class StartRCInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchOptimization")
    private String batchOptimization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private StartRCInstancesRequest(Builder builder) {
        super(builder);
        this.batchOptimization = builder.batchOptimization;
        this.instanceIds = builder.instanceIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartRCInstancesRequest create() {
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

    public static final class Builder extends Request.Builder<StartRCInstancesRequest, Builder> {
        private String batchOptimization; 
        private java.util.List<String> instanceIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StartRCInstancesRequest request) {
            super(request);
            this.batchOptimization = request.batchOptimization;
            this.instanceIds = request.instanceIds;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The batch operation mode. Set the value to <strong>AllTogether</strong>. In this mode, a success message is returned if all specified instances are started. If an instance fails the verification, none of the specified instances can be started and an error message is returned.</p>
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
        public StartRCInstancesRequest build() {
            return new StartRCInstancesRequest(this);
        } 

    } 

}
