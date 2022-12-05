// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageToGroupResponse} extends {@link TeaModel}
 *
 * <p>SendMessageToGroupResponse</p>
 */
public class SendMessageToGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendMessageToGroupResponseBody body;

    private SendMessageToGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendMessageToGroupResponse create() {
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
    public SendMessageToGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendMessageToGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendMessageToGroupResponseBody body);

        @Override
        SendMessageToGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendMessageToGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendMessageToGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendMessageToGroupResponse response) {
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
        public Builder body(SendMessageToGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendMessageToGroupResponse build() {
            return new SendMessageToGroupResponse(this);
        } 

    } 

}
