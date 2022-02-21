// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSpeechResponse} extends {@link TeaModel}
 *
 * <p>DeleteSpeechResponse</p>
 */
public class DeleteSpeechResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSpeechResponseBody body;

    private DeleteSpeechResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSpeechResponse create() {
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
    public DeleteSpeechResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSpeechResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSpeechResponseBody body);

        @Override
        DeleteSpeechResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSpeechResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSpeechResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSpeechResponse response) {
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
        public Builder body(DeleteSpeechResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSpeechResponse build() {
            return new DeleteSpeechResponse(this);
        } 

    } 

}
