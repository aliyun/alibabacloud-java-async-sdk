// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPoliciesForGroupResponse} extends {@link TeaModel}
 *
 * <p>ListPoliciesForGroupResponse</p>
 */
public class ListPoliciesForGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPoliciesForGroupResponseBody body;

    private ListPoliciesForGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPoliciesForGroupResponse create() {
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
    public ListPoliciesForGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPoliciesForGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPoliciesForGroupResponseBody body);

        @Override
        ListPoliciesForGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPoliciesForGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPoliciesForGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPoliciesForGroupResponse response) {
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
        public Builder body(ListPoliciesForGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPoliciesForGroupResponse build() {
            return new ListPoliciesForGroupResponse(this);
        } 

    } 

}
