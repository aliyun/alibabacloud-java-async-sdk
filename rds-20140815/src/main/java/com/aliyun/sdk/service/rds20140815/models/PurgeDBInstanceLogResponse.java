// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PurgeDBInstanceLogResponse} extends {@link TeaModel}
 *
 * <p>PurgeDBInstanceLogResponse</p>
 */
public class PurgeDBInstanceLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PurgeDBInstanceLogResponseBody body;

    private PurgeDBInstanceLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PurgeDBInstanceLogResponse create() {
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
    public PurgeDBInstanceLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PurgeDBInstanceLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PurgeDBInstanceLogResponseBody body);

        @Override
        PurgeDBInstanceLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PurgeDBInstanceLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PurgeDBInstanceLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PurgeDBInstanceLogResponse response) {
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
        public Builder body(PurgeDBInstanceLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PurgeDBInstanceLogResponse build() {
            return new PurgeDBInstanceLogResponse(this);
        } 

    } 

}
