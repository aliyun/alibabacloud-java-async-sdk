// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserEncryptionKeyListResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserEncryptionKeyListResponse</p>
 */
public class DescribeUserEncryptionKeyListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUserEncryptionKeyListResponseBody body;

    private DescribeUserEncryptionKeyListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserEncryptionKeyListResponse create() {
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
    public DescribeUserEncryptionKeyListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserEncryptionKeyListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUserEncryptionKeyListResponseBody body);

        @Override
        DescribeUserEncryptionKeyListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserEncryptionKeyListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUserEncryptionKeyListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserEncryptionKeyListResponse response) {
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
        public Builder body(DescribeUserEncryptionKeyListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserEncryptionKeyListResponse build() {
            return new DescribeUserEncryptionKeyListResponse(this);
        } 

    } 

}
