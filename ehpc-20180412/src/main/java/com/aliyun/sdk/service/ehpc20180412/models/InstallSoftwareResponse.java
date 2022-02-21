// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallSoftwareResponse} extends {@link TeaModel}
 *
 * <p>InstallSoftwareResponse</p>
 */
public class InstallSoftwareResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InstallSoftwareResponseBody body;

    private InstallSoftwareResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InstallSoftwareResponse create() {
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
    public InstallSoftwareResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InstallSoftwareResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InstallSoftwareResponseBody body);

        @Override
        InstallSoftwareResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstallSoftwareResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InstallSoftwareResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstallSoftwareResponse response) {
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
        public Builder body(InstallSoftwareResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InstallSoftwareResponse build() {
            return new InstallSoftwareResponse(this);
        } 

    } 

}
