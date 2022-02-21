// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallLibrariesResponse} extends {@link TeaModel}
 *
 * <p>UninstallLibrariesResponse</p>
 */
public class UninstallLibrariesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UninstallLibrariesResponseBody body;

    private UninstallLibrariesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UninstallLibrariesResponse create() {
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
    public UninstallLibrariesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UninstallLibrariesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UninstallLibrariesResponseBody body);

        @Override
        UninstallLibrariesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UninstallLibrariesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UninstallLibrariesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UninstallLibrariesResponse response) {
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
        public Builder body(UninstallLibrariesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UninstallLibrariesResponse build() {
            return new UninstallLibrariesResponse(this);
        } 

    } 

}
