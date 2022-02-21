// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveResponse} extends {@link TeaModel}
 *
 * <p>DeleteLiveResponse</p>
 */
public class DeleteLiveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLiveResponseBody body;

    private DeleteLiveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLiveResponse create() {
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
    public DeleteLiveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLiveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLiveResponseBody body);

        @Override
        DeleteLiveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLiveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLiveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLiveResponse response) {
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
        public Builder body(DeleteLiveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLiveResponse build() {
            return new DeleteLiveResponse(this);
        } 

    } 

}
