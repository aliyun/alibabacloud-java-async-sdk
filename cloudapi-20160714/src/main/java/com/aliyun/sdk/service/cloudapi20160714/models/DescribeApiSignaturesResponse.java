// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiSignaturesResponse} extends {@link TeaModel}
 *
 * <p>DescribeApiSignaturesResponse</p>
 */
public class DescribeApiSignaturesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeApiSignaturesResponseBody body;

    private DescribeApiSignaturesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeApiSignaturesResponse create() {
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
    public DescribeApiSignaturesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApiSignaturesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeApiSignaturesResponseBody body);

        @Override
        DescribeApiSignaturesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApiSignaturesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeApiSignaturesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApiSignaturesResponse response) {
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
        public Builder body(DescribeApiSignaturesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApiSignaturesResponse build() {
            return new DescribeApiSignaturesResponse(this);
        } 

    } 

}
