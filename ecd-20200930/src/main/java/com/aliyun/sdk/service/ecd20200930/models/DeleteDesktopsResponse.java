// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDesktopsResponse} extends {@link TeaModel}
 *
 * <p>DeleteDesktopsResponse</p>
 */
public class DeleteDesktopsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDesktopsResponseBody body;

    private DeleteDesktopsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDesktopsResponse create() {
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
    public DeleteDesktopsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDesktopsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDesktopsResponseBody body);

        @Override
        DeleteDesktopsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDesktopsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDesktopsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDesktopsResponse response) {
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
        public Builder body(DeleteDesktopsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDesktopsResponse build() {
            return new DeleteDesktopsResponse(this);
        } 

    } 

}
