// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAsrVocabResponse} extends {@link TeaModel}
 *
 * <p>DeleteAsrVocabResponse</p>
 */
public class DeleteAsrVocabResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAsrVocabResponseBody body;

    private DeleteAsrVocabResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAsrVocabResponse create() {
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
    public DeleteAsrVocabResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAsrVocabResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAsrVocabResponseBody body);

        @Override
        DeleteAsrVocabResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAsrVocabResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAsrVocabResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAsrVocabResponse response) {
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
        public Builder body(DeleteAsrVocabResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAsrVocabResponse build() {
            return new DeleteAsrVocabResponse(this);
        } 

    } 

}
