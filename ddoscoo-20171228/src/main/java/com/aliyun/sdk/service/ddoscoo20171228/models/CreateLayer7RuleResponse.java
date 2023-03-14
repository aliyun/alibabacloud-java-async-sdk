// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLayer7RuleResponse} extends {@link TeaModel}
 *
 * <p>CreateLayer7RuleResponse</p>
 */
public class CreateLayer7RuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLayer7RuleResponseBody body;

    private CreateLayer7RuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLayer7RuleResponse create() {
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
    public CreateLayer7RuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLayer7RuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLayer7RuleResponseBody body);

        @Override
        CreateLayer7RuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLayer7RuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLayer7RuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLayer7RuleResponse response) {
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
        public Builder body(CreateLayer7RuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLayer7RuleResponse build() {
            return new CreateLayer7RuleResponse(this);
        } 

    } 

}
