// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvadeEventListResponse} extends {@link TeaModel}
 *
 * <p>DescribeInvadeEventListResponse</p>
 */
public class DescribeInvadeEventListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInvadeEventListResponseBody body;

    private DescribeInvadeEventListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInvadeEventListResponse create() {
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
    public DescribeInvadeEventListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInvadeEventListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInvadeEventListResponseBody body);

        @Override
        DescribeInvadeEventListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInvadeEventListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInvadeEventListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInvadeEventListResponse response) {
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
        public Builder body(DescribeInvadeEventListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInvadeEventListResponse build() {
            return new DescribeInvadeEventListResponse(this);
        } 

    } 

}
