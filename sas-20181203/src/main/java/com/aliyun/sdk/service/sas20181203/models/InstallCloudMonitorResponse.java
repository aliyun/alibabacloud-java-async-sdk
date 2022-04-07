// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallCloudMonitorResponse} extends {@link TeaModel}
 *
 * <p>InstallCloudMonitorResponse</p>
 */
public class InstallCloudMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InstallCloudMonitorResponseBody body;

    private InstallCloudMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InstallCloudMonitorResponse create() {
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
    public InstallCloudMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InstallCloudMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InstallCloudMonitorResponseBody body);

        @Override
        InstallCloudMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstallCloudMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InstallCloudMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstallCloudMonitorResponse response) {
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
        public Builder body(InstallCloudMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InstallCloudMonitorResponse build() {
            return new InstallCloudMonitorResponse(this);
        } 

    } 

}
