// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link RestartNodesRequest} extends {@link RequestModel}
 *
 * <p>RestartNodesRequest</p>
 */
public class RestartNodesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RestartNodeGroups")
    private java.util.List<RestartNodeGroups> restartNodeGroups;

    private RestartNodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.restartNodeGroups = builder.restartNodeGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartNodesRequest create() {
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
     * @return restartNodeGroups
     */
    public java.util.List<RestartNodeGroups> getRestartNodeGroups() {
        return this.restartNodeGroups;
    }

    public static final class Builder extends Request.Builder<RestartNodesRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private java.util.List<RestartNodeGroups> restartNodeGroups; 

        private Builder() {
            super();
        } 

        private Builder(RestartNodesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.restartNodeGroups = request.restartNodeGroups;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RestartNodeGroups.
         */
        public Builder restartNodeGroups(java.util.List<RestartNodeGroups> restartNodeGroups) {
            this.putBodyParameter("RestartNodeGroups", restartNodeGroups);
            this.restartNodeGroups = restartNodeGroups;
            return this;
        }

        @Override
        public RestartNodesRequest build() {
            return new RestartNodesRequest(this);
        } 

    } 

    /**
     * 
     * {@link RestartNodesRequest} extends {@link TeaModel}
     *
     * <p>RestartNodesRequest</p>
     */
    public static class RestartNodeGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FastMode")
        private Boolean fastMode;

        @com.aliyun.core.annotation.NameInMap("NodeGroupId")
        private String nodeGroupId;

        @com.aliyun.core.annotation.NameInMap("NodeIds")
        private java.util.List<String> nodeIds;

        private RestartNodeGroups(Builder builder) {
            this.fastMode = builder.fastMode;
            this.nodeGroupId = builder.nodeGroupId;
            this.nodeIds = builder.nodeIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestartNodeGroups create() {
            return builder().build();
        }

        /**
         * @return fastMode
         */
        public Boolean getFastMode() {
            return this.fastMode;
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

        public static final class Builder {
            private Boolean fastMode; 
            private String nodeGroupId; 
            private java.util.List<String> nodeIds; 

            private Builder() {
            } 

            private Builder(RestartNodeGroups model) {
                this.fastMode = model.fastMode;
                this.nodeGroupId = model.nodeGroupId;
                this.nodeIds = model.nodeIds;
            } 

            /**
             * FastMode.
             */
            public Builder fastMode(Boolean fastMode) {
                this.fastMode = fastMode;
                return this;
            }

            /**
             * NodeGroupId.
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * NodeIds.
             */
            public Builder nodeIds(java.util.List<String> nodeIds) {
                this.nodeIds = nodeIds;
                return this;
            }

            public RestartNodeGroups build() {
                return new RestartNodeGroups(this);
            } 

        } 

    }
}
