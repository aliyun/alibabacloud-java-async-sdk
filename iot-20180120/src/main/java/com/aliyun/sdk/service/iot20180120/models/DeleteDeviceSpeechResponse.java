// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDeviceSpeechResponse} extends {@link TeaModel}
 *
 * <p>DeleteDeviceSpeechResponse</p>
 */
public class DeleteDeviceSpeechResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDeviceSpeechResponseBody body;

    private DeleteDeviceSpeechResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDeviceSpeechResponse create() {
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
    public DeleteDeviceSpeechResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDeviceSpeechResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDeviceSpeechResponseBody body);

        @Override
        DeleteDeviceSpeechResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDeviceSpeechResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDeviceSpeechResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDeviceSpeechResponse response) {
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
        public Builder body(DeleteDeviceSpeechResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDeviceSpeechResponse build() {
            return new DeleteDeviceSpeechResponse(this);
        } 

    } 

}
