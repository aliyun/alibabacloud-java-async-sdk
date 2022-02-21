// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckCreateDdrDBInstanceResponse} extends {@link TeaModel}
 *
 * <p>CheckCreateDdrDBInstanceResponse</p>
 */
public class CheckCreateDdrDBInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckCreateDdrDBInstanceResponseBody body;

    private CheckCreateDdrDBInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckCreateDdrDBInstanceResponse create() {
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
    public CheckCreateDdrDBInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckCreateDdrDBInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckCreateDdrDBInstanceResponseBody body);

        @Override
        CheckCreateDdrDBInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckCreateDdrDBInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckCreateDdrDBInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckCreateDdrDBInstanceResponse response) {
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
        public Builder body(CheckCreateDdrDBInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckCreateDdrDBInstanceResponse build() {
            return new CheckCreateDdrDBInstanceResponse(this);
        } 

    } 

}
