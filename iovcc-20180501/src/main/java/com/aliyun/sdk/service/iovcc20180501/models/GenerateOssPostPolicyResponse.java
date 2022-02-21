// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateOssPostPolicyResponse} extends {@link TeaModel}
 *
 * <p>GenerateOssPostPolicyResponse</p>
 */
public class GenerateOssPostPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateOssPostPolicyResponseBody body;

    private GenerateOssPostPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateOssPostPolicyResponse create() {
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
    public GenerateOssPostPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateOssPostPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateOssPostPolicyResponseBody body);

        @Override
        GenerateOssPostPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateOssPostPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateOssPostPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateOssPostPolicyResponse response) {
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
        public Builder body(GenerateOssPostPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateOssPostPolicyResponse build() {
            return new GenerateOssPostPolicyResponse(this);
        } 

    } 

}
