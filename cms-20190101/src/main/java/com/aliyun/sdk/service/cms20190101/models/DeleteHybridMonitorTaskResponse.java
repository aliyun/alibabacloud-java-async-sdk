// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHybridMonitorTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteHybridMonitorTaskResponse</p>
 */
public class DeleteHybridMonitorTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteHybridMonitorTaskResponseBody body;

    private DeleteHybridMonitorTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteHybridMonitorTaskResponse create() {
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
    public DeleteHybridMonitorTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHybridMonitorTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteHybridMonitorTaskResponseBody body);

        @Override
        DeleteHybridMonitorTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHybridMonitorTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteHybridMonitorTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHybridMonitorTaskResponse response) {
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
        public Builder body(DeleteHybridMonitorTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHybridMonitorTaskResponse build() {
            return new DeleteHybridMonitorTaskResponse(this);
        } 

    } 

}
