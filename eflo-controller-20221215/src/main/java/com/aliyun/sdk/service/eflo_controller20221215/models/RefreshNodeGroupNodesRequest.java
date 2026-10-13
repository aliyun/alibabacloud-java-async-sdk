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
 * {@link RefreshNodeGroupNodesRequest} extends {@link RequestModel}
 *
 * <p>RefreshNodeGroupNodesRequest</p>
 */
public class RefreshNodeGroupNodesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxDisruptiveAction")
    private String maxDisruptiveAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private java.util.List<String> nodeIds;

    private RefreshNodeGroupNodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maxDisruptiveAction = builder.maxDisruptiveAction;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeIds = builder.nodeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshNodeGroupNodesRequest create() {
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
     * @return maxDisruptiveAction
     */
    public String getMaxDisruptiveAction() {
        return this.maxDisruptiveAction;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return nodeIds
     */
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public static final class Builder extends Request.Builder<RefreshNodeGroupNodesRequest, Builder> {
        private String regionId; 
        private String maxDisruptiveAction; 
        private String nodeGroupId; 
        private java.util.List<String> nodeIds; 

        private Builder() {
            super();
        } 

        private Builder(RefreshNodeGroupNodesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maxDisruptiveAction = request.maxDisruptiveAction;
            this.nodeGroupId = request.nodeGroupId;
            this.nodeIds = request.nodeIds;
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
         * <p>The maximum disruptive action level allowed for the refresh operation. The system independently evaluates the action level required to refresh each drifted property of a node and performs the refresh within the specified action level constraint. If the action level required for a property exceeds the specified level, that property is skipped. Action levels in increasing order of disruption: Refresh &lt; Reboot &lt; Reimage.</p>
         * <ul>
         * <li>Refresh (default): only refreshes the configuration in place without restarting or reimaging. Currently applicable only to the RamRoleName property.</li>
         * <li>Reboot (not currently supported): allows restarting the node for the configuration to take effect. Supported properties include system cloud disk type and all properties supported by Refresh.</li>
         * <li>Reimage (not currently supported): allows reimaging the node for the configuration to take effect. Supported properties include image ID and all properties supported by Reboot.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Refresh</p>
         */
        public Builder maxDisruptiveAction(String maxDisruptiveAction) {
            this.putBodyParameter("MaxDisruptiveAction", maxDisruptiveAction);
            this.maxDisruptiveAction = maxDisruptiveAction;
            return this;
        }

        /**
         * <p>The node group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-3525</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putBodyParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>The filter scope for node refresh. If not specified, all nodes in the node group are included. <warning>If the instance type is a hypernode, pass in the TrayNode ID, not the HyperNodeId.</warning></p>
         */
        public Builder nodeIds(java.util.List<String> nodeIds) {
            String nodeIdsShrink = shrink(nodeIds, "NodeIds", "json");
            this.putBodyParameter("NodeIds", nodeIdsShrink);
            this.nodeIds = nodeIds;
            return this;
        }

        @Override
        public RefreshNodeGroupNodesRequest build() {
            return new RefreshNodeGroupNodesRequest(this);
        } 

    } 

}
