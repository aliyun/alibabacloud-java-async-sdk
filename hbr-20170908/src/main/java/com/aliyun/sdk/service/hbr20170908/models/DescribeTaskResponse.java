// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskResponse} extends {@link TeaModel}
 *
 * <p>DescribeTaskResponse</p>
 */
public class DescribeTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTaskResponseBody body;

    private DescribeTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTaskResponse create() {
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
    public DescribeTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTaskResponseBody body);

        @Override
        DescribeTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTaskResponse response) {
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
        public Builder body(DescribeTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTaskResponse build() {
            return new DescribeTaskResponse(this);
        } 

    } 

}
