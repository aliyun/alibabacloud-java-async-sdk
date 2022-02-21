// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAuthResourceResponse} extends {@link TeaModel}
 *
 * <p>DeleteAuthResourceResponse</p>
 */
public class DeleteAuthResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAuthResourceResponseBody body;

    private DeleteAuthResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAuthResourceResponse create() {
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
    public DeleteAuthResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAuthResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAuthResourceResponseBody body);

        @Override
        DeleteAuthResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAuthResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAuthResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAuthResourceResponse response) {
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
        public Builder body(DeleteAuthResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAuthResourceResponse build() {
            return new DeleteAuthResourceResponse(this);
        } 

    } 

}
