// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHotelAlarmResponse} extends {@link TeaModel}
 *
 * <p>CreateHotelAlarmResponse</p>
 */
public class CreateHotelAlarmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHotelAlarmResponseBody body;

    private CreateHotelAlarmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHotelAlarmResponse create() {
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
    public CreateHotelAlarmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHotelAlarmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHotelAlarmResponseBody body);

        @Override
        CreateHotelAlarmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHotelAlarmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHotelAlarmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHotelAlarmResponse response) {
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
        public Builder body(CreateHotelAlarmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHotelAlarmResponse build() {
            return new CreateHotelAlarmResponse(this);
        } 

    } 

}
