// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTLSCipherPolicyResponse} extends {@link TeaModel}
 *
 * <p>CreateTLSCipherPolicyResponse</p>
 */
public class CreateTLSCipherPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTLSCipherPolicyResponseBody body;

    private CreateTLSCipherPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTLSCipherPolicyResponse create() {
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
    public CreateTLSCipherPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTLSCipherPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTLSCipherPolicyResponseBody body);

        @Override
        CreateTLSCipherPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTLSCipherPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTLSCipherPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTLSCipherPolicyResponse response) {
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
        public Builder body(CreateTLSCipherPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTLSCipherPolicyResponse build() {
            return new CreateTLSCipherPolicyResponse(this);
        } 

    } 

}
