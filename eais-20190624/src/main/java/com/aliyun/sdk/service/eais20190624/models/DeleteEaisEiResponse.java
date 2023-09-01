// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEaisEiResponse} extends {@link TeaModel}
 *
 * <p>DeleteEaisEiResponse</p>
 */
public class DeleteEaisEiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEaisEiResponseBody body;

    private DeleteEaisEiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEaisEiResponse create() {
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
    public DeleteEaisEiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEaisEiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEaisEiResponseBody body);

        @Override
        DeleteEaisEiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEaisEiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEaisEiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEaisEiResponse response) {
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
        public Builder body(DeleteEaisEiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEaisEiResponse build() {
            return new DeleteEaisEiResponse(this);
        } 

    } 

}
