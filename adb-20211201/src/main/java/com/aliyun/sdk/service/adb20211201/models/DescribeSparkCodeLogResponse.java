// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSparkCodeLogResponse} extends {@link TeaModel}
 *
 * <p>DescribeSparkCodeLogResponse</p>
 */
public class DescribeSparkCodeLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSparkCodeLogResponseBody body;

    private DescribeSparkCodeLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSparkCodeLogResponse create() {
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
    public DescribeSparkCodeLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSparkCodeLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSparkCodeLogResponseBody body);

        @Override
        DescribeSparkCodeLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSparkCodeLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSparkCodeLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSparkCodeLogResponse response) {
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
        public Builder body(DescribeSparkCodeLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSparkCodeLogResponse build() {
            return new DescribeSparkCodeLogResponse(this);
        } 

    } 

}
