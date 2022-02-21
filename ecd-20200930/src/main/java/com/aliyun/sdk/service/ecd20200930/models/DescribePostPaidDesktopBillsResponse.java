// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePostPaidDesktopBillsResponse} extends {@link TeaModel}
 *
 * <p>DescribePostPaidDesktopBillsResponse</p>
 */
public class DescribePostPaidDesktopBillsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePostPaidDesktopBillsResponseBody body;

    private DescribePostPaidDesktopBillsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePostPaidDesktopBillsResponse create() {
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
    public DescribePostPaidDesktopBillsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePostPaidDesktopBillsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePostPaidDesktopBillsResponseBody body);

        @Override
        DescribePostPaidDesktopBillsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePostPaidDesktopBillsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePostPaidDesktopBillsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePostPaidDesktopBillsResponse response) {
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
        public Builder body(DescribePostPaidDesktopBillsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePostPaidDesktopBillsResponse build() {
            return new DescribePostPaidDesktopBillsResponse(this);
        } 

    } 

}
