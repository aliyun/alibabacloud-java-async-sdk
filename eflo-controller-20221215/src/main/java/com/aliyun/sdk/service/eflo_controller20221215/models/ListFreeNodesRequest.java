// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ListFreeNodesRequest} extends {@link RequestModel}
 *
 * <p>ListFreeNodesRequest</p>
 */
public class ListFreeNodesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HpnZone")
    private String hpnZone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MachineType")
    private String machineType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ListFreeNodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.hpnZone = builder.hpnZone;
        this.machineType = builder.machineType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFreeNodesRequest create() {
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
     * @return hpnZone
     */
    public String getHpnZone() {
        return this.hpnZone;
    }

    /**
     * @return machineType
     */
    public String getMachineType() {
        return this.machineType;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ListFreeNodesRequest, Builder> {
        private String regionId; 
        private String hpnZone; 
        private String machineType; 
        private Long maxResults; 
        private String nextToken; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListFreeNodesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.hpnZone = request.hpnZone;
            this.machineType = request.machineType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceGroupId = request.resourceGroupId;
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
         * HpnZone.
         */
        public Builder hpnZone(String hpnZone) {
            this.putBodyParameter("HpnZone", hpnZone);
            this.hpnZone = hpnZone;
            return this;
        }

        /**
         * MachineType.
         */
        public Builder machineType(String machineType) {
            this.putBodyParameter("MachineType", machineType);
            this.machineType = machineType;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ListFreeNodesRequest build() {
            return new ListFreeNodesRequest(this);
        } 

    } 

}
