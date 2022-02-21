// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateLorneTaskStatusResponse} extends {@link TeaModel}
 *
 * <p>OperateLorneTaskStatusResponse</p>
 */
public class OperateLorneTaskStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OperateLorneTaskStatusResponseBody body;

    private OperateLorneTaskStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OperateLorneTaskStatusResponse create() {
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
    public OperateLorneTaskStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperateLorneTaskStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OperateLorneTaskStatusResponseBody body);

        @Override
        OperateLorneTaskStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperateLorneTaskStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OperateLorneTaskStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperateLorneTaskStatusResponse response) {
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
        public Builder body(OperateLorneTaskStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperateLorneTaskStatusResponse build() {
            return new OperateLorneTaskStatusResponse(this);
        } 

    } 

}
