// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshMediaPlayUrlsResponse} extends {@link TeaModel}
 *
 * <p>RefreshMediaPlayUrlsResponse</p>
 */
public class RefreshMediaPlayUrlsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshMediaPlayUrlsResponseBody body;

    private RefreshMediaPlayUrlsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshMediaPlayUrlsResponse create() {
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
    public RefreshMediaPlayUrlsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshMediaPlayUrlsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshMediaPlayUrlsResponseBody body);

        @Override
        RefreshMediaPlayUrlsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshMediaPlayUrlsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshMediaPlayUrlsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshMediaPlayUrlsResponse response) {
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
        public Builder body(RefreshMediaPlayUrlsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshMediaPlayUrlsResponse build() {
            return new RefreshMediaPlayUrlsResponse(this);
        } 

    } 

}
