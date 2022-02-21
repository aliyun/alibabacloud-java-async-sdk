// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDBInstanceResponse} extends {@link TeaModel}
 *
 * <p>StopDBInstanceResponse</p>
 */
public class StopDBInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopDBInstanceResponseBody body;

    private StopDBInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopDBInstanceResponse create() {
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
    public StopDBInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopDBInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopDBInstanceResponseBody body);

        @Override
        StopDBInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopDBInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopDBInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopDBInstanceResponse response) {
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
        public Builder body(StopDBInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopDBInstanceResponse build() {
            return new StopDBInstanceResponse(this);
        } 

    } 

}
