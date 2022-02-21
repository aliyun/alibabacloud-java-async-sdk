// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGWSClusterResponse} extends {@link TeaModel}
 *
 * <p>DeleteGWSClusterResponse</p>
 */
public class DeleteGWSClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGWSClusterResponseBody body;

    private DeleteGWSClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGWSClusterResponse create() {
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
    public DeleteGWSClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGWSClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGWSClusterResponseBody body);

        @Override
        DeleteGWSClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGWSClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGWSClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGWSClusterResponse response) {
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
        public Builder body(DeleteGWSClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGWSClusterResponse build() {
            return new DeleteGWSClusterResponse(this);
        } 

    } 

}
