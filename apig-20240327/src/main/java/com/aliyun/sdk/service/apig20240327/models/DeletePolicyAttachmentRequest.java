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
 * {@link DeletePolicyAttachmentRequest} extends {@link RequestModel}
 *
 * <p>DeletePolicyAttachmentRequest</p>
 */
public class DeletePolicyAttachmentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policyAttachmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyAttachmentId;

    private DeletePolicyAttachmentRequest(Builder builder) {
        super(builder);
        this.policyAttachmentId = builder.policyAttachmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolicyAttachmentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyAttachmentId
     */
    public String getPolicyAttachmentId() {
        return this.policyAttachmentId;
    }

    public static final class Builder extends Request.Builder<DeletePolicyAttachmentRequest, Builder> {
        private String policyAttachmentId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolicyAttachmentRequest request) {
            super(request);
            this.policyAttachmentId = request.policyAttachmentId;
        } 

        /**
         * <p>Policy Attachment ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pr-ctd4j9mmahko5fb4***</p>
         */
        public Builder policyAttachmentId(String policyAttachmentId) {
            this.putPathParameter("policyAttachmentId", policyAttachmentId);
            this.policyAttachmentId = policyAttachmentId;
            return this;
        }

        @Override
        public DeletePolicyAttachmentRequest build() {
            return new DeletePolicyAttachmentRequest(this);
        } 

    } 

}
