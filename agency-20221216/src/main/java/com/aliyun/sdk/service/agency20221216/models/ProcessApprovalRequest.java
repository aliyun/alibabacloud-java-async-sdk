// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link ProcessApprovalRequest} extends {@link RequestModel}
 *
 * <p>ProcessApprovalRequest</p>
 */
public class ProcessApprovalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationSheetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationSheetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String approvalAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalComments")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 500, minLength = 1)
    private String approvalComments;

    private ProcessApprovalRequest(Builder builder) {
        super(builder);
        this.applicationSheetId = builder.applicationSheetId;
        this.approvalAction = builder.approvalAction;
        this.approvalComments = builder.approvalComments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProcessApprovalRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationSheetId
     */
    public String getApplicationSheetId() {
        return this.applicationSheetId;
    }

    /**
     * @return approvalAction
     */
    public String getApprovalAction() {
        return this.approvalAction;
    }

    /**
     * @return approvalComments
     */
    public String getApprovalComments() {
        return this.approvalComments;
    }

    public static final class Builder extends Request.Builder<ProcessApprovalRequest, Builder> {
        private String applicationSheetId; 
        private String approvalAction; 
        private String approvalComments; 

        private Builder() {
            super();
        } 

        private Builder(ProcessApprovalRequest request) {
            super(request);
            this.applicationSheetId = request.applicationSheetId;
            this.approvalAction = request.approvalAction;
            this.approvalComments = request.approvalComments;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d54ca949-9b88-4514-add3-c6029c4027f4</p>
         */
        public Builder applicationSheetId(String applicationSheetId) {
            this.putQueryParameter("ApplicationSheetId", applicationSheetId);
            this.applicationSheetId = applicationSheetId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Approve</p>
         */
        public Builder approvalAction(String approvalAction) {
            this.putQueryParameter("ApprovalAction", approvalAction);
            this.approvalAction = approvalAction;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder approvalComments(String approvalComments) {
            this.putQueryParameter("ApprovalComments", approvalComments);
            this.approvalComments = approvalComments;
            return this;
        }

        @Override
        public ProcessApprovalRequest build() {
            return new ProcessApprovalRequest(this);
        } 

    } 

}
