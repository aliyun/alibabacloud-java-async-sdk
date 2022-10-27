// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEstackImageResponse} extends {@link TeaModel}
 *
 * <p>DescribeEstackImageResponse</p>
 */
public class DescribeEstackImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEstackImageResponseBody body;

    private DescribeEstackImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEstackImageResponse create() {
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
    public DescribeEstackImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEstackImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEstackImageResponseBody body);

        @Override
        DescribeEstackImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEstackImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEstackImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEstackImageResponse response) {
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
        public Builder body(DescribeEstackImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEstackImageResponse build() {
            return new DescribeEstackImageResponse(this);
        } 

    } 

}
