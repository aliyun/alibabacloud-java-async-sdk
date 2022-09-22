// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkAclResponse} extends {@link TeaModel}
 *
 * <p>CreateNetworkAclResponse</p>
 */
public class CreateNetworkAclResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNetworkAclResponseBody body;

    private CreateNetworkAclResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNetworkAclResponse create() {
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
    public CreateNetworkAclResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNetworkAclResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNetworkAclResponseBody body);

        @Override
        CreateNetworkAclResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNetworkAclResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNetworkAclResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNetworkAclResponse response) {
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
        public Builder body(CreateNetworkAclResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNetworkAclResponse build() {
            return new CreateNetworkAclResponse(this);
        } 

    } 

}
