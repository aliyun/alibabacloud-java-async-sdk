// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateExecutionPolicyResponse} extends {@link TeaModel}
 *
 * <p>GenerateExecutionPolicyResponse</p>
 */
public class GenerateExecutionPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateExecutionPolicyResponseBody body;

    private GenerateExecutionPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateExecutionPolicyResponse create() {
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
    public GenerateExecutionPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateExecutionPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateExecutionPolicyResponseBody body);

        @Override
        GenerateExecutionPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateExecutionPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateExecutionPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateExecutionPolicyResponse response) {
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
        public Builder body(GenerateExecutionPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateExecutionPolicyResponse build() {
            return new GenerateExecutionPolicyResponse(this);
        } 

    } 

}
