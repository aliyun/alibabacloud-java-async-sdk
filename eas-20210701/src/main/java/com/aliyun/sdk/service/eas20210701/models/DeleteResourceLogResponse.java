// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResourceLogResponse} extends {@link TeaModel}
 *
 * <p>DeleteResourceLogResponse</p>
 */
public class DeleteResourceLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteResourceLogResponseBody body;

    private DeleteResourceLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteResourceLogResponse create() {
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
    public DeleteResourceLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteResourceLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteResourceLogResponseBody body);

        @Override
        DeleteResourceLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteResourceLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteResourceLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteResourceLogResponse response) {
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
        public Builder body(DeleteResourceLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteResourceLogResponse build() {
            return new DeleteResourceLogResponse(this);
        } 

    } 

}
