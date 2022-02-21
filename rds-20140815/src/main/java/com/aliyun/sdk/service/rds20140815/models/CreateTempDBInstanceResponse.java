// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTempDBInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateTempDBInstanceResponse</p>
 */
public class CreateTempDBInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTempDBInstanceResponseBody body;

    private CreateTempDBInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTempDBInstanceResponse create() {
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
    public CreateTempDBInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTempDBInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTempDBInstanceResponseBody body);

        @Override
        CreateTempDBInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTempDBInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTempDBInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTempDBInstanceResponse response) {
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
        public Builder body(CreateTempDBInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTempDBInstanceResponse build() {
            return new CreateTempDBInstanceResponse(this);
        } 

    } 

}
