// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApisByTrafficControlResponse} extends {@link TeaModel}
 *
 * <p>DescribeApisByTrafficControlResponse</p>
 */
public class DescribeApisByTrafficControlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeApisByTrafficControlResponseBody body;

    private DescribeApisByTrafficControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeApisByTrafficControlResponse create() {
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
    public DescribeApisByTrafficControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApisByTrafficControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeApisByTrafficControlResponseBody body);

        @Override
        DescribeApisByTrafficControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApisByTrafficControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeApisByTrafficControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApisByTrafficControlResponse response) {
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
        public Builder body(DescribeApisByTrafficControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApisByTrafficControlResponse build() {
            return new DescribeApisByTrafficControlResponse(this);
        } 

    } 

}
