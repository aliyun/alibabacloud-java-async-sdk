// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePreCheckStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribePreCheckStatusResponse</p>
 */
public class DescribePreCheckStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePreCheckStatusResponseBody body;

    private DescribePreCheckStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePreCheckStatusResponse create() {
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
    public DescribePreCheckStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePreCheckStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePreCheckStatusResponseBody body);

        @Override
        DescribePreCheckStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePreCheckStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePreCheckStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePreCheckStatusResponse response) {
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
        public Builder body(DescribePreCheckStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePreCheckStatusResponse build() {
            return new DescribePreCheckStatusResponse(this);
        } 

    } 

}
