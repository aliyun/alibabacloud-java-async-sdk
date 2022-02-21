// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConstantsResponse} extends {@link TeaModel}
 *
 * <p>DeleteConstantsResponse</p>
 */
public class DeleteConstantsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteConstantsResponseBody body;

    private DeleteConstantsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteConstantsResponse create() {
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
    public DeleteConstantsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteConstantsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteConstantsResponseBody body);

        @Override
        DeleteConstantsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteConstantsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteConstantsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteConstantsResponse response) {
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
        public Builder body(DeleteConstantsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteConstantsResponse build() {
            return new DeleteConstantsResponse(this);
        } 

    } 

}
