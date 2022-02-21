// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateILMPolicyResponse} extends {@link TeaModel}
 *
 * <p>CreateILMPolicyResponse</p>
 */
public class CreateILMPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateILMPolicyResponseBody body;

    private CreateILMPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateILMPolicyResponse create() {
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
    public CreateILMPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateILMPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateILMPolicyResponseBody body);

        @Override
        CreateILMPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateILMPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateILMPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateILMPolicyResponse response) {
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
        public Builder body(CreateILMPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateILMPolicyResponse build() {
            return new CreateILMPolicyResponse(this);
        } 

    } 

}
