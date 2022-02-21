// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSignaturesByApiResponse} extends {@link TeaModel}
 *
 * <p>DescribeSignaturesByApiResponse</p>
 */
public class DescribeSignaturesByApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSignaturesByApiResponseBody body;

    private DescribeSignaturesByApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSignaturesByApiResponse create() {
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
    public DescribeSignaturesByApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSignaturesByApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSignaturesByApiResponseBody body);

        @Override
        DescribeSignaturesByApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSignaturesByApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSignaturesByApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSignaturesByApiResponse response) {
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
        public Builder body(DescribeSignaturesByApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSignaturesByApiResponse build() {
            return new DescribeSignaturesByApiResponse(this);
        } 

    } 

}
