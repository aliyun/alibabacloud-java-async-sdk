// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteILMPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteILMPolicyRequest</p>
 */
public class DeleteILMPolicyRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("PolicyName")
    @Validation(required = true)
    private String policyName;

    private DeleteILMPolicyRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.policyName = builder.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteILMPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    public static final class Builder extends Request.Builder<DeleteILMPolicyRequest, Builder> {
        private String instanceId; 
        private String policyName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteILMPolicyRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.policyName = request.policyName;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.putPathParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        @Override
        public DeleteILMPolicyRequest build() {
            return new DeleteILMPolicyRequest(this);
        } 

    } 

}
