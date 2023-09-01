// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchDBInstanceHAResponse} extends {@link TeaModel}
 *
 * <p>SwitchDBInstanceHAResponse</p>
 */
public class SwitchDBInstanceHAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SwitchDBInstanceHAResponseBody body;

    private SwitchDBInstanceHAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SwitchDBInstanceHAResponse create() {
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
    public SwitchDBInstanceHAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SwitchDBInstanceHAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SwitchDBInstanceHAResponseBody body);

        @Override
        SwitchDBInstanceHAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SwitchDBInstanceHAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SwitchDBInstanceHAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SwitchDBInstanceHAResponse response) {
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
        public Builder body(SwitchDBInstanceHAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SwitchDBInstanceHAResponse build() {
            return new SwitchDBInstanceHAResponse(this);
        } 

    } 

}
