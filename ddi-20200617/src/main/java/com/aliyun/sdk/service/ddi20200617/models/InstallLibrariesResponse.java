// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallLibrariesResponse} extends {@link TeaModel}
 *
 * <p>InstallLibrariesResponse</p>
 */
public class InstallLibrariesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InstallLibrariesResponseBody body;

    private InstallLibrariesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InstallLibrariesResponse create() {
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
    public InstallLibrariesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InstallLibrariesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InstallLibrariesResponseBody body);

        @Override
        InstallLibrariesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstallLibrariesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InstallLibrariesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstallLibrariesResponse response) {
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
        public Builder body(InstallLibrariesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InstallLibrariesResponse build() {
            return new InstallLibrariesResponse(this);
        } 

    } 

}
