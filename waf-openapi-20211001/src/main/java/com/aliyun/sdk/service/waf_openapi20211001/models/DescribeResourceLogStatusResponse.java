// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceLogStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeResourceLogStatusResponse</p>
 */
public class DescribeResourceLogStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResourceLogStatusResponseBody body;

    private DescribeResourceLogStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResourceLogStatusResponse create() {
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
    public DescribeResourceLogStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResourceLogStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResourceLogStatusResponseBody body);

        @Override
        DescribeResourceLogStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResourceLogStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResourceLogStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResourceLogStatusResponse response) {
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
        public Builder body(DescribeResourceLogStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResourceLogStatusResponse build() {
            return new DescribeResourceLogStatusResponse(this);
        } 

    } 

}
