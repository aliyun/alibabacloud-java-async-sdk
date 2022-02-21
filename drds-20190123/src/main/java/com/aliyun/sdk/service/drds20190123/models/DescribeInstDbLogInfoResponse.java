// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstDbLogInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstDbLogInfoResponse</p>
 */
public class DescribeInstDbLogInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInstDbLogInfoResponseBody body;

    private DescribeInstDbLogInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInstDbLogInfoResponse create() {
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
    public DescribeInstDbLogInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInstDbLogInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInstDbLogInfoResponseBody body);

        @Override
        DescribeInstDbLogInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInstDbLogInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInstDbLogInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInstDbLogInfoResponse response) {
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
        public Builder body(DescribeInstDbLogInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInstDbLogInfoResponse build() {
            return new DescribeInstDbLogInfoResponse(this);
        } 

    } 

}
