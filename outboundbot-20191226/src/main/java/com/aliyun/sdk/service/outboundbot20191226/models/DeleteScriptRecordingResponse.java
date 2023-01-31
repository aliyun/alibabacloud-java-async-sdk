// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScriptRecordingResponse} extends {@link TeaModel}
 *
 * <p>DeleteScriptRecordingResponse</p>
 */
public class DeleteScriptRecordingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteScriptRecordingResponseBody body;

    private DeleteScriptRecordingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteScriptRecordingResponse create() {
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
    public DeleteScriptRecordingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteScriptRecordingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteScriptRecordingResponseBody body);

        @Override
        DeleteScriptRecordingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteScriptRecordingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteScriptRecordingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteScriptRecordingResponse response) {
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
        public Builder body(DeleteScriptRecordingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteScriptRecordingResponse build() {
            return new DeleteScriptRecordingResponse(this);
        } 

    } 

}
