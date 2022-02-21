// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigOptionsResponse} extends {@link TeaModel}
 *
 * <p>DescribeConfigOptionsResponse</p>
 */
public class DescribeConfigOptionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConfigOptionsResponseBody body;

    private DescribeConfigOptionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConfigOptionsResponse create() {
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
    public DescribeConfigOptionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConfigOptionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConfigOptionsResponseBody body);

        @Override
        DescribeConfigOptionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConfigOptionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConfigOptionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConfigOptionsResponse response) {
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
        public Builder body(DescribeConfigOptionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConfigOptionsResponse build() {
            return new DescribeConfigOptionsResponse(this);
        } 

    } 

}
