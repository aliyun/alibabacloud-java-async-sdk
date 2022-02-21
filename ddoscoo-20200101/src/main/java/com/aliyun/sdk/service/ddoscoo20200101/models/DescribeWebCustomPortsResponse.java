// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebCustomPortsResponse} extends {@link TeaModel}
 *
 * <p>DescribeWebCustomPortsResponse</p>
 */
public class DescribeWebCustomPortsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWebCustomPortsResponseBody body;

    private DescribeWebCustomPortsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWebCustomPortsResponse create() {
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
    public DescribeWebCustomPortsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWebCustomPortsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWebCustomPortsResponseBody body);

        @Override
        DescribeWebCustomPortsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWebCustomPortsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWebCustomPortsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWebCustomPortsResponse response) {
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
        public Builder body(DescribeWebCustomPortsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWebCustomPortsResponse build() {
            return new DescribeWebCustomPortsResponse(this);
        } 

    } 

}
