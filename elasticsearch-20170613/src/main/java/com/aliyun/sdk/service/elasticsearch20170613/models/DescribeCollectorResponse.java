// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCollectorResponse} extends {@link TeaModel}
 *
 * <p>DescribeCollectorResponse</p>
 */
public class DescribeCollectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCollectorResponseBody body;

    private DescribeCollectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCollectorResponse create() {
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
    public DescribeCollectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCollectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCollectorResponseBody body);

        @Override
        DescribeCollectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCollectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCollectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCollectorResponse response) {
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
        public Builder body(DescribeCollectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCollectorResponse build() {
            return new DescribeCollectorResponse(this);
        } 

    } 

}
