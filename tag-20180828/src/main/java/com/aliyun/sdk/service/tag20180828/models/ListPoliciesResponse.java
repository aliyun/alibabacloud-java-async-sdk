// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPoliciesResponse} extends {@link TeaModel}
 *
 * <p>ListPoliciesResponse</p>
 */
public class ListPoliciesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPoliciesResponseBody body;

    private ListPoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPoliciesResponse create() {
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
    public ListPoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPoliciesResponseBody body);

        @Override
        ListPoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPoliciesResponse response) {
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
        public Builder body(ListPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPoliciesResponse build() {
            return new ListPoliciesResponse(this);
        } 

    } 

}
