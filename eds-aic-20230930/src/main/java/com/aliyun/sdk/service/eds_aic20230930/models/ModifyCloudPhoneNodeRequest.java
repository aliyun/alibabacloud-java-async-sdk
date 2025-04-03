// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ModifyCloudPhoneNodeRequest} extends {@link RequestModel}
 *
 * <p>ModifyCloudPhoneNodeRequest</p>
 */
public class ModifyCloudPhoneNodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewNodeName")
    private String newNodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    private ModifyCloudPhoneNodeRequest(Builder builder) {
        super(builder);
        this.newNodeName = builder.newNodeName;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCloudPhoneNodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newNodeName
     */
    public String getNewNodeName() {
        return this.newNodeName;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<ModifyCloudPhoneNodeRequest, Builder> {
        private String newNodeName; 
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCloudPhoneNodeRequest request) {
            super(request);
            this.newNodeName = request.newNodeName;
            this.nodeId = request.nodeId;
        } 

        /**
         * <p>The name that you want to assign to the cloud phone matrix.</p>
         * 
         * <strong>example:</strong>
         * <p>node_name_new</p>
         */
        public Builder newNodeName(String newNodeName) {
            this.putQueryParameter("NewNodeName", newNodeName);
            this.newNodeName = newNodeName;
            return this;
        }

        /**
         * <p>The ID of the cloud phone matrix.</p>
         * 
         * <strong>example:</strong>
         * <p>cpn-0ugbptfu473fy****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public ModifyCloudPhoneNodeRequest build() {
            return new ModifyCloudPhoneNodeRequest(this);
        } 

    } 

}
