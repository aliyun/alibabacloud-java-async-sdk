// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLiveStreamsNotifyUrlConfigResponse} extends {@link TeaModel}
 *
 * <p>SetLiveStreamsNotifyUrlConfigResponse</p>
 */
public class SetLiveStreamsNotifyUrlConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetLiveStreamsNotifyUrlConfigResponseBody body;

    private SetLiveStreamsNotifyUrlConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetLiveStreamsNotifyUrlConfigResponse create() {
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
    public SetLiveStreamsNotifyUrlConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetLiveStreamsNotifyUrlConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetLiveStreamsNotifyUrlConfigResponseBody body);

        @Override
        SetLiveStreamsNotifyUrlConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetLiveStreamsNotifyUrlConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetLiveStreamsNotifyUrlConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetLiveStreamsNotifyUrlConfigResponse response) {
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
        public Builder body(SetLiveStreamsNotifyUrlConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetLiveStreamsNotifyUrlConfigResponse build() {
            return new SetLiveStreamsNotifyUrlConfigResponse(this);
        } 

    } 

}
