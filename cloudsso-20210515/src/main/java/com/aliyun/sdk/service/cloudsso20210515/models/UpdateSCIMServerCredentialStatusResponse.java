// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSCIMServerCredentialStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateSCIMServerCredentialStatusResponse</p>
 */
public class UpdateSCIMServerCredentialStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSCIMServerCredentialStatusResponseBody body;

    private UpdateSCIMServerCredentialStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSCIMServerCredentialStatusResponse create() {
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
    public UpdateSCIMServerCredentialStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSCIMServerCredentialStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSCIMServerCredentialStatusResponseBody body);

        @Override
        UpdateSCIMServerCredentialStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSCIMServerCredentialStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSCIMServerCredentialStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSCIMServerCredentialStatusResponse response) {
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
        public Builder body(UpdateSCIMServerCredentialStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSCIMServerCredentialStatusResponse build() {
            return new UpdateSCIMServerCredentialStatusResponse(this);
        } 

    } 

}
