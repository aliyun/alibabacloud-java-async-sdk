// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDSEntityValueRequest} extends {@link RequestModel}
 *
 * <p>UpdateDSEntityValueRequest</p>
 */
public class UpdateDSEntityValueRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long entityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityValueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long entityValueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Synonyms")
    private java.util.List < String > synonyms;

    private UpdateDSEntityValueRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.content = builder.content;
        this.entityId = builder.entityId;
        this.entityValueId = builder.entityValueId;
        this.instanceId = builder.instanceId;
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
     * @return synonyms
     */
    public java.util.List < String > getSynonyms() {
        return this.synonyms;
    }

    public static final class Builder extends Request.Builder<UpdateDSEntityValueRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String content; 
        private Long entityId; 
        private Long entityValueId; 
        private String instanceId; 
        private java.util.List < String > synonyms; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDSEntityValueRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.content = request.content;
            this.entityId = request.entityId;
            this.entityValueId = request.entityValueId;
            this.instanceId = request.instanceId;
            this.synonyms = request.synonyms;
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
         * <p>This parameter is required.</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>223423423</p>
         */
        public Builder entityId(Long entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2342377423</p>
         */
        public Builder entityValueId(Long entityValueId) {
            this.putQueryParameter("EntityValueId", entityValueId);
            this.entityValueId = entityValueId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-yjzbyrEvqd</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
        public UpdateDSEntityValueRequest build() {
            return new UpdateDSEntityValueRequest(this);
        } 

    } 

}
