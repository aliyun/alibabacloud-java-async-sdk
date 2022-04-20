// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelUserAdminResponse} extends {@link TeaModel}
 *
 * <p>CancelUserAdminResponse</p>
 */
public class CancelUserAdminResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelUserAdminResponseBody body;

    private CancelUserAdminResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelUserAdminResponse create() {
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
    public CancelUserAdminResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelUserAdminResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelUserAdminResponseBody body);

        @Override
        CancelUserAdminResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelUserAdminResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelUserAdminResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelUserAdminResponse response) {
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
        public Builder body(CancelUserAdminResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelUserAdminResponse build() {
            return new CancelUserAdminResponse(this);
        } 

    } 

}
