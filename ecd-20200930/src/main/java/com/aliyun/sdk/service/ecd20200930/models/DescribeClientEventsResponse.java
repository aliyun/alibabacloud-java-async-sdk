// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientEventsResponse} extends {@link TeaModel}
 *
 * <p>DescribeClientEventsResponse</p>
 */
public class DescribeClientEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClientEventsResponseBody body;

    private DescribeClientEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClientEventsResponse create() {
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
    public DescribeClientEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClientEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClientEventsResponseBody body);

        @Override
        DescribeClientEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClientEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClientEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClientEventsResponse response) {
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
        public Builder body(DescribeClientEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClientEventsResponse build() {
            return new DescribeClientEventsResponse(this);
        } 

    } 

}
