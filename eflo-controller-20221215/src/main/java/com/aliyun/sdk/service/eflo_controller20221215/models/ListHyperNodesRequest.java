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
 * {@link ListHyperNodesRequest} extends {@link RequestModel}
 *
 * <p>ListHyperNodesRequest</p>
 */
public class ListHyperNodesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HpnZone")
    private String hpnZone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HyperNodeId")
    private String hyperNodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HyperNodeIds")
    private java.util.List<String> hyperNodeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MachineType")
    private String machineType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeGroupName")
    private String nodeGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatingStates")
    private java.util.List<String> operatingStates;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private ListHyperNodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterName = builder.clusterName;
        this.commodityCode = builder.commodityCode;
        this.hpnZone = builder.hpnZone;
        this.hyperNodeId = builder.hyperNodeId;
        this.hyperNodeIds = builder.hyperNodeIds;
        this.machineType = builder.machineType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodeGroupName = builder.nodeGroupName;
        this.operatingStates = builder.operatingStates;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHyperNodesRequest create() {
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
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return hpnZone
     */
    public String getHpnZone() {
        return this.hpnZone;
    }

    /**
     * @return hyperNodeId
     */
    public String getHyperNodeId() {
        return this.hyperNodeId;
    }

    /**
     * @return hyperNodeIds
     */
    public java.util.List<String> getHyperNodeIds() {
        return this.hyperNodeIds;
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
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return nodeGroupName
     */
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    /**
     * @return operatingStates
     */
    public java.util.List<String> getOperatingStates() {
        return this.operatingStates;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ListHyperNodesRequest, Builder> {
        private String regionId; 
        private String clusterName; 
        private String commodityCode; 
        private String hpnZone; 
        private String hyperNodeId; 
        private java.util.List<String> hyperNodeIds; 
        private String machineType; 
        private Integer maxResults; 
        private String nextToken; 
        private String nodeGroupName; 
        private java.util.List<String> operatingStates; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ListHyperNodesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterName = request.clusterName;
            this.commodityCode = request.commodityCode;
            this.hpnZone = request.hpnZone;
            this.hyperNodeId = request.hyperNodeId;
            this.hyperNodeIds = request.hyperNodeIds;
            this.machineType = request.machineType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.nodeGroupName = request.nodeGroupName;
            this.operatingStates = request.operatingStates;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.zoneId = request.zoneId;
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
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putBodyParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
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
         * HyperNodeId.
         */
        public Builder hyperNodeId(String hyperNodeId) {
            this.putBodyParameter("HyperNodeId", hyperNodeId);
            this.hyperNodeId = hyperNodeId;
            return this;
        }

        /**
         * HyperNodeIds.
         */
        public Builder hyperNodeIds(java.util.List<String> hyperNodeIds) {
            String hyperNodeIdsShrink = shrink(hyperNodeIds, "HyperNodeIds", "json");
            this.putQueryParameter("HyperNodeIds", hyperNodeIdsShrink);
            this.hyperNodeIds = hyperNodeIds;
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
        public Builder maxResults(Integer maxResults) {
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
         * NodeGroupName.
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.putBodyParameter("NodeGroupName", nodeGroupName);
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * OperatingStates.
         */
        public Builder operatingStates(java.util.List<String> operatingStates) {
            String operatingStatesShrink = shrink(operatingStates, "OperatingStates", "json");
            this.putQueryParameter("OperatingStates", operatingStatesShrink);
            this.operatingStates = operatingStates;
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

        /**
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ListHyperNodesRequest build() {
            return new ListHyperNodesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListHyperNodesRequest} extends {@link TeaModel}
     *
     * <p>ListHyperNodesRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
