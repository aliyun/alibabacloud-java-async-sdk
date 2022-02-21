// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCoverRateDataResponse} extends {@link TeaModel}
 *
 * <p>GetCoverRateDataResponse</p>
 */
public class GetCoverRateDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCoverRateDataResponseBody body;

    private GetCoverRateDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCoverRateDataResponse create() {
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
    public GetCoverRateDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCoverRateDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCoverRateDataResponseBody body);

        @Override
        GetCoverRateDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCoverRateDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCoverRateDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCoverRateDataResponse response) {
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
        public Builder body(GetCoverRateDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCoverRateDataResponse build() {
            return new GetCoverRateDataResponse(this);
        } 

    } 

}
