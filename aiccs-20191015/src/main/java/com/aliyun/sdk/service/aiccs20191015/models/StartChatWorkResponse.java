// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartChatWorkResponse} extends {@link TeaModel}
 *
 * <p>StartChatWorkResponse</p>
 */
public class StartChatWorkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartChatWorkResponseBody body;

    private StartChatWorkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartChatWorkResponse create() {
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
    public StartChatWorkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartChatWorkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartChatWorkResponseBody body);

        @Override
        StartChatWorkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartChatWorkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartChatWorkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartChatWorkResponse response) {
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
        public Builder body(StartChatWorkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartChatWorkResponse build() {
            return new StartChatWorkResponse(this);
        } 

    } 

}
