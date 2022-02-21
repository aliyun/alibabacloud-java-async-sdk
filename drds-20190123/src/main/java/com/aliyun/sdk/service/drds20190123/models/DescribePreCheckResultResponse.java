// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePreCheckResultResponse} extends {@link TeaModel}
 *
 * <p>DescribePreCheckResultResponse</p>
 */
public class DescribePreCheckResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePreCheckResultResponseBody body;

    private DescribePreCheckResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePreCheckResultResponse create() {
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
    public DescribePreCheckResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePreCheckResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePreCheckResultResponseBody body);

        @Override
        DescribePreCheckResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePreCheckResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePreCheckResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePreCheckResultResponse response) {
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
        public Builder body(DescribePreCheckResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePreCheckResultResponse build() {
            return new DescribePreCheckResultResponse(this);
        } 

    } 

}
