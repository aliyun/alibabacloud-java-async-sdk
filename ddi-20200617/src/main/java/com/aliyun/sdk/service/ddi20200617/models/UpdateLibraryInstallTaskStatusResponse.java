// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLibraryInstallTaskStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateLibraryInstallTaskStatusResponse</p>
 */
public class UpdateLibraryInstallTaskStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateLibraryInstallTaskStatusResponseBody body;

    private UpdateLibraryInstallTaskStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateLibraryInstallTaskStatusResponse create() {
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
    public UpdateLibraryInstallTaskStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateLibraryInstallTaskStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateLibraryInstallTaskStatusResponseBody body);

        @Override
        UpdateLibraryInstallTaskStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateLibraryInstallTaskStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateLibraryInstallTaskStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateLibraryInstallTaskStatusResponse response) {
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
        public Builder body(UpdateLibraryInstallTaskStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateLibraryInstallTaskStatusResponse build() {
            return new UpdateLibraryInstallTaskStatusResponse(this);
        } 

    } 

}
