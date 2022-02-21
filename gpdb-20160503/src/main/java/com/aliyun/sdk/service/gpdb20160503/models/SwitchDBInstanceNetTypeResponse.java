// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchDBInstanceNetTypeResponse} extends {@link TeaModel}
 *
 * <p>SwitchDBInstanceNetTypeResponse</p>
 */
public class SwitchDBInstanceNetTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SwitchDBInstanceNetTypeResponseBody body;

    private SwitchDBInstanceNetTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SwitchDBInstanceNetTypeResponse create() {
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
    public SwitchDBInstanceNetTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SwitchDBInstanceNetTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SwitchDBInstanceNetTypeResponseBody body);

        @Override
        SwitchDBInstanceNetTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SwitchDBInstanceNetTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SwitchDBInstanceNetTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SwitchDBInstanceNetTypeResponse response) {
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
        public Builder body(SwitchDBInstanceNetTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SwitchDBInstanceNetTypeResponse build() {
            return new SwitchDBInstanceNetTypeResponse(this);
        } 

    } 

}
