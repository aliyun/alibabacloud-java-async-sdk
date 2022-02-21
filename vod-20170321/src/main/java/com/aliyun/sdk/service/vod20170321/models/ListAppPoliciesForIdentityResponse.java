// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppPoliciesForIdentityResponse} extends {@link TeaModel}
 *
 * <p>ListAppPoliciesForIdentityResponse</p>
 */
public class ListAppPoliciesForIdentityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAppPoliciesForIdentityResponseBody body;

    private ListAppPoliciesForIdentityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAppPoliciesForIdentityResponse create() {
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
    public ListAppPoliciesForIdentityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAppPoliciesForIdentityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAppPoliciesForIdentityResponseBody body);

        @Override
        ListAppPoliciesForIdentityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAppPoliciesForIdentityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAppPoliciesForIdentityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAppPoliciesForIdentityResponse response) {
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
        public Builder body(ListAppPoliciesForIdentityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAppPoliciesForIdentityResponse build() {
            return new ListAppPoliciesForIdentityResponse(this);
        } 

    } 

}
