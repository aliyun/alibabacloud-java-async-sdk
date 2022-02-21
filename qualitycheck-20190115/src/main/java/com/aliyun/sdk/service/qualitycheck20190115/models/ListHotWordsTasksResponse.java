// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotWordsTasksResponse} extends {@link TeaModel}
 *
 * <p>ListHotWordsTasksResponse</p>
 */
public class ListHotWordsTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHotWordsTasksResponseBody body;

    private ListHotWordsTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHotWordsTasksResponse create() {
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
    public ListHotWordsTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHotWordsTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHotWordsTasksResponseBody body);

        @Override
        ListHotWordsTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHotWordsTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHotWordsTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHotWordsTasksResponse response) {
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
        public Builder body(ListHotWordsTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHotWordsTasksResponse build() {
            return new ListHotWordsTasksResponse(this);
        } 

    } 

}
