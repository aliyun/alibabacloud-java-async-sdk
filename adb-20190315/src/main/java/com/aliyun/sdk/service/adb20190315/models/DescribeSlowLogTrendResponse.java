// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowLogTrendResponse} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogTrendResponse</p>
 */
public class DescribeSlowLogTrendResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSlowLogTrendResponseBody body;

    private DescribeSlowLogTrendResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSlowLogTrendResponse create() {
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
    public DescribeSlowLogTrendResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSlowLogTrendResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSlowLogTrendResponseBody body);

        @Override
        DescribeSlowLogTrendResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSlowLogTrendResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSlowLogTrendResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSlowLogTrendResponse response) {
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
        public Builder body(DescribeSlowLogTrendResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSlowLogTrendResponse build() {
            return new DescribeSlowLogTrendResponse(this);
        } 

    } 

}
