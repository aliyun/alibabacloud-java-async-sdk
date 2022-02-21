// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventsResponse} extends {@link TeaModel}
 *
 * <p>DescribeEventsResponse</p>
 */
public class DescribeEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEventsResponseBody body;

    private DescribeEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEventsResponse create() {
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
    public DescribeEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEventsResponseBody body);

        @Override
        DescribeEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEventsResponse response) {
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
        public Builder body(DescribeEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEventsResponse build() {
            return new DescribeEventsResponse(this);
        } 

    } 

}
