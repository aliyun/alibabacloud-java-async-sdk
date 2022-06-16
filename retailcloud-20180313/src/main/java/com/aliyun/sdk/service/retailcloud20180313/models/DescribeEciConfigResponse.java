// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEciConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeEciConfigResponse</p>
 */
public class DescribeEciConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEciConfigResponseBody body;

    private DescribeEciConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEciConfigResponse create() {
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
    public DescribeEciConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEciConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEciConfigResponseBody body);

        @Override
        DescribeEciConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEciConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEciConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEciConfigResponse response) {
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
        public Builder body(DescribeEciConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEciConfigResponse build() {
            return new DescribeEciConfigResponse(this);
        } 

    } 

}
