// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTaskResponse} extends {@link TeaModel}
 *
 * <p>SearchTaskResponse</p>
 */
public class SearchTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchTaskResponseBody body;

    private SearchTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchTaskResponse create() {
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
    public SearchTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchTaskResponseBody body);

        @Override
        SearchTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchTaskResponse response) {
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
        public Builder body(SearchTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchTaskResponse build() {
            return new SearchTaskResponse(this);
        } 

    } 

}
