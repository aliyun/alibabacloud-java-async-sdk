// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCdnSubTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteCdnSubTaskResponse</p>
 */
public class DeleteCdnSubTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCdnSubTaskResponseBody body;

    private DeleteCdnSubTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCdnSubTaskResponse create() {
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
    public DeleteCdnSubTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCdnSubTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCdnSubTaskResponseBody body);

        @Override
        DeleteCdnSubTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCdnSubTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCdnSubTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCdnSubTaskResponse response) {
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
        public Builder body(DeleteCdnSubTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCdnSubTaskResponse build() {
            return new DeleteCdnSubTaskResponse(this);
        } 

    } 

}
