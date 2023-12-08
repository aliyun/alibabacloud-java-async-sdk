// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSparkCodeWebUiResponse} extends {@link TeaModel}
 *
 * <p>DescribeSparkCodeWebUiResponse</p>
 */
public class DescribeSparkCodeWebUiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSparkCodeWebUiResponseBody body;

    private DescribeSparkCodeWebUiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSparkCodeWebUiResponse create() {
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
    public DescribeSparkCodeWebUiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSparkCodeWebUiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSparkCodeWebUiResponseBody body);

        @Override
        DescribeSparkCodeWebUiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSparkCodeWebUiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSparkCodeWebUiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSparkCodeWebUiResponse response) {
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
        public Builder body(DescribeSparkCodeWebUiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSparkCodeWebUiResponse build() {
            return new DescribeSparkCodeWebUiResponse(this);
        } 

    } 

}
