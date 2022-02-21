// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotWordsTaskHistoriesResponse} extends {@link TeaModel}
 *
 * <p>ListHotWordsTaskHistoriesResponse</p>
 */
public class ListHotWordsTaskHistoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHotWordsTaskHistoriesResponseBody body;

    private ListHotWordsTaskHistoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHotWordsTaskHistoriesResponse create() {
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
    public ListHotWordsTaskHistoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHotWordsTaskHistoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHotWordsTaskHistoriesResponseBody body);

        @Override
        ListHotWordsTaskHistoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHotWordsTaskHistoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHotWordsTaskHistoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHotWordsTaskHistoriesResponse response) {
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
        public Builder body(ListHotWordsTaskHistoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHotWordsTaskHistoriesResponse build() {
            return new ListHotWordsTaskHistoriesResponse(this);
        } 

    } 

}
