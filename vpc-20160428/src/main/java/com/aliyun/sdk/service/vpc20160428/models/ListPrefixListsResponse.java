// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrefixListsResponse} extends {@link TeaModel}
 *
 * <p>ListPrefixListsResponse</p>
 */
public class ListPrefixListsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPrefixListsResponseBody body;

    private ListPrefixListsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPrefixListsResponse create() {
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
    public ListPrefixListsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPrefixListsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPrefixListsResponseBody body);

        @Override
        ListPrefixListsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPrefixListsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPrefixListsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPrefixListsResponse response) {
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
        public Builder body(ListPrefixListsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPrefixListsResponse build() {
            return new ListPrefixListsResponse(this);
        } 

    } 

}
