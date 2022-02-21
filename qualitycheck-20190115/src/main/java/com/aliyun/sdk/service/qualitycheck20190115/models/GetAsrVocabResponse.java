// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsrVocabResponse} extends {@link TeaModel}
 *
 * <p>GetAsrVocabResponse</p>
 */
public class GetAsrVocabResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAsrVocabResponseBody body;

    private GetAsrVocabResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAsrVocabResponse create() {
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
    public GetAsrVocabResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAsrVocabResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAsrVocabResponseBody body);

        @Override
        GetAsrVocabResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAsrVocabResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAsrVocabResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAsrVocabResponse response) {
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
        public Builder body(GetAsrVocabResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAsrVocabResponse build() {
            return new GetAsrVocabResponse(this);
        } 

    } 

}
