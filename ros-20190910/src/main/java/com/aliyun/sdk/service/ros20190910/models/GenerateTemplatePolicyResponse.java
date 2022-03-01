// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateTemplatePolicyResponse} extends {@link TeaModel}
 *
 * <p>GenerateTemplatePolicyResponse</p>
 */
public class GenerateTemplatePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateTemplatePolicyResponseBody body;

    private GenerateTemplatePolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateTemplatePolicyResponse create() {
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
    public GenerateTemplatePolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateTemplatePolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateTemplatePolicyResponseBody body);

        @Override
        GenerateTemplatePolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateTemplatePolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateTemplatePolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateTemplatePolicyResponse response) {
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
        public Builder body(GenerateTemplatePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateTemplatePolicyResponse build() {
            return new GenerateTemplatePolicyResponse(this);
        } 

    } 

}
