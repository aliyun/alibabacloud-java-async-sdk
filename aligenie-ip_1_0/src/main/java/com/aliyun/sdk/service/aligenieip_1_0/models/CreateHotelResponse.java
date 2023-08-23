// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHotelResponse} extends {@link TeaModel}
 *
 * <p>CreateHotelResponse</p>
 */
public class CreateHotelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHotelResponseBody body;

    private CreateHotelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHotelResponse create() {
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
    public CreateHotelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHotelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHotelResponseBody body);

        @Override
        CreateHotelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHotelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHotelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHotelResponse response) {
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
        public Builder body(CreateHotelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHotelResponse build() {
            return new CreateHotelResponse(this);
        } 

    } 

}
