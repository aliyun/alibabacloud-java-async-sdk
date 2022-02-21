// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestoreDBInstanceResponse} extends {@link TeaModel}
 *
 * <p>RestoreDBInstanceResponse</p>
 */
public class RestoreDBInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestoreDBInstanceResponseBody body;

    private RestoreDBInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestoreDBInstanceResponse create() {
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
    public RestoreDBInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestoreDBInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestoreDBInstanceResponseBody body);

        @Override
        RestoreDBInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestoreDBInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestoreDBInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestoreDBInstanceResponse response) {
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
        public Builder body(RestoreDBInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestoreDBInstanceResponse build() {
            return new RestoreDBInstanceResponse(this);
        } 

    } 

}
