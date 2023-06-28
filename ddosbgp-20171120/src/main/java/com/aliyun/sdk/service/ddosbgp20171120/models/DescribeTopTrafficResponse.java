// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTopTrafficResponse} extends {@link TeaModel}
 *
 * <p>DescribeTopTrafficResponse</p>
 */
public class DescribeTopTrafficResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTopTrafficResponseBody body;

    private DescribeTopTrafficResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTopTrafficResponse create() {
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
    public DescribeTopTrafficResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTopTrafficResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTopTrafficResponseBody body);

        @Override
        DescribeTopTrafficResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTopTrafficResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTopTrafficResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTopTrafficResponse response) {
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
        public Builder body(DescribeTopTrafficResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTopTrafficResponse build() {
            return new DescribeTopTrafficResponse(this);
        } 

    } 

}
