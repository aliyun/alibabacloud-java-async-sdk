// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCustomMessageToUsersResponse} extends {@link TeaModel}
 *
 * <p>SendCustomMessageToUsersResponse</p>
 */
public class SendCustomMessageToUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendCustomMessageToUsersResponseBody body;

    private SendCustomMessageToUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendCustomMessageToUsersResponse create() {
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
    public SendCustomMessageToUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendCustomMessageToUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendCustomMessageToUsersResponseBody body);

        @Override
        SendCustomMessageToUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendCustomMessageToUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendCustomMessageToUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendCustomMessageToUsersResponse response) {
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
        public Builder body(SendCustomMessageToUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendCustomMessageToUsersResponse build() {
            return new SendCustomMessageToUsersResponse(this);
        } 

    } 

}
