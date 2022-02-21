// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneDBInstanceResponse} extends {@link TeaModel}
 *
 * <p>CloneDBInstanceResponse</p>
 */
public class CloneDBInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloneDBInstanceResponseBody body;

    private CloneDBInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloneDBInstanceResponse create() {
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
    public CloneDBInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloneDBInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloneDBInstanceResponseBody body);

        @Override
        CloneDBInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloneDBInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloneDBInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloneDBInstanceResponse response) {
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
        public Builder body(CloneDBInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloneDBInstanceResponse build() {
            return new CloneDBInstanceResponse(this);
        } 

    } 

}
