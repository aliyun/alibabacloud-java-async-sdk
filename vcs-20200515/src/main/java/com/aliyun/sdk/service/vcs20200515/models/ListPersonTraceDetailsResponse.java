// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPersonTraceDetailsResponse} extends {@link TeaModel}
 *
 * <p>ListPersonTraceDetailsResponse</p>
 */
public class ListPersonTraceDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPersonTraceDetailsResponseBody body;

    private ListPersonTraceDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPersonTraceDetailsResponse create() {
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
    public ListPersonTraceDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPersonTraceDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPersonTraceDetailsResponseBody body);

        @Override
        ListPersonTraceDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPersonTraceDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPersonTraceDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPersonTraceDetailsResponse response) {
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
        public Builder body(ListPersonTraceDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPersonTraceDetailsResponse build() {
            return new ListPersonTraceDetailsResponse(this);
        } 

    } 

}
