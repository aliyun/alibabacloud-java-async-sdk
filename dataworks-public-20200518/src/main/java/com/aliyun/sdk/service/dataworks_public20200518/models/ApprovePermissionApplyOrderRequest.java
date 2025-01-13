// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The action for the permission request order. Valid values:</p>
         * <ul>
         * <li>1: approve</li>
         * <li>2: reject</li>
         * </ul>
         * <!---->
         * 
         * <ul>
         * <li>0</li>
         * <li>1</li>
         * <li>2.</li>
         * <li>3.</li>
         * <li>4</li>
         * <li>5</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder approveAction(Integer approveAction) {
            this.putQueryParameter("ApproveAction", approveAction);
            this.approveAction = approveAction;
            return this;
        }

        /**
         * <p>The comment on the order.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agree</p>
         */
        public Builder approveComment(String approveComment) {
            this.putQueryParameter("ApproveComment", approveComment);
            this.approveComment = approveComment;
            return this;
        }

        /**
         * <p>The ID of the permission request order. You can call the ListPermissionApplyOrders operation to obtain the order ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>48f36729-05f9-4a40-9286-933fd940f30a</p>
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
