// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveHotelResponse} extends {@link TeaModel}
 *
 * <p>RemoveHotelResponse</p>
 */
public class RemoveHotelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveHotelResponseBody body;

    private RemoveHotelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveHotelResponse create() {
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
    public RemoveHotelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveHotelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveHotelResponseBody body);

        @Override
        RemoveHotelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveHotelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveHotelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveHotelResponse response) {
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
        public Builder body(RemoveHotelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveHotelResponse build() {
            return new RemoveHotelResponse(this);
        } 

    } 

}
