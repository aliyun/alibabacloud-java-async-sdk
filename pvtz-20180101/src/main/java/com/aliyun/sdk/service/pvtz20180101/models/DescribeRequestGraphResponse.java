// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRequestGraphResponse} extends {@link TeaModel}
 *
 * <p>DescribeRequestGraphResponse</p>
 */
public class DescribeRequestGraphResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRequestGraphResponseBody body;

    private DescribeRequestGraphResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRequestGraphResponse create() {
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
    public DescribeRequestGraphResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRequestGraphResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRequestGraphResponseBody body);

        @Override
        DescribeRequestGraphResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRequestGraphResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRequestGraphResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRequestGraphResponse response) {
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
        public Builder body(DescribeRequestGraphResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRequestGraphResponse build() {
            return new DescribeRequestGraphResponse(this);
        } 

    } 

}
