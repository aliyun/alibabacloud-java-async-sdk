// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageSensitiveFileListResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageSensitiveFileListResponse</p>
 */
public class DescribeImageSensitiveFileListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageSensitiveFileListResponseBody body;

    private DescribeImageSensitiveFileListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageSensitiveFileListResponse create() {
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
    public DescribeImageSensitiveFileListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageSensitiveFileListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageSensitiveFileListResponseBody body);

        @Override
        DescribeImageSensitiveFileListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageSensitiveFileListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageSensitiveFileListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageSensitiveFileListResponse response) {
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
        public Builder body(DescribeImageSensitiveFileListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageSensitiveFileListResponse build() {
            return new DescribeImageSensitiveFileListResponse(this);
        } 

    } 

}
