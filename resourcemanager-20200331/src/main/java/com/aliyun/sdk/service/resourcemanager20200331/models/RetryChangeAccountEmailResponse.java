// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryChangeAccountEmailResponse} extends {@link TeaModel}
 *
 * <p>RetryChangeAccountEmailResponse</p>
 */
public class RetryChangeAccountEmailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RetryChangeAccountEmailResponseBody body;

    private RetryChangeAccountEmailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RetryChangeAccountEmailResponse create() {
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
    public RetryChangeAccountEmailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RetryChangeAccountEmailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RetryChangeAccountEmailResponseBody body);

        @Override
        RetryChangeAccountEmailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RetryChangeAccountEmailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RetryChangeAccountEmailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RetryChangeAccountEmailResponse response) {
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
        public Builder body(RetryChangeAccountEmailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RetryChangeAccountEmailResponse build() {
            return new RetryChangeAccountEmailResponse(this);
        } 

    } 

}
