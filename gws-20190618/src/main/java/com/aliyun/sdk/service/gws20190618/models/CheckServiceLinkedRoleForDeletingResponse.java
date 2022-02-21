// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckServiceLinkedRoleForDeletingResponse} extends {@link TeaModel}
 *
 * <p>CheckServiceLinkedRoleForDeletingResponse</p>
 */
public class CheckServiceLinkedRoleForDeletingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckServiceLinkedRoleForDeletingResponseBody body;

    private CheckServiceLinkedRoleForDeletingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckServiceLinkedRoleForDeletingResponse create() {
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
    public CheckServiceLinkedRoleForDeletingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckServiceLinkedRoleForDeletingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckServiceLinkedRoleForDeletingResponseBody body);

        @Override
        CheckServiceLinkedRoleForDeletingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckServiceLinkedRoleForDeletingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckServiceLinkedRoleForDeletingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckServiceLinkedRoleForDeletingResponse response) {
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
        public Builder body(CheckServiceLinkedRoleForDeletingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckServiceLinkedRoleForDeletingResponse build() {
            return new CheckServiceLinkedRoleForDeletingResponse(this);
        } 

    } 

}
