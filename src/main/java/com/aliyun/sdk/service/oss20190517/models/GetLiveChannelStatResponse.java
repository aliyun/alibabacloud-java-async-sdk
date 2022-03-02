// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetLiveChannelStatResponse} extends {@link TeaModel}
 *
 * <p>GetLiveChannelStatResponse</p>
 */
public class GetLiveChannelStatResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLiveChannelStatResponseBody body;

    private GetLiveChannelStatResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLiveChannelStatResponse create() {
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
    public GetLiveChannelStatResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLiveChannelStatResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLiveChannelStatResponseBody body);

        @Override
        GetLiveChannelStatResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLiveChannelStatResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLiveChannelStatResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLiveChannelStatResponse response) {
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
        public Builder body(GetLiveChannelStatResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLiveChannelStatResponse build() {
            return new GetLiveChannelStatResponse(this);
        } 

    } 

}
