// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDSEntityValueRequest} extends {@link RequestModel}
 *
 * <p>UpdateDSEntityValueRequest</p>
 */
public class UpdateDSEntityValueRequest extends Request {
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
    @NameInMap("EntityValueId")
    @Validation(required = true)
    private Long entityValueId;

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

    private UpdateDSEntityValueRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.content = builder.content;
        this.entityId = builder.entityId;
        this.entityValueId = builder.entityValueId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.synonyms = builder.synonyms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDSEntityValueRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateDSEntityValueRequest, Builder> {
        private String agentKey; 
        private String content; 
        private Long entityId; 
        private Long entityValueId; 
        private String instanceId; 
        private String regionId; 
        private java.util.List < String > synonyms; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDSEntityValueRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.content = request.content;
            this.entityId = request.entityId;
            this.entityValueId = request.entityValueId;
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
         * 实体类型为synonyms时，表示实体归一化值；当实体类型为regex时，表示正则表达式文本
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
         * 实体成员ID，创建实体成员时为空
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 实体同义词
         */
        public Builder synonyms(java.util.List < String > synonyms) {
            String synonymsShrink = shrink(synonyms, "Synonyms", "json");
            this.putBodyParameter("Synonyms", synonymsShrink);
            this.synonyms = synonyms;
            return this;
        }

        @Override
        public UpdateDSEntityValueRequest build() {
            return new UpdateDSEntityValueRequest(this);
        } 

    } 

}
