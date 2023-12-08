// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPoliciesForTargetResponse} extends {@link TeaModel}
 *
 * <p>ListPoliciesForTargetResponse</p>
 */
public class ListPoliciesForTargetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPoliciesForTargetResponseBody body;

    private ListPoliciesForTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPoliciesForTargetResponse create() {
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
    public ListPoliciesForTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPoliciesForTargetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPoliciesForTargetResponseBody body);

        @Override
        ListPoliciesForTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPoliciesForTargetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPoliciesForTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPoliciesForTargetResponse response) {
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
        public Builder body(ListPoliciesForTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPoliciesForTargetResponse build() {
            return new ListPoliciesForTargetResponse(this);
        } 

    } 

}
