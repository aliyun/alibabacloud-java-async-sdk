// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecurityPolicyResponse} extends {@link TeaModel}
 *
 * <p>CreateSecurityPolicyResponse</p>
 */
public class CreateSecurityPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSecurityPolicyResponseBody body;

    private CreateSecurityPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSecurityPolicyResponse create() {
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
    public CreateSecurityPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSecurityPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSecurityPolicyResponseBody body);

        @Override
        CreateSecurityPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSecurityPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSecurityPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSecurityPolicyResponse response) {
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
        public Builder body(CreateSecurityPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSecurityPolicyResponse build() {
            return new CreateSecurityPolicyResponse(this);
        } 

    } 

}
