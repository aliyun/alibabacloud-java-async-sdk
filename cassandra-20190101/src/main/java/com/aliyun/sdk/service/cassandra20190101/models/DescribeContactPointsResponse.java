// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContactPointsResponse} extends {@link TeaModel}
 *
 * <p>DescribeContactPointsResponse</p>
 */
public class DescribeContactPointsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeContactPointsResponseBody body;

    private DescribeContactPointsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeContactPointsResponse create() {
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
    public DescribeContactPointsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeContactPointsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeContactPointsResponseBody body);

        @Override
        DescribeContactPointsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeContactPointsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeContactPointsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeContactPointsResponse response) {
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
        public Builder body(DescribeContactPointsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeContactPointsResponse build() {
            return new DescribeContactPointsResponse(this);
        } 

    } 

}
