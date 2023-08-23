// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHotelAlarmResponse} extends {@link TeaModel}
 *
 * <p>UpdateHotelAlarmResponse</p>
 */
public class UpdateHotelAlarmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateHotelAlarmResponseBody body;

    private UpdateHotelAlarmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateHotelAlarmResponse create() {
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
    public UpdateHotelAlarmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateHotelAlarmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateHotelAlarmResponseBody body);

        @Override
        UpdateHotelAlarmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateHotelAlarmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateHotelAlarmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateHotelAlarmResponse response) {
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
        public Builder body(UpdateHotelAlarmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateHotelAlarmResponse build() {
            return new UpdateHotelAlarmResponse(this);
        } 

    } 

}
