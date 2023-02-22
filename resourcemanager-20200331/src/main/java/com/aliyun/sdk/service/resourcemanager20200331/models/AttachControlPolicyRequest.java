// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>AttachControlPolicyRequest</p>
 */
public class AttachControlPolicyRequest extends Request {
    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    @Query
    @NameInMap("TargetId")
    @Validation(required = true)
    private String targetId;

    private AttachControlPolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.targetId = builder.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachControlPolicyRequest create() {
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
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    public static final class Builder extends Request.Builder<AttachControlPolicyRequest, Builder> {
        private String policyId; 
        private String targetId; 

        private Builder() {
            super();
        } 

        private Builder(AttachControlPolicyRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.targetId = request.targetId;
        } 

        /**
         * PolicyId.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * TargetId.
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        @Override
        public AttachControlPolicyRequest build() {
            return new AttachControlPolicyRequest(this);
        } 

    } 

}
