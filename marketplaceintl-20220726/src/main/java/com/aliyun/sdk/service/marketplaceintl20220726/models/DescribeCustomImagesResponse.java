// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomImagesResponse} extends {@link TeaModel}
 *
 * <p>DescribeCustomImagesResponse</p>
 */
public class DescribeCustomImagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCustomImagesResponseBody body;

    private DescribeCustomImagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCustomImagesResponse create() {
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
    public DescribeCustomImagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCustomImagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCustomImagesResponseBody body);

        @Override
        DescribeCustomImagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCustomImagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCustomImagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCustomImagesResponse response) {
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
        public Builder body(DescribeCustomImagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCustomImagesResponse build() {
            return new DescribeCustomImagesResponse(this);
        } 

    } 

}
