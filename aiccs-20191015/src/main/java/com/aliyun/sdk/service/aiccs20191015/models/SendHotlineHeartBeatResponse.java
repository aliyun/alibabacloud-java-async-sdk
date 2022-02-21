// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendHotlineHeartBeatResponse} extends {@link TeaModel}
 *
 * <p>SendHotlineHeartBeatResponse</p>
 */
public class SendHotlineHeartBeatResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendHotlineHeartBeatResponseBody body;

    private SendHotlineHeartBeatResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendHotlineHeartBeatResponse create() {
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
    public SendHotlineHeartBeatResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendHotlineHeartBeatResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendHotlineHeartBeatResponseBody body);

        @Override
        SendHotlineHeartBeatResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendHotlineHeartBeatResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendHotlineHeartBeatResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendHotlineHeartBeatResponse response) {
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
        public Builder body(SendHotlineHeartBeatResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendHotlineHeartBeatResponse build() {
            return new SendHotlineHeartBeatResponse(this);
        } 

    } 

}
