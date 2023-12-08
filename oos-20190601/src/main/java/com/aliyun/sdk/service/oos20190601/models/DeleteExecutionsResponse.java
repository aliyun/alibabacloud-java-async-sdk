// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteExecutionsResponse} extends {@link TeaModel}
 *
 * <p>DeleteExecutionsResponse</p>
 */
public class DeleteExecutionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteExecutionsResponseBody body;

    private DeleteExecutionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteExecutionsResponse create() {
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
    public DeleteExecutionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteExecutionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteExecutionsResponseBody body);

        @Override
        DeleteExecutionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteExecutionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteExecutionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteExecutionsResponse response) {
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
        public Builder body(DeleteExecutionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteExecutionsResponse build() {
            return new DeleteExecutionsResponse(this);
        } 

    } 

}
