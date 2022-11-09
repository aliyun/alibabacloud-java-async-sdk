// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParametersResponse} extends {@link TeaModel}
 *
 * <p>DescribeParametersResponse</p>
 */
public class DescribeParametersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeParametersResponseBody body;

    private DescribeParametersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeParametersResponse create() {
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
    public DescribeParametersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeParametersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeParametersResponseBody body);

        @Override
        DescribeParametersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeParametersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeParametersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeParametersResponse response) {
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
        public Builder body(DescribeParametersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeParametersResponse build() {
            return new DescribeParametersResponse(this);
        } 

    } 

}
