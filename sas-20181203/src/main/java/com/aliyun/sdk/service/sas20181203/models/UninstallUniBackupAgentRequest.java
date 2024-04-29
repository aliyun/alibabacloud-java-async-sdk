// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallUniBackupAgentRequest} extends {@link RequestModel}
 *
 * <p>UninstallUniBackupAgentRequest</p>
 */
public class UninstallUniBackupAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyId;

    private UninstallUniBackupAgentRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallUniBackupAgentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<UninstallUniBackupAgentRequest, Builder> {
        private Long policyId; 

        private Builder() {
            super();
        } 

        private Builder(UninstallUniBackupAgentRequest request) {
            super(request);
            this.policyId = request.policyId;
        } 

        /**
         * The ID of the anti-ransomware policy.
         * <p>
         * 
         * > You can call the [DescribeUniBackupPolicies](~~DescribeUniBackupPolicies~~) operation to query the IDs of anti-ransomware policies.
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public UninstallUniBackupAgentRequest build() {
            return new UninstallUniBackupAgentRequest(this);
        } 

    } 

}
