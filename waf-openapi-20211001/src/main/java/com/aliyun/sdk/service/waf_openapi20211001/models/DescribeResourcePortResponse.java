// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourcePortResponse} extends {@link TeaModel}
 *
 * <p>DescribeResourcePortResponse</p>
 */
public class DescribeResourcePortResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResourcePortResponseBody body;

    private DescribeResourcePortResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResourcePortResponse create() {
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
    public DescribeResourcePortResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResourcePortResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResourcePortResponseBody body);

        @Override
        DescribeResourcePortResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResourcePortResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResourcePortResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResourcePortResponse response) {
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
        public Builder body(DescribeResourcePortResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResourcePortResponse build() {
            return new DescribeResourcePortResponse(this);
        } 

    } 

}
