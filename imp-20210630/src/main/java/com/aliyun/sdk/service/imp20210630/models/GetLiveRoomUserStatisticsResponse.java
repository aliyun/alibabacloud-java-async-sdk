// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveRoomUserStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetLiveRoomUserStatisticsResponse</p>
 */
public class GetLiveRoomUserStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLiveRoomUserStatisticsResponseBody body;

    private GetLiveRoomUserStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLiveRoomUserStatisticsResponse create() {
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
    public GetLiveRoomUserStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLiveRoomUserStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLiveRoomUserStatisticsResponseBody body);

        @Override
        GetLiveRoomUserStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLiveRoomUserStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLiveRoomUserStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLiveRoomUserStatisticsResponse response) {
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
        public Builder body(GetLiveRoomUserStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLiveRoomUserStatisticsResponse build() {
            return new GetLiveRoomUserStatisticsResponse(this);
        } 

    } 

}
