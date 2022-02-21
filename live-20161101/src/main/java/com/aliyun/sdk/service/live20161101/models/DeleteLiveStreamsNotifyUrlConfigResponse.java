// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveStreamsNotifyUrlConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteLiveStreamsNotifyUrlConfigResponse</p>
 */
public class DeleteLiveStreamsNotifyUrlConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLiveStreamsNotifyUrlConfigResponseBody body;

    private DeleteLiveStreamsNotifyUrlConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLiveStreamsNotifyUrlConfigResponse create() {
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
    public DeleteLiveStreamsNotifyUrlConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLiveStreamsNotifyUrlConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLiveStreamsNotifyUrlConfigResponseBody body);

        @Override
        DeleteLiveStreamsNotifyUrlConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLiveStreamsNotifyUrlConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLiveStreamsNotifyUrlConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLiveStreamsNotifyUrlConfigResponse response) {
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
        public Builder body(DeleteLiveStreamsNotifyUrlConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLiveStreamsNotifyUrlConfigResponse build() {
            return new DeleteLiveStreamsNotifyUrlConfigResponse(this);
        } 

    } 

}
