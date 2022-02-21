// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateILMPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateILMPolicyRequest</p>
 */
public class UpdateILMPolicyRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("PolicyName")
    @Validation(required = true)
    private String policyName;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    private UpdateILMPolicyRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.policyName = builder.policyName;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateILMPolicyRequest create() {
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

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateILMPolicyRequest, Builder> {
        private String instanceId; 
        private String policyName; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateILMPolicyRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.policyName = response.policyName;
            this.clientToken = response.clientToken;
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

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateILMPolicyRequest build() {
            return new UpdateILMPolicyRequest(this);
        } 

    } 

}
