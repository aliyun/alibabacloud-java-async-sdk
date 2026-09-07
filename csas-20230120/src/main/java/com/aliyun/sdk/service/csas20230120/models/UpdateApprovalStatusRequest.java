// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateApprovalStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateApprovalStatusRequest</p>
 */
public class UpdateApprovalStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String approvalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private UpdateApprovalStatusRequest(Builder builder) {
        super(builder);
        this.approvalId = builder.approvalId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApprovalStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approvalId
     */
    public String getApprovalId() {
        return this.approvalId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateApprovalStatusRequest, Builder> {
        private String approvalId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApprovalStatusRequest request) {
            super(request);
            this.approvalId = request.approvalId;
            this.status = request.status;
        } 

        /**
         * <p>The approval instance ID. You can obtain this value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListApprovals~~">ListApprovals</a>: Lists approval instances.</li>
         * <li><a href="~~GetApproval~~">GetApproval</a>: Queries the details of an approval instance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-872b5e911b35****</p>
         */
        public Builder approvalId(String approvalId) {
            this.putQueryParameter("ApprovalId", approvalId);
            this.approvalId = approvalId;
            return this;
        }

        /**
         * <p>The approval instance status. Valid values:</p>
         * <ul>
         * <li><strong>Approved</strong>: Approved.</li>
         * <li><strong>Rejected</strong>: Rejected.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Approved</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateApprovalStatusRequest build() {
            return new UpdateApprovalStatusRequest(this);
        } 

    } 

}
