// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link ApproveProvisionedProductPlanRequest} extends {@link RequestModel}
 *
 * <p>ApproveProvisionedProductPlanRequest</p>
 */
public class ApproveProvisionedProductPlanRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApprovalAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String approvalAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planId;

    private ApproveProvisionedProductPlanRequest(Builder builder) {
        super(builder);
        this.approvalAction = builder.approvalAction;
        this.comment = builder.comment;
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApproveProvisionedProductPlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approvalAction
     */
    public String getApprovalAction() {
        return this.approvalAction;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    public static final class Builder extends Request.Builder<ApproveProvisionedProductPlanRequest, Builder> {
        private String approvalAction; 
        private String comment; 
        private String planId; 

        private Builder() {
            super();
        } 

        private Builder(ApproveProvisionedProductPlanRequest request) {
            super(request);
            this.approvalAction = request.approvalAction;
            this.comment = request.comment;
            this.planId = request.planId;
        } 

        /**
         * <p>The review action. Valid values:</p>
         * <ul>
         * <li>Approve</li>
         * <li>Reject</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Approve</p>
         */
        public Builder approvalAction(String approvalAction) {
            this.putBodyParameter("ApprovalAction", approvalAction);
            this.approvalAction = approvalAction;
            return this;
        }

        /**
         * <p>The review description.</p>
         * 
         * <strong>example:</strong>
         * <p>Approved. You can create a resource.</p>
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The ID of the plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>plan-bp1jvmdk2k****</p>
         */
        public Builder planId(String planId) {
            this.putBodyParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        @Override
        public ApproveProvisionedProductPlanRequest build() {
            return new ApproveProvisionedProductPlanRequest(this);
        } 

    } 

}
