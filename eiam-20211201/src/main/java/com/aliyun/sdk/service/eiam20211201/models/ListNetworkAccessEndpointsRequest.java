// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNetworkAccessEndpointsRequest} extends {@link RequestModel}
 *
 * <p>ListNetworkAccessEndpointsRequest</p>
 */
public class ListNetworkAccessEndpointsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointStatus")
    private String networkAccessEndpointStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointType")
    private String networkAccessEndpointType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcRegionId")
    private String vpcRegionId;

    private ListNetworkAccessEndpointsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.networkAccessEndpointStatus = builder.networkAccessEndpointStatus;
        this.networkAccessEndpointType = builder.networkAccessEndpointType;
        this.nextToken = builder.nextToken;
        this.vpcId = builder.vpcId;
        this.vpcRegionId = builder.vpcRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNetworkAccessEndpointsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return networkAccessEndpointStatus
     */
    public String getNetworkAccessEndpointStatus() {
        return this.networkAccessEndpointStatus;
    }

    /**
     * @return networkAccessEndpointType
     */
    public String getNetworkAccessEndpointType() {
        return this.networkAccessEndpointType;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcRegionId
     */
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

    public static final class Builder extends Request.Builder<ListNetworkAccessEndpointsRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private Long maxResults; 
        private String networkAccessEndpointStatus; 
        private String networkAccessEndpointType; 
        private String nextToken; 
        private String vpcId; 
        private String vpcRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ListNetworkAccessEndpointsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.networkAccessEndpointStatus = request.networkAccessEndpointStatus;
            this.networkAccessEndpointType = request.networkAccessEndpointType;
            this.nextToken = request.nextToken;
            this.vpcId = request.vpcId;
            this.vpcRegionId = request.vpcRegionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * IDaaS EIAM实例的ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 分页查询时每页行数。默认值为20，最大值为100。
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 专属网络端点连接的状态。NetworkAccessEndpointType取值为shared时不生效。
         */
        public Builder networkAccessEndpointStatus(String networkAccessEndpointStatus) {
            this.putQueryParameter("NetworkAccessEndpointStatus", networkAccessEndpointStatus);
            this.networkAccessEndpointStatus = networkAccessEndpointStatus;
            return this;
        }

        /**
         * 专属网络端点连接的类型。取值可选范围：1. private - 专属网络端点；2. shared - 共享网络端点
         */
        public Builder networkAccessEndpointType(String networkAccessEndpointType) {
            this.putQueryParameter("NetworkAccessEndpointType", networkAccessEndpointType);
            this.networkAccessEndpointType = networkAccessEndpointType;
            return this;
        }

        /**
         * 查询凭证（Token），取值为上一次API调用返回的NextToken参数值。
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 专属网络端点连接的Vpc ID。NetworkAccessEndpointType取值为shared时不生效。
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * 专属网络端点连接的Vpc所属地域，该地域取值必须在ListNetworkAccessEndpointAvailableRegions接口中返回。NetworkAccessEndpointType取值为shared时不生效。
         */
        public Builder vpcRegionId(String vpcRegionId) {
            this.putQueryParameter("VpcRegionId", vpcRegionId);
            this.vpcRegionId = vpcRegionId;
            return this;
        }

        @Override
        public ListNetworkAccessEndpointsRequest build() {
            return new ListNetworkAccessEndpointsRequest(this);
        } 

    } 

}
