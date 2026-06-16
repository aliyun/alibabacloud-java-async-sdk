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
 * {@link AddMem0MemoriesRequest} extends {@link RequestModel}
 *
 * <p>AddMem0MemoriesRequest</p>
 */
public class AddMem0MemoriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map<String, ?> body;

    private AddMem0MemoriesRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMem0MemoriesRequest create() {
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
     * @return body
     */
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<AddMem0MemoriesRequest, Builder> {
        private String agentSpace; 
        private java.util.Map<String, ?> body; 

        private Builder() {
            super();
        } 

        private Builder(AddMem0MemoriesRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.body = request.body;
        } 

        /**
         * agentSpace.
         */
        public Builder agentSpace(String agentSpace) {
            this.putQueryParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.util.Map<String, ?> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public AddMem0MemoriesRequest build() {
            return new AddMem0MemoriesRequest(this);
        } 

    } 

}
