// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelInfoResponse} extends {@link TeaModel}
 *
 * <p>ListHotelInfoResponse</p>
 */
public class ListHotelInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHotelInfoResponseBody body;

    private ListHotelInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHotelInfoResponse create() {
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
    public ListHotelInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHotelInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHotelInfoResponseBody body);

        @Override
        ListHotelInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHotelInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHotelInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHotelInfoResponse response) {
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
        public Builder body(ListHotelInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHotelInfoResponse build() {
            return new ListHotelInfoResponse(this);
        } 

    } 

}
