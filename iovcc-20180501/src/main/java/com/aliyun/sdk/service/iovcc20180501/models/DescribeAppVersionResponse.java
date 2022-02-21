// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppVersionResponse} extends {@link TeaModel}
 *
 * <p>DescribeAppVersionResponse</p>
 */
public class DescribeAppVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAppVersionResponseBody body;

    private DescribeAppVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAppVersionResponse create() {
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
    public DescribeAppVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAppVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAppVersionResponseBody body);

        @Override
        DescribeAppVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAppVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAppVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAppVersionResponse response) {
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
        public Builder body(DescribeAppVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAppVersionResponse build() {
            return new DescribeAppVersionResponse(this);
        } 

    } 

}
