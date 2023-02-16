// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelChangeAccountEmailResponse} extends {@link TeaModel}
 *
 * <p>CancelChangeAccountEmailResponse</p>
 */
public class CancelChangeAccountEmailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelChangeAccountEmailResponseBody body;

    private CancelChangeAccountEmailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelChangeAccountEmailResponse create() {
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
    public CancelChangeAccountEmailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelChangeAccountEmailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelChangeAccountEmailResponseBody body);

        @Override
        CancelChangeAccountEmailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelChangeAccountEmailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelChangeAccountEmailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelChangeAccountEmailResponse response) {
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
        public Builder body(CancelChangeAccountEmailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelChangeAccountEmailResponse build() {
            return new CancelChangeAccountEmailResponse(this);
        } 

    } 

}
