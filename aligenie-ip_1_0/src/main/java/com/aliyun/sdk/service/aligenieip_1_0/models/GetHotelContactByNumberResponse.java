// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotelContactByNumberResponse} extends {@link TeaModel}
 *
 * <p>GetHotelContactByNumberResponse</p>
 */
public class GetHotelContactByNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotelContactByNumberResponseBody body;

    private GetHotelContactByNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotelContactByNumberResponse create() {
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
    public GetHotelContactByNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotelContactByNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotelContactByNumberResponseBody body);

        @Override
        GetHotelContactByNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotelContactByNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotelContactByNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotelContactByNumberResponse response) {
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
        public Builder body(GetHotelContactByNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotelContactByNumberResponse build() {
            return new GetHotelContactByNumberResponse(this);
        } 

    } 

}
