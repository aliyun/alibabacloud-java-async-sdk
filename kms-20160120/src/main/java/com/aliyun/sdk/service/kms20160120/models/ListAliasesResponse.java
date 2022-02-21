// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAliasesResponse} extends {@link TeaModel}
 *
 * <p>ListAliasesResponse</p>
 */
public class ListAliasesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAliasesResponseBody body;

    private ListAliasesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAliasesResponse create() {
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
    public ListAliasesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAliasesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAliasesResponseBody body);

        @Override
        ListAliasesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAliasesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAliasesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAliasesResponse response) {
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
        public Builder body(ListAliasesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAliasesResponse build() {
            return new ListAliasesResponse(this);
        } 

    } 

}
