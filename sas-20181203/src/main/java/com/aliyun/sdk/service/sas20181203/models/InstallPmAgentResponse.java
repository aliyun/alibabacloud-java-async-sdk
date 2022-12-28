// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallPmAgentResponse} extends {@link TeaModel}
 *
 * <p>InstallPmAgentResponse</p>
 */
public class InstallPmAgentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InstallPmAgentResponseBody body;

    private InstallPmAgentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InstallPmAgentResponse create() {
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
    public InstallPmAgentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InstallPmAgentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InstallPmAgentResponseBody body);

        @Override
        InstallPmAgentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstallPmAgentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InstallPmAgentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstallPmAgentResponse response) {
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
        public Builder body(InstallPmAgentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InstallPmAgentResponse build() {
            return new InstallPmAgentResponse(this);
        } 

    } 

}
