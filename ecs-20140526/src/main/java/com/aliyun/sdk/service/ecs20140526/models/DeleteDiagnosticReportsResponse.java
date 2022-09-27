// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDiagnosticReportsResponse} extends {@link TeaModel}
 *
 * <p>DeleteDiagnosticReportsResponse</p>
 */
public class DeleteDiagnosticReportsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDiagnosticReportsResponseBody body;

    private DeleteDiagnosticReportsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDiagnosticReportsResponse create() {
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
    public DeleteDiagnosticReportsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDiagnosticReportsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDiagnosticReportsResponseBody body);

        @Override
        DeleteDiagnosticReportsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDiagnosticReportsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDiagnosticReportsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDiagnosticReportsResponse response) {
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
        public Builder body(DeleteDiagnosticReportsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDiagnosticReportsResponse build() {
            return new DeleteDiagnosticReportsResponse(this);
        } 

    } 

}
