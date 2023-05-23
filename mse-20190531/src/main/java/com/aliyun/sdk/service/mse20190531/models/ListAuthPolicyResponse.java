// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthPolicyResponse} extends {@link TeaModel}
 *
 * <p>ListAuthPolicyResponse</p>
 */
public class ListAuthPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAuthPolicyResponseBody body;

    private ListAuthPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAuthPolicyResponse create() {
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
    public ListAuthPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAuthPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAuthPolicyResponseBody body);

        @Override
        ListAuthPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAuthPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAuthPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAuthPolicyResponse response) {
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
        public Builder body(ListAuthPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAuthPolicyResponse build() {
            return new ListAuthPolicyResponse(this);
        } 

    } 

}
