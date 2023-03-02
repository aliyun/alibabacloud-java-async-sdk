// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDatabaseInstanceResponse} extends {@link TeaModel}
 *
 * <p>StartDatabaseInstanceResponse</p>
 */
public class StartDatabaseInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartDatabaseInstanceResponseBody body;

    private StartDatabaseInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartDatabaseInstanceResponse create() {
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
    public StartDatabaseInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartDatabaseInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartDatabaseInstanceResponseBody body);

        @Override
        StartDatabaseInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartDatabaseInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartDatabaseInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartDatabaseInstanceResponse response) {
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
        public Builder body(StartDatabaseInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartDatabaseInstanceResponse build() {
            return new StartDatabaseInstanceResponse(this);
        } 

    } 

}
