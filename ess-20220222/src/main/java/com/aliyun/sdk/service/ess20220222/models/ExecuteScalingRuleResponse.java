// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteScalingRuleResponse} extends {@link TeaModel}
 *
 * <p>ExecuteScalingRuleResponse</p>
 */
public class ExecuteScalingRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExecuteScalingRuleResponseBody body;

    private ExecuteScalingRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExecuteScalingRuleResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public ExecuteScalingRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteScalingRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExecuteScalingRuleResponseBody body);

        @Override
        ExecuteScalingRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteScalingRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExecuteScalingRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteScalingRuleResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ExecuteScalingRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteScalingRuleResponse build() {
            return new ExecuteScalingRuleResponse(this);
        } 

    } 

}
