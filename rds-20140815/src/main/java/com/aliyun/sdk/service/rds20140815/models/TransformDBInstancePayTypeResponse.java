// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransformDBInstancePayTypeResponse} extends {@link TeaModel}
 *
 * <p>TransformDBInstancePayTypeResponse</p>
 */
public class TransformDBInstancePayTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TransformDBInstancePayTypeResponseBody body;

    private TransformDBInstancePayTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TransformDBInstancePayTypeResponse create() {
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
    public TransformDBInstancePayTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransformDBInstancePayTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TransformDBInstancePayTypeResponseBody body);

        @Override
        TransformDBInstancePayTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransformDBInstancePayTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TransformDBInstancePayTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransformDBInstancePayTypeResponse response) {
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
        public Builder body(TransformDBInstancePayTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransformDBInstancePayTypeResponse build() {
            return new TransformDBInstancePayTypeResponse(this);
        } 

    } 

}
