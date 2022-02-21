// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDemandResponse} extends {@link TeaModel}
 *
 * <p>DeleteDemandResponse</p>
 */
public class DeleteDemandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDemandResponseBody body;

    private DeleteDemandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDemandResponse create() {
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
    public DeleteDemandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDemandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDemandResponseBody body);

        @Override
        DeleteDemandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDemandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDemandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDemandResponse response) {
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
        public Builder body(DeleteDemandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDemandResponse build() {
            return new DeleteDemandResponse(this);
        } 

    } 

}
