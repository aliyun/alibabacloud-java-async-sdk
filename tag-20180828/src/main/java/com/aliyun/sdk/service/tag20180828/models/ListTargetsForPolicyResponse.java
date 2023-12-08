// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTargetsForPolicyResponse} extends {@link TeaModel}
 *
 * <p>ListTargetsForPolicyResponse</p>
 */
public class ListTargetsForPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTargetsForPolicyResponseBody body;

    private ListTargetsForPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTargetsForPolicyResponse create() {
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
    public ListTargetsForPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTargetsForPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTargetsForPolicyResponseBody body);

        @Override
        ListTargetsForPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTargetsForPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTargetsForPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTargetsForPolicyResponse response) {
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
        public Builder body(ListTargetsForPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTargetsForPolicyResponse build() {
            return new ListTargetsForPolicyResponse(this);
        } 

    } 

}
