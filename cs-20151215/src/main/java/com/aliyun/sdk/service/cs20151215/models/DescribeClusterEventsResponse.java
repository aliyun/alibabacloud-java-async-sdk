// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterEventsResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterEventsResponse</p>
 */
public class DescribeClusterEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterEventsResponseBody body;

    private DescribeClusterEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterEventsResponse create() {
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
    public DescribeClusterEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterEventsResponseBody body);

        @Override
        DescribeClusterEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterEventsResponse response) {
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
        public Builder body(DescribeClusterEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterEventsResponse build() {
            return new DescribeClusterEventsResponse(this);
        } 

    } 

}
