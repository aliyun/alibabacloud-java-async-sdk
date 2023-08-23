// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddOrUpdateHotelSettingResponse} extends {@link TeaModel}
 *
 * <p>AddOrUpdateHotelSettingResponse</p>
 */
public class AddOrUpdateHotelSettingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddOrUpdateHotelSettingResponseBody body;

    private AddOrUpdateHotelSettingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddOrUpdateHotelSettingResponse create() {
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
    public AddOrUpdateHotelSettingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddOrUpdateHotelSettingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddOrUpdateHotelSettingResponseBody body);

        @Override
        AddOrUpdateHotelSettingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddOrUpdateHotelSettingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddOrUpdateHotelSettingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddOrUpdateHotelSettingResponse response) {
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
        public Builder body(AddOrUpdateHotelSettingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddOrUpdateHotelSettingResponse build() {
            return new AddOrUpdateHotelSettingResponse(this);
        } 

    } 

}
