// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserDataResponse</p>
 */
public class DescribeUserDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUserDataResponseBody body;

    private DescribeUserDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserDataResponse create() {
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
    public DescribeUserDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUserDataResponseBody body);

        @Override
        DescribeUserDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUserDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserDataResponse response) {
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
        public Builder body(DescribeUserDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserDataResponse build() {
            return new DescribeUserDataResponse(this);
        } 

    } 

}
