// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallUniBackupAgentRequest} extends {@link RequestModel}
 *
 * <p>InstallUniBackupAgentRequest</p>
 */
public class InstallUniBackupAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyId;

    private InstallUniBackupAgentRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallUniBackupAgentRequest create() {
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

    public static final class Builder extends Request.Builder<InstallUniBackupAgentRequest, Builder> {
        private Long policyId; 

        private Builder() {
            super();
        } 

        private Builder(InstallUniBackupAgentRequest request) {
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
        public InstallUniBackupAgentRequest build() {
            return new InstallUniBackupAgentRequest(this);
        } 

    } 

}
