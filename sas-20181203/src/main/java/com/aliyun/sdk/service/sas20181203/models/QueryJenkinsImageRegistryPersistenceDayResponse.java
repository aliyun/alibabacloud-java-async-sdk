// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryJenkinsImageRegistryPersistenceDayResponse} extends {@link TeaModel}
 *
 * <p>QueryJenkinsImageRegistryPersistenceDayResponse</p>
 */
public class QueryJenkinsImageRegistryPersistenceDayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryJenkinsImageRegistryPersistenceDayResponseBody body;

    private QueryJenkinsImageRegistryPersistenceDayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryJenkinsImageRegistryPersistenceDayResponse create() {
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
    public QueryJenkinsImageRegistryPersistenceDayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryJenkinsImageRegistryPersistenceDayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryJenkinsImageRegistryPersistenceDayResponseBody body);

        @Override
        QueryJenkinsImageRegistryPersistenceDayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryJenkinsImageRegistryPersistenceDayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryJenkinsImageRegistryPersistenceDayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryJenkinsImageRegistryPersistenceDayResponse response) {
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
        public Builder body(QueryJenkinsImageRegistryPersistenceDayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryJenkinsImageRegistryPersistenceDayResponse build() {
            return new QueryJenkinsImageRegistryPersistenceDayResponse(this);
        } 

    } 

}
