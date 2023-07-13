// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLogMonitorResponse} extends {@link TeaModel}
 *
 * <p>DeleteLogMonitorResponse</p>
 */
public class DeleteLogMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLogMonitorResponseBody body;

    private DeleteLogMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLogMonitorResponse create() {
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
    public DeleteLogMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLogMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLogMonitorResponseBody body);

        @Override
        DeleteLogMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLogMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLogMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLogMonitorResponse response) {
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
        public Builder body(DeleteLogMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLogMonitorResponse build() {
            return new DeleteLogMonitorResponse(this);
        } 

    } 

}
