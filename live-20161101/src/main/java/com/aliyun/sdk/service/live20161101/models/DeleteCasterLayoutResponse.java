// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCasterLayoutResponse} extends {@link TeaModel}
 *
 * <p>DeleteCasterLayoutResponse</p>
 */
public class DeleteCasterLayoutResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCasterLayoutResponseBody body;

    private DeleteCasterLayoutResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCasterLayoutResponse create() {
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
    public DeleteCasterLayoutResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCasterLayoutResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCasterLayoutResponseBody body);

        @Override
        DeleteCasterLayoutResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCasterLayoutResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCasterLayoutResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCasterLayoutResponse response) {
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
        public Builder body(DeleteCasterLayoutResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCasterLayoutResponse build() {
            return new DeleteCasterLayoutResponse(this);
        } 

    } 

}
