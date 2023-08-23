// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotelHomeBackImageAndModesResponse} extends {@link TeaModel}
 *
 * <p>GetHotelHomeBackImageAndModesResponse</p>
 */
public class GetHotelHomeBackImageAndModesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotelHomeBackImageAndModesResponseBody body;

    private GetHotelHomeBackImageAndModesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotelHomeBackImageAndModesResponse create() {
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
    public GetHotelHomeBackImageAndModesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotelHomeBackImageAndModesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotelHomeBackImageAndModesResponseBody body);

        @Override
        GetHotelHomeBackImageAndModesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotelHomeBackImageAndModesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotelHomeBackImageAndModesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotelHomeBackImageAndModesResponse response) {
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
        public Builder body(GetHotelHomeBackImageAndModesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotelHomeBackImageAndModesResponse build() {
            return new GetHotelHomeBackImageAndModesResponse(this);
        } 

    } 

}
