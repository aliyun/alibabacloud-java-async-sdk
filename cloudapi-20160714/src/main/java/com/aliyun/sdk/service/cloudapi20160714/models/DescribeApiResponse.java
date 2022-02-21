// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiResponse} extends {@link TeaModel}
 *
 * <p>DescribeApiResponse</p>
 */
public class DescribeApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeApiResponseBody body;

    private DescribeApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeApiResponse create() {
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
    public DescribeApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeApiResponseBody body);

        @Override
        DescribeApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApiResponse response) {
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
        public Builder body(DescribeApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApiResponse build() {
            return new DescribeApiResponse(this);
        } 

    } 

}
