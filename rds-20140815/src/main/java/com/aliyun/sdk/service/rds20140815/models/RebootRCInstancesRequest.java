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
 * {@link RebootRCInstancesRequest} extends {@link RequestModel}
 *
 * <p>RebootRCInstancesRequest</p>
 */
public class RebootRCInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchOptimization")
    private String batchOptimization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceReboot")
    private Boolean forceReboot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private RebootRCInstancesRequest(Builder builder) {
        super(builder);
        this.batchOptimization = builder.batchOptimization;
        this.forceReboot = builder.forceReboot;
        this.instanceIds = builder.instanceIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootRCInstancesRequest create() {
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
     * @return forceReboot
     */
    public Boolean getForceReboot() {
        return this.forceReboot;
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

    public static final class Builder extends Request.Builder<RebootRCInstancesRequest, Builder> {
        private String batchOptimization; 
        private Boolean forceReboot; 
        private java.util.List<String> instanceIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RebootRCInstancesRequest request) {
            super(request);
            this.batchOptimization = request.batchOptimization;
            this.forceReboot = request.forceReboot;
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
         * ForceReboot.
         */
        public Builder forceReboot(Boolean forceReboot) {
            this.putQueryParameter("ForceReboot", forceReboot);
            this.forceReboot = forceReboot;
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
        public RebootRCInstancesRequest build() {
            return new RebootRCInstancesRequest(this);
        } 

    } 

}
