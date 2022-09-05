// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSilencePoliciesResponse} extends {@link TeaModel}
 *
 * <p>ListSilencePoliciesResponse</p>
 */
public class ListSilencePoliciesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSilencePoliciesResponseBody body;

    private ListSilencePoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSilencePoliciesResponse create() {
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
    public ListSilencePoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSilencePoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSilencePoliciesResponseBody body);

        @Override
        ListSilencePoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSilencePoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSilencePoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSilencePoliciesResponse response) {
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
        public Builder body(ListSilencePoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSilencePoliciesResponse build() {
            return new ListSilencePoliciesResponse(this);
        } 

    } 

}
