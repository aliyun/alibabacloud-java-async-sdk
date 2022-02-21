// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLogicTableRouteConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteLogicTableRouteConfigResponse</p>
 */
public class DeleteLogicTableRouteConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLogicTableRouteConfigResponseBody body;

    private DeleteLogicTableRouteConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLogicTableRouteConfigResponse create() {
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
    public DeleteLogicTableRouteConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLogicTableRouteConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLogicTableRouteConfigResponseBody body);

        @Override
        DeleteLogicTableRouteConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLogicTableRouteConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLogicTableRouteConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLogicTableRouteConfigResponse response) {
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
        public Builder body(DeleteLogicTableRouteConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLogicTableRouteConfigResponse build() {
            return new DeleteLogicTableRouteConfigResponse(this);
        } 

    } 

}
