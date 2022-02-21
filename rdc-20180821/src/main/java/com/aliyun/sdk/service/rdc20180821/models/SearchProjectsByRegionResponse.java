// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchProjectsByRegionResponse} extends {@link TeaModel}
 *
 * <p>SearchProjectsByRegionResponse</p>
 */
public class SearchProjectsByRegionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchProjectsByRegionResponseBody body;

    private SearchProjectsByRegionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchProjectsByRegionResponse create() {
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
    public SearchProjectsByRegionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchProjectsByRegionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchProjectsByRegionResponseBody body);

        @Override
        SearchProjectsByRegionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchProjectsByRegionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchProjectsByRegionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchProjectsByRegionResponse response) {
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
        public Builder body(SearchProjectsByRegionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchProjectsByRegionResponse build() {
            return new SearchProjectsByRegionResponse(this);
        } 

    } 

}
