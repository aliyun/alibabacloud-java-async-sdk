// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScriptsResponse} extends {@link TeaModel}
 *
 * <p>ListScriptsResponse</p>
 */
public class ListScriptsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListScriptsResponseBody body;

    private ListScriptsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListScriptsResponse create() {
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
    public ListScriptsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListScriptsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListScriptsResponseBody body);

        @Override
        ListScriptsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListScriptsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListScriptsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListScriptsResponse response) {
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
        public Builder body(ListScriptsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListScriptsResponse build() {
            return new ListScriptsResponse(this);
        } 

    } 

}
