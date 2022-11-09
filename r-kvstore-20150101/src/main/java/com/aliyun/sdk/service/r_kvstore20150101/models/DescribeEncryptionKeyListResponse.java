// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEncryptionKeyListResponse} extends {@link TeaModel}
 *
 * <p>DescribeEncryptionKeyListResponse</p>
 */
public class DescribeEncryptionKeyListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEncryptionKeyListResponseBody body;

    private DescribeEncryptionKeyListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEncryptionKeyListResponse create() {
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
    public DescribeEncryptionKeyListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEncryptionKeyListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEncryptionKeyListResponseBody body);

        @Override
        DescribeEncryptionKeyListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEncryptionKeyListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEncryptionKeyListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEncryptionKeyListResponse response) {
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
        public Builder body(DescribeEncryptionKeyListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEncryptionKeyListResponse build() {
            return new DescribeEncryptionKeyListResponse(this);
        } 

    } 

}
