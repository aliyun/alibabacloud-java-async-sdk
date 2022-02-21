// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMessageResponse} extends {@link TeaModel}
 *
 * <p>DescribeMessageResponse</p>
 */
public class DescribeMessageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMessageResponseBody body;

    private DescribeMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMessageResponse create() {
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
    public DescribeMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMessageResponseBody body);

        @Override
        DescribeMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMessageResponse response) {
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
        public Builder body(DescribeMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMessageResponse build() {
            return new DescribeMessageResponse(this);
        } 

    } 

}
