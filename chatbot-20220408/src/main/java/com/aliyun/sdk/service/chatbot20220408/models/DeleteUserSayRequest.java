// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserSayRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserSayRequest</p>
 */
public class DeleteUserSayRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IntentId")
    @Validation(required = true)
    private Long intentId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UserSayId")
    @Validation(required = true)
    private Long userSayId;

    private DeleteUserSayRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.instanceId = builder.instanceId;
        this.intentId = builder.intentId;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userSayId
     */
    public Long getUserSayId() {
        return this.userSayId;
    }

    public static final class Builder extends Request.Builder<DeleteUserSayRequest, Builder> {
        private String agentKey; 
        private String instanceId; 
        private Long intentId; 
        private String regionId; 
        private Long userSayId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserSayRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.instanceId = request.instanceId;
            this.intentId = request.intentId;
            this.regionId = request.regionId;
            this.userSayId = request.userSayId;
        } 

        /**
         * 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
