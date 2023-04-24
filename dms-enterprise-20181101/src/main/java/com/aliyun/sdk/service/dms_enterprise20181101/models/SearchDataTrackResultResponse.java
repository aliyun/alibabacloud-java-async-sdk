// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchDataTrackResultResponse} extends {@link TeaModel}
 *
 * <p>SearchDataTrackResultResponse</p>
 */
public class SearchDataTrackResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchDataTrackResultResponseBody body;

    private SearchDataTrackResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchDataTrackResultResponse create() {
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
    public SearchDataTrackResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchDataTrackResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchDataTrackResultResponseBody body);

        @Override
        SearchDataTrackResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchDataTrackResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchDataTrackResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchDataTrackResultResponse response) {
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
        public Builder body(SearchDataTrackResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchDataTrackResultResponse build() {
            return new SearchDataTrackResultResponse(this);
        } 

    } 

}
