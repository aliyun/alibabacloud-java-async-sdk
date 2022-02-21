// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLiveStreamDelayConfigResponse} extends {@link TeaModel}
 *
 * <p>SetLiveStreamDelayConfigResponse</p>
 */
public class SetLiveStreamDelayConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetLiveStreamDelayConfigResponseBody body;

    private SetLiveStreamDelayConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetLiveStreamDelayConfigResponse create() {
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
    public SetLiveStreamDelayConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetLiveStreamDelayConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetLiveStreamDelayConfigResponseBody body);

        @Override
        SetLiveStreamDelayConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetLiveStreamDelayConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetLiveStreamDelayConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetLiveStreamDelayConfigResponse response) {
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
        public Builder body(SetLiveStreamDelayConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetLiveStreamDelayConfigResponse build() {
            return new SetLiveStreamDelayConfigResponse(this);
        } 

    } 

}
