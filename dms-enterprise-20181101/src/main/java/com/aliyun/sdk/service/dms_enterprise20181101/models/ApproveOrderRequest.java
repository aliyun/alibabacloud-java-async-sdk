// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveOrderRequest} extends {@link RequestModel}
 *
 * <p>ApproveOrderRequest</p>
 */
public class ApproveOrderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalNodeId")
    private Long approvalNodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalNodePos")
    private String approvalNodePos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String approvalType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewApprover")
    private Long newApprover;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewApproverList")
    private String newApproverList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OldApprover")
    private Long oldApprover;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealLoginUserUid")
    private String realLoginUserUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowInstanceId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long workflowInstanceId;

    private ApproveOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.approvalNodeId = builder.approvalNodeId;
        this.approvalNodePos = builder.approvalNodePos;
        this.approvalType = builder.approvalType;
        this.comment = builder.comment;
        this.newApprover = builder.newApprover;
        this.newApproverList = builder.newApproverList;
        this.oldApprover = builder.oldApprover;
        this.realLoginUserUid = builder.realLoginUserUid;
        this.tid = builder.tid;
        this.workflowInstanceId = builder.workflowInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApproveOrderRequest create() {
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
     * @return approvalNodeId
     */
    public Long getApprovalNodeId() {
        return this.approvalNodeId;
    }

    /**
     * @return approvalNodePos
     */
    public String getApprovalNodePos() {
        return this.approvalNodePos;
    }

    /**
     * @return approvalType
     */
    public String getApprovalType() {
        return this.approvalType;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return newApprover
     */
    public Long getNewApprover() {
        return this.newApprover;
    }

    /**
     * @return newApproverList
     */
    public String getNewApproverList() {
        return this.newApproverList;
    }

    /**
     * @return oldApprover
     */
    public Long getOldApprover() {
        return this.oldApprover;
    }

    /**
     * @return realLoginUserUid
     */
    public String getRealLoginUserUid() {
        return this.realLoginUserUid;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return workflowInstanceId
     */
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    public static final class Builder extends Request.Builder<ApproveOrderRequest, Builder> {
        private String regionId; 
        private Long approvalNodeId; 
        private String approvalNodePos; 
        private String approvalType; 
        private String comment; 
        private Long newApprover; 
        private String newApproverList; 
        private Long oldApprover; 
        private String realLoginUserUid; 
        private Long tid; 
        private Long workflowInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ApproveOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.approvalNodeId = request.approvalNodeId;
            this.approvalNodePos = request.approvalNodePos;
            this.approvalType = request.approvalType;
            this.comment = request.comment;
            this.newApprover = request.newApprover;
            this.newApproverList = request.newApproverList;
            this.oldApprover = request.oldApprover;
            this.realLoginUserUid = request.realLoginUserUid;
            this.tid = request.tid;
            this.workflowInstanceId = request.workflowInstanceId;
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
         * If ApprovalType is set to ADD_APPROVAL_NODE, you need to specify this parameter. The ID of the user that is added as the new approval node. This node must be a user-defined approval node. You can call the ListUserDefineWorkFlowNodes operation to obtain the value of this parameter.
         */
        public Builder approvalNodeId(Long approvalNodeId) {
            this.putQueryParameter("ApprovalNodeId", approvalNodeId);
            this.approvalNodeId = approvalNodeId;
            return this;
        }

        /**
         * If ApprovalType is set to ADD_APPROVAL_NODE, you need to specify this parameter. The position of the new approval node. Valid values:
         * <p>
         * 
         * *   **PRE_ADD_APPROVAL_NODE**: before the current approval node.
         * *   **POST_ADD_APPROVAL_NODE**: after the current approval node.
         */
        public Builder approvalNodePos(String approvalNodePos) {
            this.putQueryParameter("ApprovalNodePos", approvalNodePos);
            this.approvalNodePos = approvalNodePos;
            return this;
        }

        /**
         * The action that you want to perform on the ticket. Valid values:
         * <p>
         * 
         * *   **AGREE**
         * *   **CANCEL**
         * *   **REJECT**
         * *   **TRANSFER**
         * *   **ADD_APPROVAL_NODE**
         */
        public Builder approvalType(String approvalType) {
            this.putQueryParameter("ApprovalType", approvalType);
            this.approvalType = approvalType;
            return this;
        }

        /**
         * The description of the ticket.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The ID of the user to which the ticket is transferred. If ApprovalType is set to TRANSFER, you need to specify this parameter.
         */
        public Builder newApprover(Long newApprover) {
            this.putQueryParameter("NewApprover", newApprover);
            this.newApprover = newApprover;
            return this;
        }

        /**
         * NewApproverList.
         */
        public Builder newApproverList(String newApproverList) {
            this.putQueryParameter("NewApproverList", newApproverList);
            this.newApproverList = newApproverList;
            return this;
        }

        /**
         * The ID of the user that transfers the ticket to another user. The default value is the ID of the current user. If the current user is an administrator or a database administrator (DBA), the user can change the value of this parameter to the ID of another user.
         */
        public Builder oldApprover(Long oldApprover) {
            this.putQueryParameter("OldApprover", oldApprover);
            this.oldApprover = oldApprover;
            return this;
        }

        /**
         * RealLoginUserUid.
         */
        public Builder realLoginUserUid(String realLoginUserUid) {
            this.putQueryParameter("RealLoginUserUid", realLoginUserUid);
            this.realLoginUserUid = realLoginUserUid;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to obtain the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * The ID of the approval process. You can call the [GetOrderBaseInfo](~~144642~~) operation to obtain the ID of the approval process.
         */
        public Builder workflowInstanceId(Long workflowInstanceId) {
            this.putQueryParameter("WorkflowInstanceId", workflowInstanceId);
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }

        @Override
        public ApproveOrderRequest build() {
            return new ApproveOrderRequest(this);
        } 

    } 

}
