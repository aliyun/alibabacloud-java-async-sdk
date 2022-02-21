// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleasePublicContactPointsResponse} extends {@link TeaModel}
 *
 * <p>ReleasePublicContactPointsResponse</p>
 */
public class ReleasePublicContactPointsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleasePublicContactPointsResponseBody body;

    private ReleasePublicContactPointsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleasePublicContactPointsResponse create() {
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
    public ReleasePublicContactPointsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleasePublicContactPointsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleasePublicContactPointsResponseBody body);

        @Override
        ReleasePublicContactPointsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleasePublicContactPointsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleasePublicContactPointsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleasePublicContactPointsResponse response) {
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
        public Builder body(ReleasePublicContactPointsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleasePublicContactPointsResponse build() {
            return new ReleasePublicContactPointsResponse(this);
        } 

    } 

}
