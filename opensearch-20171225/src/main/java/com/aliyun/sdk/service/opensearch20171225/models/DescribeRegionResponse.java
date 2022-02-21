// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionResponse} extends {@link TeaModel}
 *
 * <p>DescribeRegionResponse</p>
 */
public class DescribeRegionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRegionResponseBody body;

    private DescribeRegionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRegionResponse create() {
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
    public DescribeRegionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRegionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRegionResponseBody body);

        @Override
        DescribeRegionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRegionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRegionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRegionResponse response) {
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
        public Builder body(DescribeRegionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRegionResponse build() {
            return new DescribeRegionResponse(this);
        } 

    } 

}
