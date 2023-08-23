// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHotelSceneBookItemResponse} extends {@link TeaModel}
 *
 * <p>DeleteHotelSceneBookItemResponse</p>
 */
public class DeleteHotelSceneBookItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteHotelSceneBookItemResponseBody body;

    private DeleteHotelSceneBookItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteHotelSceneBookItemResponse create() {
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
    public DeleteHotelSceneBookItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHotelSceneBookItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteHotelSceneBookItemResponseBody body);

        @Override
        DeleteHotelSceneBookItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHotelSceneBookItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteHotelSceneBookItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHotelSceneBookItemResponse response) {
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
        public Builder body(DeleteHotelSceneBookItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHotelSceneBookItemResponse build() {
            return new DeleteHotelSceneBookItemResponse(this);
        } 

    } 

}
