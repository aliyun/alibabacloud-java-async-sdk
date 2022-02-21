// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAsrVocabResponse} extends {@link TeaModel}
 *
 * <p>ListAsrVocabResponse</p>
 */
public class ListAsrVocabResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAsrVocabResponseBody body;

    private ListAsrVocabResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAsrVocabResponse create() {
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
    public ListAsrVocabResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAsrVocabResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAsrVocabResponseBody body);

        @Override
        ListAsrVocabResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAsrVocabResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAsrVocabResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAsrVocabResponse response) {
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
        public Builder body(ListAsrVocabResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAsrVocabResponse build() {
            return new ListAsrVocabResponse(this);
        } 

    } 

}
