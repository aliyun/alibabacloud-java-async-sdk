// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRealTimeAgentResponse} extends {@link TeaModel}
 *
 * <p>ListRealTimeAgentResponse</p>
 */
public class ListRealTimeAgentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRealTimeAgentResponseBody body;

    private ListRealTimeAgentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRealTimeAgentResponse create() {
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
    public ListRealTimeAgentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRealTimeAgentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRealTimeAgentResponseBody body);

        @Override
        ListRealTimeAgentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRealTimeAgentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRealTimeAgentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRealTimeAgentResponse response) {
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
        public Builder body(ListRealTimeAgentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRealTimeAgentResponse build() {
            return new ListRealTimeAgentResponse(this);
        } 

    } 

}
