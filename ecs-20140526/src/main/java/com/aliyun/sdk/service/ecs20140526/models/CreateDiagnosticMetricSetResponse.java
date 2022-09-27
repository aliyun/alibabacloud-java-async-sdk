// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiagnosticMetricSetResponse} extends {@link TeaModel}
 *
 * <p>CreateDiagnosticMetricSetResponse</p>
 */
public class CreateDiagnosticMetricSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDiagnosticMetricSetResponseBody body;

    private CreateDiagnosticMetricSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDiagnosticMetricSetResponse create() {
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
    public CreateDiagnosticMetricSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDiagnosticMetricSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDiagnosticMetricSetResponseBody body);

        @Override
        CreateDiagnosticMetricSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDiagnosticMetricSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDiagnosticMetricSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDiagnosticMetricSetResponse response) {
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
        public Builder body(CreateDiagnosticMetricSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDiagnosticMetricSetResponse build() {
            return new CreateDiagnosticMetricSetResponse(this);
        } 

    } 

}
