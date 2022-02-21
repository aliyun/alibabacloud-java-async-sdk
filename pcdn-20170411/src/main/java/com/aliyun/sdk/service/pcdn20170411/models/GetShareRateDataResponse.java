// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetShareRateDataResponse} extends {@link TeaModel}
 *
 * <p>GetShareRateDataResponse</p>
 */
public class GetShareRateDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetShareRateDataResponseBody body;

    private GetShareRateDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetShareRateDataResponse create() {
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
    public GetShareRateDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetShareRateDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetShareRateDataResponseBody body);

        @Override
        GetShareRateDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetShareRateDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetShareRateDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetShareRateDataResponse response) {
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
        public Builder body(GetShareRateDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetShareRateDataResponse build() {
            return new GetShareRateDataResponse(this);
        } 

    } 

}
