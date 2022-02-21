// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBotHotDsDatasResponse} extends {@link TeaModel}
 *
 * <p>ListBotHotDsDatasResponse</p>
 */
public class ListBotHotDsDatasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBotHotDsDatasResponseBody body;

    private ListBotHotDsDatasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBotHotDsDatasResponse create() {
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
    public ListBotHotDsDatasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBotHotDsDatasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBotHotDsDatasResponseBody body);

        @Override
        ListBotHotDsDatasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBotHotDsDatasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBotHotDsDatasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBotHotDsDatasResponse response) {
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
        public Builder body(ListBotHotDsDatasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBotHotDsDatasResponse build() {
            return new ListBotHotDsDatasResponse(this);
        } 

    } 

}
