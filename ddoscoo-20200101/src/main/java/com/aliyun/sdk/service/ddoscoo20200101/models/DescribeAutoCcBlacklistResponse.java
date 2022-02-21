// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoCcBlacklistResponse} extends {@link TeaModel}
 *
 * <p>DescribeAutoCcBlacklistResponse</p>
 */
public class DescribeAutoCcBlacklistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAutoCcBlacklistResponseBody body;

    private DescribeAutoCcBlacklistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAutoCcBlacklistResponse create() {
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
    public DescribeAutoCcBlacklistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAutoCcBlacklistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAutoCcBlacklistResponseBody body);

        @Override
        DescribeAutoCcBlacklistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAutoCcBlacklistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAutoCcBlacklistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAutoCcBlacklistResponse response) {
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
        public Builder body(DescribeAutoCcBlacklistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAutoCcBlacklistResponse build() {
            return new DescribeAutoCcBlacklistResponse(this);
        } 

    } 

}
