// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHandshakesForAccountResponse} extends {@link TeaModel}
 *
 * <p>ListHandshakesForAccountResponse</p>
 */
public class ListHandshakesForAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHandshakesForAccountResponseBody body;

    private ListHandshakesForAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHandshakesForAccountResponse create() {
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
    public ListHandshakesForAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHandshakesForAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHandshakesForAccountResponseBody body);

        @Override
        ListHandshakesForAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHandshakesForAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHandshakesForAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHandshakesForAccountResponse response) {
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
        public Builder body(ListHandshakesForAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHandshakesForAccountResponse build() {
            return new ListHandshakesForAccountResponse(this);
        } 

    } 

}
