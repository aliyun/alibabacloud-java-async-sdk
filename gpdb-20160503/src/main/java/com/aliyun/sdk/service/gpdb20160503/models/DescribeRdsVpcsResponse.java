// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdsVpcsResponse} extends {@link TeaModel}
 *
 * <p>DescribeRdsVpcsResponse</p>
 */
public class DescribeRdsVpcsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRdsVpcsResponseBody body;

    private DescribeRdsVpcsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRdsVpcsResponse create() {
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
    public DescribeRdsVpcsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRdsVpcsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRdsVpcsResponseBody body);

        @Override
        DescribeRdsVpcsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRdsVpcsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRdsVpcsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRdsVpcsResponse response) {
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
        public Builder body(DescribeRdsVpcsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRdsVpcsResponse build() {
            return new DescribeRdsVpcsResponse(this);
        } 

    } 

}
