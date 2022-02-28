// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageFixTaskResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageFixTaskResponse</p>
 */
public class DescribeImageFixTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageFixTaskResponseBody body;

    private DescribeImageFixTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageFixTaskResponse create() {
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
    public DescribeImageFixTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageFixTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageFixTaskResponseBody body);

        @Override
        DescribeImageFixTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageFixTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageFixTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageFixTaskResponse response) {
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
        public Builder body(DescribeImageFixTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageFixTaskResponse build() {
            return new DescribeImageFixTaskResponse(this);
        } 

    } 

}
