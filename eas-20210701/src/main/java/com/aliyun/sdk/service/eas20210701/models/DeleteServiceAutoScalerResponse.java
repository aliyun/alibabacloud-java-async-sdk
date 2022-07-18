// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceAutoScalerResponse} extends {@link TeaModel}
 *
 * <p>DeleteServiceAutoScalerResponse</p>
 */
public class DeleteServiceAutoScalerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteServiceAutoScalerResponseBody body;

    private DeleteServiceAutoScalerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteServiceAutoScalerResponse create() {
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
    public DeleteServiceAutoScalerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteServiceAutoScalerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteServiceAutoScalerResponseBody body);

        @Override
        DeleteServiceAutoScalerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteServiceAutoScalerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteServiceAutoScalerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteServiceAutoScalerResponse response) {
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
        public Builder body(DeleteServiceAutoScalerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteServiceAutoScalerResponse build() {
            return new DeleteServiceAutoScalerResponse(this);
        } 

    } 

}
