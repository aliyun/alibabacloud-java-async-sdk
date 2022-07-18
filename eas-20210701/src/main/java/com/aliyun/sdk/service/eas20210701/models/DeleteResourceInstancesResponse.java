// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResourceInstancesResponse} extends {@link TeaModel}
 *
 * <p>DeleteResourceInstancesResponse</p>
 */
public class DeleteResourceInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteResourceInstancesResponseBody body;

    private DeleteResourceInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteResourceInstancesResponse create() {
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
    public DeleteResourceInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteResourceInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteResourceInstancesResponseBody body);

        @Override
        DeleteResourceInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteResourceInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteResourceInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteResourceInstancesResponse response) {
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
        public Builder body(DeleteResourceInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteResourceInstancesResponse build() {
            return new DeleteResourceInstancesResponse(this);
        } 

    } 

}
