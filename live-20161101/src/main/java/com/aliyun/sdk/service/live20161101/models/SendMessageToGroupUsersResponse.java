// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageToGroupUsersResponse} extends {@link TeaModel}
 *
 * <p>SendMessageToGroupUsersResponse</p>
 */
public class SendMessageToGroupUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendMessageToGroupUsersResponseBody body;

    private SendMessageToGroupUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendMessageToGroupUsersResponse create() {
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
    public SendMessageToGroupUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendMessageToGroupUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendMessageToGroupUsersResponseBody body);

        @Override
        SendMessageToGroupUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendMessageToGroupUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendMessageToGroupUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendMessageToGroupUsersResponse response) {
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
        public Builder body(SendMessageToGroupUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendMessageToGroupUsersResponse build() {
            return new SendMessageToGroupUsersResponse(this);
        } 

    } 

}
