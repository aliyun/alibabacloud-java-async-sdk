// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetUserAdminResponse} extends {@link TeaModel}
 *
 * <p>SetUserAdminResponse</p>
 */
public class SetUserAdminResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetUserAdminResponseBody body;

    private SetUserAdminResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetUserAdminResponse create() {
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
    public SetUserAdminResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetUserAdminResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetUserAdminResponseBody body);

        @Override
        SetUserAdminResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetUserAdminResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetUserAdminResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetUserAdminResponse response) {
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
        public Builder body(SetUserAdminResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetUserAdminResponse build() {
            return new SetUserAdminResponse(this);
        } 

    } 

}
