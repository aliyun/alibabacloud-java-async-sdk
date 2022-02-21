// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigOfVersionResponse} extends {@link TeaModel}
 *
 * <p>DescribeConfigOfVersionResponse</p>
 */
public class DescribeConfigOfVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConfigOfVersionResponseBody body;

    private DescribeConfigOfVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConfigOfVersionResponse create() {
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
    public DescribeConfigOfVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConfigOfVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConfigOfVersionResponseBody body);

        @Override
        DescribeConfigOfVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConfigOfVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConfigOfVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConfigOfVersionResponse response) {
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
        public Builder body(DescribeConfigOfVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConfigOfVersionResponse build() {
            return new DescribeConfigOfVersionResponse(this);
        } 

    } 

}
