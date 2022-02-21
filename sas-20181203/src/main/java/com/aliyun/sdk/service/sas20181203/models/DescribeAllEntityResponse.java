// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllEntityResponse} extends {@link TeaModel}
 *
 * <p>DescribeAllEntityResponse</p>
 */
public class DescribeAllEntityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAllEntityResponseBody body;

    private DescribeAllEntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAllEntityResponse create() {
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
    public DescribeAllEntityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAllEntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAllEntityResponseBody body);

        @Override
        DescribeAllEntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAllEntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAllEntityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAllEntityResponse response) {
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
        public Builder body(DescribeAllEntityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAllEntityResponse build() {
            return new DescribeAllEntityResponse(this);
        } 

    } 

}
