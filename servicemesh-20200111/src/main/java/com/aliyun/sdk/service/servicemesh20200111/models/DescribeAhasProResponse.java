// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAhasProResponse} extends {@link TeaModel}
 *
 * <p>DescribeAhasProResponse</p>
 */
public class DescribeAhasProResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAhasProResponseBody body;

    private DescribeAhasProResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAhasProResponse create() {
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
    public DescribeAhasProResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAhasProResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAhasProResponseBody body);

        @Override
        DescribeAhasProResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAhasProResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAhasProResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAhasProResponse response) {
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
        public Builder body(DescribeAhasProResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAhasProResponse build() {
            return new DescribeAhasProResponse(this);
        } 

    } 

}
