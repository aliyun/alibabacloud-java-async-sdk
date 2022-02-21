// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchWaterMarkTemplateResponse} extends {@link TeaModel}
 *
 * <p>SearchWaterMarkTemplateResponse</p>
 */
public class SearchWaterMarkTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchWaterMarkTemplateResponseBody body;

    private SearchWaterMarkTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchWaterMarkTemplateResponse create() {
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
    public SearchWaterMarkTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchWaterMarkTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchWaterMarkTemplateResponseBody body);

        @Override
        SearchWaterMarkTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchWaterMarkTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchWaterMarkTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchWaterMarkTemplateResponse response) {
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
        public Builder body(SearchWaterMarkTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchWaterMarkTemplateResponse build() {
            return new SearchWaterMarkTemplateResponse(this);
        } 

    } 

}
