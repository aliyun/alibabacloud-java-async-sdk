// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessKeyLeakDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeAccessKeyLeakDetailResponse</p>
 */
public class DescribeAccessKeyLeakDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAccessKeyLeakDetailResponseBody body;

    private DescribeAccessKeyLeakDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAccessKeyLeakDetailResponse create() {
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
    public DescribeAccessKeyLeakDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAccessKeyLeakDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAccessKeyLeakDetailResponseBody body);

        @Override
        DescribeAccessKeyLeakDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAccessKeyLeakDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAccessKeyLeakDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAccessKeyLeakDetailResponse response) {
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
        public Builder body(DescribeAccessKeyLeakDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAccessKeyLeakDetailResponse build() {
            return new DescribeAccessKeyLeakDetailResponse(this);
        } 

    } 

}
