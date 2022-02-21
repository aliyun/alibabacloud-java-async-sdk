// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMetastoreMigrationResponse} extends {@link TeaModel}
 *
 * <p>CreateMetastoreMigrationResponse</p>
 */
public class CreateMetastoreMigrationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMetastoreMigrationResponseBody body;

    private CreateMetastoreMigrationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMetastoreMigrationResponse create() {
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
    public CreateMetastoreMigrationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMetastoreMigrationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMetastoreMigrationResponseBody body);

        @Override
        CreateMetastoreMigrationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMetastoreMigrationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMetastoreMigrationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMetastoreMigrationResponse response) {
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
        public Builder body(CreateMetastoreMigrationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMetastoreMigrationResponse build() {
            return new CreateMetastoreMigrationResponse(this);
        } 

    } 

}
