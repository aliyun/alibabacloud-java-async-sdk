// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMultiRateConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteMultiRateConfigResponse</p>
 */
public class DeleteMultiRateConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMultiRateConfigResponseBody body;

    private DeleteMultiRateConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMultiRateConfigResponse create() {
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
    public DeleteMultiRateConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMultiRateConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMultiRateConfigResponseBody body);

        @Override
        DeleteMultiRateConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMultiRateConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMultiRateConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMultiRateConfigResponse response) {
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
        public Builder body(DeleteMultiRateConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMultiRateConfigResponse build() {
            return new DeleteMultiRateConfigResponse(this);
        } 

    } 

}
