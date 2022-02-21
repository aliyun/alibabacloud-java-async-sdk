// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepoTagResponse} extends {@link TeaModel}
 *
 * <p>ListRepoTagResponse</p>
 */
public class ListRepoTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRepoTagResponseBody body;

    private ListRepoTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRepoTagResponse create() {
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
    public ListRepoTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRepoTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRepoTagResponseBody body);

        @Override
        ListRepoTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRepoTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRepoTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRepoTagResponse response) {
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
        public Builder body(ListRepoTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRepoTagResponse build() {
            return new ListRepoTagResponse(this);
        } 

    } 

}
