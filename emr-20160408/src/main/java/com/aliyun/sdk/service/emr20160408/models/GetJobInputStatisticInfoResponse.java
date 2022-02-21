// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobInputStatisticInfoResponse} extends {@link TeaModel}
 *
 * <p>GetJobInputStatisticInfoResponse</p>
 */
public class GetJobInputStatisticInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetJobInputStatisticInfoResponseBody body;

    private GetJobInputStatisticInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetJobInputStatisticInfoResponse create() {
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
    public GetJobInputStatisticInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetJobInputStatisticInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetJobInputStatisticInfoResponseBody body);

        @Override
        GetJobInputStatisticInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetJobInputStatisticInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetJobInputStatisticInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetJobInputStatisticInfoResponse response) {
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
        public Builder body(GetJobInputStatisticInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetJobInputStatisticInfoResponse build() {
            return new GetJobInputStatisticInfoResponse(this);
        } 

    } 

}
