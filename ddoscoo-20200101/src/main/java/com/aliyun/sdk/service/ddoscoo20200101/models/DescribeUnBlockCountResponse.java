// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUnBlockCountResponse} extends {@link TeaModel}
 *
 * <p>DescribeUnBlockCountResponse</p>
 */
public class DescribeUnBlockCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUnBlockCountResponseBody body;

    private DescribeUnBlockCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUnBlockCountResponse create() {
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
    public DescribeUnBlockCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUnBlockCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUnBlockCountResponseBody body);

        @Override
        DescribeUnBlockCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUnBlockCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUnBlockCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUnBlockCountResponse response) {
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
        public Builder body(DescribeUnBlockCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUnBlockCountResponse build() {
            return new DescribeUnBlockCountResponse(this);
        } 

    } 

}
