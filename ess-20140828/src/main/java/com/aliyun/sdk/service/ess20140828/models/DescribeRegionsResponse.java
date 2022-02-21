// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionsResponse} extends {@link TeaModel}
 *
 * <p>DescribeRegionsResponse</p>
 */
public class DescribeRegionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRegionsResponseBody body;

    private DescribeRegionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRegionsResponse create() {
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
    public DescribeRegionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRegionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRegionsResponseBody body);

        @Override
        DescribeRegionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRegionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRegionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRegionsResponse response) {
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
        public Builder body(DescribeRegionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRegionsResponse build() {
            return new DescribeRegionsResponse(this);
        } 

    } 

}
