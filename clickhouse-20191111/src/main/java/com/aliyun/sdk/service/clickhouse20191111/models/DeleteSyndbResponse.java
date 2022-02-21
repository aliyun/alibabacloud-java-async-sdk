// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSyndbResponse} extends {@link TeaModel}
 *
 * <p>DeleteSyndbResponse</p>
 */
public class DeleteSyndbResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSyndbResponseBody body;

    private DeleteSyndbResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSyndbResponse create() {
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
    public DeleteSyndbResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSyndbResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSyndbResponseBody body);

        @Override
        DeleteSyndbResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSyndbResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSyndbResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSyndbResponse response) {
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
        public Builder body(DeleteSyndbResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSyndbResponse build() {
            return new DeleteSyndbResponse(this);
        } 

    } 

}
