// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceCronScalerResponse} extends {@link TeaModel}
 *
 * <p>DeleteServiceCronScalerResponse</p>
 */
public class DeleteServiceCronScalerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteServiceCronScalerResponseBody body;

    private DeleteServiceCronScalerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteServiceCronScalerResponse create() {
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
    public DeleteServiceCronScalerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteServiceCronScalerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteServiceCronScalerResponseBody body);

        @Override
        DeleteServiceCronScalerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteServiceCronScalerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteServiceCronScalerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteServiceCronScalerResponse response) {
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
        public Builder body(DeleteServiceCronScalerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteServiceCronScalerResponse build() {
            return new DeleteServiceCronScalerResponse(this);
        } 

    } 

}
