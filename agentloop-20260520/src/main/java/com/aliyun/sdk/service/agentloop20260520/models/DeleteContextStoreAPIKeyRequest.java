// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteContextStoreAPIKeyRequest} extends {@link RequestModel}
 *
 * <p>DeleteContextStoreAPIKeyRequest</p>
 */
public class DeleteContextStoreAPIKeyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    private String contextStoreName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private DeleteContextStoreAPIKeyRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.contextStoreName = builder.contextStoreName;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContextStoreAPIKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return contextStoreName
     */
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DeleteContextStoreAPIKeyRequest, Builder> {
        private String agentSpace; 
        private String contextStoreName; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContextStoreAPIKeyRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.contextStoreName = request.contextStoreName;
            this.name = request.name;
        } 

        /**
         * agentSpace.
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * contextStoreName.
         */
        public Builder contextStoreName(String contextStoreName) {
            this.putPathParameter("contextStoreName", contextStoreName);
            this.contextStoreName = contextStoreName;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteContextStoreAPIKeyRequest build() {
            return new DeleteContextStoreAPIKeyRequest(this);
        } 

    } 

}
