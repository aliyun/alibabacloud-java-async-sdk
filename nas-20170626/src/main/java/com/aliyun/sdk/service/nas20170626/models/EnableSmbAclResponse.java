// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableSmbAclResponse} extends {@link TeaModel}
 *
 * <p>EnableSmbAclResponse</p>
 */
public class EnableSmbAclResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableSmbAclResponseBody body;

    private EnableSmbAclResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableSmbAclResponse create() {
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
    public EnableSmbAclResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableSmbAclResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableSmbAclResponseBody body);

        @Override
        EnableSmbAclResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableSmbAclResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableSmbAclResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableSmbAclResponse response) {
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
        public Builder body(EnableSmbAclResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableSmbAclResponse build() {
            return new EnableSmbAclResponse(this);
        } 

    } 

}
