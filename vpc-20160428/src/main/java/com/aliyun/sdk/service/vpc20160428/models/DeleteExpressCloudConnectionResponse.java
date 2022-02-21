// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteExpressCloudConnectionResponse} extends {@link TeaModel}
 *
 * <p>DeleteExpressCloudConnectionResponse</p>
 */
public class DeleteExpressCloudConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteExpressCloudConnectionResponseBody body;

    private DeleteExpressCloudConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteExpressCloudConnectionResponse create() {
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
    public DeleteExpressCloudConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteExpressCloudConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteExpressCloudConnectionResponseBody body);

        @Override
        DeleteExpressCloudConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteExpressCloudConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteExpressCloudConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteExpressCloudConnectionResponse response) {
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
        public Builder body(DeleteExpressCloudConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteExpressCloudConnectionResponse build() {
            return new DeleteExpressCloudConnectionResponse(this);
        } 

    } 

}
