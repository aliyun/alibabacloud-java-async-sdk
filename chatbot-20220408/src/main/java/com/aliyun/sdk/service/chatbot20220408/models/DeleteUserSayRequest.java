// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteUserSayRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserSayRequest</p>
 */
public class DeleteUserSayRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long intentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserSayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userSayId;

    private DeleteUserSayRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.instanceId = builder.instanceId;
        this.intentId = builder.intentId;
        this.userSayId = builder.userSayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserSayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return intentId
     */
    public Long getIntentId() {
        return this.intentId;
    }

    /**
     * @return userSayId
     */
    public Long getUserSayId() {
        return this.userSayId;
    }

    public static final class Builder extends Request.Builder<DeleteUserSayRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String instanceId; 
        private Long intentId; 
        private Long userSayId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserSayRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.instanceId = request.instanceId;
            this.intentId = request.intentId;
            this.userSayId = request.userSayId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IntentId.
         */
        public Builder intentId(Long intentId) {
            this.putQueryParameter("IntentId", intentId);
            this.intentId = intentId;
            return this;
        }

        /**
         * UserSayId.
         */
        public Builder userSayId(Long userSayId) {
            this.putQueryParameter("UserSayId", userSayId);
            this.userSayId = userSayId;
            return this;
        }

        @Override
        public DeleteUserSayRequest build() {
            return new DeleteUserSayRequest(this);
        } 

    } 

}
