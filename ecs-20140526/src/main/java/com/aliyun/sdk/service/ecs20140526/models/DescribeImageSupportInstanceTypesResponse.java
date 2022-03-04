// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageSupportInstanceTypesResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageSupportInstanceTypesResponse</p>
 */
public class DescribeImageSupportInstanceTypesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageSupportInstanceTypesResponseBody body;

    private DescribeImageSupportInstanceTypesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageSupportInstanceTypesResponse create() {
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
    public DescribeImageSupportInstanceTypesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageSupportInstanceTypesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageSupportInstanceTypesResponseBody body);

        @Override
        DescribeImageSupportInstanceTypesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageSupportInstanceTypesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageSupportInstanceTypesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageSupportInstanceTypesResponse response) {
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
        public Builder body(DescribeImageSupportInstanceTypesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageSupportInstanceTypesResponse build() {
            return new DescribeImageSupportInstanceTypesResponse(this);
        } 

    } 

}
