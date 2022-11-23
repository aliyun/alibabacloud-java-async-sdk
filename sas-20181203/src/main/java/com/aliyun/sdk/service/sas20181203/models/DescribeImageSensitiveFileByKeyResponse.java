// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageSensitiveFileByKeyResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageSensitiveFileByKeyResponse</p>
 */
public class DescribeImageSensitiveFileByKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageSensitiveFileByKeyResponseBody body;

    private DescribeImageSensitiveFileByKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageSensitiveFileByKeyResponse create() {
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
    public DescribeImageSensitiveFileByKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageSensitiveFileByKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageSensitiveFileByKeyResponseBody body);

        @Override
        DescribeImageSensitiveFileByKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageSensitiveFileByKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageSensitiveFileByKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageSensitiveFileByKeyResponse response) {
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
        public Builder body(DescribeImageSensitiveFileByKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageSensitiveFileByKeyResponse build() {
            return new DescribeImageSensitiveFileByKeyResponse(this);
        } 

    } 

}
