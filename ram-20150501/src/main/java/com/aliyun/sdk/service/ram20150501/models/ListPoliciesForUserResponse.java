// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPoliciesForUserResponse} extends {@link TeaModel}
 *
 * <p>ListPoliciesForUserResponse</p>
 */
public class ListPoliciesForUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPoliciesForUserResponseBody body;

    private ListPoliciesForUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPoliciesForUserResponse create() {
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
    public ListPoliciesForUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPoliciesForUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPoliciesForUserResponseBody body);

        @Override
        ListPoliciesForUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPoliciesForUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPoliciesForUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPoliciesForUserResponse response) {
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
        public Builder body(ListPoliciesForUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPoliciesForUserResponse build() {
            return new ListPoliciesForUserResponse(this);
        } 

    } 

}
