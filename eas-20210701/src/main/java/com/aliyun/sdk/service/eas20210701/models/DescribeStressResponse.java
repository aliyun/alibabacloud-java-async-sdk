// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStressResponse} extends {@link TeaModel}
 *
 * <p>DescribeStressResponse</p>
 */
public class DescribeStressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeStressResponseBody body;

    private DescribeStressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeStressResponse create() {
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
    public DescribeStressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeStressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeStressResponseBody body);

        @Override
        DescribeStressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeStressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeStressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeStressResponse response) {
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
        public Builder body(DescribeStressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeStressResponse build() {
            return new DescribeStressResponse(this);
        } 

    } 

}
