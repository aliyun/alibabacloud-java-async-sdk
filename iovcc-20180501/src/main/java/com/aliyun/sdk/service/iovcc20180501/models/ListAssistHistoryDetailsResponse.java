// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssistHistoryDetailsResponse} extends {@link TeaModel}
 *
 * <p>ListAssistHistoryDetailsResponse</p>
 */
public class ListAssistHistoryDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAssistHistoryDetailsResponseBody body;

    private ListAssistHistoryDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAssistHistoryDetailsResponse create() {
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
    public ListAssistHistoryDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAssistHistoryDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAssistHistoryDetailsResponseBody body);

        @Override
        ListAssistHistoryDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAssistHistoryDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAssistHistoryDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAssistHistoryDetailsResponse response) {
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
        public Builder body(ListAssistHistoryDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAssistHistoryDetailsResponse build() {
            return new ListAssistHistoryDetailsResponse(this);
        } 

    } 

}
