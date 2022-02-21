// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAclsResponse} extends {@link TeaModel}
 *
 * <p>ListAclsResponse</p>
 */
public class ListAclsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAclsResponseBody body;

    private ListAclsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAclsResponse create() {
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
    public ListAclsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAclsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAclsResponseBody body);

        @Override
        ListAclsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAclsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAclsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAclsResponse response) {
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
        public Builder body(ListAclsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAclsResponse build() {
            return new ListAclsResponse(this);
        } 

    } 

}
