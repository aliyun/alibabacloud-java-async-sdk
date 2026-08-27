// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link DetachAndDeletePolicyRequest} extends {@link RequestModel}
 *
 * <p>DetachAndDeletePolicyRequest</p>
 */
public class DetachAndDeletePolicyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("policyAttachmentId")
    private String policyAttachmentId;

    private DetachAndDeletePolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.policyAttachmentId = builder.policyAttachmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachAndDeletePolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return policyAttachmentId
     */
    public String getPolicyAttachmentId() {
        return this.policyAttachmentId;
    }

    public static final class Builder extends Request.Builder<DetachAndDeletePolicyRequest, Builder> {
        private String policyId; 
        private String policyAttachmentId; 

        private Builder() {
            super();
        } 

        private Builder(DetachAndDeletePolicyRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.policyAttachmentId = request.policyAttachmentId;
        } 

        /**
         * <p>The policy ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>p-cq7l5s5lhtgi6qasrdc0</p>
         */
        public Builder policyId(String policyId) {
            this.putPathParameter("policyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The policy association ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pr-cq7l5s5lhtgi6qasrdc0</p>
         */
        public Builder policyAttachmentId(String policyAttachmentId) {
            this.putQueryParameter("policyAttachmentId", policyAttachmentId);
            this.policyAttachmentId = policyAttachmentId;
            return this;
        }

        @Override
        public DetachAndDeletePolicyRequest build() {
            return new DetachAndDeletePolicyRequest(this);
        } 

    } 

}
