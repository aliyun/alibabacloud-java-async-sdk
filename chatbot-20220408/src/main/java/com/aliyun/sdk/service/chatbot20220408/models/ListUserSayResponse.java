// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserSayResponse} extends {@link TeaModel}
 *
 * <p>ListUserSayResponse</p>
 */
public class ListUserSayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserSayResponseBody body;

    private ListUserSayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserSayResponse create() {
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
    public ListUserSayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserSayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserSayResponseBody body);

        @Override
        ListUserSayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserSayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserSayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserSayResponse response) {
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
        public Builder body(ListUserSayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserSayResponse build() {
            return new ListUserSayResponse(this);
        } 

    } 

}
