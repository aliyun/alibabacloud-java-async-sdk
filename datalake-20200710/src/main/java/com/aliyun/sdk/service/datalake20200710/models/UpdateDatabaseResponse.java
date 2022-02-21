// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDatabaseResponse} extends {@link TeaModel}
 *
 * <p>UpdateDatabaseResponse</p>
 */
public class UpdateDatabaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDatabaseResponseBody body;

    private UpdateDatabaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDatabaseResponse create() {
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
    public UpdateDatabaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDatabaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDatabaseResponseBody body);

        @Override
        UpdateDatabaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDatabaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDatabaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDatabaseResponse response) {
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
        public Builder body(UpdateDatabaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDatabaseResponse build() {
            return new UpdateDatabaseResponse(this);
        } 

    } 

}
