// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeResourceInfoResponse</p>
 */
public class DescribeResourceInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResourceInfoResponseBody body;

    private DescribeResourceInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResourceInfoResponse create() {
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
    public DescribeResourceInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResourceInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResourceInfoResponseBody body);

        @Override
        DescribeResourceInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResourceInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResourceInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResourceInfoResponse response) {
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
        public Builder body(DescribeResourceInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResourceInfoResponse build() {
            return new DescribeResourceInfoResponse(this);
        } 

    } 

}
