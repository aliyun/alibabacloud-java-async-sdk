// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserInputStatisticInfoResponse} extends {@link TeaModel}
 *
 * <p>GetUserInputStatisticInfoResponse</p>
 */
public class GetUserInputStatisticInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserInputStatisticInfoResponseBody body;

    private GetUserInputStatisticInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserInputStatisticInfoResponse create() {
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
    public GetUserInputStatisticInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserInputStatisticInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserInputStatisticInfoResponseBody body);

        @Override
        GetUserInputStatisticInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserInputStatisticInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserInputStatisticInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserInputStatisticInfoResponse response) {
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
        public Builder body(GetUserInputStatisticInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserInputStatisticInfoResponse build() {
            return new GetUserInputStatisticInfoResponse(this);
        } 

    } 

}
