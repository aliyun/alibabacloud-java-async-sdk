// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLayer4RuleResponse} extends {@link TeaModel}
 *
 * <p>CreateLayer4RuleResponse</p>
 */
public class CreateLayer4RuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLayer4RuleResponseBody body;

    private CreateLayer4RuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLayer4RuleResponse create() {
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
    public CreateLayer4RuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLayer4RuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLayer4RuleResponseBody body);

        @Override
        CreateLayer4RuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLayer4RuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLayer4RuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLayer4RuleResponse response) {
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
        public Builder body(CreateLayer4RuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLayer4RuleResponse build() {
            return new CreateLayer4RuleResponse(this);
        } 

    } 

}
