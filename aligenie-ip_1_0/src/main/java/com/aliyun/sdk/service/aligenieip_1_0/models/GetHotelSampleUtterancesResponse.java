// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotelSampleUtterancesResponse} extends {@link TeaModel}
 *
 * <p>GetHotelSampleUtterancesResponse</p>
 */
public class GetHotelSampleUtterancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotelSampleUtterancesResponseBody body;

    private GetHotelSampleUtterancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotelSampleUtterancesResponse create() {
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
    public GetHotelSampleUtterancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotelSampleUtterancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotelSampleUtterancesResponseBody body);

        @Override
        GetHotelSampleUtterancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotelSampleUtterancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotelSampleUtterancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotelSampleUtterancesResponse response) {
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
        public Builder body(GetHotelSampleUtterancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotelSampleUtterancesResponse build() {
            return new GetHotelSampleUtterancesResponse(this);
        } 

    } 

}
