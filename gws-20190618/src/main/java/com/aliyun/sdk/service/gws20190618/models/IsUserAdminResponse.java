// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IsUserAdminResponse} extends {@link TeaModel}
 *
 * <p>IsUserAdminResponse</p>
 */
public class IsUserAdminResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private IsUserAdminResponseBody body;

    private IsUserAdminResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static IsUserAdminResponse create() {
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
    public IsUserAdminResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<IsUserAdminResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(IsUserAdminResponseBody body);

        @Override
        IsUserAdminResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<IsUserAdminResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private IsUserAdminResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(IsUserAdminResponse response) {
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
        public Builder body(IsUserAdminResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public IsUserAdminResponse build() {
            return new IsUserAdminResponse(this);
        } 

    } 

}
