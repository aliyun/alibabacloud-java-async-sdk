// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBotDsDetailsResponse} extends {@link TeaModel}
 *
 * <p>ListBotDsDetailsResponse</p>
 */
public class ListBotDsDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBotDsDetailsResponseBody body;

    private ListBotDsDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBotDsDetailsResponse create() {
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
    public ListBotDsDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBotDsDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBotDsDetailsResponseBody body);

        @Override
        ListBotDsDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBotDsDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBotDsDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBotDsDetailsResponse response) {
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
        public Builder body(ListBotDsDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBotDsDetailsResponse build() {
            return new ListBotDsDetailsResponse(this);
        } 

    } 

}
