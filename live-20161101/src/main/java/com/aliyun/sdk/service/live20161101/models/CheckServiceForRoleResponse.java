// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckServiceForRoleResponse} extends {@link TeaModel}
 *
 * <p>CheckServiceForRoleResponse</p>
 */
public class CheckServiceForRoleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckServiceForRoleResponseBody body;

    private CheckServiceForRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckServiceForRoleResponse create() {
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
    public CheckServiceForRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckServiceForRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckServiceForRoleResponseBody body);

        @Override
        CheckServiceForRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckServiceForRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckServiceForRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckServiceForRoleResponse response) {
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
        public Builder body(CheckServiceForRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckServiceForRoleResponse build() {
            return new CheckServiceForRoleResponse(this);
        } 

    } 

}
