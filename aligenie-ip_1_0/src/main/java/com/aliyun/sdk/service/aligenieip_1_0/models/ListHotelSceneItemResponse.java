// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelSceneItemResponse} extends {@link TeaModel}
 *
 * <p>ListHotelSceneItemResponse</p>
 */
public class ListHotelSceneItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHotelSceneItemResponseBody body;

    private ListHotelSceneItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHotelSceneItemResponse create() {
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
    public ListHotelSceneItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHotelSceneItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHotelSceneItemResponseBody body);

        @Override
        ListHotelSceneItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHotelSceneItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHotelSceneItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHotelSceneItemResponse response) {
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
        public Builder body(ListHotelSceneItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHotelSceneItemResponse build() {
            return new ListHotelSceneItemResponse(this);
        } 

    } 

}
