// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebAccessLogStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeWebAccessLogStatusResponse</p>
 */
public class DescribeWebAccessLogStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWebAccessLogStatusResponseBody body;

    private DescribeWebAccessLogStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWebAccessLogStatusResponse create() {
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
    public DescribeWebAccessLogStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWebAccessLogStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWebAccessLogStatusResponseBody body);

        @Override
        DescribeWebAccessLogStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWebAccessLogStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWebAccessLogStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWebAccessLogStatusResponse response) {
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
        public Builder body(DescribeWebAccessLogStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWebAccessLogStatusResponse build() {
            return new DescribeWebAccessLogStatusResponse(this);
        } 

    } 

}
