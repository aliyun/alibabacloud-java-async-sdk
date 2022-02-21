// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortViewSourceProvincesResponse} extends {@link TeaModel}
 *
 * <p>DescribePortViewSourceProvincesResponse</p>
 */
public class DescribePortViewSourceProvincesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePortViewSourceProvincesResponseBody body;

    private DescribePortViewSourceProvincesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePortViewSourceProvincesResponse create() {
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
    public DescribePortViewSourceProvincesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePortViewSourceProvincesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePortViewSourceProvincesResponseBody body);

        @Override
        DescribePortViewSourceProvincesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePortViewSourceProvincesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePortViewSourceProvincesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePortViewSourceProvincesResponse response) {
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
        public Builder body(DescribePortViewSourceProvincesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePortViewSourceProvincesResponse build() {
            return new DescribePortViewSourceProvincesResponse(this);
        } 

    } 

}
