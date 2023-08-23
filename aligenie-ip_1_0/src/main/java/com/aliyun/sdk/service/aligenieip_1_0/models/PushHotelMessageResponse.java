// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushHotelMessageResponse} extends {@link TeaModel}
 *
 * <p>PushHotelMessageResponse</p>
 */
public class PushHotelMessageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushHotelMessageResponseBody body;

    private PushHotelMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushHotelMessageResponse create() {
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
    public PushHotelMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushHotelMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushHotelMessageResponseBody body);

        @Override
        PushHotelMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushHotelMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushHotelMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushHotelMessageResponse response) {
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
        public Builder body(PushHotelMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushHotelMessageResponse build() {
            return new PushHotelMessageResponse(this);
        } 

    } 

}
