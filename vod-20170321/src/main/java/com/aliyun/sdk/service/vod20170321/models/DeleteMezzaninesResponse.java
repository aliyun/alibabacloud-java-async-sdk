// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMezzaninesResponse} extends {@link TeaModel}
 *
 * <p>DeleteMezzaninesResponse</p>
 */
public class DeleteMezzaninesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMezzaninesResponseBody body;

    private DeleteMezzaninesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMezzaninesResponse create() {
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
    public DeleteMezzaninesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMezzaninesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMezzaninesResponseBody body);

        @Override
        DeleteMezzaninesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMezzaninesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMezzaninesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMezzaninesResponse response) {
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
        public Builder body(DeleteMezzaninesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMezzaninesResponse build() {
            return new DeleteMezzaninesResponse(this);
        } 

    } 

}
