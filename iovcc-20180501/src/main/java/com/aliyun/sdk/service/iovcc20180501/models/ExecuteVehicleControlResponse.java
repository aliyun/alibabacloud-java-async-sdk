// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteVehicleControlResponse} extends {@link TeaModel}
 *
 * <p>ExecuteVehicleControlResponse</p>
 */
public class ExecuteVehicleControlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExecuteVehicleControlResponseBody body;

    private ExecuteVehicleControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExecuteVehicleControlResponse create() {
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
    public ExecuteVehicleControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteVehicleControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExecuteVehicleControlResponseBody body);

        @Override
        ExecuteVehicleControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteVehicleControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExecuteVehicleControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteVehicleControlResponse response) {
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
        public Builder body(ExecuteVehicleControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteVehicleControlResponse build() {
            return new ExecuteVehicleControlResponse(this);
        } 

    } 

}
