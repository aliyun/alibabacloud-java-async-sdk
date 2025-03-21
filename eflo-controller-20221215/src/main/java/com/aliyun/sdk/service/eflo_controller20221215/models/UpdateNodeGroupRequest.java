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
 * {@link UpdateNodeGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateNodeGroupRequest</p>
 */
public class UpdateNodeGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NewNodeGroupName")
    private String newNodeGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    private UpdateNodeGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.newNodeGroupName = builder.newNodeGroupName;
        this.nodeGroupId = builder.nodeGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNodeGroupRequest create() {
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
     * @return newNodeGroupName
     */
    public String getNewNodeGroupName() {
        return this.newNodeGroupName;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public static final class Builder extends Request.Builder<UpdateNodeGroupRequest, Builder> {
        private String regionId; 
        private String newNodeGroupName; 
        private String nodeGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNodeGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.newNodeGroupName = request.newNodeGroupName;
            this.nodeGroupId = request.nodeGroupId;
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
         * NewNodeGroupName.
         */
        public Builder newNodeGroupName(String newNodeGroupName) {
            this.putBodyParameter("NewNodeGroupName", newNodeGroupName);
            this.newNodeGroupName = newNodeGroupName;
            return this;
        }

        /**
         * NodeGroupId.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putBodyParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        @Override
        public UpdateNodeGroupRequest build() {
            return new UpdateNodeGroupRequest(this);
        } 

    } 

}
