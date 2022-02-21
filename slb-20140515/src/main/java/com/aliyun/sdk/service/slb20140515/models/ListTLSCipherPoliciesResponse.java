// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTLSCipherPoliciesResponse} extends {@link TeaModel}
 *
 * <p>ListTLSCipherPoliciesResponse</p>
 */
public class ListTLSCipherPoliciesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTLSCipherPoliciesResponseBody body;

    private ListTLSCipherPoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTLSCipherPoliciesResponse create() {
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
    public ListTLSCipherPoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTLSCipherPoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTLSCipherPoliciesResponseBody body);

        @Override
        ListTLSCipherPoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTLSCipherPoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTLSCipherPoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTLSCipherPoliciesResponse response) {
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
        public Builder body(ListTLSCipherPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTLSCipherPoliciesResponse build() {
            return new ListTLSCipherPoliciesResponse(this);
        } 

    } 

}
