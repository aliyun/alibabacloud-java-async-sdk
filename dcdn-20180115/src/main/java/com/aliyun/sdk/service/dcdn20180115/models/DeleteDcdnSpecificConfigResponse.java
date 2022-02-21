// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDcdnSpecificConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteDcdnSpecificConfigResponse</p>
 */
public class DeleteDcdnSpecificConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDcdnSpecificConfigResponseBody body;

    private DeleteDcdnSpecificConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDcdnSpecificConfigResponse create() {
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
    public DeleteDcdnSpecificConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDcdnSpecificConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDcdnSpecificConfigResponseBody body);

        @Override
        DeleteDcdnSpecificConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDcdnSpecificConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDcdnSpecificConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDcdnSpecificConfigResponse response) {
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
        public Builder body(DeleteDcdnSpecificConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDcdnSpecificConfigResponse build() {
            return new DeleteDcdnSpecificConfigResponse(this);
        } 

    } 

}
