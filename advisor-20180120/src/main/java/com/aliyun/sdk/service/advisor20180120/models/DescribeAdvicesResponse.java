// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdvicesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAdvicesResponse</p>
 */
public class DescribeAdvicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAdvicesResponseBody body;

    private DescribeAdvicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAdvicesResponse create() {
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
    public DescribeAdvicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAdvicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAdvicesResponseBody body);

        @Override
        DescribeAdvicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAdvicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAdvicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAdvicesResponse response) {
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
        public Builder body(DescribeAdvicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAdvicesResponse build() {
            return new DescribeAdvicesResponse(this);
        } 

    } 

}
