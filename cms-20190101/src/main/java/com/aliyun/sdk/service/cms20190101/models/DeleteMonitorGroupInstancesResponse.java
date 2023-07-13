// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMonitorGroupInstancesResponse} extends {@link TeaModel}
 *
 * <p>DeleteMonitorGroupInstancesResponse</p>
 */
public class DeleteMonitorGroupInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMonitorGroupInstancesResponseBody body;

    private DeleteMonitorGroupInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMonitorGroupInstancesResponse create() {
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
    public DeleteMonitorGroupInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMonitorGroupInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMonitorGroupInstancesResponseBody body);

        @Override
        DeleteMonitorGroupInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMonitorGroupInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMonitorGroupInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMonitorGroupInstancesResponse response) {
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
        public Builder body(DeleteMonitorGroupInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMonitorGroupInstancesResponse build() {
            return new DeleteMonitorGroupInstancesResponse(this);
        } 

    } 

}
