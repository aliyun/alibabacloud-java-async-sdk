// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCallTagResponse} extends {@link TeaModel}
 *
 * <p>DeleteCallTagResponse</p>
 */
public class DeleteCallTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCallTagResponseBody body;

    private DeleteCallTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCallTagResponse create() {
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
    public DeleteCallTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCallTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCallTagResponseBody body);

        @Override
        DeleteCallTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCallTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCallTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCallTagResponse response) {
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
        public Builder body(DeleteCallTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCallTagResponse build() {
            return new DeleteCallTagResponse(this);
        } 

    } 

}
