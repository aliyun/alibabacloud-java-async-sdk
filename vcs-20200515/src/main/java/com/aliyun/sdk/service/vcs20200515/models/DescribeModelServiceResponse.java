// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeModelServiceResponse} extends {@link TeaModel}
 *
 * <p>DescribeModelServiceResponse</p>
 */
public class DescribeModelServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeModelServiceResponseBody body;

    private DescribeModelServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeModelServiceResponse create() {
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
    public DescribeModelServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeModelServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeModelServiceResponseBody body);

        @Override
        DescribeModelServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeModelServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeModelServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeModelServiceResponse response) {
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
        public Builder body(DescribeModelServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeModelServiceResponse build() {
            return new DescribeModelServiceResponse(this);
        } 

    } 

}
