// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTemplateResponse} extends {@link TeaModel}
 *
 * <p>SearchTemplateResponse</p>
 */
public class SearchTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchTemplateResponseBody body;

    private SearchTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchTemplateResponse create() {
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
    public SearchTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchTemplateResponseBody body);

        @Override
        SearchTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchTemplateResponse response) {
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
        public Builder body(SearchTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchTemplateResponse build() {
            return new SearchTemplateResponse(this);
        } 

    } 

}
