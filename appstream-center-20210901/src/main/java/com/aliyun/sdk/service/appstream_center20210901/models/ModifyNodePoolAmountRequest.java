// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ModifyNodePoolAmountRequest} extends {@link RequestModel}
 *
 * <p>ModifyNodePoolAmountRequest</p>
 */
public class ModifyNodePoolAmountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodePool")
    @com.aliyun.core.annotation.Validation(required = true)
    private NodePool nodePool;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    private ModifyNodePoolAmountRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.nodePool = builder.nodePool;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNodePoolAmountRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyNodePoolAmountRequest, Builder> {
        private String appInstanceGroupId; 
        private NodePool nodePool; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNodePoolAmountRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.nodePool = request.nodePool;
            this.productType = request.productType;
        } 

        /**
         * <p>The ID of the delivery group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * <p>The parameters related to the configuration change of the node pool.</p>
         * <p>This parameter is required.</p>
         */
        public Builder nodePool(NodePool nodePool) {
            String nodePoolShrink = shrink(nodePool, "NodePool", "json");
            this.putBodyParameter("NodePool", nodePoolShrink);
            this.nodePool = nodePool;
            return this;
        }

        /**
         * <p>The product type.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>CloudApp: App Streaming</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public ModifyNodePoolAmountRequest build() {
            return new ModifyNodePoolAmountRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyNodePoolAmountRequest} extends {@link TeaModel}
     *
     * <p>ModifyNodePoolAmountRequest</p>
     */
    public static class NodePool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeAmount")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer nodeAmount;

        @com.aliyun.core.annotation.NameInMap("PrePaidNodeAmountModifyMode")
        private String prePaidNodeAmountModifyMode;

        @com.aliyun.core.annotation.NameInMap("PrePaidNodeAmountModifyNodeIds")
        private java.util.List<String> prePaidNodeAmountModifyNodeIds;

        private NodePool(Builder builder) {
            this.nodeAmount = builder.nodeAmount;
            this.prePaidNodeAmountModifyMode = builder.prePaidNodeAmountModifyMode;
            this.prePaidNodeAmountModifyNodeIds = builder.prePaidNodeAmountModifyNodeIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodePool create() {
            return builder().build();
        }

        /**
         * @return nodeAmount
         */
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        /**
         * @return prePaidNodeAmountModifyMode
         */
        public String getPrePaidNodeAmountModifyMode() {
            return this.prePaidNodeAmountModifyMode;
        }

        /**
         * @return prePaidNodeAmountModifyNodeIds
         */
        public java.util.List<String> getPrePaidNodeAmountModifyNodeIds() {
            return this.prePaidNodeAmountModifyNodeIds;
        }

        public static final class Builder {
            private Integer nodeAmount; 
            private String prePaidNodeAmountModifyMode; 
            private java.util.List<String> prePaidNodeAmountModifyNodeIds; 

            private Builder() {
            } 

            private Builder(NodePool model) {
                this.nodeAmount = model.nodeAmount;
                this.prePaidNodeAmountModifyMode = model.prePaidNodeAmountModifyMode;
                this.prePaidNodeAmountModifyNodeIds = model.prePaidNodeAmountModifyNodeIds;
            } 

            /**
             * <p>The total number of subscription nodes after the change.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeAmount(Integer nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * <p>The change mode of subscription nodes.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>EXPAND_FROM_POST_PAID_EXPLICIT: changes from specified pay-as-you-go nodes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EXPAND_FROM_POST_PAID_EXPLICIT</p>
             */
            public Builder prePaidNodeAmountModifyMode(String prePaidNodeAmountModifyMode) {
                this.prePaidNodeAmountModifyMode = prePaidNodeAmountModifyMode;
                return this;
            }

            /**
             * <p>The nodes for which you want to change the billing method.</p>
             */
            public Builder prePaidNodeAmountModifyNodeIds(java.util.List<String> prePaidNodeAmountModifyNodeIds) {
                this.prePaidNodeAmountModifyNodeIds = prePaidNodeAmountModifyNodeIds;
                return this;
            }

            public NodePool build() {
                return new NodePool(this);
            } 

        } 

    }
}
