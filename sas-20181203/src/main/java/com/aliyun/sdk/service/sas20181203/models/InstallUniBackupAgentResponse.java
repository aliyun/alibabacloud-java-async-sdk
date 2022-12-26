// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallUniBackupAgentResponse} extends {@link TeaModel}
 *
 * <p>InstallUniBackupAgentResponse</p>
 */
public class InstallUniBackupAgentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InstallUniBackupAgentResponseBody body;

    private InstallUniBackupAgentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InstallUniBackupAgentResponse create() {
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
    public InstallUniBackupAgentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InstallUniBackupAgentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InstallUniBackupAgentResponseBody body);

        @Override
        InstallUniBackupAgentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstallUniBackupAgentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InstallUniBackupAgentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstallUniBackupAgentResponse response) {
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
        public Builder body(InstallUniBackupAgentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InstallUniBackupAgentResponse build() {
            return new InstallUniBackupAgentResponse(this);
        } 

    } 

}
