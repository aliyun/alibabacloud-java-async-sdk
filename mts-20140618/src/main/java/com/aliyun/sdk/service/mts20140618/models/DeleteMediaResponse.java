// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMediaResponse} extends {@link TeaModel}
 *
 * <p>DeleteMediaResponse</p>
 */
public class DeleteMediaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMediaResponseBody body;

    private DeleteMediaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMediaResponse create() {
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
    public DeleteMediaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMediaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMediaResponseBody body);

        @Override
        DeleteMediaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMediaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMediaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMediaResponse response) {
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
        public Builder body(DeleteMediaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMediaResponse build() {
            return new DeleteMediaResponse(this);
        } 

    } 

}
