// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelSceneBookItemsResponse} extends {@link TeaModel}
 *
 * <p>ListHotelSceneBookItemsResponse</p>
 */
public class ListHotelSceneBookItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHotelSceneBookItemsResponseBody body;

    private ListHotelSceneBookItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHotelSceneBookItemsResponse create() {
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
    public ListHotelSceneBookItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHotelSceneBookItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHotelSceneBookItemsResponseBody body);

        @Override
        ListHotelSceneBookItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHotelSceneBookItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHotelSceneBookItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHotelSceneBookItemsResponse response) {
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
        public Builder body(ListHotelSceneBookItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHotelSceneBookItemsResponse build() {
            return new ListHotelSceneBookItemsResponse(this);
        } 

    } 

}
