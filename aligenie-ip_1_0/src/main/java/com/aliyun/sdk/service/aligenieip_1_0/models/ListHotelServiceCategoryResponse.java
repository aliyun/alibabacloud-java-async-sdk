// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelServiceCategoryResponse} extends {@link TeaModel}
 *
 * <p>ListHotelServiceCategoryResponse</p>
 */
public class ListHotelServiceCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHotelServiceCategoryResponseBody body;

    private ListHotelServiceCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHotelServiceCategoryResponse create() {
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
    public ListHotelServiceCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHotelServiceCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHotelServiceCategoryResponseBody body);

        @Override
        ListHotelServiceCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHotelServiceCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHotelServiceCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHotelServiceCategoryResponse response) {
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
        public Builder body(ListHotelServiceCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHotelServiceCategoryResponse build() {
            return new ListHotelServiceCategoryResponse(this);
        } 

    } 

}
