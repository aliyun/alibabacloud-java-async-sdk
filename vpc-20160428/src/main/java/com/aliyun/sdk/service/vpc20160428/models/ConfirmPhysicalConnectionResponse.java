// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmPhysicalConnectionResponse} extends {@link TeaModel}
 *
 * <p>ConfirmPhysicalConnectionResponse</p>
 */
public class ConfirmPhysicalConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfirmPhysicalConnectionResponseBody body;

    private ConfirmPhysicalConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfirmPhysicalConnectionResponse create() {
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
    public ConfirmPhysicalConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfirmPhysicalConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfirmPhysicalConnectionResponseBody body);

        @Override
        ConfirmPhysicalConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfirmPhysicalConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfirmPhysicalConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfirmPhysicalConnectionResponse response) {
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
        public Builder body(ConfirmPhysicalConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfirmPhysicalConnectionResponse build() {
            return new ConfirmPhysicalConnectionResponse(this);
        } 

    } 

}
