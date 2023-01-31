// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScriptResponse} extends {@link TeaModel}
 *
 * <p>CreateScriptResponse</p>
 */
public class CreateScriptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateScriptResponseBody body;

    private CreateScriptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateScriptResponse create() {
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
    public CreateScriptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateScriptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateScriptResponseBody body);

        @Override
        CreateScriptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateScriptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateScriptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateScriptResponse response) {
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
        public Builder body(CreateScriptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateScriptResponse build() {
            return new CreateScriptResponse(this);
        } 

    } 

}
