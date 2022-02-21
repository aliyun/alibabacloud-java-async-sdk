// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackendInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackendInfoResponse</p>
 */
public class DescribeBackendInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackendInfoResponseBody body;

    private DescribeBackendInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackendInfoResponse create() {
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
    public DescribeBackendInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackendInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackendInfoResponseBody body);

        @Override
        DescribeBackendInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackendInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackendInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackendInfoResponse response) {
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
        public Builder body(DescribeBackendInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackendInfoResponse build() {
            return new DescribeBackendInfoResponse(this);
        } 

    } 

}
