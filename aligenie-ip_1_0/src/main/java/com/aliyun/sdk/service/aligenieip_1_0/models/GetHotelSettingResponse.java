// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotelSettingResponse} extends {@link TeaModel}
 *
 * <p>GetHotelSettingResponse</p>
 */
public class GetHotelSettingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotelSettingResponseBody body;

    private GetHotelSettingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotelSettingResponse create() {
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
    public GetHotelSettingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotelSettingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotelSettingResponseBody body);

        @Override
        GetHotelSettingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotelSettingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotelSettingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotelSettingResponse response) {
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
        public Builder body(GetHotelSettingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotelSettingResponse build() {
            return new GetHotelSettingResponse(this);
        } 

    } 

}
