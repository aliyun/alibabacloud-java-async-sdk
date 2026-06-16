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
 * {@link ValidateMem0APIKeyRequest} extends {@link RequestModel}
 *
 * <p>ValidateMem0APIKeyRequest</p>
 */
public class ValidateMem0APIKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    private ValidateMem0APIKeyRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateMem0APIKeyRequest create() {
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

    public static final class Builder extends Request.Builder<ValidateMem0APIKeyRequest, Builder> {
        private String agentSpace; 

        private Builder() {
            super();
        } 

        private Builder(ValidateMem0APIKeyRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
        } 

        /**
         * agentSpace.
         */
        public Builder agentSpace(String agentSpace) {
            this.putQueryParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        @Override
        public ValidateMem0APIKeyRequest build() {
            return new ValidateMem0APIKeyRequest(this);
        } 

    } 

}
