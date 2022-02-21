// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRoomResponse} extends {@link TeaModel}
 *
 * <p>GetRoomResponse</p>
 */
public class GetRoomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRoomResponseBody body;

    private GetRoomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRoomResponse create() {
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
    public GetRoomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRoomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRoomResponseBody body);

        @Override
        GetRoomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRoomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRoomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRoomResponse response) {
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
        public Builder body(GetRoomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRoomResponse build() {
            return new GetRoomResponse(this);
        } 

    } 

}
