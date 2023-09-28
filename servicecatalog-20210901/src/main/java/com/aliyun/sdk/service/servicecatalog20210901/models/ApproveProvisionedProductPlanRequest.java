// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveProvisionedProductPlanRequest} extends {@link RequestModel}
 *
 * <p>ApproveProvisionedProductPlanRequest</p>
 */
public class ApproveProvisionedProductPlanRequest extends Request {
    @Body
    @NameInMap("ApprovalAction")
    @Validation(required = true)
    private String approvalAction;

    @Body
    @NameInMap("Comment")
    private String comment;

    @Body
    @NameInMap("PlanId")
    @Validation(required = true)
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
         * The review action. Valid values:
         * <p>
         * 
         * *   Approve
         * *   Reject
         */
        public Builder approvalAction(String approvalAction) {
            this.putBodyParameter("ApprovalAction", approvalAction);
            this.approvalAction = approvalAction;
            return this;
        }

        /**
         * The review description.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The ID of the plan.
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
