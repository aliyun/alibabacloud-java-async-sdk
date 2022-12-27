// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionResourceResponse} extends {@link TeaModel}
 *
 * <p>DescribeRegionResourceResponse</p>
 */
public class DescribeRegionResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRegionResourceResponseBody body;

    private DescribeRegionResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRegionResourceResponse create() {
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
    public DescribeRegionResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRegionResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRegionResourceResponseBody body);

        @Override
        DescribeRegionResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRegionResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRegionResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRegionResourceResponse response) {
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
        public Builder body(DescribeRegionResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRegionResourceResponse build() {
            return new DescribeRegionResourceResponse(this);
        } 

    } 

}
