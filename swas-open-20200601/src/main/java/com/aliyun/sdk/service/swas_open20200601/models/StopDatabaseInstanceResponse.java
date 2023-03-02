// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDatabaseInstanceResponse} extends {@link TeaModel}
 *
 * <p>StopDatabaseInstanceResponse</p>
 */
public class StopDatabaseInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopDatabaseInstanceResponseBody body;

    private StopDatabaseInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopDatabaseInstanceResponse create() {
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
    public StopDatabaseInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopDatabaseInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopDatabaseInstanceResponseBody body);

        @Override
        StopDatabaseInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopDatabaseInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopDatabaseInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopDatabaseInstanceResponse response) {
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
        public Builder body(StopDatabaseInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopDatabaseInstanceResponse build() {
            return new StopDatabaseInstanceResponse(this);
        } 

    } 

}
