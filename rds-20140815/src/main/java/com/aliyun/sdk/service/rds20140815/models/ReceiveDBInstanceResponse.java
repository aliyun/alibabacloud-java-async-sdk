// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReceiveDBInstanceResponse} extends {@link TeaModel}
 *
 * <p>ReceiveDBInstanceResponse</p>
 */
public class ReceiveDBInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReceiveDBInstanceResponseBody body;

    private ReceiveDBInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReceiveDBInstanceResponse create() {
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
    public ReceiveDBInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReceiveDBInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReceiveDBInstanceResponseBody body);

        @Override
        ReceiveDBInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReceiveDBInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReceiveDBInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReceiveDBInstanceResponse response) {
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
        public Builder body(ReceiveDBInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReceiveDBInstanceResponse build() {
            return new ReceiveDBInstanceResponse(this);
        } 

    } 

}
