// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDSEntityRequest} extends {@link RequestModel}
 *
 * <p>CreateDSEntityRequest</p>
 */
public class CreateDSEntityRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("EntityName")
    @Validation(required = true)
    private String entityName;

    @Query
    @NameInMap("EntityType")
    @Validation(required = true)
    private String entityType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateDSEntityRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.entityName = builder.entityName;
        this.entityType = builder.entityType;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDSEntityRequest create() {
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
     * @return entityName
     */
    public String getEntityName() {
        return this.entityName;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateDSEntityRequest, Builder> {
        private String agentKey; 
        private String entityName; 
        private String entityType; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDSEntityRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.entityName = request.entityName;
            this.entityType = request.entityType;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * ????????????key,???????????????????????????????????????key???????????????????????????????????????
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * ?????????????????????????????????????????????????????????????????????
         */
        public Builder entityName(String entityName) {
            this.putQueryParameter("EntityName", entityName);
            this.entityName = entityName;
            return this;
        }

        /**
         * ?????????????????????:,EntityTypeEnum[synonyms(?????????),regex(??????)]
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * ?????????ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        @Override
        public CreateDSEntityRequest build() {
            return new CreateDSEntityRequest(this);
        } 

    } 

}
