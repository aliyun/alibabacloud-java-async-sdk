// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageComponentsResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageComponentsResponse</p>
 */
public class DescribeImageComponentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageComponentsResponseBody body;

    private DescribeImageComponentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageComponentsResponse create() {
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
    public DescribeImageComponentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageComponentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageComponentsResponseBody body);

        @Override
        DescribeImageComponentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageComponentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageComponentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageComponentsResponse response) {
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
        public Builder body(DescribeImageComponentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageComponentsResponse build() {
            return new DescribeImageComponentsResponse(this);
        } 

    } 

}
