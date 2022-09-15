// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionInfosResponse} extends {@link TeaModel}
 *
 * <p>DescribeRegionInfosResponse</p>
 */
public class DescribeRegionInfosResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRegionInfosResponseBody body;

    private DescribeRegionInfosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRegionInfosResponse create() {
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
    public DescribeRegionInfosResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRegionInfosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRegionInfosResponseBody body);

        @Override
        DescribeRegionInfosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRegionInfosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRegionInfosResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRegionInfosResponse response) {
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
        public Builder body(DescribeRegionInfosResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRegionInfosResponse build() {
            return new DescribeRegionInfosResponse(this);
        } 

    } 

}
