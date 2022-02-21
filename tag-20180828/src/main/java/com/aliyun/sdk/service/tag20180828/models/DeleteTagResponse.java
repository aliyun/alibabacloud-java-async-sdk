// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTagResponse} extends {@link TeaModel}
 *
 * <p>DeleteTagResponse</p>
 */
public class DeleteTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTagResponseBody body;

    private DeleteTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTagResponse create() {
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
    public DeleteTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTagResponseBody body);

        @Override
        DeleteTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTagResponse response) {
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
        public Builder body(DeleteTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTagResponse build() {
            return new DeleteTagResponse(this);
        } 

    } 

}
