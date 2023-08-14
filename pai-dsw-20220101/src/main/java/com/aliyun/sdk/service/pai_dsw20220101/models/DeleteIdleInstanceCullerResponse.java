// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIdleInstanceCullerResponse} extends {@link TeaModel}
 *
 * <p>DeleteIdleInstanceCullerResponse</p>
 */
public class DeleteIdleInstanceCullerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIdleInstanceCullerResponseBody body;

    private DeleteIdleInstanceCullerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIdleInstanceCullerResponse create() {
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
    public DeleteIdleInstanceCullerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIdleInstanceCullerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIdleInstanceCullerResponseBody body);

        @Override
        DeleteIdleInstanceCullerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIdleInstanceCullerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIdleInstanceCullerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIdleInstanceCullerResponse response) {
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
        public Builder body(DeleteIdleInstanceCullerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIdleInstanceCullerResponse build() {
            return new DeleteIdleInstanceCullerResponse(this);
        } 

    } 

}
