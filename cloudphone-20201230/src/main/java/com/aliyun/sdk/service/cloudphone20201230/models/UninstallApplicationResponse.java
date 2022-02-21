// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallApplicationResponse} extends {@link TeaModel}
 *
 * <p>UninstallApplicationResponse</p>
 */
public class UninstallApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UninstallApplicationResponseBody body;

    private UninstallApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UninstallApplicationResponse create() {
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
    public UninstallApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UninstallApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UninstallApplicationResponseBody body);

        @Override
        UninstallApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UninstallApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UninstallApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UninstallApplicationResponse response) {
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
        public Builder body(UninstallApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UninstallApplicationResponse build() {
            return new UninstallApplicationResponse(this);
        } 

    } 

}
