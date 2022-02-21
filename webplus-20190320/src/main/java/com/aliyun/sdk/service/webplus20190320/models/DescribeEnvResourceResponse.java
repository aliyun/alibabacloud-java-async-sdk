// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnvResourceResponse} extends {@link TeaModel}
 *
 * <p>DescribeEnvResourceResponse</p>
 */
public class DescribeEnvResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEnvResourceResponseBody body;

    private DescribeEnvResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEnvResourceResponse create() {
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
    public DescribeEnvResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEnvResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEnvResourceResponseBody body);

        @Override
        DescribeEnvResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEnvResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEnvResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEnvResourceResponse response) {
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
        public Builder body(DescribeEnvResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEnvResourceResponse build() {
            return new DescribeEnvResourceResponse(this);
        } 

    } 

}
