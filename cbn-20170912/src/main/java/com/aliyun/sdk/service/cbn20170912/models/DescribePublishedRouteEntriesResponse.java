// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePublishedRouteEntriesResponse} extends {@link TeaModel}
 *
 * <p>DescribePublishedRouteEntriesResponse</p>
 */
public class DescribePublishedRouteEntriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePublishedRouteEntriesResponseBody body;

    private DescribePublishedRouteEntriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePublishedRouteEntriesResponse create() {
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
    public DescribePublishedRouteEntriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePublishedRouteEntriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePublishedRouteEntriesResponseBody body);

        @Override
        DescribePublishedRouteEntriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePublishedRouteEntriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePublishedRouteEntriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePublishedRouteEntriesResponse response) {
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
        public Builder body(DescribePublishedRouteEntriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePublishedRouteEntriesResponse build() {
            return new DescribePublishedRouteEntriesResponse(this);
        } 

    } 

}
