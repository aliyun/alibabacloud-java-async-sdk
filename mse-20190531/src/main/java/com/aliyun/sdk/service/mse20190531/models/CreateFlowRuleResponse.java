// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateFlowRuleResponse</p>
 */
public class CreateFlowRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFlowRuleResponseBody body;

    private CreateFlowRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFlowRuleResponse create() {
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
    public CreateFlowRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFlowRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFlowRuleResponseBody body);

        @Override
        CreateFlowRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFlowRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFlowRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFlowRuleResponse response) {
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
        public Builder body(CreateFlowRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFlowRuleResponse build() {
            return new CreateFlowRuleResponse(this);
        } 

    } 

}
