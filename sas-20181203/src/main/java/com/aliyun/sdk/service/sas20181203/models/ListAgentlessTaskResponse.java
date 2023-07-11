// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentlessTaskResponse} extends {@link TeaModel}
 *
 * <p>ListAgentlessTaskResponse</p>
 */
public class ListAgentlessTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAgentlessTaskResponseBody body;

    private ListAgentlessTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAgentlessTaskResponse create() {
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
    public ListAgentlessTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAgentlessTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAgentlessTaskResponseBody body);

        @Override
        ListAgentlessTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAgentlessTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAgentlessTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAgentlessTaskResponse response) {
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
        public Builder body(ListAgentlessTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAgentlessTaskResponse build() {
            return new ListAgentlessTaskResponse(this);
        } 

    } 

}
