// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEntitiesForPolicyResponse} extends {@link TeaModel}
 *
 * <p>ListEntitiesForPolicyResponse</p>
 */
public class ListEntitiesForPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEntitiesForPolicyResponseBody body;

    private ListEntitiesForPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEntitiesForPolicyResponse create() {
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
    public ListEntitiesForPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEntitiesForPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEntitiesForPolicyResponseBody body);

        @Override
        ListEntitiesForPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEntitiesForPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEntitiesForPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEntitiesForPolicyResponse response) {
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
        public Builder body(ListEntitiesForPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEntitiesForPolicyResponse build() {
            return new ListEntitiesForPolicyResponse(this);
        } 

    } 

}
