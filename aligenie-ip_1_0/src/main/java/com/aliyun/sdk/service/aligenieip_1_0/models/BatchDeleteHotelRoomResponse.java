// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteHotelRoomResponse} extends {@link TeaModel}
 *
 * <p>BatchDeleteHotelRoomResponse</p>
 */
public class BatchDeleteHotelRoomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchDeleteHotelRoomResponseBody body;

    private BatchDeleteHotelRoomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchDeleteHotelRoomResponse create() {
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
    public BatchDeleteHotelRoomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDeleteHotelRoomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchDeleteHotelRoomResponseBody body);

        @Override
        BatchDeleteHotelRoomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDeleteHotelRoomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchDeleteHotelRoomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDeleteHotelRoomResponse response) {
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
        public Builder body(BatchDeleteHotelRoomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDeleteHotelRoomResponse build() {
            return new BatchDeleteHotelRoomResponse(this);
        } 

    } 

}
