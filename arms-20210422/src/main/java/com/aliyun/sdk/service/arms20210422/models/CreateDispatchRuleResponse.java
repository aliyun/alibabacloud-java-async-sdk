// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDispatchRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateDispatchRuleResponse</p>
 */
public class CreateDispatchRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDispatchRuleResponseBody body;

    private CreateDispatchRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDispatchRuleResponse create() {
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
    public CreateDispatchRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDispatchRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDispatchRuleResponseBody body);

        @Override
        CreateDispatchRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDispatchRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDispatchRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDispatchRuleResponse response) {
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
        public Builder body(CreateDispatchRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDispatchRuleResponse build() {
            return new CreateDispatchRuleResponse(this);
        } 

    } 

}
