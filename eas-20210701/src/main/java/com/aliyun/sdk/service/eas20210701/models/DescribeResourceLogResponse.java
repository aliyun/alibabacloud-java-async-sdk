// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceLogResponse} extends {@link TeaModel}
 *
 * <p>DescribeResourceLogResponse</p>
 */
public class DescribeResourceLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResourceLogResponseBody body;

    private DescribeResourceLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResourceLogResponse create() {
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
    public DescribeResourceLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResourceLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResourceLogResponseBody body);

        @Override
        DescribeResourceLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResourceLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResourceLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResourceLogResponse response) {
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
        public Builder body(DescribeResourceLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResourceLogResponse build() {
            return new DescribeResourceLogResponse(this);
        } 

    } 

}
