// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRouteTablesResponse} extends {@link TeaModel}
 *
 * <p>DescribeRouteTablesResponse</p>
 */
public class DescribeRouteTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRouteTablesResponseBody body;

    private DescribeRouteTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRouteTablesResponse create() {
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
    public DescribeRouteTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRouteTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRouteTablesResponseBody body);

        @Override
        DescribeRouteTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRouteTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRouteTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRouteTablesResponse response) {
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
        public Builder body(DescribeRouteTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRouteTablesResponse build() {
            return new DescribeRouteTablesResponse(this);
        } 

    } 

}
