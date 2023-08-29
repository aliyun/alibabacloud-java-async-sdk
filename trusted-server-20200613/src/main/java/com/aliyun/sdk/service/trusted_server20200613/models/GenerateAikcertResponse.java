// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAikcertResponse} extends {@link TeaModel}
 *
 * <p>GenerateAikcertResponse</p>
 */
public class GenerateAikcertResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateAikcertResponseBody body;

    private GenerateAikcertResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateAikcertResponse create() {
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
    public GenerateAikcertResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateAikcertResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateAikcertResponseBody body);

        @Override
        GenerateAikcertResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateAikcertResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateAikcertResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateAikcertResponse response) {
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
        public Builder body(GenerateAikcertResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateAikcertResponse build() {
            return new GenerateAikcertResponse(this);
        } 

    } 

}
