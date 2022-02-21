// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOfflineMessagesResponse} extends {@link TeaModel}
 *
 * <p>ListOfflineMessagesResponse</p>
 */
public class ListOfflineMessagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOfflineMessagesResponseBody body;

    private ListOfflineMessagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOfflineMessagesResponse create() {
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
    public ListOfflineMessagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOfflineMessagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOfflineMessagesResponseBody body);

        @Override
        ListOfflineMessagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOfflineMessagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOfflineMessagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOfflineMessagesResponse response) {
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
        public Builder body(ListOfflineMessagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOfflineMessagesResponse build() {
            return new ListOfflineMessagesResponse(this);
        } 

    } 

}
