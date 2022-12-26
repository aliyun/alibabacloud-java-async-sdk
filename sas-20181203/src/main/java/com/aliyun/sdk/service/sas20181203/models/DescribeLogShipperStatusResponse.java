// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogShipperStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeLogShipperStatusResponse</p>
 */
public class DescribeLogShipperStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLogShipperStatusResponseBody body;

    private DescribeLogShipperStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLogShipperStatusResponse create() {
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
    public DescribeLogShipperStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLogShipperStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLogShipperStatusResponseBody body);

        @Override
        DescribeLogShipperStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLogShipperStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLogShipperStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLogShipperStatusResponse response) {
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
        public Builder body(DescribeLogShipperStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLogShipperStatusResponse build() {
            return new DescribeLogShipperStatusResponse(this);
        } 

    } 

}
