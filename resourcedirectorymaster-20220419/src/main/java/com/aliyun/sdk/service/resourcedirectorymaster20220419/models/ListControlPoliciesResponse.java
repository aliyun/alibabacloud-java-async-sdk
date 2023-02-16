// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListControlPoliciesResponse} extends {@link TeaModel}
 *
 * <p>ListControlPoliciesResponse</p>
 */
public class ListControlPoliciesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListControlPoliciesResponseBody body;

    private ListControlPoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListControlPoliciesResponse create() {
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
    public ListControlPoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListControlPoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListControlPoliciesResponseBody body);

        @Override
        ListControlPoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListControlPoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListControlPoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListControlPoliciesResponse response) {
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
        public Builder body(ListControlPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListControlPoliciesResponse build() {
            return new ListControlPoliciesResponse(this);
        } 

    } 

}
