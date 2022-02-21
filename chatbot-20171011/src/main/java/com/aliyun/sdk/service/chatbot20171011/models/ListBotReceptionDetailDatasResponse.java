// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBotReceptionDetailDatasResponse} extends {@link TeaModel}
 *
 * <p>ListBotReceptionDetailDatasResponse</p>
 */
public class ListBotReceptionDetailDatasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBotReceptionDetailDatasResponseBody body;

    private ListBotReceptionDetailDatasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBotReceptionDetailDatasResponse create() {
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
    public ListBotReceptionDetailDatasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBotReceptionDetailDatasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBotReceptionDetailDatasResponseBody body);

        @Override
        ListBotReceptionDetailDatasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBotReceptionDetailDatasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBotReceptionDetailDatasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBotReceptionDetailDatasResponse response) {
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
        public Builder body(ListBotReceptionDetailDatasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBotReceptionDetailDatasResponse build() {
            return new ListBotReceptionDetailDatasResponse(this);
        } 

    } 

}
