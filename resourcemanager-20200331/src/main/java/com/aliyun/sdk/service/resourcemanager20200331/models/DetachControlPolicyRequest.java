// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>DetachControlPolicyRequest</p>
 */
public class DetachControlPolicyRequest extends Request {
    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    @Query
    @NameInMap("TargetId")
    @Validation(required = true)
    private String targetId;

    private DetachControlPolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.targetId = builder.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachControlPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<DetachControlPolicyRequest, Builder> {
        private String policyId; 
        private String targetId; 

        private Builder() {
            super();
        } 

        private Builder(DetachControlPolicyRequest response) {
            super(response);
            this.policyId = response.policyId;
            this.targetId = response.targetId;
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
        public DetachControlPolicyRequest build() {
            return new DetachControlPolicyRequest(this);
        } 

    } 

}
