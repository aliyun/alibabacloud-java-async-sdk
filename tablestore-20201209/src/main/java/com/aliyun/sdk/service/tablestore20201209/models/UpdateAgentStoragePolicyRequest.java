// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
 * {@link UpdateAgentStoragePolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateAgentStoragePolicyRequest</p>
 */
public class UpdateAgentStoragePolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentStorageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentStorageName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Policy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyVersion;

    private UpdateAgentStoragePolicyRequest(Builder builder) {
        super(builder);
        this.agentStorageName = builder.agentStorageName;
        this.policy = builder.policy;
        this.policyVersion = builder.policyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentStoragePolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentStorageName
     */
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return policyVersion
     */
    public Long getPolicyVersion() {
        return this.policyVersion;
    }

    public static final class Builder extends Request.Builder<UpdateAgentStoragePolicyRequest, Builder> {
        private String agentStorageName; 
        private String policy; 
        private Long policyVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgentStoragePolicyRequest request) {
            super(request);
            this.agentStorageName = request.agentStorageName;
            this.policy = request.policy;
            this.policyVersion = request.policyVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-test</p>
         */
        public Builder agentStorageName(String agentStorageName) {
            this.putBodyParameter("AgentStorageName", agentStorageName);
            this.agentStorageName = agentStorageName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;Version&quot;: &quot;1&quot;,
         *     &quot;Statement&quot;: [
         *         {
         *             &quot;Action&quot;: [
         *                 &quot;ots:<em>&quot;
         *             ],
         *             &quot;Resource&quot;: [
         *                 &quot;acs:ots:</em>:13791xxxxxxxxxxx:agentstorage/myagentstorage*&quot;
         *             ],
         *             &quot;Principal&quot;: [
         *                 &quot;*&quot;
         *             ],
         *             &quot;Effect&quot;: &quot;Allow&quot;,
         *             &quot;Condition&quot;: {
         *                 &quot;StringEquals&quot;: {
         *                     &quot;ots:TLSVersion&quot;: [
         *                         &quot;1.2&quot;
         *                     ]
         *                 },
         *                 &quot;IpAddress&quot;: {
         *                     &quot;acs:SourceIp&quot;: [
         *                         &quot;192.168.0.1&quot;,
         *                         &quot;172.16.0.1&quot;
         *                     ]
         *                 }
         *             }
         *         }
         *     ]
         * }</p>
         */
        public Builder policy(String policy) {
            this.putBodyParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder policyVersion(Long policyVersion) {
            this.putBodyParameter("PolicyVersion", policyVersion);
            this.policyVersion = policyVersion;
            return this;
        }

        @Override
        public UpdateAgentStoragePolicyRequest build() {
            return new UpdateAgentStoragePolicyRequest(this);
        } 

    } 

}
