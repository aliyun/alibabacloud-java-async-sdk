// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoDelConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeAutoDelConfigResponse</p>
 */
public class DescribeAutoDelConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAutoDelConfigResponseBody body;

    private DescribeAutoDelConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAutoDelConfigResponse create() {
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
    public DescribeAutoDelConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAutoDelConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAutoDelConfigResponseBody body);

        @Override
        DescribeAutoDelConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAutoDelConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAutoDelConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAutoDelConfigResponse response) {
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
        public Builder body(DescribeAutoDelConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAutoDelConfigResponse build() {
            return new DescribeAutoDelConfigResponse(this);
        } 

    } 

}
