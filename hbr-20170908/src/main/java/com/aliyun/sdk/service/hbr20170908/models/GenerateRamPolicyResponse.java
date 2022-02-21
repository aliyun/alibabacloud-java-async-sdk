// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateRamPolicyResponse} extends {@link TeaModel}
 *
 * <p>GenerateRamPolicyResponse</p>
 */
public class GenerateRamPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateRamPolicyResponseBody body;

    private GenerateRamPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateRamPolicyResponse create() {
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
    public GenerateRamPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateRamPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateRamPolicyResponseBody body);

        @Override
        GenerateRamPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateRamPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateRamPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateRamPolicyResponse response) {
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
        public Builder body(GenerateRamPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateRamPolicyResponse build() {
            return new GenerateRamPolicyResponse(this);
        } 

    } 

}
