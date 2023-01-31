// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScriptResponse} extends {@link TeaModel}
 *
 * <p>DeleteScriptResponse</p>
 */
public class DeleteScriptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteScriptResponseBody body;

    private DeleteScriptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteScriptResponse create() {
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
    public DeleteScriptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteScriptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteScriptResponseBody body);

        @Override
        DeleteScriptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteScriptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteScriptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteScriptResponse response) {
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
        public Builder body(DeleteScriptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteScriptResponse build() {
            return new DeleteScriptResponse(this);
        } 

    } 

}
