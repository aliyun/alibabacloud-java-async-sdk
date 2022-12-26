// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCountNotScannedImageResponse} extends {@link TeaModel}
 *
 * <p>DescribeCountNotScannedImageResponse</p>
 */
public class DescribeCountNotScannedImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCountNotScannedImageResponseBody body;

    private DescribeCountNotScannedImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCountNotScannedImageResponse create() {
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
    public DescribeCountNotScannedImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCountNotScannedImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCountNotScannedImageResponseBody body);

        @Override
        DescribeCountNotScannedImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCountNotScannedImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCountNotScannedImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCountNotScannedImageResponse response) {
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
        public Builder body(DescribeCountNotScannedImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCountNotScannedImageResponse build() {
            return new DescribeCountNotScannedImageResponse(this);
        } 

    } 

}
