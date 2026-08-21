// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ossagent20260810.models;

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
 * {@link AgentCardRequest} extends {@link RequestModel}
 *
 * <p>AgentCardRequest</p>
 */
public class AgentCardRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    private AgentCardRequest(Builder builder) {
        super(builder);
        this.env = builder.env;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentCardRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    public static final class Builder extends Request.Builder<AgentCardRequest, Builder> {
        private String env; 

        private Builder() {
            super();
        } 

        private Builder(AgentCardRequest request) {
            super(request);
            this.env = request.env;
        } 

        /**
         * Env.
         */
        public Builder env(String env) {
            this.putQueryParameter("Env", env);
            this.env = env;
            return this;
        }

        @Override
        public AgentCardRequest build() {
            return new AgentCardRequest(this);
        } 

    } 

}
