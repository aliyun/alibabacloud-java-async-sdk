// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiIpControlsResponse} extends {@link TeaModel}
 *
 * <p>DescribeApiIpControlsResponse</p>
 */
public class DescribeApiIpControlsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeApiIpControlsResponseBody body;

    private DescribeApiIpControlsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeApiIpControlsResponse create() {
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
    public DescribeApiIpControlsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApiIpControlsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeApiIpControlsResponseBody body);

        @Override
        DescribeApiIpControlsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApiIpControlsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeApiIpControlsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApiIpControlsResponse response) {
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
        public Builder body(DescribeApiIpControlsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApiIpControlsResponse build() {
            return new DescribeApiIpControlsResponse(this);
        } 

    } 

}
