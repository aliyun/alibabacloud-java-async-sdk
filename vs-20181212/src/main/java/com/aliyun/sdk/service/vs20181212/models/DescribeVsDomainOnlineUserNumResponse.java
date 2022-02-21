// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsDomainOnlineUserNumResponse} extends {@link TeaModel}
 *
 * <p>DescribeVsDomainOnlineUserNumResponse</p>
 */
public class DescribeVsDomainOnlineUserNumResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVsDomainOnlineUserNumResponseBody body;

    private DescribeVsDomainOnlineUserNumResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVsDomainOnlineUserNumResponse create() {
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
    public DescribeVsDomainOnlineUserNumResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVsDomainOnlineUserNumResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVsDomainOnlineUserNumResponseBody body);

        @Override
        DescribeVsDomainOnlineUserNumResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVsDomainOnlineUserNumResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVsDomainOnlineUserNumResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVsDomainOnlineUserNumResponse response) {
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
        public Builder body(DescribeVsDomainOnlineUserNumResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVsDomainOnlineUserNumResponse build() {
            return new DescribeVsDomainOnlineUserNumResponse(this);
        } 

    } 

}
