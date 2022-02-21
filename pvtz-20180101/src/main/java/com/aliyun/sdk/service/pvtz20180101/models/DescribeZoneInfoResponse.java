// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZoneInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeZoneInfoResponse</p>
 */
public class DescribeZoneInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeZoneInfoResponseBody body;

    private DescribeZoneInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeZoneInfoResponse create() {
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
    public DescribeZoneInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeZoneInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeZoneInfoResponseBody body);

        @Override
        DescribeZoneInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeZoneInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeZoneInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeZoneInfoResponse response) {
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
        public Builder body(DescribeZoneInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeZoneInfoResponse build() {
            return new DescribeZoneInfoResponse(this);
        } 

    } 

}
