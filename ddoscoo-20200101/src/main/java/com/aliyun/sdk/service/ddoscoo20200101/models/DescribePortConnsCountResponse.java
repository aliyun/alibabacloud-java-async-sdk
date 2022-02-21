// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortConnsCountResponse} extends {@link TeaModel}
 *
 * <p>DescribePortConnsCountResponse</p>
 */
public class DescribePortConnsCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePortConnsCountResponseBody body;

    private DescribePortConnsCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePortConnsCountResponse create() {
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
    public DescribePortConnsCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePortConnsCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePortConnsCountResponseBody body);

        @Override
        DescribePortConnsCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePortConnsCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePortConnsCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePortConnsCountResponse response) {
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
        public Builder body(DescribePortConnsCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePortConnsCountResponse build() {
            return new DescribePortConnsCountResponse(this);
        } 

    } 

}
