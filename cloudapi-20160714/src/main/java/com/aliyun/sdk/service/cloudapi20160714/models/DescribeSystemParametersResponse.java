// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSystemParametersResponse} extends {@link TeaModel}
 *
 * <p>DescribeSystemParametersResponse</p>
 */
public class DescribeSystemParametersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSystemParametersResponseBody body;

    private DescribeSystemParametersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSystemParametersResponse create() {
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
    public DescribeSystemParametersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSystemParametersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSystemParametersResponseBody body);

        @Override
        DescribeSystemParametersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSystemParametersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSystemParametersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSystemParametersResponse response) {
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
        public Builder body(DescribeSystemParametersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSystemParametersResponse build() {
            return new DescribeSystemParametersResponse(this);
        } 

    } 

}
