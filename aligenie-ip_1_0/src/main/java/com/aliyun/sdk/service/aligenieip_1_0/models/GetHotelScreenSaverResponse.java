// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotelScreenSaverResponse} extends {@link TeaModel}
 *
 * <p>GetHotelScreenSaverResponse</p>
 */
public class GetHotelScreenSaverResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotelScreenSaverResponseBody body;

    private GetHotelScreenSaverResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotelScreenSaverResponse create() {
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
    public GetHotelScreenSaverResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotelScreenSaverResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotelScreenSaverResponseBody body);

        @Override
        GetHotelScreenSaverResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotelScreenSaverResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotelScreenSaverResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotelScreenSaverResponse response) {
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
        public Builder body(GetHotelScreenSaverResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotelScreenSaverResponse build() {
            return new GetHotelScreenSaverResponse(this);
        } 

    } 

}
