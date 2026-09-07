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
 * {@link InvalidateApprovalRequest} extends {@link RequestModel}
 *
 * <p>InvalidateApprovalRequest</p>
 */
public class InvalidateApprovalRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApprovalId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String approvalId;

    private InvalidateApprovalRequest(Builder builder) {
        super(builder);
        this.approvalId = builder.approvalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvalidateApprovalRequest create() {
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

    public static final class Builder extends Request.Builder<InvalidateApprovalRequest, Builder> {
        private String approvalId; 

        private Builder() {
            super();
        } 

        private Builder(InvalidateApprovalRequest request) {
            super(request);
            this.approvalId = request.approvalId;
        } 

        /**
         * <p>The ID of the approval instance to immediately invalidate. You can call ListApprovals to query approval instance IDs. Only one approval instance ID under the current Alibaba Cloud account can be specified per request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-6b5188a28634****</p>
         */
        public Builder approvalId(String approvalId) {
            this.putBodyParameter("ApprovalId", approvalId);
            this.approvalId = approvalId;
            return this;
        }

        @Override
        public InvalidateApprovalRequest build() {
            return new InvalidateApprovalRequest(this);
        } 

    } 

}
