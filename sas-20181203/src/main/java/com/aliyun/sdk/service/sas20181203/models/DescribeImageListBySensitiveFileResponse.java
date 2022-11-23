// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageListBySensitiveFileResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageListBySensitiveFileResponse</p>
 */
public class DescribeImageListBySensitiveFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageListBySensitiveFileResponseBody body;

    private DescribeImageListBySensitiveFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageListBySensitiveFileResponse create() {
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
    public DescribeImageListBySensitiveFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageListBySensitiveFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageListBySensitiveFileResponseBody body);

        @Override
        DescribeImageListBySensitiveFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageListBySensitiveFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageListBySensitiveFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageListBySensitiveFileResponse response) {
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
        public Builder body(DescribeImageListBySensitiveFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageListBySensitiveFileResponse build() {
            return new DescribeImageListBySensitiveFileResponse(this);
        } 

    } 

}
