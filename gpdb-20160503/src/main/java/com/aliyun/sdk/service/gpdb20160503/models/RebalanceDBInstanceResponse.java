// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebalanceDBInstanceResponse} extends {@link TeaModel}
 *
 * <p>RebalanceDBInstanceResponse</p>
 */
public class RebalanceDBInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RebalanceDBInstanceResponseBody body;

    private RebalanceDBInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RebalanceDBInstanceResponse create() {
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
    public RebalanceDBInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RebalanceDBInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RebalanceDBInstanceResponseBody body);

        @Override
        RebalanceDBInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RebalanceDBInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RebalanceDBInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RebalanceDBInstanceResponse response) {
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
        public Builder body(RebalanceDBInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RebalanceDBInstanceResponse build() {
            return new RebalanceDBInstanceResponse(this);
        } 

    } 

}
