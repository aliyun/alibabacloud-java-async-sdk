// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationsForPrivateAccessPolicyResponse} extends {@link TeaModel}
 *
 * <p>ListApplicationsForPrivateAccessPolicyResponse</p>
 */
public class ListApplicationsForPrivateAccessPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListApplicationsForPrivateAccessPolicyResponseBody body;

    private ListApplicationsForPrivateAccessPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListApplicationsForPrivateAccessPolicyResponse create() {
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
    public ListApplicationsForPrivateAccessPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListApplicationsForPrivateAccessPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListApplicationsForPrivateAccessPolicyResponseBody body);

        @Override
        ListApplicationsForPrivateAccessPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListApplicationsForPrivateAccessPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListApplicationsForPrivateAccessPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListApplicationsForPrivateAccessPolicyResponse response) {
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
        public Builder body(ListApplicationsForPrivateAccessPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListApplicationsForPrivateAccessPolicyResponse build() {
            return new ListApplicationsForPrivateAccessPolicyResponse(this);
        } 

    } 

}
