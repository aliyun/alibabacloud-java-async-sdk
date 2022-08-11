// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExportMigrationResponse} extends {@link TeaModel}
 *
 * <p>CreateExportMigrationResponse</p>
 */
public class CreateExportMigrationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateExportMigrationResponseBody body;

    private CreateExportMigrationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateExportMigrationResponse create() {
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
    public CreateExportMigrationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateExportMigrationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateExportMigrationResponseBody body);

        @Override
        CreateExportMigrationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateExportMigrationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateExportMigrationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateExportMigrationResponse response) {
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
        public Builder body(CreateExportMigrationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateExportMigrationResponse build() {
            return new CreateExportMigrationResponse(this);
        } 

    } 

}
