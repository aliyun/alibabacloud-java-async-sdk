// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchHistoricalSnapshotsResponse} extends {@link TeaModel}
 *
 * <p>SearchHistoricalSnapshotsResponse</p>
 */
public class SearchHistoricalSnapshotsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchHistoricalSnapshotsResponseBody body;

    private SearchHistoricalSnapshotsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchHistoricalSnapshotsResponse create() {
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
    public SearchHistoricalSnapshotsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchHistoricalSnapshotsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchHistoricalSnapshotsResponseBody body);

        @Override
        SearchHistoricalSnapshotsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchHistoricalSnapshotsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchHistoricalSnapshotsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchHistoricalSnapshotsResponse response) {
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
        public Builder body(SearchHistoricalSnapshotsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchHistoricalSnapshotsResponse build() {
            return new SearchHistoricalSnapshotsResponse(this);
        } 

    } 

}
