// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchDBInstanceVpcResponse} extends {@link TeaModel}
 *
 * <p>SwitchDBInstanceVpcResponse</p>
 */
public class SwitchDBInstanceVpcResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SwitchDBInstanceVpcResponseBody body;

    private SwitchDBInstanceVpcResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SwitchDBInstanceVpcResponse create() {
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
    public SwitchDBInstanceVpcResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SwitchDBInstanceVpcResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SwitchDBInstanceVpcResponseBody body);

        @Override
        SwitchDBInstanceVpcResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SwitchDBInstanceVpcResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SwitchDBInstanceVpcResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SwitchDBInstanceVpcResponse response) {
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
        public Builder body(SwitchDBInstanceVpcResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SwitchDBInstanceVpcResponse build() {
            return new SwitchDBInstanceVpcResponse(this);
        } 

    } 

}
