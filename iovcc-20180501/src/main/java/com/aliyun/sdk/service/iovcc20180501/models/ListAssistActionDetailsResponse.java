// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssistActionDetailsResponse} extends {@link TeaModel}
 *
 * <p>ListAssistActionDetailsResponse</p>
 */
public class ListAssistActionDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAssistActionDetailsResponseBody body;

    private ListAssistActionDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAssistActionDetailsResponse create() {
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
    public ListAssistActionDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAssistActionDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAssistActionDetailsResponseBody body);

        @Override
        ListAssistActionDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAssistActionDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAssistActionDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAssistActionDetailsResponse response) {
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
        public Builder body(ListAssistActionDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAssistActionDetailsResponse build() {
            return new ListAssistActionDetailsResponse(this);
        } 

    } 

}
