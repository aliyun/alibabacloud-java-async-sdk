// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApprovePermissionApplyOrderRequest} extends {@link RequestModel}
 *
 * <p>ApprovePermissionApplyOrderRequest</p>
 */
public class ApprovePermissionApplyOrderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApproveAction")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 5)
    private Integer approveAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApproveComment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String approveComment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowId;

    private ApprovePermissionApplyOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.approveAction = builder.approveAction;
        this.approveComment = builder.approveComment;
        this.flowId = builder.flowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApprovePermissionApplyOrderRequest create() {
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
     * @return approveAction
     */
    public Integer getApproveAction() {
        return this.approveAction;
    }

    /**
     * @return approveComment
     */
    public String getApproveComment() {
        return this.approveComment;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    public static final class Builder extends Request.Builder<ApprovePermissionApplyOrderRequest, Builder> {
        private String regionId; 
        private Integer approveAction; 
        private String approveComment; 
        private String flowId; 

        private Builder() {
            super();
        } 

        private Builder(ApprovePermissionApplyOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.approveAction = request.approveAction;
            this.approveComment = request.approveComment;
            this.flowId = request.flowId;
        } 

        /**
         * The region ID. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint that is used to call the operation.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The approval action. Valid values:
         * <p>
         * 
         * *   1: Approve the permission request order.
         * *   2: Reject the permission request order.
         */
        public Builder approveAction(Integer approveAction) {
            this.putQueryParameter("ApproveAction", approveAction);
            this.approveAction = approveAction;
            return this;
        }

        /**
         * The comment on the approval.
         */
        public Builder approveComment(String approveComment) {
            this.putQueryParameter("ApproveComment", approveComment);
            this.approveComment = approveComment;
            return this;
        }

        /**
         * The ID of the permission request order. You can call the ListPermissionApplyOrders operation to obtain the order ID.
         */
        public Builder flowId(String flowId) {
            this.putQueryParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        @Override
        public ApprovePermissionApplyOrderRequest build() {
            return new ApprovePermissionApplyOrderRequest(this);
        } 

    } 

}
