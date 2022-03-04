// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessPointsResponse} extends {@link TeaModel}
 *
 * <p>DescribeAccessPointsResponse</p>
 */
public class DescribeAccessPointsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAccessPointsResponseBody body;

    private DescribeAccessPointsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAccessPointsResponse create() {
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
    public DescribeAccessPointsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAccessPointsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAccessPointsResponseBody body);

        @Override
        DescribeAccessPointsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAccessPointsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAccessPointsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAccessPointsResponse response) {
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
        public Builder body(DescribeAccessPointsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAccessPointsResponse build() {
            return new DescribeAccessPointsResponse(this);
        } 

    } 

}
