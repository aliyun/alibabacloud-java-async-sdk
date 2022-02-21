// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEstimateFeeInfoResponse} extends {@link TeaModel}
 *
 * <p>GetEstimateFeeInfoResponse</p>
 */
public class GetEstimateFeeInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEstimateFeeInfoResponseBody body;

    private GetEstimateFeeInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEstimateFeeInfoResponse create() {
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
    public GetEstimateFeeInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEstimateFeeInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEstimateFeeInfoResponseBody body);

        @Override
        GetEstimateFeeInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEstimateFeeInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEstimateFeeInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEstimateFeeInfoResponse response) {
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
        public Builder body(GetEstimateFeeInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEstimateFeeInfoResponse build() {
            return new GetEstimateFeeInfoResponse(this);
        } 

    } 

}
