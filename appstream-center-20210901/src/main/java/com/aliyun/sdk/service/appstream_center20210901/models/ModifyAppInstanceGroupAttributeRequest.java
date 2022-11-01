// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAppInstanceGroupAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppInstanceGroupAttributeRequest</p>
 */
public class ModifyAppInstanceGroupAttributeRequest extends Request {
    @Query
    @NameInMap("AppInstanceGroupId")
    @Validation(required = true)
    private String appInstanceGroupId;

    @Query
    @NameInMap("AppInstanceGroupName")
    private String appInstanceGroupName;

    @Query
    @NameInMap("NodePool")
    private NodePool nodePool;

    @Query
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    @Query
    @NameInMap("SessionTimeout")
    @Validation(maximum = 300)
    private Integer sessionTimeout;

    private ModifyAppInstanceGroupAttributeRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceGroupName = builder.appInstanceGroupName;
        this.nodePool = builder.nodePool;
        this.productType = builder.productType;
        this.sessionTimeout = builder.sessionTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppInstanceGroupAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstanceGroupName
     */
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    /**
     * @return nodePool
     */
    public NodePool getNodePool() {
        return this.nodePool;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return sessionTimeout
     */
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public static final class Builder extends Request.Builder<ModifyAppInstanceGroupAttributeRequest, Builder> {
        private String appInstanceGroupId; 
        private String appInstanceGroupName; 
        private NodePool nodePool; 
        private String productType; 
        private Integer sessionTimeout; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAppInstanceGroupAttributeRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceGroupName = request.appInstanceGroupName;
            this.nodePool = request.nodePool;
            this.productType = request.productType;
            this.sessionTimeout = request.sessionTimeout;
        } 

        /**
         * AppInstanceGroupId.
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putQueryParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * AppInstanceGroupName.
         */
        public Builder appInstanceGroupName(String appInstanceGroupName) {
            this.putQueryParameter("AppInstanceGroupName", appInstanceGroupName);
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }

        /**
         * NodePool.
         */
        public Builder nodePool(NodePool nodePool) {
            String nodePoolShrink = shrink(nodePool, "NodePool", "json");
            this.putQueryParameter("NodePool", nodePoolShrink);
            this.nodePool = nodePool;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * SessionTimeout.
         */
        public Builder sessionTimeout(Integer sessionTimeout) {
            this.putQueryParameter("SessionTimeout", sessionTimeout);
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        @Override
        public ModifyAppInstanceGroupAttributeRequest build() {
            return new ModifyAppInstanceGroupAttributeRequest(this);
        } 

    } 

    public static class NodePool extends TeaModel {
        @NameInMap("NodeCapacity")
        private Integer nodeCapacity;

        @NameInMap("NodePoolId")
        private String nodePoolId;

        private NodePool(Builder builder) {
            this.nodeCapacity = builder.nodeCapacity;
            this.nodePoolId = builder.nodePoolId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodePool create() {
            return builder().build();
        }

        /**
         * @return nodeCapacity
         */
        public Integer getNodeCapacity() {
            return this.nodeCapacity;
        }

        /**
         * @return nodePoolId
         */
        public String getNodePoolId() {
            return this.nodePoolId;
        }

        public static final class Builder {
            private Integer nodeCapacity; 
            private String nodePoolId; 

            /**
             * NodeCapacity.
             */
            public Builder nodeCapacity(Integer nodeCapacity) {
                this.nodeCapacity = nodeCapacity;
                return this;
            }

            /**
             * NodePoolId.
             */
            public Builder nodePoolId(String nodePoolId) {
                this.nodePoolId = nodePoolId;
                return this;
            }

            public NodePool build() {
                return new NodePool(this);
            } 

        } 

    }
}
