// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentStatesResponse} extends {@link TeaModel}
 *
 * <p>ListAgentStatesResponse</p>
 */
public class ListAgentStatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAgentStatesResponseBody body;

    private ListAgentStatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAgentStatesResponse create() {
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
    public ListAgentStatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAgentStatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAgentStatesResponseBody body);

        @Override
        ListAgentStatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAgentStatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAgentStatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAgentStatesResponse response) {
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
        public Builder body(ListAgentStatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAgentStatesResponse build() {
            return new ListAgentStatesResponse(this);
        } 

    } 

}
