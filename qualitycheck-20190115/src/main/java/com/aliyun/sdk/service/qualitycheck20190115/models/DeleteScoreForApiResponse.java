// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScoreForApiResponse} extends {@link TeaModel}
 *
 * <p>DeleteScoreForApiResponse</p>
 */
public class DeleteScoreForApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteScoreForApiResponseBody body;

    private DeleteScoreForApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteScoreForApiResponse create() {
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
    public DeleteScoreForApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteScoreForApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteScoreForApiResponseBody body);

        @Override
        DeleteScoreForApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteScoreForApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteScoreForApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteScoreForApiResponse response) {
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
        public Builder body(DeleteScoreForApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteScoreForApiResponse build() {
            return new DeleteScoreForApiResponse(this);
        } 

    } 

}
