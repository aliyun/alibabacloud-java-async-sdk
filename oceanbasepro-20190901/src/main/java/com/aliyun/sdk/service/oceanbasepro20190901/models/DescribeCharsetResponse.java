// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCharsetResponse} extends {@link TeaModel}
 *
 * <p>DescribeCharsetResponse</p>
 */
public class DescribeCharsetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCharsetResponseBody body;

    private DescribeCharsetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCharsetResponse create() {
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
    public DescribeCharsetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCharsetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCharsetResponseBody body);

        @Override
        DescribeCharsetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCharsetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCharsetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCharsetResponse response) {
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
        public Builder body(DescribeCharsetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCharsetResponse build() {
            return new DescribeCharsetResponse(this);
        } 

    } 

}
