// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchWorkitemResponse} extends {@link TeaModel}
 *
 * <p>SearchWorkitemResponse</p>
 */
public class SearchWorkitemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchWorkitemResponseBody body;

    private SearchWorkitemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchWorkitemResponse create() {
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
    public SearchWorkitemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchWorkitemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchWorkitemResponseBody body);

        @Override
        SearchWorkitemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchWorkitemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchWorkitemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchWorkitemResponse response) {
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
        public Builder body(SearchWorkitemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchWorkitemResponse build() {
            return new SearchWorkitemResponse(this);
        } 

    } 

}
