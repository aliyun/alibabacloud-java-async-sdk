// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveRoomResponse} extends {@link TeaModel}
 *
 * <p>GetLiveRoomResponse</p>
 */
public class GetLiveRoomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLiveRoomResponseBody body;

    private GetLiveRoomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLiveRoomResponse create() {
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
    public GetLiveRoomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLiveRoomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLiveRoomResponseBody body);

        @Override
        GetLiveRoomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLiveRoomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLiveRoomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLiveRoomResponse response) {
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
        public Builder body(GetLiveRoomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLiveRoomResponse build() {
            return new GetLiveRoomResponse(this);
        } 

    } 

}
