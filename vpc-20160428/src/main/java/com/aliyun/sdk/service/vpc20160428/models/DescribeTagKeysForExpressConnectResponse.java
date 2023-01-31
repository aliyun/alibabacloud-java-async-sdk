// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagKeysForExpressConnectResponse} extends {@link TeaModel}
 *
 * <p>DescribeTagKeysForExpressConnectResponse</p>
 */
public class DescribeTagKeysForExpressConnectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTagKeysForExpressConnectResponseBody body;

    private DescribeTagKeysForExpressConnectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTagKeysForExpressConnectResponse create() {
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
    public DescribeTagKeysForExpressConnectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTagKeysForExpressConnectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTagKeysForExpressConnectResponseBody body);

        @Override
        DescribeTagKeysForExpressConnectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTagKeysForExpressConnectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTagKeysForExpressConnectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTagKeysForExpressConnectResponse response) {
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
        public Builder body(DescribeTagKeysForExpressConnectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTagKeysForExpressConnectResponse build() {
            return new DescribeTagKeysForExpressConnectResponse(this);
        } 

    } 

}
