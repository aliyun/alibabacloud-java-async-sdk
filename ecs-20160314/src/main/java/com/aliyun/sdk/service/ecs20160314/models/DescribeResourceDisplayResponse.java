// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceDisplayResponse} extends {@link TeaModel}
 *
 * <p>DescribeResourceDisplayResponse</p>
 */
public class DescribeResourceDisplayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResourceDisplayResponseBody body;

    private DescribeResourceDisplayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResourceDisplayResponse create() {
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
    public DescribeResourceDisplayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResourceDisplayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResourceDisplayResponseBody body);

        @Override
        DescribeResourceDisplayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResourceDisplayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResourceDisplayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResourceDisplayResponse response) {
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
        public Builder body(DescribeResourceDisplayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResourceDisplayResponse build() {
            return new DescribeResourceDisplayResponse(this);
        } 

    } 

}
