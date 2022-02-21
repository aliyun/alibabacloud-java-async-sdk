// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExternalStreamURLResponse} extends {@link TeaModel}
 *
 * <p>DescribeExternalStreamURLResponse</p>
 */
public class DescribeExternalStreamURLResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeExternalStreamURLResponseBody body;

    private DescribeExternalStreamURLResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeExternalStreamURLResponse create() {
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
    public DescribeExternalStreamURLResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExternalStreamURLResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeExternalStreamURLResponseBody body);

        @Override
        DescribeExternalStreamURLResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExternalStreamURLResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeExternalStreamURLResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExternalStreamURLResponse response) {
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
        public Builder body(DescribeExternalStreamURLResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExternalStreamURLResponse build() {
            return new DescribeExternalStreamURLResponse(this);
        } 

    } 

}
