// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAclRelationsResponse} extends {@link TeaModel}
 *
 * <p>ListAclRelationsResponse</p>
 */
public class ListAclRelationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAclRelationsResponseBody body;

    private ListAclRelationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAclRelationsResponse create() {
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
    public ListAclRelationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAclRelationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAclRelationsResponseBody body);

        @Override
        ListAclRelationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAclRelationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAclRelationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAclRelationsResponse response) {
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
        public Builder body(ListAclRelationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAclRelationsResponse build() {
            return new ListAclRelationsResponse(this);
        } 

    } 

}
