// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicyVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListPolicyVersionsResponse</p>
 */
public class ListPolicyVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPolicyVersionsResponseBody body;

    private ListPolicyVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPolicyVersionsResponse create() {
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
    public ListPolicyVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPolicyVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPolicyVersionsResponseBody body);

        @Override
        ListPolicyVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPolicyVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPolicyVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPolicyVersionsResponse response) {
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
        public Builder body(ListPolicyVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPolicyVersionsResponse build() {
            return new ListPolicyVersionsResponse(this);
        } 

    } 

}
