// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMetastoreMigrationResponse} extends {@link TeaModel}
 *
 * <p>UpdateMetastoreMigrationResponse</p>
 */
public class UpdateMetastoreMigrationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMetastoreMigrationResponseBody body;

    private UpdateMetastoreMigrationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMetastoreMigrationResponse create() {
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
    public UpdateMetastoreMigrationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMetastoreMigrationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMetastoreMigrationResponseBody body);

        @Override
        UpdateMetastoreMigrationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMetastoreMigrationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMetastoreMigrationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMetastoreMigrationResponse response) {
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
        public Builder body(UpdateMetastoreMigrationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMetastoreMigrationResponse build() {
            return new UpdateMetastoreMigrationResponse(this);
        } 

    } 

}
