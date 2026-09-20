// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

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
 * {@link DescribeTrafficRequest} extends {@link RequestModel}
 *
 * <p>DescribeTrafficRequest</p>
 */
public class DescribeTrafficRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Integer endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowType")
    private String flowType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipnet")
    private String ipnet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The end time of the query. Specify a UNIX timestamp. Unit: seconds.</p>
         * <p>If you do not set this parameter, the current time is used as the end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1563445054</p>
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The type of traffic statistics to query. Valid values:</p>
         * <ul>
         * <li><strong>max</strong>: the peak traffic within the statistical interval.</li>
         * <li><strong>avg</strong>: the average traffic within the statistical interval.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>max</p>
         */
        public Builder flowType(String flowType) {
            this.putQueryParameter("FlowType", flowType);
            this.flowType = flowType;
            return this;
        }

        /**
         * <p>The ID of the Anti-DDoS Origin instance to query.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> to query the IDs of all Anti-DDoS Origin instances.</p>
         * </blockquote>
         * <p>If the instance specified here is used for traffic diversion, you must set the <strong>Interval</strong> request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-n6w203qg****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The time interval for traffic statistics. Unit: seconds. This parameter specifies the length of each interval for which traffic data is aggregated. Default value: <strong>5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The assets that are assigned public IP addresses to query. If you do not specify this parameter in Settings, the traffic statistics of all assets that are assigned public IP addresses protected by the Anti-DDoS Origin instance are queried.</p>
         * <blockquote>
         * <p>The assets that are assigned public IP addresses must have been added as protected objects of the Anti-DDoS Origin instance. You can invoke <a href="https://help.aliyun.com/document_detail/118701.html">DescribePackIpList</a> to query all protected objects of the Anti-DDoS Origin instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>39.XX.XX.96</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The CIDR block used for traffic diversion to query.</p>
         * 
         * <strong>example:</strong>
         * <p>111.XX.XX.0/24</p>
         */
        public Builder ipnet(String ipnet) {
            this.putQueryParameter("Ipnet", ipnet);
            this.ipnet = ipnet;
            return this;
        }

        /**
         * <p>The region ID of the Anti-DDoS Origin instance.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> to query all region IDs supported by Anti-DDoS Origin.</p>
         * </blockquote>
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
         * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management.</p>
         * <p>If you do not set this parameter, the default resource group is used.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2pz25js****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The start time of the query. Specify a UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1619798400</p>
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
