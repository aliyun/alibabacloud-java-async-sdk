// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDSEntityValueRequest} extends {@link RequestModel}
 *
 * <p>CreateDSEntityValueRequest</p>
 */
public class CreateDSEntityValueRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("EntityId")
    @Validation(required = true)
    private Long entityId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Synonyms")
    private java.util.List < String > synonyms;

    private CreateDSEntityValueRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.content = builder.content;
        this.entityId = builder.entityId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.synonyms = builder.synonyms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDSEntityValueRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
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

    /**
     * @return synonyms
     */
    public java.util.List < String > getSynonyms() {
        return this.synonyms;
    }

    public static final class Builder extends Request.Builder<CreateDSEntityValueRequest, Builder> {
        private String agentKey; 
        private String content; 
        private Long entityId; 
        private String instanceId; 
        private String regionId; 
        private java.util.List < String > synonyms; 

        private Builder() {
            super();
        } 

        private Builder(CreateDSEntityValueRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.content = request.content;
            this.entityId = request.entityId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.synonyms = request.synonyms;
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
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * 实体ID，修改实体成员时可为空
         */
        public Builder entityId(Long entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Synonyms.
         */
        public Builder synonyms(java.util.List < String > synonyms) {
            String synonymsShrink = shrink(synonyms, "Synonyms", "json");
            this.putBodyParameter("Synonyms", synonymsShrink);
            this.synonyms = synonyms;
            return this;
        }

        @Override
        public CreateDSEntityValueRequest build() {
            return new CreateDSEntityValueRequest(this);
        } 

    } 

}
