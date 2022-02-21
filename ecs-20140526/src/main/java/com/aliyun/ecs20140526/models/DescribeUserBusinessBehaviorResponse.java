// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserBusinessBehaviorResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserBusinessBehaviorResponse</p>
 */
public class DescribeUserBusinessBehaviorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUserBusinessBehaviorResponseBody body;

    private DescribeUserBusinessBehaviorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserBusinessBehaviorResponse create() {
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
    public DescribeUserBusinessBehaviorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserBusinessBehaviorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUserBusinessBehaviorResponseBody body);

        @Override
        DescribeUserBusinessBehaviorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserBusinessBehaviorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUserBusinessBehaviorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserBusinessBehaviorResponse response) {
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
        public Builder body(DescribeUserBusinessBehaviorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserBusinessBehaviorResponse build() {
            return new DescribeUserBusinessBehaviorResponse(this);
        } 

    } 

}
