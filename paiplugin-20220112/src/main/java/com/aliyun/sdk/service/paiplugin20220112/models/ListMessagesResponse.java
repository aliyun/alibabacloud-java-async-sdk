// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessagesResponse} extends {@link TeaModel}
 *
 * <p>ListMessagesResponse</p>
 */
public class ListMessagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMessagesResponseBody body;

    private ListMessagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMessagesResponse create() {
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
    public ListMessagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMessagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMessagesResponseBody body);

        @Override
        ListMessagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMessagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMessagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMessagesResponse response) {
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
        public Builder body(ListMessagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMessagesResponse build() {
            return new ListMessagesResponse(this);
        } 

    } 

}
