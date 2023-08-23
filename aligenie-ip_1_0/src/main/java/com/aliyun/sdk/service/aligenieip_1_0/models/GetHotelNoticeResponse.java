// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotelNoticeResponse} extends {@link TeaModel}
 *
 * <p>GetHotelNoticeResponse</p>
 */
public class GetHotelNoticeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotelNoticeResponseBody body;

    private GetHotelNoticeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotelNoticeResponse create() {
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
    public GetHotelNoticeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotelNoticeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotelNoticeResponseBody body);

        @Override
        GetHotelNoticeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotelNoticeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotelNoticeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotelNoticeResponse response) {
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
        public Builder body(GetHotelNoticeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotelNoticeResponse build() {
            return new GetHotelNoticeResponse(this);
        } 

    } 

}
