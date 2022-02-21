// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlockedRegionsResponse} extends {@link TeaModel}
 *
 * <p>DescribeBlockedRegionsResponse</p>
 */
public class DescribeBlockedRegionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBlockedRegionsResponseBody body;

    private DescribeBlockedRegionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBlockedRegionsResponse create() {
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
    public DescribeBlockedRegionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBlockedRegionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBlockedRegionsResponseBody body);

        @Override
        DescribeBlockedRegionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBlockedRegionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBlockedRegionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBlockedRegionsResponse response) {
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
        public Builder body(DescribeBlockedRegionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBlockedRegionsResponse build() {
            return new DescribeBlockedRegionsResponse(this);
        } 

    } 

}
