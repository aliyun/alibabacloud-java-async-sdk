// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
    private ListAliasesOutput body;

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
    public ListAliasesOutput getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAliasesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAliasesOutput body);

        @Override
        ListAliasesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAliasesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAliasesOutput body; 

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
        public Builder body(ListAliasesOutput body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAliasesResponse build() {
            return new ListAliasesResponse(this);
        } 

    } 

}
