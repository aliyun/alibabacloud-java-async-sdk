// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserOutputStatisticInfoResponse} extends {@link TeaModel}
 *
 * <p>GetUserOutputStatisticInfoResponse</p>
 */
public class GetUserOutputStatisticInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserOutputStatisticInfoResponseBody body;

    private GetUserOutputStatisticInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserOutputStatisticInfoResponse create() {
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
    public GetUserOutputStatisticInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserOutputStatisticInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserOutputStatisticInfoResponseBody body);

        @Override
        GetUserOutputStatisticInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserOutputStatisticInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserOutputStatisticInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserOutputStatisticInfoResponse response) {
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
        public Builder body(GetUserOutputStatisticInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserOutputStatisticInfoResponse build() {
            return new GetUserOutputStatisticInfoResponse(this);
        } 

    } 

}
