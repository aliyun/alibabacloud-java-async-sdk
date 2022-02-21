// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobOutputStatisticInfoResponse} extends {@link TeaModel}
 *
 * <p>GetJobOutputStatisticInfoResponse</p>
 */
public class GetJobOutputStatisticInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetJobOutputStatisticInfoResponseBody body;

    private GetJobOutputStatisticInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetJobOutputStatisticInfoResponse create() {
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
    public GetJobOutputStatisticInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetJobOutputStatisticInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetJobOutputStatisticInfoResponseBody body);

        @Override
        GetJobOutputStatisticInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetJobOutputStatisticInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetJobOutputStatisticInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetJobOutputStatisticInfoResponse response) {
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
        public Builder body(GetJobOutputStatisticInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetJobOutputStatisticInfoResponse build() {
            return new GetJobOutputStatisticInfoResponse(this);
        } 

    } 

}
