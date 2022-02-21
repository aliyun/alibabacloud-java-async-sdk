// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSystemLogResponse} extends {@link TeaModel}
 *
 * <p>DescribeSystemLogResponse</p>
 */
public class DescribeSystemLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSystemLogResponseBody body;

    private DescribeSystemLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSystemLogResponse create() {
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
    public DescribeSystemLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSystemLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSystemLogResponseBody body);

        @Override
        DescribeSystemLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSystemLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSystemLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSystemLogResponse response) {
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
        public Builder body(DescribeSystemLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSystemLogResponse build() {
            return new DescribeSystemLogResponse(this);
        } 

    } 

}
