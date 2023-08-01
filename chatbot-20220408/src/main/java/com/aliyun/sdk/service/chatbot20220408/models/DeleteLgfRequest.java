// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLgfRequest} extends {@link RequestModel}
 *
 * <p>DeleteLgfRequest</p>
 */
public class DeleteLgfRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    @Query
    @NameInMap("LgfId")
    @Validation(required = true)
    private Long lgfId;

    private DeleteLgfRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.instanceId = builder.instanceId;
        this.intentId = builder.intentId;
        this.lgfId = builder.lgfId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLgfRequest create() {
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
     * @return lgfId
     */
    public Long getLgfId() {
        return this.lgfId;
    }

    public static final class Builder extends Request.Builder<DeleteLgfRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String instanceId; 
        private Long intentId; 
        private Long lgfId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLgfRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.instanceId = request.instanceId;
            this.intentId = request.intentId;
            this.lgfId = request.lgfId;
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
         * lgf Id
         */
        public Builder lgfId(Long lgfId) {
            this.putQueryParameter("LgfId", lgfId);
            this.lgfId = lgfId;
            return this;
        }

        @Override
        public DeleteLgfRequest build() {
            return new DeleteLgfRequest(this);
        } 

    } 

}
