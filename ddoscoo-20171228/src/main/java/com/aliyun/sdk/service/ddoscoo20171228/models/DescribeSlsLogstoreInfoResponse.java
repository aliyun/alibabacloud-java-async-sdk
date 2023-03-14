// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlsLogstoreInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeSlsLogstoreInfoResponse</p>
 */
public class DescribeSlsLogstoreInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSlsLogstoreInfoResponseBody body;

    private DescribeSlsLogstoreInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSlsLogstoreInfoResponse create() {
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
    public DescribeSlsLogstoreInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSlsLogstoreInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSlsLogstoreInfoResponseBody body);

        @Override
        DescribeSlsLogstoreInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSlsLogstoreInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSlsLogstoreInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSlsLogstoreInfoResponse response) {
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
        public Builder body(DescribeSlsLogstoreInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSlsLogstoreInfoResponse build() {
            return new DescribeSlsLogstoreInfoResponse(this);
        } 

    } 

}
