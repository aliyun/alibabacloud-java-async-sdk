// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link TakeoverAIAgentCallRequest} extends {@link RequestModel}
 *
 * <p>TakeoverAIAgentCallRequest</p>
 */
public class TakeoverAIAgentCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HumanAgentUserId")
    private String humanAgentUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequireToken")
    private Boolean requireToken;

    private TakeoverAIAgentCallRequest(Builder builder) {
        super(builder);
        this.humanAgentUserId = builder.humanAgentUserId;
        this.instanceId = builder.instanceId;
        this.requireToken = builder.requireToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TakeoverAIAgentCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return humanAgentUserId
     */
    public String getHumanAgentUserId() {
        return this.humanAgentUserId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requireToken
     */
    public Boolean getRequireToken() {
        return this.requireToken;
    }

    public static final class Builder extends Request.Builder<TakeoverAIAgentCallRequest, Builder> {
        private String humanAgentUserId; 
        private String instanceId; 
        private Boolean requireToken; 

        private Builder() {
            super();
        } 

        private Builder(TakeoverAIAgentCallRequest request) {
            super(request);
            this.humanAgentUserId = request.humanAgentUserId;
            this.instanceId = request.instanceId;
            this.requireToken = request.requireToken;
        } 

        /**
         * <p>The ID of the human agent that will take over the AI agent (UserId in ARTC). If you do not specify this parameter, it is automatically generated and returned.</p>
         * 
         * <strong>example:</strong>
         * <p>uid2</p>
         */
        public Builder humanAgentUserId(String humanAgentUserId) {
            this.putQueryParameter("HumanAgentUserId", humanAgentUserId);
            this.humanAgentUserId = humanAgentUserId;
            return this;
        }

        /**
         * <p>The ID of the AI agent that will be taken over.</p>
         * 
         * <strong>example:</strong>
         * <p>39f8e0bc005e4f309379701645f4****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to return the ARTC token. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder requireToken(Boolean requireToken) {
            this.putQueryParameter("RequireToken", requireToken);
            this.requireToken = requireToken;
            return this;
        }

        @Override
        public TakeoverAIAgentCallRequest build() {
            return new TakeoverAIAgentCallRequest(this);
        } 

    } 

}
