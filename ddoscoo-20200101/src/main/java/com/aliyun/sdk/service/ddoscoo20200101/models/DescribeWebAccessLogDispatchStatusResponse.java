// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebAccessLogDispatchStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeWebAccessLogDispatchStatusResponse</p>
 */
public class DescribeWebAccessLogDispatchStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWebAccessLogDispatchStatusResponseBody body;

    private DescribeWebAccessLogDispatchStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWebAccessLogDispatchStatusResponse create() {
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
    public DescribeWebAccessLogDispatchStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWebAccessLogDispatchStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWebAccessLogDispatchStatusResponseBody body);

        @Override
        DescribeWebAccessLogDispatchStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWebAccessLogDispatchStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWebAccessLogDispatchStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWebAccessLogDispatchStatusResponse response) {
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
        public Builder body(DescribeWebAccessLogDispatchStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWebAccessLogDispatchStatusResponse build() {
            return new DescribeWebAccessLogDispatchStatusResponse(this);
        } 

    } 

}
