// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveFilesByIdResponse} extends {@link TeaModel}
 *
 * <p>DeleteLiveFilesByIdResponse</p>
 */
public class DeleteLiveFilesByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLiveFilesByIdResponseBody body;

    private DeleteLiveFilesByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLiveFilesByIdResponse create() {
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
    public DeleteLiveFilesByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLiveFilesByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLiveFilesByIdResponseBody body);

        @Override
        DeleteLiveFilesByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLiveFilesByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLiveFilesByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLiveFilesByIdResponse response) {
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
        public Builder body(DeleteLiveFilesByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLiveFilesByIdResponse build() {
            return new DeleteLiveFilesByIdResponse(this);
        } 

    } 

}
