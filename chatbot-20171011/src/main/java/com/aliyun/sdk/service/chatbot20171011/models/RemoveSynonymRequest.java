// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveSynonymRequest} extends {@link RequestModel}
 *
 * <p>RemoveSynonymRequest</p>
 */
public class RemoveSynonymRequest extends Request {
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

    private RemoveSynonymRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.coreWordName = builder.coreWordName;
        this.synonym = builder.synonym;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveSynonymRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveSynonymRequest, Builder> {
        private String agentKey; 
        private String coreWordName; 
        private String synonym; 

        private Builder() {
            super();
        } 

        private Builder(RemoveSynonymRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.coreWordName = request.coreWordName;
            this.synonym = request.synonym;
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
        public RemoveSynonymRequest build() {
            return new RemoveSynonymRequest(this);
        } 

    } 

}
