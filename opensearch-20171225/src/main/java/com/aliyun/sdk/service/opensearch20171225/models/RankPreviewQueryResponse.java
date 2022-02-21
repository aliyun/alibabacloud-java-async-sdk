// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RankPreviewQueryResponse} extends {@link TeaModel}
 *
 * <p>RankPreviewQueryResponse</p>
 */
public class RankPreviewQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RankPreviewQueryResponseBody body;

    private RankPreviewQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RankPreviewQueryResponse create() {
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
    public RankPreviewQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RankPreviewQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RankPreviewQueryResponseBody body);

        @Override
        RankPreviewQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RankPreviewQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RankPreviewQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RankPreviewQueryResponse response) {
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
        public Builder body(RankPreviewQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RankPreviewQueryResponse build() {
            return new RankPreviewQueryResponse(this);
        } 

    } 

}
