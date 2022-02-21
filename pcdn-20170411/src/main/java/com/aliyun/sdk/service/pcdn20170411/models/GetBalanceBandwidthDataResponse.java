// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBalanceBandwidthDataResponse} extends {@link TeaModel}
 *
 * <p>GetBalanceBandwidthDataResponse</p>
 */
public class GetBalanceBandwidthDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBalanceBandwidthDataResponseBody body;

    private GetBalanceBandwidthDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBalanceBandwidthDataResponse create() {
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
    public GetBalanceBandwidthDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBalanceBandwidthDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBalanceBandwidthDataResponseBody body);

        @Override
        GetBalanceBandwidthDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBalanceBandwidthDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBalanceBandwidthDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBalanceBandwidthDataResponse response) {
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
        public Builder body(GetBalanceBandwidthDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBalanceBandwidthDataResponse build() {
            return new GetBalanceBandwidthDataResponse(this);
        } 

    } 

}
