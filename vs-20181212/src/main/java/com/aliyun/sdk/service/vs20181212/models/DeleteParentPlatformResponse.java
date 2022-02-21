// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteParentPlatformResponse} extends {@link TeaModel}
 *
 * <p>DeleteParentPlatformResponse</p>
 */
public class DeleteParentPlatformResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteParentPlatformResponseBody body;

    private DeleteParentPlatformResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteParentPlatformResponse create() {
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
    public DeleteParentPlatformResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteParentPlatformResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteParentPlatformResponseBody body);

        @Override
        DeleteParentPlatformResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteParentPlatformResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteParentPlatformResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteParentPlatformResponse response) {
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
        public Builder body(DeleteParentPlatformResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteParentPlatformResponse build() {
            return new DeleteParentPlatformResponse(this);
        } 

    } 

}
