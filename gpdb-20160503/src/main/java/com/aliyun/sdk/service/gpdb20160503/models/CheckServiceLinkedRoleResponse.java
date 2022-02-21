// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckServiceLinkedRoleResponse} extends {@link TeaModel}
 *
 * <p>CheckServiceLinkedRoleResponse</p>
 */
public class CheckServiceLinkedRoleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckServiceLinkedRoleResponseBody body;

    private CheckServiceLinkedRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckServiceLinkedRoleResponse create() {
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
    public CheckServiceLinkedRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckServiceLinkedRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckServiceLinkedRoleResponseBody body);

        @Override
        CheckServiceLinkedRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckServiceLinkedRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckServiceLinkedRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckServiceLinkedRoleResponse response) {
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
        public Builder body(CheckServiceLinkedRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckServiceLinkedRoleResponse build() {
            return new CheckServiceLinkedRoleResponse(this);
        } 

    } 

}
