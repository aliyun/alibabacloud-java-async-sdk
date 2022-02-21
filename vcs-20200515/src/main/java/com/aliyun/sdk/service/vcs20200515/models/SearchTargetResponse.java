// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTargetResponse} extends {@link TeaModel}
 *
 * <p>SearchTargetResponse</p>
 */
public class SearchTargetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchTargetResponseBody body;

    private SearchTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchTargetResponse create() {
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
    public SearchTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchTargetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchTargetResponseBody body);

        @Override
        SearchTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchTargetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchTargetResponse response) {
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
        public Builder body(SearchTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchTargetResponse build() {
            return new SearchTargetResponse(this);
        } 

    } 

}
