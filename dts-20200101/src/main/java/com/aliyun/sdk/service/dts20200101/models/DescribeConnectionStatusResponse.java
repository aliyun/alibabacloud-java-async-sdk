// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConnectionStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeConnectionStatusResponse</p>
 */
public class DescribeConnectionStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConnectionStatusResponseBody body;

    private DescribeConnectionStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConnectionStatusResponse create() {
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
    public DescribeConnectionStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConnectionStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConnectionStatusResponseBody body);

        @Override
        DescribeConnectionStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConnectionStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConnectionStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConnectionStatusResponse response) {
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
        public Builder body(DescribeConnectionStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConnectionStatusResponse build() {
            return new DescribeConnectionStatusResponse(this);
        } 

    } 

}
