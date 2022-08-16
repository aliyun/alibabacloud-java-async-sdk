// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotNodeResponse} extends {@link TeaModel}
 *
 * <p>ListHoneypotNodeResponse</p>
 */
public class ListHoneypotNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHoneypotNodeResponseBody body;

    private ListHoneypotNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHoneypotNodeResponse create() {
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
    public ListHoneypotNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHoneypotNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHoneypotNodeResponseBody body);

        @Override
        ListHoneypotNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHoneypotNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHoneypotNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHoneypotNodeResponse response) {
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
        public Builder body(ListHoneypotNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHoneypotNodeResponse build() {
            return new ListHoneypotNodeResponse(this);
        } 

    } 

}
