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
 * {@link DeleteAgentStoragePolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteAgentStoragePolicyRequest</p>
 */
public class DeleteAgentStoragePolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentStorageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentStorageName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyVersion;

    private DeleteAgentStoragePolicyRequest(Builder builder) {
        super(builder);
        this.agentStorageName = builder.agentStorageName;
        this.policyVersion = builder.policyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAgentStoragePolicyRequest create() {
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
     * @return policyVersion
     */
    public Long getPolicyVersion() {
        return this.policyVersion;
    }

    public static final class Builder extends Request.Builder<DeleteAgentStoragePolicyRequest, Builder> {
        private String agentStorageName; 
        private Long policyVersion; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAgentStoragePolicyRequest request) {
            super(request);
            this.agentStorageName = request.agentStorageName;
            this.policyVersion = request.policyVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>first-agent</p>
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
         * <p>2</p>
         */
        public Builder policyVersion(Long policyVersion) {
            this.putBodyParameter("PolicyVersion", policyVersion);
            this.policyVersion = policyVersion;
            return this;
        }

        @Override
        public DeleteAgentStoragePolicyRequest build() {
            return new DeleteAgentStoragePolicyRequest(this);
        } 

    } 

}
