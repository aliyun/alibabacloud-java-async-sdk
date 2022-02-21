// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChainInstanceResponse} extends {@link TeaModel}
 *
 * <p>ListChainInstanceResponse</p>
 */
public class ListChainInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListChainInstanceResponseBody body;

    private ListChainInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListChainInstanceResponse create() {
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
    public ListChainInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListChainInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListChainInstanceResponseBody body);

        @Override
        ListChainInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListChainInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListChainInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListChainInstanceResponse response) {
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
        public Builder body(ListChainInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListChainInstanceResponse build() {
            return new ListChainInstanceResponse(this);
        } 

    } 

}
