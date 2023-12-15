// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCoreWordRequest} extends {@link RequestModel}
 *
 * <p>CreateCoreWordRequest</p>
 */
public class CreateCoreWordRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("CoreWordName")
    @Validation(required = true)
    private String coreWordName;

    private CreateCoreWordRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.coreWordName = builder.coreWordName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCoreWordRequest create() {
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

    public static final class Builder extends Request.Builder<CreateCoreWordRequest, Builder> {
        private String agentKey; 
        private String coreWordName; 

        private Builder() {
            super();
        } 

        private Builder(CreateCoreWordRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.coreWordName = request.coreWordName;
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

        @Override
        public CreateCoreWordRequest build() {
            return new CreateCoreWordRequest(this);
        } 

    } 

}
