// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCustomMessageToAllResponse} extends {@link TeaModel}
 *
 * <p>SendCustomMessageToAllResponse</p>
 */
public class SendCustomMessageToAllResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendCustomMessageToAllResponseBody body;

    private SendCustomMessageToAllResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendCustomMessageToAllResponse create() {
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
    public SendCustomMessageToAllResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendCustomMessageToAllResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendCustomMessageToAllResponseBody body);

        @Override
        SendCustomMessageToAllResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendCustomMessageToAllResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendCustomMessageToAllResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendCustomMessageToAllResponse response) {
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
        public Builder body(SendCustomMessageToAllResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendCustomMessageToAllResponse build() {
            return new SendCustomMessageToAllResponse(this);
        } 

    } 

}
