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
 * {@link ModifyRCInstanceNetworkSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyRCInstanceNetworkSpecRequest</p>
 */
public class ModifyRCInstanceNetworkSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
    private String internetMaxBandwidthOut;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkChargeType")
    private String networkChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyRCInstanceNetworkSpecRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.networkChargeType = builder.networkChargeType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRCInstanceNetworkSpecRequest create() {
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
     * @return internetMaxBandwidthOut
     */
    public String getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return networkChargeType
     */
    public String getNetworkChargeType() {
        return this.networkChargeType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyRCInstanceNetworkSpecRequest, Builder> {
        private String instanceId; 
        private String internetMaxBandwidthOut; 
        private String networkChargeType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRCInstanceNetworkSpecRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.networkChargeType = request.networkChargeType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the RDS Custom instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-dh2jf9n6j4s14926****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The maximum outbound public bandwidth. Unit: Mbit/s.</p>
         * <p>Valid values: 0 to 1024. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder internetMaxBandwidthOut(String internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * <p>The billing method of the bandwidth. Only the <strong>pay-by-traffic</strong> billing method is supported.</p>
         * <blockquote>
         * <p> If the <strong>pay-by-traffic</strong> billing method is used for network usage, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be limited.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        public Builder networkChargeType(String networkChargeType) {
            this.putQueryParameter("NetworkChargeType", networkChargeType);
            this.networkChargeType = networkChargeType;
            return this;
        }

        /**
         * <p>The region ID of the instance. You can call the DescribeRegions operation to query the most recent region list.</p>
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
        public ModifyRCInstanceNetworkSpecRequest build() {
            return new ModifyRCInstanceNetworkSpecRequest(this);
        } 

    } 

}
