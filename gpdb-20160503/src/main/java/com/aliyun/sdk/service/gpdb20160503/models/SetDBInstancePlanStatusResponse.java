// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDBInstancePlanStatusResponse} extends {@link TeaModel}
 *
 * <p>SetDBInstancePlanStatusResponse</p>
 */
public class SetDBInstancePlanStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDBInstancePlanStatusResponseBody body;

    private SetDBInstancePlanStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDBInstancePlanStatusResponse create() {
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
    public SetDBInstancePlanStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDBInstancePlanStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDBInstancePlanStatusResponseBody body);

        @Override
        SetDBInstancePlanStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDBInstancePlanStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDBInstancePlanStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDBInstancePlanStatusResponse response) {
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
        public Builder body(SetDBInstancePlanStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDBInstancePlanStatusResponse build() {
            return new SetDBInstancePlanStatusResponse(this);
        } 

    } 

}
