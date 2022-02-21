// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyResourceDiagnosisStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyResourceDiagnosisStatusResponse</p>
 */
public class ModifyResourceDiagnosisStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyResourceDiagnosisStatusResponseBody body;

    private ModifyResourceDiagnosisStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyResourceDiagnosisStatusResponse create() {
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
    public ModifyResourceDiagnosisStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyResourceDiagnosisStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyResourceDiagnosisStatusResponseBody body);

        @Override
        ModifyResourceDiagnosisStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyResourceDiagnosisStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyResourceDiagnosisStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyResourceDiagnosisStatusResponse response) {
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
        public Builder body(ModifyResourceDiagnosisStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyResourceDiagnosisStatusResponse build() {
            return new ModifyResourceDiagnosisStatusResponse(this);
        } 

    } 

}
