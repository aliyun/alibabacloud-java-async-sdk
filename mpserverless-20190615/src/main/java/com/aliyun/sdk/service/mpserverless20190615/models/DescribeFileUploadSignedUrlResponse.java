// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFileUploadSignedUrlResponse} extends {@link TeaModel}
 *
 * <p>DescribeFileUploadSignedUrlResponse</p>
 */
public class DescribeFileUploadSignedUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFileUploadSignedUrlResponseBody body;

    private DescribeFileUploadSignedUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFileUploadSignedUrlResponse create() {
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
    public DescribeFileUploadSignedUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFileUploadSignedUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFileUploadSignedUrlResponseBody body);

        @Override
        DescribeFileUploadSignedUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFileUploadSignedUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFileUploadSignedUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFileUploadSignedUrlResponse response) {
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
        public Builder body(DescribeFileUploadSignedUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFileUploadSignedUrlResponse build() {
            return new DescribeFileUploadSignedUrlResponse(this);
        } 

    } 

}
