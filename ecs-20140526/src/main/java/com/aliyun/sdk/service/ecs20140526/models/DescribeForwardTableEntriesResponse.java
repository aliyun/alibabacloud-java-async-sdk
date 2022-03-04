// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeForwardTableEntriesResponse} extends {@link TeaModel}
 *
 * <p>DescribeForwardTableEntriesResponse</p>
 */
public class DescribeForwardTableEntriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeForwardTableEntriesResponseBody body;

    private DescribeForwardTableEntriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeForwardTableEntriesResponse create() {
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
    public DescribeForwardTableEntriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeForwardTableEntriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeForwardTableEntriesResponseBody body);

        @Override
        DescribeForwardTableEntriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeForwardTableEntriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeForwardTableEntriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeForwardTableEntriesResponse response) {
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
        public Builder body(DescribeForwardTableEntriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeForwardTableEntriesResponse build() {
            return new DescribeForwardTableEntriesResponse(this);
        } 

    } 

}
