// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImportFileUrlResponse} extends {@link TeaModel}
 *
 * <p>DescribeImportFileUrlResponse</p>
 */
public class DescribeImportFileUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImportFileUrlResponseBody body;

    private DescribeImportFileUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImportFileUrlResponse create() {
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
    public DescribeImportFileUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImportFileUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImportFileUrlResponseBody body);

        @Override
        DescribeImportFileUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImportFileUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImportFileUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImportFileUrlResponse response) {
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
        public Builder body(DescribeImportFileUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImportFileUrlResponse build() {
            return new DescribeImportFileUrlResponse(this);
        } 

    } 

}
