// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetastoreMigrationResponse} extends {@link TeaModel}
 *
 * <p>DeleteMetastoreMigrationResponse</p>
 */
public class DeleteMetastoreMigrationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMetastoreMigrationResponseBody body;

    private DeleteMetastoreMigrationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMetastoreMigrationResponse create() {
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
    public DeleteMetastoreMigrationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMetastoreMigrationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMetastoreMigrationResponseBody body);

        @Override
        DeleteMetastoreMigrationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMetastoreMigrationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMetastoreMigrationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMetastoreMigrationResponse response) {
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
        public Builder body(DeleteMetastoreMigrationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMetastoreMigrationResponse build() {
            return new DeleteMetastoreMigrationResponse(this);
        } 

    } 

}
