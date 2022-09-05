// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallCmsExporterResponse} extends {@link TeaModel}
 *
 * <p>InstallCmsExporterResponse</p>
 */
public class InstallCmsExporterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InstallCmsExporterResponseBody body;

    private InstallCmsExporterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InstallCmsExporterResponse create() {
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
    public InstallCmsExporterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InstallCmsExporterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InstallCmsExporterResponseBody body);

        @Override
        InstallCmsExporterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstallCmsExporterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InstallCmsExporterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstallCmsExporterResponse response) {
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
        public Builder body(InstallCmsExporterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InstallCmsExporterResponse build() {
            return new InstallCmsExporterResponse(this);
        } 

    } 

}
