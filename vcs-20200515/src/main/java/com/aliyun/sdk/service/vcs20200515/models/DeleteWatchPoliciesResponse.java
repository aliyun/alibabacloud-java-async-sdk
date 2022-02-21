// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWatchPoliciesResponse} extends {@link TeaModel}
 *
 * <p>DeleteWatchPoliciesResponse</p>
 */
public class DeleteWatchPoliciesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWatchPoliciesResponseBody body;

    private DeleteWatchPoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWatchPoliciesResponse create() {
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
    public DeleteWatchPoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWatchPoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWatchPoliciesResponseBody body);

        @Override
        DeleteWatchPoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWatchPoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWatchPoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWatchPoliciesResponse response) {
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
        public Builder body(DeleteWatchPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWatchPoliciesResponse build() {
            return new DeleteWatchPoliciesResponse(this);
        } 

    } 

}
