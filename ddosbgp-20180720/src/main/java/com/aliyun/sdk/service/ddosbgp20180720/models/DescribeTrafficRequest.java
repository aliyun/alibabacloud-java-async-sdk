// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrafficRequest} extends {@link RequestModel}
 *
 * <p>DescribeTrafficRequest</p>
 */
public class DescribeTrafficRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private Integer endTime;

    @Query
    @NameInMap("FlowType")
    private String flowType;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Interval")
    private Integer interval;

    @Query
    @NameInMap("Ip")
    private String ip;

    @Query
    @NameInMap("Ipnet")
    private String ipnet;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Integer startTime;

    private DescribeTrafficRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.flowType = builder.flowType;
        this.instanceId = builder.instanceId;
        this.interval = builder.interval;
        this.ip = builder.ip;
        this.ipnet = builder.ipnet;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrafficRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return flowType
     */
    public String getFlowType() {
        return this.flowType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return ipnet
     */
    public String getIpnet() {
        return this.ipnet;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeTrafficRequest, Builder> {
        private Integer endTime; 
        private String flowType; 
        private String instanceId; 
        private Integer interval; 
        private String ip; 
        private String ipnet; 
        private String regionId; 
        private String resourceGroupId; 
        private Integer startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTrafficRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.flowType = request.flowType;
            this.instanceId = request.instanceId;
            this.interval = request.interval;
            this.ip = request.ip;
            this.ipnet = request.ipnet;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.startTime = request.startTime;
        } 

        /**
         * The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.
         * <p>
         * 
         * If you do not specify this parameter, the current system time is used as the end time.
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The type of the traffic statistics to query. Valid values:
         * <p>
         * 
         * *   **max**: the peak traffic within the specified interval
         * *   **avg**: the average traffic within the specified interval
         */
        public Builder flowType(String flowType) {
            this.putQueryParameter("FlowType", flowType);
            this.flowType = flowType;
            return this;
        }

        /**
         * The ID of the Anti-DDoS Origin instance to query.
         * <p>
         * 
         * >  You can call the [DescribeInstanceList](~~118698~~) operation to query the IDs of all Anti-DDoS Origin instances.
         * 
         * If you specify an on-demand instance, you must configure the **Interval** parameter.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The interval at which the traffic statistics are calculated. Unit: seconds. Default value: **5**.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The public IP address of the asset to query. If you do not specify this parameter, the traffic statistics of all public IP addresses that are protected by the Anti-DDoS Origin instance are queried.
         * <p>
         * 
         * >  The public IP address must be a protected object of the Anti-DDoS Origin instance. You can call the [DescribePackIpList](~~118701~~) operation to query all protected objects of the Anti-DDoS Origin instance.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * The Classless Inter-Domain Routing (CIDR) block of the on-demand instance that you want to query.
         */
        public Builder ipnet(String ipnet) {
            this.putQueryParameter("Ipnet", ipnet);
            this.ipnet = ipnet;
            return this;
        }

        /**
         * The ID of the region where the Anti-DDoS Origin instance resides.
         * <p>
         * 
         * >  You can call the [DescribeRegions](~~118703~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management.
         * <p>
         * 
         * If you do not specify this parameter, the instance belongs to the default resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeTrafficRequest build() {
            return new DescribeTrafficRequest(this);
        } 

    } 

}
