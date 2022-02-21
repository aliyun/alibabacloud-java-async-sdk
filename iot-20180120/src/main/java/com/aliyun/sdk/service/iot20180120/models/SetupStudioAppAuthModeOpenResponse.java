// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetupStudioAppAuthModeOpenResponse} extends {@link TeaModel}
 *
 * <p>SetupStudioAppAuthModeOpenResponse</p>
 */
public class SetupStudioAppAuthModeOpenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetupStudioAppAuthModeOpenResponseBody body;

    private SetupStudioAppAuthModeOpenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetupStudioAppAuthModeOpenResponse create() {
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
    public SetupStudioAppAuthModeOpenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetupStudioAppAuthModeOpenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetupStudioAppAuthModeOpenResponseBody body);

        @Override
        SetupStudioAppAuthModeOpenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetupStudioAppAuthModeOpenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetupStudioAppAuthModeOpenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetupStudioAppAuthModeOpenResponse response) {
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
        public Builder body(SetupStudioAppAuthModeOpenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetupStudioAppAuthModeOpenResponse build() {
            return new SetupStudioAppAuthModeOpenResponse(this);
        } 

    } 

}
