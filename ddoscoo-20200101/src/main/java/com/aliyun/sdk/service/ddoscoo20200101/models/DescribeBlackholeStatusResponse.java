// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlackholeStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeBlackholeStatusResponse</p>
 */
public class DescribeBlackholeStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBlackholeStatusResponseBody body;

    private DescribeBlackholeStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBlackholeStatusResponse create() {
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
    public DescribeBlackholeStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBlackholeStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBlackholeStatusResponseBody body);

        @Override
        DescribeBlackholeStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBlackholeStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBlackholeStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBlackholeStatusResponse response) {
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
        public Builder body(DescribeBlackholeStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBlackholeStatusResponse build() {
            return new DescribeBlackholeStatusResponse(this);
        } 

    } 

}
