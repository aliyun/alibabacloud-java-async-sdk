// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEncryptionKeyResponse} extends {@link TeaModel}
 *
 * <p>DescribeEncryptionKeyResponse</p>
 */
public class DescribeEncryptionKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEncryptionKeyResponseBody body;

    private DescribeEncryptionKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEncryptionKeyResponse create() {
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
    public DescribeEncryptionKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEncryptionKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEncryptionKeyResponseBody body);

        @Override
        DescribeEncryptionKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEncryptionKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEncryptionKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEncryptionKeyResponse response) {
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
        public Builder body(DescribeEncryptionKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEncryptionKeyResponse build() {
            return new DescribeEncryptionKeyResponse(this);
        } 

    } 

}
