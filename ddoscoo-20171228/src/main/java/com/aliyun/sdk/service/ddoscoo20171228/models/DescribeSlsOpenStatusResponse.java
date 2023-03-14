// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlsOpenStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeSlsOpenStatusResponse</p>
 */
public class DescribeSlsOpenStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSlsOpenStatusResponseBody body;

    private DescribeSlsOpenStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSlsOpenStatusResponse create() {
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
    public DescribeSlsOpenStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSlsOpenStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSlsOpenStatusResponseBody body);

        @Override
        DescribeSlsOpenStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSlsOpenStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSlsOpenStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSlsOpenStatusResponse response) {
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
        public Builder body(DescribeSlsOpenStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSlsOpenStatusResponse build() {
            return new DescribeSlsOpenStatusResponse(this);
        } 

    } 

}
