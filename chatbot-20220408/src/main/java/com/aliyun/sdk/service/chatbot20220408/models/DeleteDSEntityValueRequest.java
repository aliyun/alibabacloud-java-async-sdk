// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDSEntityValueRequest} extends {@link RequestModel}
 *
 * <p>DeleteDSEntityValueRequest</p>
 */
public class DeleteDSEntityValueRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("EntityId")
    @Validation(required = true)
    private Long entityId;

    @Query
    @NameInMap("EntityValueId")
    @Validation(required = true)
    private Long entityValueId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DeleteDSEntityValueRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.entityId = builder.entityId;
        this.entityValueId = builder.entityValueId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDSEntityValueRequest create() {
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
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return entityValueId
     */
    public Long getEntityValueId() {
        return this.entityValueId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteDSEntityValueRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private Long entityId; 
        private Long entityValueId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDSEntityValueRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.entityId = request.entityId;
            this.entityValueId = request.entityValueId;
            this.instanceId = request.instanceId;
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
         * 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * 实体ID
         */
        public Builder entityId(Long entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * 实体成员ID
         */
        public Builder entityValueId(Long entityValueId) {
            this.putQueryParameter("EntityValueId", entityValueId);
            this.entityValueId = entityValueId;
            return this;
        }

        /**
         * 机器人ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteDSEntityValueRequest build() {
            return new DeleteDSEntityValueRequest(this);
        } 

    } 

}
