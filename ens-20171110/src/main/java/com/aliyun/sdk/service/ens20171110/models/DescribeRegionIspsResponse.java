// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionIspsResponse} extends {@link TeaModel}
 *
 * <p>DescribeRegionIspsResponse</p>
 */
public class DescribeRegionIspsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRegionIspsResponseBody body;

    private DescribeRegionIspsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRegionIspsResponse create() {
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
    public DescribeRegionIspsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRegionIspsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRegionIspsResponseBody body);

        @Override
        DescribeRegionIspsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRegionIspsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRegionIspsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRegionIspsResponse response) {
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
        public Builder body(DescribeRegionIspsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRegionIspsResponse build() {
            return new DescribeRegionIspsResponse(this);
        } 

    } 

}
