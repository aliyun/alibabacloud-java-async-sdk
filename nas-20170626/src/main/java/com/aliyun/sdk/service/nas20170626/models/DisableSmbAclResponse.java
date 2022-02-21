// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableSmbAclResponse} extends {@link TeaModel}
 *
 * <p>DisableSmbAclResponse</p>
 */
public class DisableSmbAclResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableSmbAclResponseBody body;

    private DisableSmbAclResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableSmbAclResponse create() {
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
    public DisableSmbAclResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableSmbAclResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableSmbAclResponseBody body);

        @Override
        DisableSmbAclResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableSmbAclResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableSmbAclResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableSmbAclResponse response) {
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
        public Builder body(DisableSmbAclResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableSmbAclResponse build() {
            return new DisableSmbAclResponse(this);
        } 

    } 

}
