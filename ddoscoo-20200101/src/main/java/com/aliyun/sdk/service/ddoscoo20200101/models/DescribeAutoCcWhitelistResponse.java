// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoCcWhitelistResponse} extends {@link TeaModel}
 *
 * <p>DescribeAutoCcWhitelistResponse</p>
 */
public class DescribeAutoCcWhitelistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAutoCcWhitelistResponseBody body;

    private DescribeAutoCcWhitelistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAutoCcWhitelistResponse create() {
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
    public DescribeAutoCcWhitelistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAutoCcWhitelistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAutoCcWhitelistResponseBody body);

        @Override
        DescribeAutoCcWhitelistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAutoCcWhitelistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAutoCcWhitelistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAutoCcWhitelistResponse response) {
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
        public Builder body(DescribeAutoCcWhitelistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAutoCcWhitelistResponse build() {
            return new DescribeAutoCcWhitelistResponse(this);
        } 

    } 

}
