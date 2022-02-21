// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetVsStreamsNotifyUrlConfigResponse} extends {@link TeaModel}
 *
 * <p>SetVsStreamsNotifyUrlConfigResponse</p>
 */
public class SetVsStreamsNotifyUrlConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetVsStreamsNotifyUrlConfigResponseBody body;

    private SetVsStreamsNotifyUrlConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetVsStreamsNotifyUrlConfigResponse create() {
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
    public SetVsStreamsNotifyUrlConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetVsStreamsNotifyUrlConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetVsStreamsNotifyUrlConfigResponseBody body);

        @Override
        SetVsStreamsNotifyUrlConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetVsStreamsNotifyUrlConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetVsStreamsNotifyUrlConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetVsStreamsNotifyUrlConfigResponse response) {
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
        public Builder body(SetVsStreamsNotifyUrlConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetVsStreamsNotifyUrlConfigResponse build() {
            return new SetVsStreamsNotifyUrlConfigResponse(this);
        } 

    } 

}
