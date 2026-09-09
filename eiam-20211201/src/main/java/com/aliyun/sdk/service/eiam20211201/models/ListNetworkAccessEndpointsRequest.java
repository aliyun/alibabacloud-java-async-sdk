// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of rows per page in a paged query. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The status of the network access endpoint. Valid values:</p>
         * <ul>
         * <li>pending: pending initialization.</li>
         * <li>creating: being created.</li>
         * <li>running: running.</li>
         * <li>deleting: being deleted.</li>
         * </ul>
         * <p>This filter parameter does not take effect when NetworkAccessEndpointType is set to shared.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder networkAccessEndpointStatus(String networkAccessEndpointStatus) {
            this.putQueryParameter("NetworkAccessEndpointStatus", networkAccessEndpointStatus);
            this.networkAccessEndpointStatus = networkAccessEndpointStatus;
            return this;
        }

        /**
         * <p>The type of the network access endpoint. Valid values:</p>
         * <ul>
         * <li>shared: shared network access endpoint.</li>
         * <li>private: dedicated network access endpoint.</li>
         * </ul>
         * <p>Default value: private.</p>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        public Builder networkAccessEndpointType(String networkAccessEndpointType) {
            this.putQueryParameter("NetworkAccessEndpointType", networkAccessEndpointType);
            this.networkAccessEndpointType = networkAccessEndpointType;
            return this;
        }

        /**
         * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call. Leave this parameter empty for the first query.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The VPC ID of the dedicated network access endpoint. This parameter does not take effect when NetworkAccessEndpointType is set to shared.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-examplexxx</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The region of the VPC for the dedicated network access endpoint. The region must be one of the regions returned by the ListNetworkAccessEndpointAvailableRegions operation. This parameter does not take effect when NetworkAccessEndpointType is set to shared.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
