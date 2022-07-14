// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootMachineResponse} extends {@link TeaModel}
 *
 * <p>RebootMachineResponse</p>
 */
public class RebootMachineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RebootMachineResponseBody body;

    private RebootMachineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RebootMachineResponse create() {
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
    public RebootMachineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RebootMachineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RebootMachineResponseBody body);

        @Override
        RebootMachineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RebootMachineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RebootMachineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RebootMachineResponse response) {
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
        public Builder body(RebootMachineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RebootMachineResponse build() {
            return new RebootMachineResponse(this);
        } 

    } 

}
