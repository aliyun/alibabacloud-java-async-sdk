// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKmsKeysResponse} extends {@link TeaModel}
 *
 * <p>DescribeKmsKeysResponse</p>
 */
public class DescribeKmsKeysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeKmsKeysResponseBody body;

    private DescribeKmsKeysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeKmsKeysResponse create() {
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
    public DescribeKmsKeysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeKmsKeysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeKmsKeysResponseBody body);

        @Override
        DescribeKmsKeysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeKmsKeysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeKmsKeysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeKmsKeysResponse response) {
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
        public Builder body(DescribeKmsKeysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeKmsKeysResponse build() {
            return new DescribeKmsKeysResponse(this);
        } 

    } 

}
