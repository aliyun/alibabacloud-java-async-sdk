// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAclResponse} extends {@link TeaModel}
 *
 * <p>CreateAclResponse</p>
 */
public class CreateAclResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAclResponseBody body;

    private CreateAclResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAclResponse create() {
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
    public CreateAclResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAclResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAclResponseBody body);

        @Override
        CreateAclResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAclResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAclResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAclResponse response) {
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
        public Builder body(CreateAclResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAclResponse build() {
            return new CreateAclResponse(this);
        } 

    } 

}
