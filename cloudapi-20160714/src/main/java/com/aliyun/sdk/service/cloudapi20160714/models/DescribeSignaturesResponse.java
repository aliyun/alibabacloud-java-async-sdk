// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSignaturesResponse} extends {@link TeaModel}
 *
 * <p>DescribeSignaturesResponse</p>
 */
public class DescribeSignaturesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSignaturesResponseBody body;

    private DescribeSignaturesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSignaturesResponse create() {
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
    public DescribeSignaturesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSignaturesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSignaturesResponseBody body);

        @Override
        DescribeSignaturesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSignaturesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSignaturesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSignaturesResponse response) {
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
        public Builder body(DescribeSignaturesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSignaturesResponse build() {
            return new DescribeSignaturesResponse(this);
        } 

    } 

}
