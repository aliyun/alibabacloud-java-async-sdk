// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateLogHubResponse} extends {@link TeaModel}
 *
 * <p>OperateLogHubResponse</p>
 */
public class OperateLogHubResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OperateLogHubResponseBody body;

    private OperateLogHubResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OperateLogHubResponse create() {
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
    public OperateLogHubResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperateLogHubResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OperateLogHubResponseBody body);

        @Override
        OperateLogHubResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperateLogHubResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OperateLogHubResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperateLogHubResponse response) {
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
        public Builder body(OperateLogHubResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperateLogHubResponse build() {
            return new OperateLogHubResponse(this);
        } 

    } 

}
