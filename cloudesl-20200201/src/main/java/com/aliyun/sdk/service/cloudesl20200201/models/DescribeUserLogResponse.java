// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserLogResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserLogResponse</p>
 */
public class DescribeUserLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUserLogResponseBody body;

    private DescribeUserLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserLogResponse create() {
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
    public DescribeUserLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUserLogResponseBody body);

        @Override
        DescribeUserLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUserLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserLogResponse response) {
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
        public Builder body(DescribeUserLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserLogResponse build() {
            return new DescribeUserLogResponse(this);
        } 

    } 

}
