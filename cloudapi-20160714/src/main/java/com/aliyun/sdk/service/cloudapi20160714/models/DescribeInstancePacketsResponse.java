// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancePacketsResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstancePacketsResponse</p>
 */
public class DescribeInstancePacketsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInstancePacketsResponseBody body;

    private DescribeInstancePacketsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInstancePacketsResponse create() {
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
    public DescribeInstancePacketsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInstancePacketsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInstancePacketsResponseBody body);

        @Override
        DescribeInstancePacketsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInstancePacketsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInstancePacketsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInstancePacketsResponse response) {
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
        public Builder body(DescribeInstancePacketsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInstancePacketsResponse build() {
            return new DescribeInstancePacketsResponse(this);
        } 

    } 

}
