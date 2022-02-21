// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEaiAllResponse} extends {@link TeaModel}
 *
 * <p>DeleteEaiAllResponse</p>
 */
public class DeleteEaiAllResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEaiAllResponseBody body;

    private DeleteEaiAllResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEaiAllResponse create() {
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
    public DeleteEaiAllResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEaiAllResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEaiAllResponseBody body);

        @Override
        DeleteEaiAllResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEaiAllResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEaiAllResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEaiAllResponse response) {
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
        public Builder body(DeleteEaiAllResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEaiAllResponse build() {
            return new DeleteEaiAllResponse(this);
        } 

    } 

}
