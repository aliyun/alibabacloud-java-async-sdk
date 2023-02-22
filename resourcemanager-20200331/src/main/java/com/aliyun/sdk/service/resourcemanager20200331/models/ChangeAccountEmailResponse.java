// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeAccountEmailResponse} extends {@link TeaModel}
 *
 * <p>ChangeAccountEmailResponse</p>
 */
public class ChangeAccountEmailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeAccountEmailResponseBody body;

    private ChangeAccountEmailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeAccountEmailResponse create() {
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
    public ChangeAccountEmailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeAccountEmailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeAccountEmailResponseBody body);

        @Override
        ChangeAccountEmailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeAccountEmailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeAccountEmailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeAccountEmailResponse response) {
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
        public Builder body(ChangeAccountEmailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeAccountEmailResponse build() {
            return new ChangeAccountEmailResponse(this);
        } 

    } 

}
