// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlsAuthStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeSlsAuthStatusResponse</p>
 */
public class DescribeSlsAuthStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSlsAuthStatusResponseBody body;

    private DescribeSlsAuthStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSlsAuthStatusResponse create() {
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
    public DescribeSlsAuthStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSlsAuthStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSlsAuthStatusResponseBody body);

        @Override
        DescribeSlsAuthStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSlsAuthStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSlsAuthStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSlsAuthStatusResponse response) {
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
        public Builder body(DescribeSlsAuthStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSlsAuthStatusResponse build() {
            return new DescribeSlsAuthStatusResponse(this);
        } 

    } 

}
