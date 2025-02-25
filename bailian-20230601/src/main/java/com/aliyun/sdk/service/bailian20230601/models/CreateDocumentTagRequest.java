// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDocumentTagRequest} extends {@link RequestModel}
 *
 * <p>CreateDocumentTagRequest</p>
 */
public class CreateDocumentTagRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private CreateDocumentTagRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDocumentTagRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateDocumentTagRequest, Builder> {
        private String agentKey; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateDocumentTagRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.name = request.name;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateDocumentTagRequest build() {
            return new CreateDocumentTagRequest(this);
        } 

    } 

}
