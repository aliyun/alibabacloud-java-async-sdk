// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCdnDeliverTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteCdnDeliverTaskResponse</p>
 */
public class DeleteCdnDeliverTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCdnDeliverTaskResponseBody body;

    private DeleteCdnDeliverTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCdnDeliverTaskResponse create() {
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
    public DeleteCdnDeliverTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCdnDeliverTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCdnDeliverTaskResponseBody body);

        @Override
        DeleteCdnDeliverTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCdnDeliverTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCdnDeliverTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCdnDeliverTaskResponse response) {
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
        public Builder body(DeleteCdnDeliverTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCdnDeliverTaskResponse build() {
            return new DeleteCdnDeliverTaskResponse(this);
        } 

    } 

}
