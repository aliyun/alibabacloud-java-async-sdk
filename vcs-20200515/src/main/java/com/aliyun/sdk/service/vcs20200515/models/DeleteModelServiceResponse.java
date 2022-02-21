// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteModelServiceResponse} extends {@link TeaModel}
 *
 * <p>DeleteModelServiceResponse</p>
 */
public class DeleteModelServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteModelServiceResponseBody body;

    private DeleteModelServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteModelServiceResponse create() {
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
    public DeleteModelServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteModelServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteModelServiceResponseBody body);

        @Override
        DeleteModelServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteModelServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteModelServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteModelServiceResponse response) {
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
        public Builder body(DeleteModelServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteModelServiceResponse build() {
            return new DeleteModelServiceResponse(this);
        } 

    } 

}
