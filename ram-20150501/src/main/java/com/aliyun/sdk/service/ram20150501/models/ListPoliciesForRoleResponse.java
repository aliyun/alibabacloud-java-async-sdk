// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPoliciesForRoleResponse} extends {@link TeaModel}
 *
 * <p>ListPoliciesForRoleResponse</p>
 */
public class ListPoliciesForRoleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPoliciesForRoleResponseBody body;

    private ListPoliciesForRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPoliciesForRoleResponse create() {
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
    public ListPoliciesForRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPoliciesForRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPoliciesForRoleResponseBody body);

        @Override
        ListPoliciesForRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPoliciesForRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPoliciesForRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPoliciesForRoleResponse response) {
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
        public Builder body(ListPoliciesForRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPoliciesForRoleResponse build() {
            return new ListPoliciesForRoleResponse(this);
        } 

    } 

}
