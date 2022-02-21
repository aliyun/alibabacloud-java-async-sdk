// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlackListClientsResponse} extends {@link TeaModel}
 *
 * <p>DescribeBlackListClientsResponse</p>
 */
public class DescribeBlackListClientsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBlackListClientsResponseBody body;

    private DescribeBlackListClientsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBlackListClientsResponse create() {
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
    public DescribeBlackListClientsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBlackListClientsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBlackListClientsResponseBody body);

        @Override
        DescribeBlackListClientsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBlackListClientsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBlackListClientsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBlackListClientsResponse response) {
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
        public Builder body(DescribeBlackListClientsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBlackListClientsResponse build() {
            return new DescribeBlackListClientsResponse(this);
        } 

    } 

}
