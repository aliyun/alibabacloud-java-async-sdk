// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDiscoverDatabaseTaskResponse} extends {@link TeaModel}
 *
 * <p>StartDiscoverDatabaseTaskResponse</p>
 */
public class StartDiscoverDatabaseTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartDiscoverDatabaseTaskResponseBody body;

    private StartDiscoverDatabaseTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartDiscoverDatabaseTaskResponse create() {
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
    public StartDiscoverDatabaseTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartDiscoverDatabaseTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartDiscoverDatabaseTaskResponseBody body);

        @Override
        StartDiscoverDatabaseTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartDiscoverDatabaseTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartDiscoverDatabaseTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartDiscoverDatabaseTaskResponse response) {
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
        public Builder body(StartDiscoverDatabaseTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartDiscoverDatabaseTaskResponse build() {
            return new StartDiscoverDatabaseTaskResponse(this);
        } 

    } 

}
