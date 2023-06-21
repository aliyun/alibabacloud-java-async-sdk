// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageToGlobeResponse} extends {@link TeaModel}
 *
 * <p>SendMessageToGlobeResponse</p>
 */
public class SendMessageToGlobeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendMessageToGlobeResponseBody body;

    private SendMessageToGlobeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendMessageToGlobeResponse create() {
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
    public SendMessageToGlobeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendMessageToGlobeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendMessageToGlobeResponseBody body);

        @Override
        SendMessageToGlobeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendMessageToGlobeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendMessageToGlobeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendMessageToGlobeResponse response) {
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
        public Builder body(SendMessageToGlobeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendMessageToGlobeResponse build() {
            return new SendMessageToGlobeResponse(this);
        } 

    } 

}
