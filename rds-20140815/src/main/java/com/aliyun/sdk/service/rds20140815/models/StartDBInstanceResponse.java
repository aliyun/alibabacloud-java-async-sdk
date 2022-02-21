// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDBInstanceResponse} extends {@link TeaModel}
 *
 * <p>StartDBInstanceResponse</p>
 */
public class StartDBInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartDBInstanceResponseBody body;

    private StartDBInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartDBInstanceResponse create() {
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
    public StartDBInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartDBInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartDBInstanceResponseBody body);

        @Override
        StartDBInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartDBInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartDBInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartDBInstanceResponse response) {
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
        public Builder body(StartDBInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartDBInstanceResponse build() {
            return new StartDBInstanceResponse(this);
        } 

    } 

}
