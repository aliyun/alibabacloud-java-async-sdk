// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckChatappContactsResponse} extends {@link TeaModel}
 *
 * <p>CheckChatappContactsResponse</p>
 */
public class CheckChatappContactsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckChatappContactsResponseBody body;

    private CheckChatappContactsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckChatappContactsResponse create() {
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
    public CheckChatappContactsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckChatappContactsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckChatappContactsResponseBody body);

        @Override
        CheckChatappContactsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckChatappContactsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckChatappContactsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckChatappContactsResponse response) {
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
        public Builder body(CheckChatappContactsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckChatappContactsResponse build() {
            return new CheckChatappContactsResponse(this);
        } 

    } 

}
