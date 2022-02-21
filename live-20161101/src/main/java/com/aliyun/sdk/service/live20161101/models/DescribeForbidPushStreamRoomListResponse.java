// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeForbidPushStreamRoomListResponse} extends {@link TeaModel}
 *
 * <p>DescribeForbidPushStreamRoomListResponse</p>
 */
public class DescribeForbidPushStreamRoomListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeForbidPushStreamRoomListResponseBody body;

    private DescribeForbidPushStreamRoomListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeForbidPushStreamRoomListResponse create() {
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
    public DescribeForbidPushStreamRoomListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeForbidPushStreamRoomListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeForbidPushStreamRoomListResponseBody body);

        @Override
        DescribeForbidPushStreamRoomListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeForbidPushStreamRoomListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeForbidPushStreamRoomListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeForbidPushStreamRoomListResponse response) {
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
        public Builder body(DescribeForbidPushStreamRoomListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeForbidPushStreamRoomListResponse build() {
            return new DescribeForbidPushStreamRoomListResponse(this);
        } 

    } 

}
