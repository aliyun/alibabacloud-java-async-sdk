// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiagnosticMetricSetResponse} extends {@link TeaModel}
 *
 * <p>ModifyDiagnosticMetricSetResponse</p>
 */
public class ModifyDiagnosticMetricSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDiagnosticMetricSetResponseBody body;

    private ModifyDiagnosticMetricSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDiagnosticMetricSetResponse create() {
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
    public ModifyDiagnosticMetricSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDiagnosticMetricSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDiagnosticMetricSetResponseBody body);

        @Override
        ModifyDiagnosticMetricSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDiagnosticMetricSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDiagnosticMetricSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDiagnosticMetricSetResponse response) {
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
        public Builder body(ModifyDiagnosticMetricSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDiagnosticMetricSetResponse build() {
            return new ModifyDiagnosticMetricSetResponse(this);
        } 

    } 

}
