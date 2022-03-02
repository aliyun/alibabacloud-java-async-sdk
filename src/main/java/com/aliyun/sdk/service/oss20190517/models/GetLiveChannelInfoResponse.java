// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetLiveChannelInfoResponse} extends {@link TeaModel}
 *
 * <p>GetLiveChannelInfoResponse</p>
 */
public class GetLiveChannelInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLiveChannelInfoResponseBody body;

    private GetLiveChannelInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLiveChannelInfoResponse create() {
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
    public GetLiveChannelInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLiveChannelInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLiveChannelInfoResponseBody body);

        @Override
        GetLiveChannelInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLiveChannelInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLiveChannelInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLiveChannelInfoResponse response) {
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
        public Builder body(GetLiveChannelInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLiveChannelInfoResponse build() {
            return new GetLiveChannelInfoResponse(this);
        } 

    } 

}
