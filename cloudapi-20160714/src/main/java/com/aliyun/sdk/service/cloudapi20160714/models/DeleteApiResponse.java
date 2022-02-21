// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteApiResponse} extends {@link TeaModel}
 *
 * <p>DeleteApiResponse</p>
 */
public class DeleteApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteApiResponseBody body;

    private DeleteApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteApiResponse create() {
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
    public DeleteApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteApiResponseBody body);

        @Override
        DeleteApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteApiResponse response) {
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
        public Builder body(DeleteApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteApiResponse build() {
            return new DeleteApiResponse(this);
        } 

    } 

}
