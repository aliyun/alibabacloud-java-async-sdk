// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePostgresExtensionsResponse} extends {@link TeaModel}
 *
 * <p>UpdatePostgresExtensionsResponse</p>
 */
public class UpdatePostgresExtensionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePostgresExtensionsResponseBody body;

    private UpdatePostgresExtensionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePostgresExtensionsResponse create() {
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
    public UpdatePostgresExtensionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePostgresExtensionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePostgresExtensionsResponseBody body);

        @Override
        UpdatePostgresExtensionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePostgresExtensionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePostgresExtensionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePostgresExtensionsResponse response) {
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
        public Builder body(UpdatePostgresExtensionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePostgresExtensionsResponse build() {
            return new UpdatePostgresExtensionsResponse(this);
        } 

    } 

}
