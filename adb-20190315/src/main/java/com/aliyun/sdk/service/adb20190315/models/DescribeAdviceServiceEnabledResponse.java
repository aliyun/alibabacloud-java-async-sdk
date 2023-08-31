// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdviceServiceEnabledResponse} extends {@link TeaModel}
 *
 * <p>DescribeAdviceServiceEnabledResponse</p>
 */
public class DescribeAdviceServiceEnabledResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAdviceServiceEnabledResponseBody body;

    private DescribeAdviceServiceEnabledResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAdviceServiceEnabledResponse create() {
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
    public DescribeAdviceServiceEnabledResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAdviceServiceEnabledResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAdviceServiceEnabledResponseBody body);

        @Override
        DescribeAdviceServiceEnabledResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAdviceServiceEnabledResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAdviceServiceEnabledResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAdviceServiceEnabledResponse response) {
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
        public Builder body(DescribeAdviceServiceEnabledResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAdviceServiceEnabledResponse build() {
            return new DescribeAdviceServiceEnabledResponse(this);
        } 

    } 

}
