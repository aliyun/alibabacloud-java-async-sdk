// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIpsetsBandwidthLimitResponse} extends {@link TeaModel}
 *
 * <p>GetIpsetsBandwidthLimitResponse</p>
 */
public class GetIpsetsBandwidthLimitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIpsetsBandwidthLimitResponseBody body;

    private GetIpsetsBandwidthLimitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIpsetsBandwidthLimitResponse create() {
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
    public GetIpsetsBandwidthLimitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIpsetsBandwidthLimitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIpsetsBandwidthLimitResponseBody body);

        @Override
        GetIpsetsBandwidthLimitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIpsetsBandwidthLimitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIpsetsBandwidthLimitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIpsetsBandwidthLimitResponse response) {
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
        public Builder body(GetIpsetsBandwidthLimitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIpsetsBandwidthLimitResponse build() {
            return new GetIpsetsBandwidthLimitResponse(this);
        } 

    } 

}
