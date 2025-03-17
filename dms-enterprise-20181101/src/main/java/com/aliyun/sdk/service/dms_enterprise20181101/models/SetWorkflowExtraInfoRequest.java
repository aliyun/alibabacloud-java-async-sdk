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
 * {@link SetWorkflowExtraInfoRequest} extends {@link RequestModel}
 *
 * <p>SetWorkflowExtraInfoRequest</p>
 */
public class SetWorkflowExtraInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderAddApprovalNode")
    private Boolean renderAddApprovalNode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderAgree")
    private Boolean renderAgree;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderCancel")
    private Boolean renderCancel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderReject")
    private Boolean renderReject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderTransfer")
    private Boolean renderTransfer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdpartyWorkflowComment")
    private String thirdpartyWorkflowComment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdpartyWorkflowUrl")
    private String thirdpartyWorkflowUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long workflowInstanceId;

    private SetWorkflowExtraInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.renderAddApprovalNode = builder.renderAddApprovalNode;
        this.renderAgree = builder.renderAgree;
        this.renderCancel = builder.renderCancel;
        this.renderReject = builder.renderReject;
        this.renderTransfer = builder.renderTransfer;
        this.thirdpartyWorkflowComment = builder.thirdpartyWorkflowComment;
        this.thirdpartyWorkflowUrl = builder.thirdpartyWorkflowUrl;
        this.tid = builder.tid;
        this.workflowInstanceId = builder.workflowInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetWorkflowExtraInfoRequest create() {
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
     * @return renderAddApprovalNode
     */
    public Boolean getRenderAddApprovalNode() {
        return this.renderAddApprovalNode;
    }

    /**
     * @return renderAgree
     */
    public Boolean getRenderAgree() {
        return this.renderAgree;
    }

    /**
     * @return renderCancel
     */
    public Boolean getRenderCancel() {
        return this.renderCancel;
    }

    /**
     * @return renderReject
     */
    public Boolean getRenderReject() {
        return this.renderReject;
    }

    /**
     * @return renderTransfer
     */
    public Boolean getRenderTransfer() {
        return this.renderTransfer;
    }

    /**
     * @return thirdpartyWorkflowComment
     */
    public String getThirdpartyWorkflowComment() {
        return this.thirdpartyWorkflowComment;
    }

    /**
     * @return thirdpartyWorkflowUrl
     */
    public String getThirdpartyWorkflowUrl() {
        return this.thirdpartyWorkflowUrl;
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

    public static final class Builder extends Request.Builder<SetWorkflowExtraInfoRequest, Builder> {
        private String regionId; 
        private Boolean renderAddApprovalNode; 
        private Boolean renderAgree; 
        private Boolean renderCancel; 
        private Boolean renderReject; 
        private Boolean renderTransfer; 
        private String thirdpartyWorkflowComment; 
        private String thirdpartyWorkflowUrl; 
        private Long tid; 
        private Long workflowInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(SetWorkflowExtraInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.renderAddApprovalNode = request.renderAddApprovalNode;
            this.renderAgree = request.renderAgree;
            this.renderCancel = request.renderCancel;
            this.renderReject = request.renderReject;
            this.renderTransfer = request.renderTransfer;
            this.thirdpartyWorkflowComment = request.thirdpartyWorkflowComment;
            this.thirdpartyWorkflowUrl = request.thirdpartyWorkflowUrl;
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
         * RenderAddApprovalNode.
         */
        public Builder renderAddApprovalNode(Boolean renderAddApprovalNode) {
            this.putQueryParameter("RenderAddApprovalNode", renderAddApprovalNode);
            this.renderAddApprovalNode = renderAddApprovalNode;
            return this;
        }

        /**
         * RenderAgree.
         */
        public Builder renderAgree(Boolean renderAgree) {
            this.putQueryParameter("RenderAgree", renderAgree);
            this.renderAgree = renderAgree;
            return this;
        }

        /**
         * RenderCancel.
         */
        public Builder renderCancel(Boolean renderCancel) {
            this.putQueryParameter("RenderCancel", renderCancel);
            this.renderCancel = renderCancel;
            return this;
        }

        /**
         * RenderReject.
         */
        public Builder renderReject(Boolean renderReject) {
            this.putQueryParameter("RenderReject", renderReject);
            this.renderReject = renderReject;
            return this;
        }

        /**
         * RenderTransfer.
         */
        public Builder renderTransfer(Boolean renderTransfer) {
            this.putQueryParameter("RenderTransfer", renderTransfer);
            this.renderTransfer = renderTransfer;
            return this;
        }

        /**
         * ThirdpartyWorkflowComment.
         */
        public Builder thirdpartyWorkflowComment(String thirdpartyWorkflowComment) {
            this.putQueryParameter("ThirdpartyWorkflowComment", thirdpartyWorkflowComment);
            this.thirdpartyWorkflowComment = thirdpartyWorkflowComment;
            return this;
        }

        /**
         * ThirdpartyWorkflowUrl.
         */
        public Builder thirdpartyWorkflowUrl(String thirdpartyWorkflowUrl) {
            this.putQueryParameter("ThirdpartyWorkflowUrl", thirdpartyWorkflowUrl);
            this.thirdpartyWorkflowUrl = thirdpartyWorkflowUrl;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>184****</p>
         */
        public Builder workflowInstanceId(Long workflowInstanceId) {
            this.putQueryParameter("WorkflowInstanceId", workflowInstanceId);
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }

        @Override
        public SetWorkflowExtraInfoRequest build() {
            return new SetWorkflowExtraInfoRequest(this);
        } 

    } 

}
