// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
         * <p>If ApprovalType is set to ADD_APPROVAL_NODE, you need to specify this parameter. The ID of the user that is added as the new approval node. This node must be a user-defined approval node. You can call the ListUserDefineWorkFlowNodes operation to obtain the value of this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder approvalNodeId(Long approvalNodeId) {
            this.putQueryParameter("ApprovalNodeId", approvalNodeId);
            this.approvalNodeId = approvalNodeId;
            return this;
        }

        /**
         * <p>The position of the new approval node. You must specify this parameter if ApprovalType is set to ADD_APPROVAL_NODE. Valid values:</p>
         * <ul>
         * <li><strong>PRE_ADD_APPROVAL_NODE</strong>: before the current approval node.</li>
         * <li><strong>POST_ADD_APPROVAL_NODE</strong>: after the current approval node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POST_ADD_APPROVAL_NODE</p>
         */
        public Builder approvalNodePos(String approvalNodePos) {
            this.putQueryParameter("ApprovalNodePos", approvalNodePos);
            this.approvalNodePos = approvalNodePos;
            return this;
        }

        /**
         * <p>The action that you want to perform on the ticket. Valid values:</p>
         * <ul>
         * <li><strong>AGREE</strong></li>
         * <li><strong>CANCEL</strong></li>
         * <li><strong>REJECT</strong></li>
         * <li><strong>TRANSFER</strong></li>
         * <li><strong>ADD_APPROVAL_NODE</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agree</p>
         */
        public Builder approvalType(String approvalType) {
            this.putQueryParameter("ApprovalType", approvalType);
            this.approvalType = approvalType;
            return this;
        }

        /**
         * <p>The description of the ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The ID of the user to which the ticket is transferred. If ApprovalType is set to TRANSFER, you need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>12***</p>
         */
        public Builder newApprover(Long newApprover) {
            this.putQueryParameter("NewApprover", newApprover);
            this.newApprover = newApprover;
            return this;
        }

        /**
         * <blockquote>
         * <p> You can specify this parameter if ApprovalType is set to TRANSFER. You need to only specify one of NewApproverList and NewApprover.</p>
         * </blockquote>
         * <p>The IDs of the users to whom the ticket is transferred. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>154***,155***,156***</p>
         */
        public Builder newApproverList(String newApproverList) {
            this.putQueryParameter("NewApproverList", newApproverList);
            this.newApproverList = newApproverList;
            return this;
        }

        /**
         * <p>The ID of the user that transfers the ticket to another user. The default value is the ID of the current user. If the current user is an administrator or a database administrator (DBA), the user can change the value of this parameter to the ID of another user.</p>
         * 
         * <strong>example:</strong>
         * <p>23***</p>
         */
        public Builder oldApprover(Long oldApprover) {
            this.putQueryParameter("OldApprover", oldApprover);
            this.oldApprover = oldApprover;
            return this;
        }

        /**
         * <p>The UID of the Alibaba Cloud account that actually calls the API.</p>
         * 
         * <strong>example:</strong>
         * <p>21400447956867****</p>
         */
        public Builder realLoginUserUid(String realLoginUserUid) {
            this.putQueryParameter("RealLoginUserUid", realLoginUserUid);
            this.realLoginUserUid = realLoginUserUid;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to obtain the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>The ID of the approval process. You can call the <a href="https://help.aliyun.com/document_detail/144642.html">GetOrderBaseInfo</a> operation to obtain the ID of the approval process.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
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
