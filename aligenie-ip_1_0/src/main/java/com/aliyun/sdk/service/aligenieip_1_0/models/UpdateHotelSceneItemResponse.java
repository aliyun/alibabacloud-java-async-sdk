// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHotelSceneItemResponse} extends {@link TeaModel}
 *
 * <p>UpdateHotelSceneItemResponse</p>
 */
public class UpdateHotelSceneItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateHotelSceneItemResponseBody body;

    private UpdateHotelSceneItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateHotelSceneItemResponse create() {
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
    public UpdateHotelSceneItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateHotelSceneItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateHotelSceneItemResponseBody body);

        @Override
        UpdateHotelSceneItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateHotelSceneItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateHotelSceneItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateHotelSceneItemResponse response) {
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
        public Builder body(UpdateHotelSceneItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateHotelSceneItemResponse build() {
            return new UpdateHotelSceneItemResponse(this);
        } 

    } 

}
