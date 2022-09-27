// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDiagnosticMetricSetsResponse} extends {@link TeaModel}
 *
 * <p>DeleteDiagnosticMetricSetsResponse</p>
 */
public class DeleteDiagnosticMetricSetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDiagnosticMetricSetsResponseBody body;

    private DeleteDiagnosticMetricSetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDiagnosticMetricSetsResponse create() {
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
    public DeleteDiagnosticMetricSetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDiagnosticMetricSetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDiagnosticMetricSetsResponseBody body);

        @Override
        DeleteDiagnosticMetricSetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDiagnosticMetricSetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDiagnosticMetricSetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDiagnosticMetricSetsResponse response) {
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
        public Builder body(DeleteDiagnosticMetricSetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDiagnosticMetricSetsResponse build() {
            return new DeleteDiagnosticMetricSetsResponse(this);
        } 

    } 

}
