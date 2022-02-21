// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortResponse} extends {@link TeaModel}
 *
 * <p>DescribePortResponse</p>
 */
public class DescribePortResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePortResponseBody body;

    private DescribePortResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePortResponse create() {
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
    public DescribePortResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePortResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePortResponseBody body);

        @Override
        DescribePortResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePortResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePortResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePortResponse response) {
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
        public Builder body(DescribePortResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePortResponse build() {
            return new DescribePortResponse(this);
        } 

    } 

}
