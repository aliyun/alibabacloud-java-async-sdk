// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScriptWaveformResponse} extends {@link TeaModel}
 *
 * <p>DeleteScriptWaveformResponse</p>
 */
public class DeleteScriptWaveformResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteScriptWaveformResponseBody body;

    private DeleteScriptWaveformResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteScriptWaveformResponse create() {
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
    public DeleteScriptWaveformResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteScriptWaveformResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteScriptWaveformResponseBody body);

        @Override
        DeleteScriptWaveformResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteScriptWaveformResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteScriptWaveformResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteScriptWaveformResponse response) {
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
        public Builder body(DeleteScriptWaveformResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteScriptWaveformResponse build() {
            return new DeleteScriptWaveformResponse(this);
        } 

    } 

}
