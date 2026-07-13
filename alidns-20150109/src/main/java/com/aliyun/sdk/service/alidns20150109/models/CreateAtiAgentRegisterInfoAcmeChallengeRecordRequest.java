// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link CreateAtiAgentRegisterInfoAcmeChallengeRecordRequest} extends {@link RequestModel}
 *
 * <p>CreateAtiAgentRegisterInfoAcmeChallengeRecordRequest</p>
 */
public class CreateAtiAgentRegisterInfoAcmeChallengeRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentRegisterInfoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentRegisterInfoId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    private CreateAtiAgentRegisterInfoAcmeChallengeRecordRequest(Builder builder) {
        super(builder);
        this.agentRegisterInfoId = builder.agentRegisterInfoId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAtiAgentRegisterInfoAcmeChallengeRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRegisterInfoId
     */
    public String getAgentRegisterInfoId() {
        return this.agentRegisterInfoId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateAtiAgentRegisterInfoAcmeChallengeRecordRequest, Builder> {
        private String agentRegisterInfoId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateAtiAgentRegisterInfoAcmeChallengeRecordRequest request) {
            super(request);
            this.agentRegisterInfoId = request.agentRegisterInfoId;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2074031103110331392</p>
         */
        public Builder agentRegisterInfoId(String agentRegisterInfoId) {
            this.putQueryParameter("AgentRegisterInfoId", agentRegisterInfoId);
            this.agentRegisterInfoId = agentRegisterInfoId;
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
        public CreateAtiAgentRegisterInfoAcmeChallengeRecordRequest build() {
            return new CreateAtiAgentRegisterInfoAcmeChallengeRecordRequest(this);
        } 

    } 

}
