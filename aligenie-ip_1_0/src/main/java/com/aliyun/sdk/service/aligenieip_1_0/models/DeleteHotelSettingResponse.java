// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHotelSettingResponse} extends {@link TeaModel}
 *
 * <p>DeleteHotelSettingResponse</p>
 */
public class DeleteHotelSettingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteHotelSettingResponseBody body;

    private DeleteHotelSettingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteHotelSettingResponse create() {
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
    public DeleteHotelSettingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHotelSettingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteHotelSettingResponseBody body);

        @Override
        DeleteHotelSettingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHotelSettingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteHotelSettingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHotelSettingResponse response) {
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
        public Builder body(DeleteHotelSettingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHotelSettingResponse build() {
            return new DeleteHotelSettingResponse(this);
        } 

    } 

}
