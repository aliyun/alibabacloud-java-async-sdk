// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGlobalDesktopsResponse} extends {@link TeaModel}
 *
 * <p>DescribeGlobalDesktopsResponse</p>
 */
public class DescribeGlobalDesktopsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGlobalDesktopsResponseBody body;

    private DescribeGlobalDesktopsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGlobalDesktopsResponse create() {
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
    public DescribeGlobalDesktopsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGlobalDesktopsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGlobalDesktopsResponseBody body);

        @Override
        DescribeGlobalDesktopsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGlobalDesktopsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGlobalDesktopsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGlobalDesktopsResponse response) {
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
        public Builder body(DescribeGlobalDesktopsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGlobalDesktopsResponse build() {
            return new DescribeGlobalDesktopsResponse(this);
        } 

    } 

}
