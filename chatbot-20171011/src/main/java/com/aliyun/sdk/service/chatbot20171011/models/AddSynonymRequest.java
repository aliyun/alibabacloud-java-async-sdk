// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSynonymRequest} extends {@link RequestModel}
 *
 * <p>AddSynonymRequest</p>
 */
public class AddSynonymRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("CoreWordName")
    @Validation(required = true)
    private String coreWordName;

    @Query
    @NameInMap("Synonym")
    @Validation(required = true)
    private String synonym;

    private AddSynonymRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.coreWordName = builder.coreWordName;
        this.synonym = builder.synonym;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSynonymRequest create() {
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
     * @return coreWordName
     */
    public String getCoreWordName() {
        return this.coreWordName;
    }

    /**
     * @return synonym
     */
    public String getSynonym() {
        return this.synonym;
    }

    public static final class Builder extends Request.Builder<AddSynonymRequest, Builder> {
        private String agentKey; 
        private String coreWordName; 
        private String synonym; 

        private Builder() {
            super();
        } 

        private Builder(AddSynonymRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.coreWordName = request.coreWordName;
            this.synonym = request.synonym;
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
         * CoreWordName.
         */
        public Builder coreWordName(String coreWordName) {
            this.putQueryParameter("CoreWordName", coreWordName);
            this.coreWordName = coreWordName;
            return this;
        }

        /**
         * Synonym.
         */
        public Builder synonym(String synonym) {
            this.putQueryParameter("Synonym", synonym);
            this.synonym = synonym;
            return this;
        }

        @Override
        public AddSynonymRequest build() {
            return new AddSynonymRequest(this);
        } 

    } 

}
