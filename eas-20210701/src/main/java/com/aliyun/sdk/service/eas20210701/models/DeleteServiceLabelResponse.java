// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceLabelResponse} extends {@link TeaModel}
 *
 * <p>DeleteServiceLabelResponse</p>
 */
public class DeleteServiceLabelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteServiceLabelResponseBody body;

    private DeleteServiceLabelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteServiceLabelResponse create() {
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
    public DeleteServiceLabelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteServiceLabelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteServiceLabelResponseBody body);

        @Override
        DeleteServiceLabelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteServiceLabelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteServiceLabelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteServiceLabelResponse response) {
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
        public Builder body(DeleteServiceLabelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteServiceLabelResponse build() {
            return new DeleteServiceLabelResponse(this);
        } 

    } 

}
