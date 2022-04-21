// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceResponse} extends {@link TeaModel}
 *
 * <p>DeleteServiceResponse</p>
 */
public class DeleteServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteServiceResponseBody body;

    private DeleteServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteServiceResponse create() {
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
    public DeleteServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteServiceResponseBody body);

        @Override
        DeleteServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteServiceResponse response) {
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
        public Builder body(DeleteServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteServiceResponse build() {
            return new DeleteServiceResponse(this);
        } 

    } 

}
