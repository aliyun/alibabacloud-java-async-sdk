// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlockStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeBlockStatusResponse</p>
 */
public class DescribeBlockStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBlockStatusResponseBody body;

    private DescribeBlockStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBlockStatusResponse create() {
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
    public DescribeBlockStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBlockStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBlockStatusResponseBody body);

        @Override
        DescribeBlockStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBlockStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBlockStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBlockStatusResponse response) {
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
        public Builder body(DescribeBlockStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBlockStatusResponse build() {
            return new DescribeBlockStatusResponse(this);
        } 

    } 

}
