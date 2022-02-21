// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMultiZoneClusterResponse} extends {@link TeaModel}
 *
 * <p>DeleteMultiZoneClusterResponse</p>
 */
public class DeleteMultiZoneClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMultiZoneClusterResponseBody body;

    private DeleteMultiZoneClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMultiZoneClusterResponse create() {
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
    public DeleteMultiZoneClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMultiZoneClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMultiZoneClusterResponseBody body);

        @Override
        DeleteMultiZoneClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMultiZoneClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMultiZoneClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMultiZoneClusterResponse response) {
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
        public Builder body(DeleteMultiZoneClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMultiZoneClusterResponse build() {
            return new DeleteMultiZoneClusterResponse(this);
        } 

    } 

}
