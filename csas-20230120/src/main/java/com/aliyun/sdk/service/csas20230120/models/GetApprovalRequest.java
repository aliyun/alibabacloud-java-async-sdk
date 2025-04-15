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
 * {@link GetApprovalRequest} extends {@link RequestModel}
 *
 * <p>GetApprovalRequest</p>
 */
public class GetApprovalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String approvalId;

    private GetApprovalRequest(Builder builder) {
        super(builder);
        this.approvalId = builder.approvalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApprovalRequest create() {
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

    public static final class Builder extends Request.Builder<GetApprovalRequest, Builder> {
        private String approvalId; 

        private Builder() {
            super();
        } 

        private Builder(GetApprovalRequest request) {
            super(request);
            this.approvalId = request.approvalId;
        } 

        /**
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

        @Override
        public GetApprovalRequest build() {
            return new GetApprovalRequest(this);
        } 

    } 

}
