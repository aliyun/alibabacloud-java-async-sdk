// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySystemEntitiesRequest} extends {@link RequestModel}
 *
 * <p>QuerySystemEntitiesRequest</p>
 */
public class QuerySystemEntitiesRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("EntityName")
    private String entityName;

    private QuerySystemEntitiesRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.entityName = builder.entityName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySystemEntitiesRequest create() {
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

    public static final class Builder extends Request.Builder<QuerySystemEntitiesRequest, Builder> {
        private String agentKey; 
        private String entityName; 

        private Builder() {
            super();
        } 

        private Builder(QuerySystemEntitiesRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.entityName = request.entityName;
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
         * EntityName.
         */
        public Builder entityName(String entityName) {
            this.putQueryParameter("EntityName", entityName);
            this.entityName = entityName;
            return this;
        }

        @Override
        public QuerySystemEntitiesRequest build() {
            return new QuerySystemEntitiesRequest(this);
        } 

    } 

}
