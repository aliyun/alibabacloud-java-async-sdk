// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApisBySignatureResponse} extends {@link TeaModel}
 *
 * <p>DescribeApisBySignatureResponse</p>
 */
public class DescribeApisBySignatureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeApisBySignatureResponseBody body;

    private DescribeApisBySignatureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeApisBySignatureResponse create() {
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
    public DescribeApisBySignatureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApisBySignatureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeApisBySignatureResponseBody body);

        @Override
        DescribeApisBySignatureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApisBySignatureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeApisBySignatureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApisBySignatureResponse response) {
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
        public Builder body(DescribeApisBySignatureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApisBySignatureResponse build() {
            return new DescribeApisBySignatureResponse(this);
        } 

    } 

}
