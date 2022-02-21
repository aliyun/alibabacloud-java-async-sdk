// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20170601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewTSDBInstanceResponse} extends {@link TeaModel}
 *
 * <p>RenewTSDBInstanceResponse</p>
 */
public class RenewTSDBInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenewTSDBInstanceResponseBody body;

    private RenewTSDBInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenewTSDBInstanceResponse create() {
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
    public RenewTSDBInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenewTSDBInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenewTSDBInstanceResponseBody body);

        @Override
        RenewTSDBInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenewTSDBInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenewTSDBInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenewTSDBInstanceResponse response) {
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
        public Builder body(RenewTSDBInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenewTSDBInstanceResponse build() {
            return new RenewTSDBInstanceResponse(this);
        } 

    } 

}
